package com.example.donutsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.BlackColor
import com.example.donutsapp.ui.theme.BlueColor
import com.example.donutsapp.ui.theme.InterFont
import com.example.donutsapp.ui.theme.RoseBackgroundColor
import com.example.donutsapp.ui.theme.TitleColor
import com.example.donutsapp.ui.theme.WhiteBackgroundColor

@Composable
fun DonutsHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteBackgroundColor)
            .padding(top = 81.dp)
    ) {
        TitleSearchSection()
        OffersSection()
        DonutsSection()
        BottomActionBar()
    }
}

@Composable
fun BottomActionBar() {
    Row(
        modifier = Modifier.fillMaxWidth()
        .padding(start = 38.dp, end = 38.dp, top = 34.dp, bottom = 34.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(R.drawable.home_icon),
            contentDescription = "favourite icon",
            modifier = Modifier.size(35.dp)
        )
        Image(
            painter = painterResource(R.drawable.heart_icon),
            contentDescription = "favourite icon",
            modifier = Modifier.size(35.dp)
        )
        Image(
            painter = painterResource(R.drawable.notification_icon),
            contentDescription = "favourite icon",
            modifier = Modifier.size(35.dp)
        )
        Image(
            painter = painterResource(R.drawable.cart_icon),
            contentDescription = "favourite icon",
            modifier = Modifier.size(35.dp)
        )
        Image(
            painter = painterResource(R.drawable.profile_icon),
            contentDescription = "favourite icon",
            modifier = Modifier.size(35.dp)
        )
    }
}

@Composable
fun DonutsSection() {
    Column(
        modifier = Modifier
            .padding(top = 46.dp)
    ) {
        Text(
            text = "Donuts",
            fontFamily = InterFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
            color = BlackColor,
            modifier = Modifier.padding(horizontal = 38.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()

                .horizontalScroll(rememberScrollState()),
        ) {
            Spacer(Modifier.width(38.dp))
            Box(
                modifier = Modifier.height(167.dp).width(138.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 55.dp)
                        .shadow(
                            elevation = 30.dp,
                            shape = RoundedCornerShape(15.dp),
                            ambientColor = BlackColor,
                            spotColor = BlackColor.copy(0.2f)
                        )
                        .fillMaxWidth()
                        .height(111.dp)
                        .background(color = WhiteBackgroundColor)
                        .padding(
                            start = 11.dp, end = 11.dp
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Chocolate Cherry",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        letterSpacing = 0.sp,
                        color = BlackColor.copy(0.6f),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 63.dp
                            ),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "$22",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        letterSpacing = 0.sp,
                        color = TitleColor,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 10.dp
                            ),
                        textAlign = TextAlign.Center
                    )
                }
                Image(
                    painter = painterResource(R.drawable.donut_image_3),
                    contentDescription = "favourite icon",
                    modifier = Modifier.size(width = 137.dp, height = 138.dp)
                )
            }
            Spacer(Modifier.width(21.dp))
            Box(
                modifier = Modifier.height(167.dp).width(138.dp)
            ) {
                Column(
                    modifier = Modifier

                        .padding(top = 55.dp)
                        .shadow(
                            elevation = 30.dp,
                            shape = RoundedCornerShape(15.dp),
                            ambientColor = BlackColor,
                            spotColor = BlackColor.copy(0.2f)
                        )
                        .fillMaxWidth()
                        .height(111.dp)
                        .background(color = WhiteBackgroundColor)
                        .padding(
                            start = 11.dp, end = 11.dp
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Strawberry Rain",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        letterSpacing = 0.sp,
                        color = BlackColor.copy(0.6f),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 63.dp
                            ),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "$22",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        letterSpacing = 0.sp,
                        color = TitleColor,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 10.dp
                            ),
                        textAlign = TextAlign.Center
                    )
                }
                Image(
                    painter = painterResource(R.drawable.donut_image_4),
                    contentDescription = "favourite icon",
                    modifier = Modifier.size(width = 137.dp, height = 138.dp)
                )
            }
            Spacer(Modifier.width(21.dp))
            Box(
                modifier = Modifier.height(167.dp).width(138.dp)
            ) {
                Column(
                    modifier = Modifier

                        .padding(top = 55.dp)
                        .shadow(
                            elevation = 30.dp,
                            shape = RoundedCornerShape(15.dp),
                            ambientColor = BlackColor,
                            spotColor = BlackColor.copy(0.2f)
                        )
                        .fillMaxWidth()
                        .height(111.dp)
                        .background(color = WhiteBackgroundColor)
                        .padding(
                            start = 11.dp, end = 11.dp
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Strawberry Coco",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        letterSpacing = 0.sp,
                        color = BlackColor.copy(0.6f),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 70.dp
                            ),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "$22",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        letterSpacing = 0.sp,
                        color = TitleColor,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 10.dp
                            ),
                        textAlign = TextAlign.Center
                    )
                }
                Image(
                    painter = painterResource(R.drawable.donut_image_5),
                    contentDescription = "favourite icon",
                    modifier = Modifier.size(width = 137.dp, height = 138.dp)
                )
            }
            Spacer(Modifier.width(38.dp))
        }
    }
}

