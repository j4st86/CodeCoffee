package ru.wildberries.wbtech.android.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.elements.ProfileRow
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme

@Composable
fun ScreenMore(
    goToMyProfile: () -> Unit,
    goToMyMeetings: () -> Unit
) {
    LazyColumn(
        Modifier
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Profile row
        item {
            ProfileRow(
                profileImage = R.drawable.ic_ttttt,
                profileName = "Иван Иванов",
                profileNumber = "+7 999 999-99-99",
                goToMyProfile
            )
        }
        // My meetings row
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clickable(onClick = goToMyMeetings)
            ) {
                Row(modifier = Modifier.align(Alignment.CenterStart)) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_meetings),
                        contentDescription = "Meetings icon"
                    )
                    Spacer(modifier = Modifier.size(6.dp))
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.height(24.dp)
                    ) {
                        Text(
                            text = "Мои встречи",
                            color = CodeAndCoffeeTheme.colors.neutralActiveColor,
                            style = CodeAndCoffeeTheme.typography.bodyText1,
                        )
                    }
                }
                Box(Modifier.align(Alignment.CenterEnd)) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = "Right arrow"
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun tttttt() {
    CodeCoffeeTheme {
        //ScreenMore()
    }
}