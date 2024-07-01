package ru.wildberries.wbtech.android.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme

@Composable
fun NavBottomBar(
    destinations: List<Destination>,
    selectedPage: MutableIntState,
    navController: NavController
) {
    NavigationBar {
        destinations.forEachIndexed { index, item ->
            val isSelected = index == selectedPage.intValue
            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    selectedPage.intValue = index
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        if (isSelected) {
                            Text(
                                text = item.textId,
                                style = CodeAndCoffeeTheme.typography.bodyText1
                            )
                            Image(
                                painter = painterResource(id = item.selectedIcon),
                                contentDescription = "Selected",
                                Modifier.size(4.dp)
                            )
                        } else {
                            Image(
                                painter = painterResource(id = item.unselectedIcon),
                                contentDescription = "Unselected",
                                Modifier.size(32.dp)
                            )
                        }
                    }
                }
            )
        }
    }
}