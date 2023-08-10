package com.example.myapp14;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PhoneService {
    //전체보기
    @GET("/list")
    Call<List<Phone>> findAll();
    //추가
    @POST("/insert")
    Call<Phone> save(@Body Phone phone);
    //수정
    //삭제
}
