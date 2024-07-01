package ru.wildberries.wbtech.android.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {

    val navController = rememberNavController()
    val selectedPage = remember { mutableIntStateOf(0) }

    Scaffold(

        topBar = {
            NavTopBar(
                navController = navController
            )
        },

        bottomBar = {
            NavBottomBar(
                destinations = listOf(
                    Destination.Meetings.Dashboard,
                    Destination.Groups.Dashboard,
                    Destination.More.Dashboard
                ),
                selectedPage = selectedPage,
                navController = navController,
            )
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = Destination.Meetings.route,
            Modifier.padding(innerPadding)
        ) {
            meetingsNavGraph(navController = navController)
            groupsNavGraph(navController = navController)
            moreNavGraph(navController = navController)
        }
    }
}