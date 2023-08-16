package com.latihan.service.impl;

import com.latihan.domain.Author;
import com.latihan.domain.Book;
import com.latihan.dto.BookDetailDTO;
import com.latihan.repository.BookRepository;
import com.latihan.repository.impl.BookRepositoryImpl;
import com.latihan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("bookService")
public class BookServiceImpl implements BookService {
    private Book book;
    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDetailDTO getBookDtoByID(long id) {
        Book book = bookRepository.findBookById(id);
        BookDetailDTO bookDetailDTO = new BookDetailDTO();
        bookDetailDTO.setBookID(book.getId());
        bookDetailDTO.setBookTitle(book.getTitle());
        bookDetailDTO.setBookDescription(book.getDescription());
        bookDetailDTO.setAuthorName(book.getAuthor().getName());
        return bookDetailDTO;
    }

}
