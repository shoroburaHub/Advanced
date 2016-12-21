package ua.com.library.controller;

import java.time.LocalDate;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;
import ua.com.library.dto.DtoUtilMapper;
import ua.com.library.editor.AuthorEditor;
import ua.com.library.editor.CountryEditor;
import ua.com.library.entity.Author;
import ua.com.library.entity.Book;
import ua.com.library.entity.Country;
import ua.com.library.entity.User;
import ua.com.library.service.AuthorService;
import ua.com.library.service.BookService;
import ua.com.library.service.CountryService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private AuthorService authorService;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
		binder.registerCustomEditor(Author.class, new AuthorEditor(authorService));
	}

	@RequestMapping(value = "/newBook", method = RequestMethod.GET)
	public String newBook(Model model) {


		return "views-admin-newBook";
	}

	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public String saveBook(@RequestParam String title,
						   @RequestParam String pages,
						   @RequestParam String date,
						   @RequestParam MultipartFile image) {

		Book book = new Book();
		book.setTitle(title);
		book.setPages(Integer.parseInt(pages));
		book.setDateofPublic(LocalDate.parse(date));

		bookService.save(book, image);



		return "redirect:/newBook";
	}

	@RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.GET)
	public String newBook(@PathVariable int id) {

		bookService.delete(id);

		return "redirect:/newBook";
	}










}
