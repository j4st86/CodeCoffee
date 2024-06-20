package ru.wildberries.wbtech.android.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.ui.theme.InfoChipBackgroundColor
import ru.wildberries.wbtech.android.ui.theme.InfoChipTextColor
import ru.wildberries.wbtech.android.ui.theme.Metadata3

@Composable
fun InfoChip(
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(
                color = InfoChipBackgroundColor,
                shape = RoundedCornerShape(40.dp)
            )
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Text(
            text = text,
            fontFamily = MaterialTheme.typography.Metadata3.fontFamily,
            color = InfoChipTextColor
        )
    }
}