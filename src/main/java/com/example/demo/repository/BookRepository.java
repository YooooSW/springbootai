package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// jpa api
@Repository                            // findAll()
public interface BookRepository extends JpaRepository<Book, Long> {
    // 1. JPA에서 제공해주는 메서드를 사용
    // 책 번호(title)이 일치하는 책을 자져오고 싶다.
    // public Optional<Book> findById(Long id);
    // select * from Book b where b.id=id
    // 2. 쿼리메서드(규칙을 가지고 메서드를 만들면 자동으로 SQL을 생성)
    // public Optional<Book> findByTitleAndPage(String title, int page);
    // select * from Book b where b.title=title and b.page=page

}
/*
  public class EntityManager implements BookRepository{
        // JDBC
        public List<Book> findAll(){
           1. SQL(JPQL:사용자정의 SQL) : select * from Book-->Table
           2. Book
           3. List
        }
  }
 */