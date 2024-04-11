package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.viewmodel.DogUiState
import com.mexiti.catphotoapp.viewmodel.DogViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import mx.unam.fi.randomphotoapp.rules.TestDispatcherRule

class DogViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()
    @Test
    fun imgViewModel_getRandomPhotos_verifyImgUiStateSuccess(){
        runTest {
            val imgViewModel = DogViewModel(
               dogPhotoRepository = FakeNetworkDogPhotoRepository()
            )
            assertEquals(DogUiState.Success(FakeDataSource.photoList), imgViewModel.dogUiState)
        }
    }
}