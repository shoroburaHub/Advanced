package ua.com.portalNews.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Lob
    private String text;
    private LocalDateTime localDateTime;
    private int likes;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "theme_news",
            joinColumns = @JoinColumn(name = "id_news"),
            inverseJoinColumns = @JoinColumn(name = "id_theme"))
    private List<Theme> themeList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_news",
            joinColumns = @JoinColumn(name = "id_news"),
            inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User> userList;

    public News() {
    }

    public News(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Theme> getThemeList() {
        return themeList;
    }

    public void setThemeList(List<Theme> themeList) {
        this.themeList = themeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
