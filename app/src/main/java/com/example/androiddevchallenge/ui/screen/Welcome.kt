/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.WeTradeTheme

@Composable
fun Welcome(onLoginClick: () -> Unit) {
    Surface(color = MaterialTheme.colors.primary) {
        Image(
            painterResource(id = R.drawable.ic_welcome_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            Modifier
                .fillMaxSize()
                .padding(
                    bottom = 32.dp,
                    top = 16.dp,
                    start = 16.dp,
                    end = 16.dp
                )
                .height(48.dp)
        ) {
            Image(
                painterResource(id = R.drawable.ic_logo),
                contentDescription = null,
                modifier = Modifier.align(Alignment.Center)
            )
            ButtonRow(
                onLoginClick,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .fillMaxWidth()
                    .height(48.dp),
            )
        }
    }
}

@Composable
private fun ButtonRow(
    onLoginClick: () -> Unit,
    modifier: Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = MaterialTheme.shapes.large,
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Text("GET STARTED")
        }
        Spacer(Modifier.width(8.dp))
        OutlinedButton(
            onClick = onLoginClick,
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color.Transparent,
            ),
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            shape = MaterialTheme.shapes.large,
            border = BorderStroke(ButtonDefaults.OutlinedBorderSize, MaterialTheme.colors.primary)
        ) {
            Text("LOG IN")
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomeLightPreview() {
    WeTradeTheme {
        Welcome(onLoginClick = {})
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomeDarkPreview() {
    WeTradeTheme(darkTheme = true) {
        Welcome(onLoginClick = {})
    }
}
