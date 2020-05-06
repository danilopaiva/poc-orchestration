package com.github.danilopaiva.poc.orchestration.charge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChargeApplication

fun main(args: Array<String>) {
	runApplication<ChargeApplication>(*args)
}
