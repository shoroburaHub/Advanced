package ua.com.portalNews.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.portalNews.dao.ThemeDao;
import ua.com.portalNews.entity.Theme;
import ua.com.portalNews.service.ThemeService;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Service
public class ThemeServiceImpl implements ThemeService{

    @Autowired
    private ThemeDao themeDao;

    @Override
    public void save(Theme theme) {
        themeDao.save(theme);
    }

    @Override
    public List<Theme> findAll() {
        return themeDao.findAll();
    }

    @Override
    public Theme findOne(int id) {
        return themeDao.findOne(id);
    }

    @Override
    public void delete(int id) {
        themeDao.delete(id);
    }
}
