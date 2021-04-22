package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hamza on 23/04/2021.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
