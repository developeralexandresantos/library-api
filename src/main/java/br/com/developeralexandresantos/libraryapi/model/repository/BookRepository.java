package br.com.developeralexandresantos.libraryapi.model.repository;

import br.com.developeralexandresantos.libraryapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByIsbn(String isbn);
}
