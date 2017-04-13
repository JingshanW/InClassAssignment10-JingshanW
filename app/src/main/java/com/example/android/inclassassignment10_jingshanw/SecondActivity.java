package com.example.android.inclassassignment10_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView name;
    private TextView age;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name= (TextView) findViewById(R.id.name_textview_secondActivity);
        age= (TextView) findViewById(R.id.age_textview_secondActivity);
        image= (ImageView) findViewById(R.id.image_view_secondActivity);

        Intent intent = getIntent();
        Dog doggy= (Dog) intent.getSerializableExtra(Keys.DOG);
        name.setText(doggy.getName());
        age.setText(doggy.getAge());
        image.setImageResource(doggy.getPhotoId());






    }
}
