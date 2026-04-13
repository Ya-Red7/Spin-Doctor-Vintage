package com.spindoctor.vintage

import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.css.Style
import com.spindoctor.vintage.theme.AppStyles
import com.spindoctor.vintage.sections.*

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyles)

        Div(attrs = { classes(AppStyles.body) }) {
            HeroSection()
            RestorationQueue()
            ServiceMenu()
            ContactFooter()
        }
    }
}