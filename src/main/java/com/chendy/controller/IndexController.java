package com.chendy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chendy.entity.Book;
import com.chendy.service.BookService;

@Controller

@RequestMapping("/index")
public class IndexController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("index")
	public String index() {
		List<Book> list = bookService.getList();
		System.out.println(list);
		System.out.println("test");
		
		return "index";
	}
}
