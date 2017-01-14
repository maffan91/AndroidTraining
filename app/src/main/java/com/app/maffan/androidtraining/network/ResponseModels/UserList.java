package com.app.maffan.androidtraining.network.ResponseModels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by affan on 1/11/17.
 */

public class UserList {

    @SerializedName("results")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
