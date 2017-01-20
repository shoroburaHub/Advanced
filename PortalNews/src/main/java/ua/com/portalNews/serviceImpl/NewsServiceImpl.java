package ua.com.portalNews.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.portalNews.dao.NewsDao;
import ua.com.portalNews.entity.News;
import ua.com.portalNews.service.NewsService;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDao newsDao;

    @Override
    public void save(News news) {
        newsDao.save(news);
    }

    @Override
    public List<News> findAll() {
        return newsDao.findAll();
    }

    @Override
    public News findOne(int id) {
        return newsDao.findOne(id);
    }

    @Override
    public void delete(int id) {
        newsDao.delete(id);
    }
}
