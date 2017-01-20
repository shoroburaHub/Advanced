package ua.com.portalNews.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Entity
public class NewsPortal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "newsPortal_theme",
            joinColumns = @JoinColumn(name = "id_newsPortal"),
            inverseJoinColumns = @JoinColumn(name = "id_theme"))
    private List<Theme> themeList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_newsPortal",
            joinColumns = @JoinColumn(name = "id_newsPortal"),
            inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User> userList;

    public NewsPortal() {
    }

    public NewsPortal(String name) {
        this.name = name;
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
