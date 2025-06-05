package com.example.donutsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.BlackColor
import com.example.donutsapp.ui.theme.InterFont
import com.example.donutsapp.ui.theme.RoseBackgroundColor
import com.example.donutsapp.ui.theme.TitleColor
import com.example.donutsapp.ui.theme.WhiteBackgroundColor

@Composable
fun DonutsCartScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteBackgroundColor)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .size(500.dp)
                .background(RoseBackgroundColor)
        )
        Image(
            painter = painterResource(R.drawable.donut_image_6),
            contentDescription = "donuts image",
            modifier = Modifier
                .padding(top = 28.dp)
                .align(Alignment.TopCenter),
        )

        Image(
            painter = painterResource(R.drawable.ic_round_arrow_back_ios),
            contentDescription = "back arrow",
            modifier = Modifier
                .padding(top = 45.dp, start = 32.dp)
                .size(30.dp),
            colorFilter = ColorFilter.tint(TitleColor)
        )

        Column(
            modifier = Modifier
                .padding(top = 436.dp)
                .fillMaxSize()
                .clip(RoundedCornerShape(40.dp, 40.dp, 0.dp, 0.dp))
                .background(WhiteBackgroundColor)
        ) {
            Text(
                text = "Strawberry Wheel",
                fontFamily = InterFont,
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp,
                lineHeight = 36.sp,
                letterSpacing = 0.sp,
                color = TitleColor,
                modifier = Modifier.padding(
                    top = 35.dp, start = 38.dp, end = 38.dp
                )
            )
            Text(
                text = "About Gonut",
                fontFamily = InterFont,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                lineHeight = 22.sp,
                letterSpacing = 0.sp,
                color = BlackColor.copy(0.8f),
                modifier = Modifier.padding(
                    top = 33.dp, start = 38.dp, end = 38.dp
                )
            )
            Text(
                text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                fontFamily = InterFont,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 17.sp,
                letterSpacing = 0.sp,
                color = BlackColor.copy(0.6f),
                modifier = Modifier.padding(
                    top = 16.dp, start = 38.dp, end = 38.dp
                )
            )
            Text(
                text = "Quantity",
                fontFamily = InterFont,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                lineHeight = 22.sp,
                letterSpacing = 0.sp,
                color = BlackColor.copy(0.8f),
                modifier = Modifier.padding(
                    top = 26.dp, start = 38.dp, end = 38.dp
                )
            )
            Row(
                modifier = Modifier
                    .padding(top = 19.dp, start = 38.dp, end = 40.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .shadow(
                            elevation = 20.dp,
                            shape = RoundedCornerShape(15.dp),
                            ambientColor = BlackColor,
                            spotColor = BlackColor.copy(0.1f)
                        )
                        .background(WhiteBackgroundColor),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "-",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        lineHeight = 39.sp,
                        letterSpacing = 0.sp,
                        color = BlackColor,
                    )
                }
                Spacer(Modifier.width(20.dp))
                Box(
                    modifier = Modifier
                        .size(45.dp)
//                         .clip(RoundedCornerShape(15.dp))
                        .shadow(
                            elevation = 20.dp,
                            shape = RoundedCornerShape(15.dp),
                            ambientColor = BlackColor,
                            spotColor = BlackColor.copy(0.1f)
                        )
                        .background(WhiteBackgroundColor),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "1",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        lineHeight = 39.sp,
                        letterSpacing = 0.sp,
                        color = BlackColor,
                    )
                }
                Spacer(Modifier.width(20.dp))
                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .shadow(
                            elevation = 20.dp,
                            shape = RoundedCornerShape(15.dp),
                            ambientColor = BlackColor,
                            spotColor = BlackColor.copy(0.1f)
                        )
                        .background(BlackColor),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "+",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        lineHeight = 39.sp,
                        letterSpacing = 0.sp,
                        color = WhiteBackgroundColor,
                    )
                }
            }
            Spacer(Modifier.height(47.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "£16",
                    fontFamily = InterFont,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 30.sp,
                    lineHeight = 36.sp,
                    letterSpacing = 0.sp,
                    color = BlackColor,
                    modifier = Modifier.padding(end = 26.dp)
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(50.dp))
                        .background(TitleColor)
                        .padding(vertical = 22.dp)
                ) {
                    Text(
                        text = "Add to Cart",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        lineHeight = 24.sp,
                        letterSpacing = 0.sp,
                        color = WhiteBackgroundColor,
                        modifier = Modifier
                            .padding(end = 26.dp)
                            .align(Alignment.Center)
                    )
                }
            }
            Spacer(Modifier.height(39.dp))
        }

        Box(
            modifier = Modifier
                .padding(top = 413.dp, end = 33.dp)
                .size(45.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(WhiteBackgroundColor)
                .align(Alignment.TopEnd),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_round_favpourite),
                contentDescription = "favourite icon",
                modifier = Modifier
                    .size(35.dp),
                colorFilter = ColorFilter.tint(TitleColor)
            )
        }

    }
}

@Preview(widthDp = 428, heightDp = 926)
@Composable
fun DonutsCartScreenPreview() {
    DonutsCartScreen()
}