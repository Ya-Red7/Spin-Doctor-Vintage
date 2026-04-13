package com.spindoctor.vintage.sections
import androidx.compose.runtime.Composable
import com.spindoctor.vintage.theme.AppStyles
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.attributes.*

@Composable
fun ContactFooter(){
    Footer(attrs = {
        style {
            backgroundColor(AppStyles.oilBlack)
            color(AppStyles.chrome)
            padding(3.cssRem, 2.cssRem)
            textAlign("center")
            property("border-top", "3px solid ${AppStyles.rust}")
        }
    }){
        H3(attrs={style{fontFamily("Bebas Neue"); letterSpacing(2.px)}}){
            Text("VISIT THE SHOP")
        }
        P{ Text("122 chrome alley, industrial district")}
        P{ Text("MON-FRI: 09:00 - 18:00")}
        Br()

        A(href="mailto:william.henry.harrison@spindoctor.com", attrs={
            style{
                color(AppStyles.rust)
                textDecoration("none")
                fontWeight("bold")
                border(1.px, LineStyle.Solid, AppStyles.rust)
                padding(0.5.cssRem, 1.cssRem)
            }
        }){
            Text("Book a restoration")
            }
        P(attrs={style{marginTop(2.cssRem); fontSize(0.9.cssRem); opacity(0.7)}}){
            Text("@2026 Spin-Doctor Vintage.")
        }
    }
}