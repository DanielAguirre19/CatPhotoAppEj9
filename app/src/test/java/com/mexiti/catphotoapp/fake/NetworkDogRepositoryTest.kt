package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.data.NetworkDogPhotoRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Test

class NetworkDogPhotRepositoryTest {
    @Test
    fun networkCatPhotoRepository_getCatPhotos_verifyPhotoList(){
        runTest {
            val repository = NetworkDogPhotoRepository(
                dogApiService = FakeDogApiService()
            )
            val photos = repository.getDogPhotos()
            val expectedPhotos = FakeDataSource.photoList + FakeDataSource.photoList
            assertEquals(expectedPhotos, photos)
        }
    }
}