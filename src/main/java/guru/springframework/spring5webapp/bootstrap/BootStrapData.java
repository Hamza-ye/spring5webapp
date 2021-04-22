package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepsitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Hamza on 23/04/2021.
 */
@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepsitory bookRepsitory;

    public BootStrapData(AuthorRepository authorRepository, BookRepsitory bookRepsitory) {
        this.authorRepository = authorRepository;
        this.bookRepsitory = bookRepsitory;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Bold");
        Book ddd = new Book("Domain Driven Design", "233212323");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepsitory.save(ddd);

        System.out.println("count of books: " + bookRepsitory.count());
    }
}
