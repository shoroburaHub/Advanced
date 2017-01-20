package ua.com.portalNews.service;

import ua.com.portalNews.entity.Theme;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
public interface ThemeService {

    void save(Theme theme);
    List<Theme> findAll();
    Theme findOne(int id);
    void delete(int id);

}
