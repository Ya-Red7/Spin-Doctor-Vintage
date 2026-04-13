package com.spindoctor.vintage.sections
            import androidx.compose.runtime.Composable
            import com.spindoctor.vintage.components.ServiceItem
            import com.spindoctor.vintage.theme.AppStyles
            import org.jetbrains.compose.web.dom.*
            import org.jetbrains.compose.web.css.*
            import org.jetbrains.compose.web.attributes.*

            @Composable
            fun ServiceMenu(){
                Section(attrs={
        style {
            padding(4.cssRem, 2.cssRem)
            backgroundColor(Color.white)
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            alignItems(AlignItems.Center)
        }
    }) {
        H2(attrs = {
            style {
                fontFamily("Bebas Neue")
                fontSize(3.cssRem)
                color(AppStyles.racingGreen)
                marginBottom(2.cssRem)
            }
        }) {
            Text("Proffesional tuning services")
        }

        Div(attrs = {
            style{
                maxWidth(800.px)
                width(100.percent)
                border(1.px, LineStyle.Dashed, AppStyles.oilBlack)
                padding(2.cssRem)
            }
        }) {
            ServiceItem("Full strip & polish", "$249", "Frame-up restoration including chrome buffing.")
            ServiceItem("Cable routing", "$85", "Internal & external routing with period-correct housing.")
            ServiceItem("Bottom bracket overhaul", "$120", "Precision cleaning & repacking of vintage bearings.")
        }
    }
}