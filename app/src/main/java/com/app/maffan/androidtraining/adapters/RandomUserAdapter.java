package com.app.maffan.androidtraining.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.maffan.androidtraining.R;
import com.app.maffan.androidtraining.network.ResponseModels.User;
import com.squareup.picasso.Picasso;

import java.util.List;


public class RandomUserAdapter extends RecyclerView.Adapter<RandomUserAdapter.ViewHolder> {

    private Context context;
    private List<User> users;

    public RandomUserAdapter(Context context, List<User> users){

        this.context = context;
        this.users = users;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.user_item,null));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        User user = users.get(position);

        holder.fullName.setText(titleCase(user.getName().getTitle()) + ' ' + titleCase(user.getName().getFirst()) + ' ' + titleCase(user.getName().getLast()));
        holder.city.setText(titleCase(titleCase(user.getLocation().getCity())));
        Picasso.with(context).load(user.getPicture().getLarge()).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView fullName;
        TextView city;
        ImageView thumbnail;

        public ViewHolder(View itemView) {
            super(itemView);
            fullName = (TextView) itemView.findViewById(R.id.name);
            city = (TextView) itemView.findViewById(R.id.city);
            thumbnail = (ImageView) itemView.findViewById(R.id.image_thumbnail);
        }
    }

    public String titleCase(String value){

        return value.substring(0,1).toUpperCase() + value.substring(1,value.length() -1);


    }
}
