package com.example.demo_test.repositories;

import com.example.demo_test.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
