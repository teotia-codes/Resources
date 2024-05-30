package com.example.resources.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.example.resources.R

@OptIn(ExperimentalCoilApi::class)
@Composable
fun CoilImage() {
    Box(modifier = Modifier
        .height(150.dp)
        .width(200.dp),
        contentAlignment = Alignment.Center){
        val painter =  rememberImagePainter(data = "https://i.pinimg.com/originals/e3/63/16/e36316cfd05ca21e44d8fabcf1a192be.jpg",
            builder = {
                CircleCropTransformation()

            }
        )
        Image(painter = painter, contentDescription = "Avatar")
    }

}

@Preview
@Composable
fun Prev() {
    CoilImage()
}