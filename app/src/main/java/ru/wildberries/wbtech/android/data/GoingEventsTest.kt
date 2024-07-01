package ru.wildberries.wbtech.android.data

import ru.wildberries.wbtech.android.R

data class GoingEventsTest(
    val image: Int = R.drawable.ic_ttttt,
    val name: String = "Android Developer",
    val location: String = "Moscow",
    val isGoing: Boolean = true,
    val chipsData: List<String> = listOf("Junior", "Android", "Kotlin", "Java")
)
