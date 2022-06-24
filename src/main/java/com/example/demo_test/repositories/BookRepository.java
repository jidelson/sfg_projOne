package com.example.demo_test.repositories;

import com.example.demo_test.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
