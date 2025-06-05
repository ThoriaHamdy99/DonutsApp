package com.example.donutsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.WhiteBackgroundColor
import com.example.donutsapp.ui.theme.BlackColor
import com.example.donutsapp.ui.theme.RoseBackgroundColor
import com.example.donutsapp.ui.theme.GonutsWithDonutsDescriptionColor
import com.example.donutsapp.ui.theme.TitleColor
import com.example.donutsapp.ui.theme.InterFont

@Composable
fun GonutsWithDonuts() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(RoseBackgroundColor)
    ) {
        Image(
            painter = painterResource(R.drawable.donuts_background),
            contentDescription = "background image",
            modifier = Modifier.align(Alignment.TopStart),
            contentScale = ContentScale.FillWidth
        )

        Column(
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp, bottom = 46.dp)
                .align(Alignment.BottomStart),
        ) {
            Text(
                text = "Gonuts\n" +
                        "with\n" +
                        "Donuts",
                color = TitleColor,
                fontFamily = InterFont,
                fontWeight = FontWeight.Bold,
                fontSize = 54.sp,
                lineHeight = 65.sp,
            )

            Text(
                text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                color = GonutsWithDonutsDescriptionColor,
                fontFamily = InterFont,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                lineHeight = 22.sp,
                modifier = Modifier.padding(top = 19.dp)
            )

            Box(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(50.dp))
                    .background(WhiteBackgroundColor)
                    .padding(vertical = 22.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Get Started",
                    color = BlackColor,
                    fontFamily = InterFont,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    lineHeight = 24.sp,
                )
            }

        }
    }
}

@Preview(widthDp = 428, heightDp = 926)
@Composable
fun GonutsWithDonutsPreview() {
    GonutsWithDonuts()
}