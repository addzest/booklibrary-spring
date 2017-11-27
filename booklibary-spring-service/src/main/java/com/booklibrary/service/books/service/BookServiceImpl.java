package com.booklibrary.service.books.service;

import com.booklibrary.service.books.dao.BookDao;
import com.booklibrary.service.books.model.BookOnHoldIdTO;
import com.booklibrary.service.books.model.BookOnHoldTO;
import com.booklibrary.service.books.model.BookTO;
import com.booklibrary.service.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Aliaksandr_Trafimovi on 11/14/2017.
 */
@Transactional
@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
/*
    @Autowired
    private UserDao userDao;*/

  /*  @Override
    public void addBook(BookTO bookTO) { bookDao.addBook(bookTO);}

    @Override
    public boolean removeBook(long id) {
        if (bookDao.bookOnHold(id)) {
            return false;
        } else {
            bookDao.removeBook(id);
            return true;
        }
    }

    @Override
    public void updateBook(BookTO bookTO) { bookDao.updateBook(bookTO);}

    @Override
    public BookTO getBookById(long id) {
        return bookDao.getBookById(id);
    }

    @Override
    public List<BookTO> findBooks(String searchRequest, int recordsPerPage, int currentPage, String orderBy) {
        return bookDao.findBooks(searchRequest, recordsPerPage, currentPage, orderBy);
    }
*/
    @Override
    public List<BookTO> getBookTOList(int recordsPerPage, int currentPage, String orderBy) {
        return bookDao.getBookTOList(recordsPerPage, currentPage, orderBy);
    }
/*
    @Override
    public int getBookTOCount() {
        return bookDao.getBookTOCount();
    }

    @Override
    public int getBookTOCountWithSearchRequest(String searchRequest) {
        return bookDao.getBookTOCountWithSearchRequest(searchRequest);
    }

    @Override
    public List<BookOnHoldTO> getBooksOnHoldList(long userId) {
        return bookDao.getBooksOnHoldList(userId);
    }

    @Override
    public List<BookOnHoldTO> getAllBooksOnHoldList() {
        return bookDao.getAllBooksOnHoldList();
    }

    @Override
    public void takeBook(long bookId, long userId, String holdType) {
        BookTO bookTO = bookDao.getBookById(bookId);
        if (bookTO.getCount() > 0) {
            bookTO.setCount(bookTO.getCount() - 1);
            bookDao.updateBook(bookTO);
            bookDao.takeBook(bookId, userId, holdType);
        }
    }

    @Override
    public void returnBook(long bookId, long userId) {
        BookTO bookTO = bookDao.getBookById(bookId);
        BookOnHoldIdTO bookOnHoldIdTO = new BookOnHoldIdTO();
        bookOnHoldIdTO.setUserTO(userDao.getUserById(userId));
        bookOnHoldIdTO.setBookTO(bookTO);
        bookTO.setCount(bookTO.getCount() + 1);
        bookDao.updateBook(bookTO);
        bookDao.returnBook(bookOnHoldIdTO);
    }

    @Override
    public void approveBook(long bookId, long userId) {
        BookOnHoldIdTO bookOnHoldIdTO = new BookOnHoldIdTO();
        bookOnHoldIdTO.setUserTO(userDao.getUserById(userId));
        bookOnHoldIdTO.setBookTO(bookDao.getBookById(bookId));
        bookDao.approveBook(bookOnHoldIdTO);
    }*/
}
