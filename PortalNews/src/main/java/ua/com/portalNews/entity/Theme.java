package ua.com.portalNews.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String theme;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "theme_news",
            joinColumns = @JoinColumn(name = "id_theme"),
            inverseJoinColumns = @JoinColumn(name = "id_news"))
    private List<News> newsList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "newsPortal_theme",
            joinColumns = @JoinColumn(name = "id_theme"),
            inverseJoinColumns = @JoinColumn(name = "id_newsPortal"))
    private List<NewsPortal> newsPortalList;

    public Theme() {
    }

    public Theme(String theme) {
        this.theme = theme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public List<NewsPortal> getNewsPortalList() {
        return newsPortalList;
    }

    public void setNewsPortalList(List<NewsPortal> newsPortalList) {
        this.newsPortalList = newsPortalList;
    }
}
