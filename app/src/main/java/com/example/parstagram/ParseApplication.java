package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8p1KHbhu7mT4LxyAFG5Fv291oWpVEyruPbH8fdEN")
                .clientKey("LaXV1kA76okfFojmqfRZqSUhtYNpam6UuR6z4KhG")
                .server(getString(R.string.back4app_server_url))
                .build()
        );

    }
}
