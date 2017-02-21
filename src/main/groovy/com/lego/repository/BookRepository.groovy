package com.lego.repository

import com.lego.model.Book
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by Edgar on 21/02/2017.
 */
interface BookRepository extends MongoRepository<Book,String> {

    List<Book> findAll()

    Book findById(String id)

    Book insert(Book book)

    Book save(Book book)

    void delete(String id)
}