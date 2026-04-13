package com.spindoctor.vintage.sections
import androidx.compose.runtime.Composable
import com.spindoctor.vintage.theme.AppStyles
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.attributes.*

@Composable
fun HeroSection(){
    Header(attrs = { classes(AppStyles.heroSection) }){
        H1(attrs = { classes(AppStyles.vintageHeader) }){
            Text("Spin-Doctor Vintage")
        }
        P(attrs={
            style{
                fontSize(1.2.cssRem)
                maxWidth(600.px)
                color(AppStyles.chrome)
            }
        }){
            Text("Precision restoration for the golden ers of steel. We breathe life into 70s and 80s racing legends.")
        }
    }
}