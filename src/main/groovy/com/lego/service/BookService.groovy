package com.lego.service

import com.lego.model.Book
import com.lego.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service

/**
 * Created by Edgar on 21/02/2017.
 */
@Service
@Scope("request")
class BookService {


    @Autowired
    BookRepository bookRepository

    def findAll(){
        return bookRepository.findAll()
    }

    def findById(String id){
        return bookRepository.findById(id)
    }

    def insert(Book book){
        return bookRepository.insert(book)
    }

    def save(Book book){
        return bookRepository.save(book)
    }

    def delete(String id){
        return bookRepository.delete(id)
    }
}
