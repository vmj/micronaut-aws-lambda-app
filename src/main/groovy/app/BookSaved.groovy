package app;
import io.micronaut.core.annotation.NonNull
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import groovy.transform.CompileStatic

@CompileStatic
@Introspected
class BookSaved {

    @NonNull
    @NotBlank
    String name


    @NonNull
    @NotBlank
    String isbn
}
