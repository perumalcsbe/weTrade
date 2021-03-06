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
package com.example.androiddevchallenge.repo

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Stock

object StocksRepo {

    val stocks: List<Stock> = listOf(
        Stock(
            symbol = "ALK",
            name = "Alaska Air Group, Inc",
            price = "$7,918",
            delta = -0.54,
            visualization = R.drawable.ic_home_alk
        ),
        Stock(
            symbol = "BA",
            name = "Boeing Co.",
            price = "$1,293",
            delta = 4.18,
            visualization = R.drawable.ic_home_ba
        ),
        Stock(
            symbol = "DAL",
            name = "Delta Airlines Inc.",
            price = "$893.50",
            delta = -0.54,
            visualization = R.drawable.ic_home_dal
        ),
        Stock(
            symbol = "EXPE",
            name = "Expedia Group Inc.",
            price = "$12,301",
            delta = 2.51,
            visualization = R.drawable.ic_home_exp
        ),
        Stock(
            symbol = "EADSY",
            name = "Airbus SE",
            price = "$12,301",
            delta = 1.38,
            visualization = R.drawable.ic_home_eadsy
        ),
        Stock(
            symbol = "JBLU",
            name = "Jetblue Airways Corp.",
            price = "$8,521",
            delta = 1.56,
            visualization = R.drawable.ic_home_jblu
        ),
        Stock(
            symbol = "MAR",
            name = "Marriott International Inc.",
            price = "$521",
            delta = 2.75,
            visualization = R.drawable.ic_home_mar
        ),
        Stock(
            symbol = "CCL",
            name = "Carnival Corp",
            price = "$5,481",
            delta = -0.14,
            visualization = R.drawable.ic_home_ccl
        ),
        Stock(
            symbol = "RCL",
            name = "Royal Caribbean Cruises",
            price = "$9,184",
            delta = 1.69,
            visualization = R.drawable.ic_home_rcl
        ),
        Stock(
            symbol = "TRVL",
            name = "Travelocity Inc.",
            price = "$654",
            delta = 3.23,
            visualization = R.drawable.ic_home_trvl
        ),
    )
}
