package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends JpaRepository<Book, Long>{

    public void saveBook() {

        System.out.println("Book saved successfully.");

    }

}