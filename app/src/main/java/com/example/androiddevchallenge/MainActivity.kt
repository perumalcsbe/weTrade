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
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.Crossfade
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.core.view.WindowCompat
import com.example.androiddevchallenge.ui.screen.Home
import com.example.androiddevchallenge.ui.screen.Login
import com.example.androiddevchallenge.ui.screen.Welcome
import com.example.androiddevchallenge.ui.theme.WeTradeTheme
import com.example.androiddevchallenge.ui.util.LocalBackDispatcher
import com.example.androiddevchallenge.ui.util.Navigator
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

class MainActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            WeTradeTheme {
                ProvideWindowInsets {
                    WeTradeApp(OnBackPressedDispatcher())
                }
            }
        }
    }
}

// Start building your app here!
@ExperimentalMaterialApi
@Composable
fun WeTradeApp(backPressedDispatcher: OnBackPressedDispatcher) {
    val navigator: Navigator<Destination> = rememberSaveable(
        saver = Navigator.saver(backPressedDispatcher)
    ) {
        Navigator(Destination.Welcome, backPressedDispatcher)
    }
    val actions = remember(navigator) { Actions(navigator) }

    CompositionLocalProvider(LocalBackDispatcher provides backPressedDispatcher) {
        Crossfade(navigator.current) { destination ->
            when (destination) {
                Destination.Welcome -> Welcome(actions.onLoginClick)
                is Destination.Login -> Login(actions.onLoginSubmit)
                is Destination.Home -> Home()
            }
        }
    }
}
