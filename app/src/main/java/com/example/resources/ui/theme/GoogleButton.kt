package com.example.resources.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.resources.R

@Composable
fun GoogleButton() {
    var clicked by remember {
        mutableStateOf(false)
    }


    Surface(
        onClick = {
            clicked = !clicked
        },
        shape = RoundedCornerShape(2.dp),
        border = BorderStroke(width = 1.dp, color = Color.LightGray),
        color = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .animateContentSize(
                    animationSpec = tween(
                        easing = FastOutLinearInEasing
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.google_icon),
                contentDescription = "Google button",
                tint = Color.Unspecified
            )
            Text(
                text = if(clicked) "Creating Account" else "  Sign Up with Google",
                fontSize = 18.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W400
            )
            Spacer(modifier = Modifier.width(8.dp))
            if (clicked)
                CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
        }

    }


}

@Preview
@Composable
fun Goo() {
    GoogleButton()
}