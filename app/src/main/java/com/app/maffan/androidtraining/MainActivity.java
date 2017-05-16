package com.app.maffan.androidtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.app.maffan.androidtraining.adapters.RandomUserAdapter;
import com.app.maffan.androidtraining.network.RandomUserService;
import com.app.maffan.androidtraining.network.ResponseModels.User;
import com.app.maffan.androidtraining.network.ResponseModels.UserList;
import com.app.maffan.androidtraining.network.ServiceGenerator;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    EditText userCount;
    RandomUserAdapter adapter;
    RecyclerView userListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userCount = (EditText) findViewById(R.id.user_count);

    }


    public void fetchUsers(View view){

        // user fetching code here
        Toast.makeText(this,"Fetching...",Toast.LENGTH_SHORT).show();
        RandomUserService service = ServiceGenerator.getRetrofit().create(RandomUserService.class);
        Call<UserList> call = service.fetchUsers(Integer.parseInt(userCount.getText().toString()));
        Log.d(TAG, String.valueOf(Integer.parseInt(userCount.getText().toString())));
        call.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {

                Toast.makeText(getApplicationContext(),"Request Successful",Toast.LENGTH_SHORT).show();
                showUsers(response.body().getUsers());
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Request Failed",Toast.LENGTH_SHORT).show();

            }
        });






    }

    private void showUsers(List<User> users){

        userListView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new RandomUserAdapter(this,users);
        userListView.setAdapter(adapter);
        userListView.setLayoutManager(new LinearLayoutManager(this));

    }
}
