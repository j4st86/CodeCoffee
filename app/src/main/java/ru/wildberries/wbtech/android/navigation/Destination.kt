package ru.wildberries.wbtech.android.navigation

import androidx.annotation.DrawableRes
import ru.wildberries.wbtech.android.R

sealed class Destination(
    val route: String,
    val textId: String,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int
){

    // Meetings screens
    sealed class Meetings(route: String) : Destination(
        "${Meetings.route}/$route",
        "Встречи",
        R.drawable.ic_selected_dot,
        R.drawable.ic_meetings
    ) {
        data object Dashboard : Meetings("dashboard")
        // implement new inner screens here

        companion object {
            const val route = "meetings"
        }
    }

    // Groups screens
    sealed class Groups(route: String) : Destination(
        "${Groups.route}/$route",
        "Сообщества",
        R.drawable.ic_selected_dot,
        R.drawable.ic_groups
    ) {
        data object Dashboard : Groups("dashboard")
        // implement new inner screens here

        companion object {
            const val route = "groups"
        }
    }

    // More screens
    sealed class More(route: String) : Destination(
        "${More.route}/$route",
        "Ещё",
        R.drawable.ic_selected_dot,
        R.drawable.ic_more_settings
    ) {
        data object Dashboard : More("dashboard")
        data object MyProfile : More("my_profile")
        data object MyMeetings : More("my_meetings")
        // implement new inner screens here

        companion object {
            const val route = "more"
        }
    }
}