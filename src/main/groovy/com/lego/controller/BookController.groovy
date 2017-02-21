package com.lego.controller

import com.lego.model.Book
import com.lego.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Edgar on 21/02/2017.
 */
@RestController
@RequestMapping(value="/book")
@Scope("request")
class BookController {

    @Autowired
    BookService bookService

    @RequestMapping(method = RequestMethod.GET)
    def findAll(){
        return bookService.findAll()
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    def findById(@PathVariable def id){
        return bookService.findById(id)
    }

    @RequestMapping(method = RequestMethod.POST)
    def insertBook(@RequestBody Book book){
        return bookService.insert(book);
    }

    @RequestMapping(method = RequestMethod.PUT)
    def updateBook(@RequestBody Book book){
        return bookService.save(book)
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    def deleteBook(@PathVariable def id){
        bookService.delete(id)
    }
}
