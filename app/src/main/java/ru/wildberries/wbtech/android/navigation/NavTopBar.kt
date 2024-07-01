package ru.wildberries.wbtech.android.navigation

import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavTopBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    when (navBackStackEntry?.destination?.route) {
        //Meetings Top Bar
        Destination.Meetings.Dashboard.route -> {
            TopAppBar(
                title = {
                    Text(
                        text = "Встречи",
                        style = CodeAndCoffeeTheme.typography.subheading1,
                        color = CodeAndCoffeeTheme.colors.neutralActiveColor
                    )
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_add_meeting),
                            contentDescription = "Add meeting icon"
                        )
                    }
                }
            )
        }

        //Groups Top Bar
        Destination.Groups.Dashboard.route -> {
            TopAppBar(
                title = {
                    Text(
                        text = "Сообщества",
                        style = CodeAndCoffeeTheme.typography.subheading1,
                        color = CodeAndCoffeeTheme.colors.neutralActiveColor
                    )
                }
            )
        }

        // More Top Bar
        Destination.More.Dashboard.route -> {
            TopAppBar(
                title = {
                    Text(
                        text = "Ещё",
                        style = CodeAndCoffeeTheme.typography.subheading1,
                        color = CodeAndCoffeeTheme.colors.neutralActiveColor
                    )
                }
            )
        }

        // More My profile Top Bar
        Destination.More.MyProfile.route -> {
            TopAppBar(
                navigationIcon = {
                    IconButton({ navController.navigateUp() }) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_arrow_left),
                            contentDescription = "Back Arrow"
                        )
                    }
                },
                title = {
                    Text(
                        text = "Профиль",
                        style = CodeAndCoffeeTheme.typography.subheading1,
                        color = CodeAndCoffeeTheme.colors.neutralActiveColor
                    )
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_edit),
                            contentDescription = "Add meeting icon"
                        )
                    }
                }
            )
        }

        // More My meetings Top Bar
        Destination.More.MyMeetings.route -> {
            TopAppBar(
                navigationIcon = {
                    IconButton({ navController.navigateUp() }) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_arrow_left),
                            contentDescription = "Back Arrow"
                        )
                    }
                },
                title = {
                    Text(
                        text = "Мои встречи",
                        style = CodeAndCoffeeTheme.typography.subheading1,
                        color = CodeAndCoffeeTheme.colors.neutralActiveColor
                    )
                },
            )
        }
    }
}

