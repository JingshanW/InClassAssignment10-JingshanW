package com.example.android.inclassassignment10_jingshanw;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jing on 4/11/17.
 */

//public class DogViewHolder extends RecyclerView.ViewHolder
//{
//    private CardView cardView;
//    private TextView dogNameView;
//    private TextView dogAgeView;
//    private ImageView dogPhotoView;
//    private Context context;
//
//    public DogViewHolder(View itemView,Context context)
//    {
//        super(itemView);
//        cardView= (CardView) itemView.findViewById(R.id.card_view_dog);
//        dogNameView= (TextView) itemView.findViewById(R.id.dog_name);
//        dogAgeView= (TextView) itemView.findViewById(R.id.dog_age);
//        dogPhotoView= (ImageView) itemView.findViewById(R.id.dog_image);
//        this.context=context;
//    }
//
//    public void bind(final Dog dog)
//    {
//        dogNameView.setText(dog.name);
//        dogAgeView.setText(dog.age);
//        dogPhotoView.setImageResource(dog.photoId);
//        cardView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v)
//            {
//                Toast.makeText(context,dogNameView.getText(),Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}

public class DogViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView dogNameView;
    private TextView dogAgeView;
    private ImageView dogPhotoView;
    private Context context;



    public DogViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view_dog);
        dogNameView = (TextView) itemView.findViewById(R.id.dog_name);
        dogAgeView = (TextView) itemView.findViewById(R.id.dog_age);
        dogPhotoView = (ImageView) itemView.findViewById(R.id.dog_image);
        this.context = context;
    }

    public void bind(final
                     Dog dog) {
        dogNameView.setText(dog.name);
        dogAgeView.setText(dog.age);
        dogPhotoView.setImageResource(dog.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, dogNameView.getText(), Toast.LENGTH_SHORT).show();

                Intent intent =new Intent(v.getContext(), SecondActivity.class);

                Dog d=new Dog(dogNameView.getText().toString(),dogAgeView.getText().toString(),dogPhotoView.getId());
                intent.putExtra(Keys.DOG,d);
                v.getContext().startActivity(intent);

            }




        });
    }


}

