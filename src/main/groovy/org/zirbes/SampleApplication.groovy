package org.zirbes

import org.joda.time.LocalDate

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@RestController
class SampleApplication {

    @RequestMapping("/")
    def helloWorld() {
        LocalDate localToday = new LocalDate()
        Date today = localToday.toDate()

        return [message: "Hello Gr8conf", author: "Spring Boot", timestamp: today]
    }

    static void main(String[] args) throws Exception {
        SpringApplication.run(SampleApplication.class, args)
    }

}
