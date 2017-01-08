package com.app.maffan.androidtraining.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;


@Entity
public class User {

    @Id
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String first;
    @NotNull
    private String last;
    @Generated(hash = 1416693950)
    public User(Long id, @NotNull String title, @NotNull String first,
            @NotNull String last) {
        this.id = id;
        this.title = title;
        this.first = first;
        this.last = last;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFirst() {
        return this.first;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public String getLast() {
        return this.last;
    }
    public void setLast(String last) {
        this.last = last;
    }
}
