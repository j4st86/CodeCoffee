package ru.wildberries.wbtech.android.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.base.AvatarSmallRoundedIcon
import ru.wildberries.wbtech.android.ui.base.AvatarRegularIcon
import ru.wildberries.wbtech.android.ui.base.GhostButton
import ru.wildberries.wbtech.android.ui.base.InfoChip
import ru.wildberries.wbtech.android.ui.base.PrimaryButton
import ru.wildberries.wbtech.android.ui.base.SearchBar
import ru.wildberries.wbtech.android.ui.base.SecondaryButton
import ru.wildberries.wbtech.android.ui.base.TypographyTutorial
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme

@Composable
fun TutorialScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = PaddingValues(top = 16.dp, bottom = 60.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        item {
            LazyRow {
                item {
                    PrimaryButton(text = "Button", isEnabled = true)
                }
                item {
                    SecondaryButton(text = "Button", isEnabled = true)
                }
                item {
                    GhostButton(text = "Button", isEnabled = true)
                }
            }
        }
        item {
            LazyRow {
                item {
                    PrimaryButton(text = "Button", isEnabled = false)
                }
                item {
                    SecondaryButton(text = "Button", isEnabled = false)
                }
                item {
                    GhostButton(text = "Button", isEnabled = false)
                }
            }
        }
        item {
            TypographyTutorial()
        }
        item {
            AvatarRegularIcon(image = R.drawable.ic_avatar)
        }
        item {
            AvatarSmallRoundedIcon(image = R.drawable.ic_avatar_meeting)
        }
        item {
            SearchBar()
        }
        item {
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                InfoChip(text = "Junior")
                InfoChip(text = "Android")
                InfoChip(text = "Moscow")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodeCoffeeTheme {
        TutorialScreen()
    }
}