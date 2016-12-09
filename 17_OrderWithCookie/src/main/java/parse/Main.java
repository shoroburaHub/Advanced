package parse;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		parse();
		
	}
	
	public static void parse() throws IOException{
		
		Document document = Jsoup.connect("http://www.shopbookshop.com/collections/books").get();
		

		String [] text = new String[document.select("span.grid-product__wrapper").size()];
		
		System.out.println(document.select("span.grid-product__price").text().replace("$ ", ""));
		
		
//		int i = 1;
//		for(Element s : document.select("span.grid-product__wrapper")){
//			System.out.println(s.text());
////			text[i] = s.text().split("$ ")[i];
//			i++;
//		}
//		
//		for (String string : text) {
//			System.out.println(string);
//		}
		
	}
	
	
}
