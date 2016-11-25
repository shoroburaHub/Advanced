package ua.com.library.dto;

import java.util.ArrayList;
import java.util.List;

import ua.com.library.entity.Book;

public class DtoUtilMapper {

	public static List<BookDTO> booksToBooksDTO(List<Book> books){
		
		List<BookDTO>  bookDTOs = new ArrayList<BookDTO>();
		
		for(Book book : books){
			BookDTO bookDTO = new BookDTO();
			
			bookDTO.setTitle(book.getTitle());
			bookDTO.setPages(book.getPages());
			
			bookDTOs.add(bookDTO);
			
		}
		
		return bookDTOs;
		
	}
	
	
}
