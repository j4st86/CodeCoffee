package ru.wildberries.wbtech.android.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import ru.wildberries.wbtech.android.screens.ScreenGroups
import ru.wildberries.wbtech.android.screens.ScreenMeetings
import ru.wildberries.wbtech.android.screens.ScreenMore
import ru.wildberries.wbtech.android.screens.ScreenMyMeetings
import ru.wildberries.wbtech.android.screens.ScreenMyProfile

//Meetings navGraph
fun NavGraphBuilder.meetingsNavGraph(navController: NavController) {
    navigation(
        route = Destination.Meetings.route,
        startDestination = Destination.Meetings.Dashboard.route
    ) {
        composable(route = Destination.Meetings.Dashboard.route) {
            ScreenMeetings()
        }
    }
}

// Groups navGraph
fun NavGraphBuilder.groupsNavGraph(navController: NavController) {
    navigation(
        route = Destination.Groups.route,
        startDestination = Destination.Groups.Dashboard.route
    ) {
        composable(route = Destination.Groups.Dashboard.route) {
            ScreenGroups()
        }
    }
}

// More navGraph
fun NavGraphBuilder.moreNavGraph(navController: NavController) {
    navigation(
        route = Destination.More.route,
        startDestination = Destination.More.Dashboard.route
    ) {
        composable(route = Destination.More.Dashboard.route) {
            ScreenMore(
                goToMyProfile =  {
                    navController.navigate(Destination.More.MyProfile.route)
                },
                goToMyMeetings = {
                    navController.navigate(Destination.More.MyMeetings.route)
                },
            )
        }

        composable(route = Destination.More.MyProfile.route) {
            ScreenMyProfile()
        }

        composable(route = Destination.More.MyMeetings.route) {
            ScreenMyMeetings()
        }
    }
}