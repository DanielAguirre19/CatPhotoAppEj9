package com.mexiti.catphotoapp.network

import com.mexiti.catphotoapp.model.DogPhoto
import retrofit2.http.GET

interface DogApiService{
    @GET("v1/images/search?limit=10")
    suspend fun getPhotos():List<DogPhoto>
}
