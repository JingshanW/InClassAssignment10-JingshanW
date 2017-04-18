package com.example.android.inclassassignment10_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.inclassassignment10_jingshanw.Keys.DOG;

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
        Dog dog= (Dog) intent.getSerializableExtra(DOG);
        name.setText(dog.getName());
        age.setText(dog.getAge());
        image.setImageResource(dog.getPhotoId());


//        name.setText(intent.getStringExtra("NAME"));
//        age.setText(dog.getAge());
//        image.setImageResource(dog.getPhotoId());
//        int i=intent.getIntExtra("IMAGE",1);
//        image.setImageResource(i);
//        name.setText(intent.getStringExtra("NAME"));
//        age.setText(intent.getStringExtra("AGE"));







    }
}
