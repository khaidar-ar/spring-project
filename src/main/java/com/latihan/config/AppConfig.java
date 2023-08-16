package com.latihan.config;

import com.latihan.domain.Author;
import com.latihan.domain.Book;
import com.latihan.repository.BookRepository;
import com.latihan.repository.impl.BookRepositoryImpl;
import com.latihan.service.BookService;
import com.latihan.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@ComponentScan(basePackages = {"com.latihan"})
@Configuration
public class AppConfig {
    @Bean
    public Author author1() {
        Author author = new Author();
        author.setId(1L);
        author.setName("M.Pierce");
        author.setBirthDate(-16041L);
        return author;
    }

    @Bean
    public Author author2() {
        Author author = new Author();
        author.setId(2L);
        author.setName("Coolen Hovver");
        author.setBirthDate(-15042L);
        return author;
    }


    @Bean
    public Book book1(Author author1) {
        Book book = new Book();
        book.setId(1L);
        book.setTitle("Night Owl");
        book.setDescription("Night Owl by M. Pierce");
        book.setAuthor(author1);
        return book;
    }

    @Bean
    public Book book2(Author author2) {
        Book book = new Book();
        book.setId(2L);
        book.setTitle("Slammed");
        book.setDescription("Slammed by Coolen Hovver");
        book.setAuthor(author2);
        return book;
    }

    @Bean
    public BookRepository bookRepository(Book book1, Book book2) {
        Map<Long, Book> bookMap = new HashMap<Long, Book>();
        bookMap.put(1L, book1);
        bookMap.put(2L, book2);
        BookRepositoryImpl bookRepository = new BookRepositoryImpl();
        bookRepository.setBookMap(bookMap);
        return bookRepository;
    }

//    @Bean
//    public BookService bookService(BookRepository bookRepository) {
//        return new BookServiceImpl(bookRepository);
//    }
}
