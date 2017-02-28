package ua.com.portalNews.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.portalNews.dao.NewsPortalDao;
import ua.com.portalNews.entity.NewsPortal;
import ua.com.portalNews.service.NewsPortalService;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Service
public class NewsPortalServiceImpl implements NewsPortalService{

    @Autowired
    private NewsPortalDao newsPortalDao;

    @Override
    public void save(NewsPortal newsPortal) {
        newsPortalDao.save(newsPortal);

    }

    @Override
    public List<NewsPortal> findAll() {
        return newsPortalDao.findAll();
    }

    @Override
    public NewsPortal findOne(int id) {
        return newsPortalDao.findOne(id);
    }

    @Override
    public void delete(int id) {
        newsPortalDao.delete(id);
    }
}
