package ua.com.portalNews.service;

import ua.com.portalNews.entity.News;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
public interface NewsService {

    void save(News news);
    List<News> findAll();
    News findOne(int id);
    void delete(int id);

}
