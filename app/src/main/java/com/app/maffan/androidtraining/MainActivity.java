package com.app.maffan.androidtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.app.maffan.androidtraining.network.RandomUserService;
import com.app.maffan.androidtraining.network.ResponseModels.UserList;
import com.app.maffan.androidtraining.network.ServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    EditText userCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userCount = (EditText) findViewById(R.id.user_count);
    }


    public void fetchUsers(View view){

        // user fetching code here
        Toast.makeText(this,"Fetching...",Toast.LENGTH_LONG).show();
        RandomUserService service = ServiceGenerator.getRetrofit().create(RandomUserService.class);
        Call<UserList> call = service.fetchUsers(Integer.parseInt(userCount.getText().toString()));

        call.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {

                Toast.makeText(getApplicationContext(),"Request Successful",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Request Failed",Toast.LENGTH_SHORT).show();

            }
        });






    }
}
