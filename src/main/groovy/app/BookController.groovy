package app
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

import javax.inject.Inject
import javax.validation.Valid
import groovy.transform.CompileStatic

@CompileStatic
@Controller
class BookController {
    private final BookService bookService

    @Inject
    BookController(final BookService bookService) {
        this.bookService = bookService
    }

    @Post
    BookSaved save(@Valid @Body Book book) {
        bookService.save(book)
    }
}
