package com.mexiti.catphotoapp.data

import com.mexiti.catphotoapp.model.DogPhoto
import com.mexiti.catphotoapp.network.DogApiService

interface DogPhotoRepository{
    suspend fun getDogPhotos(): List<DogPhoto>
}

class NetworkDogPhotoRepository(private val dogApiService: DogApiService): DogPhotoRepository{
    override suspend fun getDogPhotos(): List<DogPhoto> {
        val listResult = dogApiService.getPhotos()
        val listResult2 = dogApiService.getPhotos()
        val combinedList = listResult + listResult2
        return combinedList
    }
}