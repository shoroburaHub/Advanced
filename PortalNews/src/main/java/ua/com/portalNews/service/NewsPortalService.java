package ua.com.portalNews.service;

import ua.com.portalNews.entity.NewsPortal;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
public interface NewsPortalService {

    void save(NewsPortal newsPortal);
    List<NewsPortal> findAll();
    NewsPortal findOne(int id);
    void delete(int id);
}


