package com.jokes;

import java.util.Random;

public class MyJokes {
    public String getJoke(){
        String[] jokes={"This is totally a funny joke 1","This is totally a funny joke 2", "This is totally a funny joke 3", "This is totally a funny joke 4", "This is totally a funny joke 5", "This is totally a funny joke 6", "This is totally a funny joke 7", "This is totally a funny joke 8", "This is totally a funny joke 9", "This is totally a funny joke 10"};
        Random rand = new Random();
        return jokes[rand.nextInt(jokes.length -1)];
    }
}
