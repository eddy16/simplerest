package com.lego.config

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.ComponentScan

/**
 * Created by Edgar on 21/02/2017.
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.lego")
class SpringBootConfig {

    static void main(String[] args){
        new SpringApplicationBuilder()
                .sources(SpringBootConfig.class)
                .run()
    }

}
