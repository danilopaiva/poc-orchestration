[arch]: ./media/arch.png

# poc-orchestration

> Bom, como é uma aplicação de estudos e experimentação, vamos viajar na maionese aqui galera :D

A ideia é criar um projeto que sirva como estudo e experimentação da AWS utilizando Terraform para aprovisionar, além dos estudos do Dynamo, Kafka Connect, MSK e coreografia SAGA.

> Como exercício imagine que exista um aplicativo bancário no qual iremos desenvolver uma nova funcionalidade de cobrança.

## Regra de Negócio

Criar uma funcionalidade no qual permita um cliente enviar cobrança um ou mais clientes.

**Requisitos funcionais**

* O cliente pode enviar cobrança para um mais clientes;
* Ao enviar a cobrança para mais de um cliente, o cliente cobrador pode enviar valores diferentes de cobrança;
* Ao enviar a cobrança é necessário notificar o módulo de notificação para que o cliente cobrado receba a notificação da cobrança;
* Ao enviar a cobrança é necessário notificar o módulo de timeline para que essa cobrança aparece na timeline do cobrador e do cliente cobrado;
* Ao enviar a cobrança é necessário notificar o módulo de dados;
* O cliente cobrado tem a opção de aceitar ou negar essa cobrança;

**Requisitos não funcionais**

* O módulo cobrança não terá a "SAGA" de notificar os outros módulos, a ideia é usar notification event pattern;
* Disponibilizar Swagger com as documentações das APIs;

## Sequence Diagram

**TODO**

## Draft Architecture

![][arch]