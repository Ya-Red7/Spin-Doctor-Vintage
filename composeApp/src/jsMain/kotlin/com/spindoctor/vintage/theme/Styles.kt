package com.spindoctor.vintage.theme
import org.jetbrains.compose.web.css.*

object AppStyles: StyleSheet() {
    val racingGreen = Color("#1B4D3E")
    val chrome = Color("#C0C0C0")
    val rust = Color("#B7410E")
    val offWhite = Color("#F5F5F5")
    val oilBlack = Color("#121212")
    val chromeSilver = Color("#C0C0C0")

    val body by style{
        margin(0.px)
        padding(0.px)
        backgroundColor(offWhite)
        fontFamily("Courier Prime", "monospace")
    }
    val heroSection by style{
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        padding(4.cssRem, 2.cssRem)
        backgroundColor(racingGreen)
        color(chrome)
        property("borderBottom","3.px, LineStyle.Solid, chrome")
        textAlign("center")
    }
    val bikeGrid by style{
        display(DisplayStyle.Grid)
        gridTemplateColumns("repeat(auto-fill, minmax(300px, 1fr))")
        gap(2.cssRem)
        padding(2.cssRem)
        maxWidth(1200.px)
        property("margin", "0 auto")
    }
    val vintageHeader by style{
        fontFamily("Bebas Neue", "san-serif")
        fontSize(5.cssRem)
        letterSpacing(4.px)
        margin(0.px)
        color(chrome)
        property("text-shadow", "2px 2px 0px #121212")
    }
}