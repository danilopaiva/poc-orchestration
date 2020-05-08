package com.github.danilopaiva.poc.orchestration.charge.controller.v1

import com.github.danilopaiva.poc.orchestration.charge.api.v1.ChargeApi
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ChargeController : ChargeApi {

    override fun charge(): String =
        UUID.randomUUID().toString()

    override fun find() {
        TODO("Not yet implemented")
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun paid() {
        TODO("Not yet implemented")
    }
}