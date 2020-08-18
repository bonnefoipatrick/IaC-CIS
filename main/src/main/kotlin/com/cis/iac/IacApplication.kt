package com.cis.iac

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Bank API spring boot application.
 *
 * @author Patrick BONNEFOI
 *      Date 21/11/2018.
 */
@SpringBootApplication()
class IacApplication

fun main(args: Array<String>) {
    SpringApplication.run(IacApplication::class.java, *args)
}