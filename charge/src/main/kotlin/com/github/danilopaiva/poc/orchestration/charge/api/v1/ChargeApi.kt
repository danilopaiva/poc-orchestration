package com.github.danilopaiva.poc.orchestration.charge.api.v1

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/v1/charges")
interface ChargeApi {

    //@PostMapping
    @GetMapping
    fun charge(): String

    @GetMapping("/{chargeId}")
    fun find()

    @DeleteMapping("/{chargeId}")
    fun cancel()

    @GetMapping("/{chargeId}/debtors/{customerId}/paid")
    fun paid()
}