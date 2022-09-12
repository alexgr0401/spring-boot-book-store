package springbootbookstore.service;

import springbootbookstore.model.Book;

import java.util.List;

public interface IBookService {

    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
