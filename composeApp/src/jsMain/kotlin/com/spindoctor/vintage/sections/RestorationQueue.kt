package com.spindoctor.vintage.sections
import androidx.compose.runtime.Composable
import com.spindoctor.vintage.components.BikeCard
import com.spindoctor.vintage.theme.AppStyles
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.attributes.*

@Composable
fun RestorationQueue(){
    Section {
        H2(attrs = {
            style {
                textAlign("center")
                fontFamily("Bebas Neue")
                fontSize(3.cssRem)
                paddingTop(2.cssRem)
            }
        }) {
            Text("Currently on the stand")
        }
        Div(attrs = { classes(AppStyles.bikeGrid) }) {
            BikeCard("1974 Raleigh Professional", "Full chrome restore", "RACING GREEN/SILVER")
            BikeCard("1982 Colnago Mexico", "Saronni red - campagnolo super record", "CHROME SOUL")
            BikeCard("1979 Peugeot PX-10", "Original reynolds 531 tubing", "VINTAGE WHITE")
        }
    }
}
