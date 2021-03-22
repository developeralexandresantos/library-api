package br.com.developeralexandresantos.libraryapi.service.impl;

import br.com.developeralexandresantos.libraryapi.exception.BusinessException;
import br.com.developeralexandresantos.libraryapi.model.entity.Book;
import br.com.developeralexandresantos.libraryapi.model.repository.BookRepository;
import br.com.developeralexandresantos.libraryapi.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        if(repository.existsByIsbn(book.getIsbn())){
            throw new BusinessException("Isbn já cadastrado.");
        }
        return repository.save(book);
    }
}
