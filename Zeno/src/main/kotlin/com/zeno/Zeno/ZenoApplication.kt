package com.zeno.Zeno

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZenoApplication

fun main(args: Array<String>) {
	try {
		runApplication<ZenoApplication>(*args)
	} catch (e: Exception) {
		e.printStackTrace()
	}
}
