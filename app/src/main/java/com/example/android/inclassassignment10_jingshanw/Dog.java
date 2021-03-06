package com.example.android.inclassassignment10_jingshanw;

import java.io.Serializable;

/**
 * Created by Jing on 4/11/17.
 */

public class Dog implements Serializable
{
    public String name;
    public String age;
    public int photoId;

    public Dog(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public Dog(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
