package ua.com.portalNews.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emil;
    private String password;
    private String image;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_newsPortal",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_newsPortal"))
    private List<NewsPortal> newsPortalList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_news",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_news"))
    private List<News> newsList;

    public User() {
    }

    public User(String name, String emil, String password) {
        this.name = name;
        this.emil = emil;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<NewsPortal> getNewsPortalList() {
        return newsPortalList;
    }

    public void setNewsPortalList(List<NewsPortal> newsPortalList) {
        this.newsPortalList = newsPortalList;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }
}
