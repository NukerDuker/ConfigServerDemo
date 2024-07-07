package ru.ConfigServer.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
