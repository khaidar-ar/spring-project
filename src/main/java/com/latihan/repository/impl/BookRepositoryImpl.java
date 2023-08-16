package com.latihan.repository.impl;

import com.latihan.domain.Author;
import com.latihan.domain.Book;
import com.latihan.repository.BookRepository;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

    private Map<Long, Book> bookMap;

    @Override
    public Book findBookById(long id) {
        Book book = bookMap.get(id);
        return book;
    }

//    public BookRepositoryImpl() {
//        bookMap = new HashMap<Long,Book>();
//        Book book1 = new Book();
//        book1.setId(1L);
//        book1.setTitle("Night Owl");
//        book1.setDescription("Night Owl by M. Pierce");
//        Author author = new Author();
//        author.setId(1L);
//        author.setName("M. Pierce");
//        author.setBirthDate(-16045L);
//        book1.setAuthor(author);
//        this.bookMap.put(book1.getId(), book1);
//    }

    public Map<Long, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<Long, Book> bookMap) {
        this.bookMap = bookMap;
    }
}
