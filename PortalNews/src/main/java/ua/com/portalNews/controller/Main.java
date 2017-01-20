package ua.com.portalNews.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;

public class Main {

	
	public static void main(String[] args) throws IOException {


		Document document = Jsoup.connect("http://news.liga.net/").get();

		Elements elements = document.select("ul.ul > li > div.title");

		for (Element element : elements) {
			System.out.println(element.text());
		}


	}
	
	
}
