package com.zeno.Zeno

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class TestController {
    var logger: Logger = LoggerFactory.getLogger(TestController::class.java);

    @GetMapping("/test")
    fun testGet(): ResponseEntity<String> {
        return ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    @PostMapping("/test/{input}")
    fun testPost1(@PathVariable("input") input: String): ResponseEntity<String> {
        return ResponseEntity<String>(input, HttpStatus.OK);
    }

    @PostMapping("/testing")
    fun testPost2(@RequestBody input: TestData): ResponseEntity<String> {
        logger.atInfo().log(input.id.toString());
        return ResponseEntity<String>(input.id.toString(), HttpStatus.OK);
    }
}