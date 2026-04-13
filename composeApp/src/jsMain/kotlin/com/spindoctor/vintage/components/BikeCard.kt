package com.spindoctor.vintage.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.attributes.*
import com.spindoctor.vintage.theme.AppStyles

@Composable
fun BikeCard(name: String, description: String, tag: String) {
    Div(attrs = {
        style {
            border(2.px, LineStyle.Solid, AppStyles.racingGreen)
            padding(1.5.cssRem)
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            backgroundColor(Color.white)
        }
    }) {
        Span(attrs = {
            style {
                color(AppStyles.rust)
                fontWeight("bold")
                fontSize(0.8.cssRem)
            }
        }) { Text(tag) }

        H3 { Text(name) }
        P { Text(description) }
    }
}