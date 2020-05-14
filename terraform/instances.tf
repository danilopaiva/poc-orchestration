resource "aws_instance" "instances" {
  count = 3

  ami           = "ami-0915e09cc7ceee3ab"
  instance_type = "t2.micro"
  subnet_id     = element(aws_subnet.public_subnet.*.id, count.index)

  key_name = aws_key_pair.keypair.key_name

  vpc_security_group_ids = [aws_security_group.allow_ssh.id, aws_security_group.allow_outbound.id, aws_security_group.load_balancer_tg.id]

  user_data = templatefile("${path.module}/user_data/install_app.tmpl", {database_endpoint = "test.com"})

  tags = {
      Name = "PoC_instances_${count.index}"
  }
}

resource "aws_key_pair" "keypair" {
  public_key = file("/home/danilo/.ssh/poc-orchestration.pub")
}

output "public_ips" {
  value = join(", ", aws_instance.instances.*.public_ip)
}