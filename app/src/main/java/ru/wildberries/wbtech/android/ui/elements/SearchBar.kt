package ru.wildberries.wbtech.android.ui.elements

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.ui.theme.BodyText1
import ru.wildberries.wbtech.android.ui.theme.SearchBarContainerColor
import ru.wildberries.wbtech.android.ui.theme.SearchBarContentColor

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    var text by rememberSaveable {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(4.dp),
            value = text,
            onValueChange = { text = it },
            placeholder = {
                Text(
                    text = "Поиск",
                    color = SearchBarContentColor,
                    fontSize = MaterialTheme.typography.BodyText1.fontSize,
                    fontFamily = MaterialTheme.typography.BodyText1.fontFamily
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "Search Icon",
                    tint = SearchBarContentColor
                )
            },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                focusedContainerColor = SearchBarContainerColor,
                unfocusedContainerColor = SearchBarContainerColor
            )
        )
    }
}