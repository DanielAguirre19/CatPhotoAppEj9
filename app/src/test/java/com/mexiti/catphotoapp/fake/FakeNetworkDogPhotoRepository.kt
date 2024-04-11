package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.data.DogPhotoRepository
import com.mexiti.catphotoapp.model.DogPhoto

class FakeNetworkDogPhotoRepository: DogPhotoRepository {
    override suspend fun getDogPhotos(): List<DogPhoto> {
        return FakeDataSource.photoList
    }
}