package com.huangyunbin.controller;

import com.huangyunbin.model.Book;
import com.huangyunbin.persist.BookDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@Controller
@RequestMapping(value="/book")
public class BookController {
	private  Log log=LogFactory.getLog(getClass());
	
	@Autowired
	private BookDao bookDao;
	


	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public String getAll(Model model) {
        log.info("3333333333333");
		Set<Book> books= bookDao.getAll();
		model.addAttribute("books", books);
		return "book/list";
	}



}
