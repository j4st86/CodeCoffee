package ru.wildberries.wbtech.android.ui.base

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.data.TypoData
import ru.wildberries.wbtech.android.ui.theme.BodyText1
import ru.wildberries.wbtech.android.ui.theme.BodyText2
import ru.wildberries.wbtech.android.ui.theme.Heading1
import ru.wildberries.wbtech.android.ui.theme.Heading2
import ru.wildberries.wbtech.android.ui.theme.Metadata1
import ru.wildberries.wbtech.android.ui.theme.Metadata2
import ru.wildberries.wbtech.android.ui.theme.Metadata3
import ru.wildberries.wbtech.android.ui.theme.Subheading1
import ru.wildberries.wbtech.android.ui.theme.Subheading2
import ru.wildberries.wbtech.android.ui.theme.TypoSubTitleColor

@Composable
fun TypographyTutorial(modifier: Modifier = Modifier) {

    val typographyList = listOf(
        TypoData(
            fontFamily = MaterialTheme.typography.Heading1.fontFamily,
            fontSize = MaterialTheme.typography.Heading1.fontSize,
            title = "Heading 1",
            subTitle = "SF Pro Display/32/Bold"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.Heading2.fontFamily,
            fontSize = MaterialTheme.typography.Heading2.fontSize,
            title = "Heading 2",
            subTitle = "SF Pro Display/24/Bold"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.Subheading1.fontFamily,
            fontSize = MaterialTheme.typography.Subheading1.fontSize,
            title = "Subheading 1",
            subTitle = "SF Pro Display/18/SemiBold"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.Subheading2.fontFamily,
            fontSize = MaterialTheme.typography.Subheading2.fontSize,
            title = "Subheading 2",
            subTitle = "SF Pro Display/16/SemiBold"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.BodyText1.fontFamily,
            fontSize = MaterialTheme.typography.BodyText1.fontSize,
            title = "Body Text 1",
            subTitle = "SF Pro Display/14/SemiBold"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.BodyText2.fontFamily,
            fontSize = MaterialTheme.typography.BodyText2.fontSize,
            title = "Body Text 2",
            subTitle = "SF Pro Display/14/Regular"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.Metadata1.fontFamily,
            fontSize = MaterialTheme.typography.Metadata1.fontSize,
            title = "Metadata 1",
            subTitle = "SF Pro Display/12/Regular"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.Metadata2.fontFamily,
            fontSize = MaterialTheme.typography.Metadata2.fontSize,
            title = "Metadata 2",
            subTitle = "SF Pro Display/10/Regular"
        ),
        TypoData(
            fontFamily = MaterialTheme.typography.Metadata3.fontFamily,
            fontSize = MaterialTheme.typography.Metadata3.fontSize,
            title = "Metadata 3",
            subTitle = "SF Pro Display/10/SemiBold"
        ),
    )

    Column(
        modifier = Modifier
            .padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        typographyList.forEach {
            TypoRow(
                fontSize = it.fontSize,
                fontFamily = it.fontFamily,
                title = it.title,
                subTitle = it.subTitle
            )
        }
    }
}

@Composable
fun TypoRow(
    modifier: Modifier = Modifier,
    fontSize: TextUnit,
    fontFamily: FontFamily?,
    title: String,
    subTitle: String
) {
    val text = "The quick brown fox jumps over the lazy dog"
    LazyRow(
        modifier = Modifier
            .sizeIn(minHeight = 64.dp)
    ) {
        item {
            Column(
                modifier = Modifier
                    .padding(end = 16.dp)
                    .widthIn(200.dp)
            ) {
                Text(
                    text = title,
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontFamily = fontFamily
                )
                Text(
                    text = subTitle,
                    fontSize = MaterialTheme.typography.titleSmall.fontSize,
                    color = TypoSubTitleColor,
                    fontFamily = fontFamily
                )
            }
        }
        item {
            Text(
                text = text,
                fontSize = fontSize,
                fontFamily = fontFamily
            )
        }
    }
}