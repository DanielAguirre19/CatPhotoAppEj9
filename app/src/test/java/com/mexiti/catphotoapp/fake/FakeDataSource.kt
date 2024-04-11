package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.model.DogPhoto


object FakeDataSource{
    const val idOne = "idCat1"
    const val idTwo = "idCat2"
    const val imgOne = "url.1"
    const val imgTwo = "url.2"
    const val widthOne = 225
    const val heightOne = 225
    const val widthTwo = 125
    const val heightTwo = 125


    val photoList = listOf(
        DogPhoto(
            idOne,
            imgOne,
            widthOne,
            heightOne,
        ),
        DogPhoto(idTwo,
            imgTwo,
            widthTwo,
            heightTwo,
        )
    )
}