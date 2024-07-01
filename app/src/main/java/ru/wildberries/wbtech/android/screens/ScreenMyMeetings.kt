package ru.wildberries.wbtech.android.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.data.GoingEventsTest
import ru.wildberries.wbtech.android.ui.elements.MeetingCard
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme

@Composable
fun ScreenMyMeetings() {
    var tabIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf("ЗАПЛАНИРОВАНО", "УЖЕ ПРОШЛИ")
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        TabRow(
            selectedTabIndex = tabIndex,
            contentColor = CodeAndCoffeeTheme.colors.brandDefaultColor,
            containerColor = CodeAndCoffeeTheme.colors.neutralWhiteColor,
            indicator = { tabPositions ->
                if (tabIndex < tabPositions.size) {
                    SecondaryIndicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[tabIndex]),
                        color = CodeAndCoffeeTheme.colors.brandDefaultColor
                    )
                }
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(text = { Text(text = title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        when (tabIndex) {
            0 -> MyPlannedMeetings()
            1 -> MyPlannedMeetings()
        }
    }
}

@Composable
fun MyPlannedMeetings() {
    LazyColumn(
        Modifier
            .fillMaxSize()
    ) {
        item {
            MeetingCard(
                meetingImage = R.drawable.ic_ttttt,
                meetingName = "Android 3w23213 ",
                meetingLocation = "Moscow",
                isGoing = false,
                chipsData = listOf("junior", "android", "Python")
            )
        }
        item {
            HorizontalDivider(
                color = CodeAndCoffeeTheme.colors.neutralLineColor,
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
        item {
            MeetingCard(
                meetingImage = R.drawable.ic_ttttt,
                meetingName = "Android 3w23213 ",
                meetingLocation = "Moscow",
                isGoing = true,
                chipsData = listOf("junior", "android", "Python")
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun yyyyy() {
    CodeCoffeeTheme {
        ScreenMyMeetings()
    }
}