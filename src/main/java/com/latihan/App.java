package com.latihan;

import com.latihan.config.AppConfig;
import com.latihan.domain.Author;
import com.latihan.dto.BookDetailDTO;
import com.latihan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        XML app context
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("application-context.xml");
//        Path directory xml in fs
        ApplicationContext fs = new FileSystemXmlApplicationContext("D:\\project\\spring\\trial\\book-catalog\\src\\main\\resources\\application-context.xml");
//        BookService bookService =(BookService) fs.getBean("bookService");

//        Java base config using bean annotation
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bookService = (BookService) annotationContext.getBean("bookService");
//        BookService bookService = (BookService) appContext.getBean("bookService");
        BookDetailDTO dto = bookService.getBookDtoByID(1L);

        System.out.println("Book detail : " + dto);
    }
}
