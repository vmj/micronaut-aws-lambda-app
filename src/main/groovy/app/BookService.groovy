package app

import groovy.transform.CompileStatic

import javax.inject.Singleton

@CompileStatic
@Singleton
class BookService {
    BookSaved save(Book book) {
        BookSaved bookSaved = new BookSaved()
        bookSaved.name = book.name
        bookSaved.isbn = UUID.randomUUID().toString()
        bookSaved
    }
}
