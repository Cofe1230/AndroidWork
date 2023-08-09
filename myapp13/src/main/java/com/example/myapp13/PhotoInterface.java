package com.example.myapp13;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhotoInterface {
    @GET("photos/")
    Call<List<Photo>> doGetPhotos();
    //@GET("photos/")
    //Call<List<Post>> doGetPost()
}
