package com.lego.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

/**
 * Created by Edgar on 21/02/2017.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.lego.repository")
@PropertySource(value="classpath:connectionDB.properties", ignoreResourceNotFound = false)
class MongoConfig {
}
