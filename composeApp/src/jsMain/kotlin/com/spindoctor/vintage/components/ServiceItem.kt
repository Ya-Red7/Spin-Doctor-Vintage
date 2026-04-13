package com.spindoctor.vintage.components
import androidx.compose.runtime.Composable
import com.spindoctor.vintage.theme.AppStyles
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.attributes.*

@Composable
fun ServiceItem(title: String, price: String, detail: String){
    Div(attrs={
        style{
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.SpaceBetween)
            alignItems(AlignItems.Center)
            property("border-bottom", "1px solid ${AppStyles.oilBlack}")
            marginBottom(1.cssRem)
            paddingBottom(0.5.cssRem)
        }
    }){
        Div{
            H4(attrs={ style{margin(0.px); color(AppStyles.racingGreen)}}) {Text(title)}
            P(attrs={ style{fontSize(0.9.cssRem); margin(0.px); color(Color.gray)}}) {Text(detail)}
        }
        Span(attrs={ style{fontWeight("bold"); color(AppStyles.rust); fontSize(1.2.cssRem)}}) {Text(price)}

    }
}