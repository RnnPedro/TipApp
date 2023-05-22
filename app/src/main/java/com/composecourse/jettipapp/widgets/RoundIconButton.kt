package com.composecourse.jettipapp.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


val IconButtonSizeModifier = Modifier.size(40.dp)

@Composable
fun RoundIconButton(
    modifier: Modifier = Modifier,
    image: Any,
    onClick: () -> Unit,
    tint: Color = Color.Black,
    backgroundColor: CardColors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
    elevation: CardElevation = cardElevation(4.dp)
) {
    Card(
        modifier = modifier
            .padding(all = 4.dp)
            .clickable { onClick.invoke() }
            .then(IconButtonSizeModifier),
        shape = CircleShape,
        colors = backgroundColor,
        elevation = elevation

    ) {
        when (image) {
            is ImageVector -> {
                Icon(
                    imageVector = image,
                    contentDescription = "Plus or minus icon",
                    modifier = Modifier
                        .fillMaxSize(),
                    tint = tint
                )
            }
            is Painter -> {
                Icon(
                    painter = image,
                    contentDescription = "Plus or minus icon",
                    modifier = Modifier
                        .fillMaxSize(),
                    tint = tint
                )
            }
            else -> {

            }
        }

    }

}