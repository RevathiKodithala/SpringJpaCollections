package com.example.profiles.Repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.profiles.entity.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {

	void save(Book b1);

	void saveAll(List<Book> asList);

	Iterable<Book> findAll();

	

	

	

}
