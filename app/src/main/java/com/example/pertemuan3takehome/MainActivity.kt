package com.example.pertemuan3takehome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    val profiles = listOf(
        ProfileData(
            name = R.string.name_bambang,
            address = R.string.address_bambang,
            cardColor = R.color.card_gray,
            isCursive = true
        ),
        ProfileData(
            name = R.string.name_gibran,
            phone = R.string.phone_gibran,
            address = R.string.address_gibran,
            cardColor = R.color.card_purple
        ),
        ProfileData(
            name = R.string.name_zhilal,
            phone = R.string.phone_zhilal,
            address = R.string.address_zhilal,
            cardColor = R.color.card_blue
        ),
        ProfileData(
            name = R.string.name_ahmad,
            phone = R.string.phone_ahmad,
            address = R.string.address_ahmad,
            cardColor = R.color.card_green
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .padding(dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.header_top_space)))

        Text(
            text = stringResource(R.string.title_main),
            color = colorResource(R.color.text_dark),
            fontSize = dimensionResource(R.dimen.text_size_title).value.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(R.string.subtitle_main),
            color = colorResource(R.color.text_dark),
            fontSize = dimensionResource(R.dimen.text_size_subtitle).value.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.header_bottom_space)))

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
        ) {
            profiles.forEach { profile ->
                ProfileCard(data = profile)
            }
        }

        Text(
            text = stringResource(R.string.footer_copyright),
            color = colorResource(R.color.text_dark),
            fontSize = dimensionResource(R.dimen.text_size_footer).value.sp
        )
    }
}

