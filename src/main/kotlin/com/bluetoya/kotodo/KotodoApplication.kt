package com.bluetoya.kotodo

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotodoApplication

fun main(args: Array<String>) {
	runApplication<KotodoApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
