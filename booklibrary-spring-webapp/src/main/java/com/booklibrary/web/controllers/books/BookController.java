package com.booklibrary.web.controllers.books;

import com.booklibrary.service.books.model.BookTO;
import com.booklibrary.service.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public ModelAndView listBooksNotLogged() {
        List<BookTO> bookTOList = bookService.getBookTOList(5,1,"title");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("bookTOList", bookTOList);
        return modelAndView;
    }






}
