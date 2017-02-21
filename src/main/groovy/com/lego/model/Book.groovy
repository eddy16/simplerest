package com.lego.model

import groovy.transform.Canonical
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

/**
 * Created by Edgar on 21/02/2017.
 */
@Document(collection = "book")
@Canonical
class Book {

    @Id
    String id

    @Field("name")
    String name

    @Field("author")
    String author
}
