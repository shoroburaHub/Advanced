package ua.com.portalNews.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.portalNews.entity.News;

/**
 * Created by admin on 18.01.2017.
 */
public interface NewsDao extends JpaRepository<News, Integer> {
}
