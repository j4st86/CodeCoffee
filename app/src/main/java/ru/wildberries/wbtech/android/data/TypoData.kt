package ru.wildberries.wbtech.android.data

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit

data class TypoData(
    val fontFamily: FontFamily?,
    val fontSize: TextUnit,
    val title: String,
    val subTitle: String
)