package com.app.maffan.androidtraining.network;

import com.app.maffan.androidtraining.network.ResponseModels.User;
import com.app.maffan.androidtraining.network.ResponseModels.UserList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface RandomUserService {

    @GET("api/")
    Call<UserList> fetchUsers(@Query("userCount") int userCount);
}
