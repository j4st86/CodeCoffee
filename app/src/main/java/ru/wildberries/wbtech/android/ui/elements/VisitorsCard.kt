package ru.wildberries.wbtech.android.ui.elements

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.base.AvatarRoundedBorderedIcon
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme

@Composable
fun OverlappingVisitorsRow(
    accountsList: List<Int>,
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(4.dp)
        ) {
            OverlappingRow(overlappingPercentage = 0.20f) {
                for ((index, image) in accountsList.take(5).withIndex()) {
                    AvatarRoundedBorderedIcon(index, image)
                }
            }
            Text(
                text = "+" + (accountsList.size - 5),
                style = CodeAndCoffeeTheme.typography.bodyText1,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Composable
fun OverlappingRow(
    modifier: Modifier = Modifier,
    overlappingPercentage: Float,
    content: @Composable () -> Unit
) {
    val factor = (1 - overlappingPercentage)
    Layout(
        modifier = modifier,
        content = content,
        measurePolicy = { measurables, constraints ->
            val placeables = measurables.map { it.measure(constraints) }
            val widthsExceptFirst = placeables.subList(1, placeables.size).sumOf { it.width }
            val firstWidth = placeables.getOrNull(0)?.width ?: 0
            val width = (widthsExceptFirst * factor + firstWidth).toInt()
            val height = placeables.maxOf { it.height }
            layout(width, height) {
                var x = width - firstWidth
                for (placeable in placeables.asReversed()) {
                    placeable.placeRelative(x, 0, 0f)
                    x -= (placeable.width * factor).toInt()
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun eeeeeeeeee() {
    val list = MutableList(20) { R.drawable.ic_ttttt }
    list.add(0, R.drawable.ic_avatar_meeting)
    list.add(2, R.drawable.ic_avatar)

    CodeCoffeeTheme {
        OverlappingVisitorsRow(accountsList = list)
    }
}