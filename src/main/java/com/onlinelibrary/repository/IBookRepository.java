package com.onlinelibrary.repository;

import com.onlinelibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