@Composable
fun OffersSection() {
    Column(
        modifier = Modifier
            .padding(top = 54.dp,start = 38.dp, end = 38.dp)
    ) {
        Text(
            text = "Today Offers",
            fontFamily = InterFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
            color = BlackColor
        )

        Row(
            modifier = Modifier
                .padding(top = 25.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .width(238.dp)
                    .height(325.dp)
                    .fillMaxHeight()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 40.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(BlueColor)
                )
                Column {
                    Box(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(35.dp)
                            .clip(RoundedCornerShape(100.dp))
                            .background(WhiteBackgroundColor)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.favourite_icon),
                            contentDescription = "favourite icon",
                            modifier = Modifier.align(Alignment.Center),
                        )
                    }
                    Image(
                        painter = painterResource(R.drawable.donut_image_2),
                        contentDescription = "favourite icon",
                        modifier = Modifier
                            .size(width = 137.dp, height = 138.dp)
                            .align(Alignment.End),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Strawberry Wheel",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 19.sp,
                        letterSpacing = 0.sp,
                        overflow = TextOverflow.Ellipsis,
                        color = BlackColor,
                        modifier = Modifier.padding(start = 20.dp, end = 40.dp)
                    )
                    Text(
                        text = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        lineHeight = 15.sp,
                        letterSpacing = 0.sp,
                        color = BlackColor.copy(0.6f),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(start = 20.dp, end = 40.dp, top = 9.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, end = 55.dp, bottom = 15.dp, top = 5.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$20",
                            fontFamily = InterFont,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp,
                            lineHeight = 17.sp,
                            letterSpacing = 0.sp,
                            overflow = TextOverflow.Ellipsis,
                            color = BlackColor,
                            textDecoration = TextDecoration.LineThrough
                        )
                        Text(
                            text = "$16",
                            fontFamily = InterFont,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 22.sp,
                            lineHeight = 27.sp,
                            letterSpacing = 0.sp,
                            color = BlackColor,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                }
            }

            Box(
                modifier = Modifier
                    .width(238.dp)
                    .height(325.dp)
                    .fillMaxHeight()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 40.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(BlueColor)
                )
                Column {
                    Box(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(35.dp)
                            .clip(RoundedCornerShape(100.dp))
                            .background(WhiteBackgroundColor)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.favourite_icon),
                            contentDescription = "favourite icon",
                            modifier = Modifier.align(Alignment.Center),
                        )
                    }
                    Image(
                        painter = painterResource(R.drawable.donut_image_2),
                        contentDescription = "favourite icon",
                        modifier = Modifier
                            .size(width = 137.dp, height = 138.dp)
                            .align(Alignment.End),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Chocolate Glaze",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 19.sp,
                        letterSpacing = 0.sp,
                        overflow = TextOverflow.Ellipsis,
                        color = BlackColor,
                        modifier = Modifier.padding(start = 20.dp, end = 40.dp)
                    )
                    Text(
                        text = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                        fontFamily = InterFont,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        lineHeight = 15.sp,
                        letterSpacing = 0.sp,
                        color = BlackColor.copy(0.6f),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(start = 20.dp, end = 40.dp, top = 9.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, end = 55.dp, bottom = 15.dp, top = 5.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$20",
                            fontFamily = InterFont,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp,
                            lineHeight = 17.sp,
                            letterSpacing = 0.sp,
                            overflow = TextOverflow.Ellipsis,
                            color = BlackColor,
                            textDecoration = TextDecoration.LineThrough
                        )
                        Text(
                            text = "$16",
                            fontFamily = InterFont,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 22.sp,
                            lineHeight = 27.sp,
                            letterSpacing = 0.sp,
                            color = BlackColor,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TitleSearchSection() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 38.dp, end = 38.dp)
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Let’s Gonuts!",
                fontFamily = InterFont,
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp,
                lineHeight = 36.sp,
                letterSpacing = 0.sp,
                color = TitleColor
            )

            Text(
                text = "Order your favourite donuts from here",
                fontFamily = InterFont,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 17.sp,
                letterSpacing = 0.sp,
                color = BlackColor.copy(0.6f)
            )
        }
        Box(
            modifier = Modifier
                .size(45.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(RoseBackgroundColor)
                .align(Alignment.CenterVertically),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.search_icon),
                contentDescription = "search image"
            )
        }
    }
}

@Preview(widthDp = 428, heightDp = 926)
@Composable
fun DonutsHomeScreenPreview() {
    DonutsHomeScreen()
}