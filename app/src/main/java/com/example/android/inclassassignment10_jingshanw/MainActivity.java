package com.example.android.inclassassignment10_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;


public class MainActivity extends AppCompatActivity {
    private List<Dog> dogs;
    private DogsAdapter dogsAdapter;
//    private CardView cardView;
//
//    private TextView dogName;
//    private TextView dogAge;
//    private ImageView dogImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dogsAdapter = new DogsAdapter(dogs, this);
        recyclerView.setAdapter(dogsAdapter);

//        dogName= (TextView) findViewById(R.id.dog_name);
//        dogAge= (TextView) findViewById(R.id.dog_age);
//        dogImage= (ImageView) findViewById(R.id.dog_image);
//        cardView = (CardView)findViewById(R.id.card_view_dog);


    }


    public void addRandomDog(View view) {
        dogs.add(getRandomDog());
        dogsAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        dogs = new ArrayList<>();
        dogs.add(new Dog("Corgi","12-14 years",R.drawable.corgi));
        dogs.add(new Dog("Husky","12-15 years",R.drawable.husky));
        dogs.add(new Dog("Golden Retriever","10-12 years",R.drawable.golden_retriever));
    }

    private Dog getRandomDog() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Dog("Corgi","12-14 years",R.drawable.corgi);
        else if (num == 1)
            return new Dog("Husky","12-15 years",R.drawable.husky);
        else
            return new Dog("Golden Retriever","10-12 years",R.drawable.golden_retriever);
    }



}




