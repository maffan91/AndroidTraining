package com.app.maffan.androidtraining.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;


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
}
