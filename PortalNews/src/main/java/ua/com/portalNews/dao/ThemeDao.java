package ua.com.portalNews.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.portalNews.entity.Theme;

/**
 * Created by admin on 18.01.2017.
 */
public interface ThemeDao extends JpaRepository<Theme, Integer> {
}
