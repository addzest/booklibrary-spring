package com.booklibrary.service.books.dao;

import com.booklibrary.service.books.model.*;

import java.util.List;


public interface BookDao {
/*
    void addBook(BookTO bookTO);

    void removeBook(long id);

    void updateBook(BookTO bookTO);

    BookTO  getBookById(long id);

    List<BookTO> findBooks(String searchRequest, int recordsPerPage, int currentPage, String orderBy);

    int getBookTOCount();

    int getBookTOCountWithSearchRequest(String searchRequest);*/

    List<BookTO> getBookTOList(int recordsPerPage, int currentPage, String orderBy);

 /*   List<BookOnHoldTO> getBooksOnHoldList(long userId);

    List<BookOnHoldTO> getAllBooksOnHoldList();

    boolean bookOnHold(long id);
    void takeBook(long bookId, long userId, String holdType);


    BookOnHoldTO getBookOnHoldTO(BookOnHoldIdTO bookOnHoldIdTO);

    void returnBook(BookOnHoldIdTO bookOnHoldIdTO);

    void approveBook(BookOnHoldIdTO bookOnHoldIdTO);*/
}
