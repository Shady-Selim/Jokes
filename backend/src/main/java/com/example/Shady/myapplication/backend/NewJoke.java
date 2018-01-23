package com.example.Shady.myapplication.backend;

import com.jokes.MyJokes;

/**
 * Created by Shady on 9/19/2017.
 */

public class NewJoke {
    MyJokes newJoke = new MyJokes();
    public String getData() {
        return newJoke.getJoke();
    }
    public void setData() {}
}
