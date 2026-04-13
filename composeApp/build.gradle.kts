plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    js (IR){
        browser{
            commonWebpackConfig {
                outputFileName = "main.js"
            }
        }
        binaries.executable()
    }

    
    sourceSets {
        val jsMain by getting {
            dependencies{
                implementation(compose.html.core)
                implementation(compose.runtime)
                implementation(kotlin("stdlib-js"))
            }
        }
//        val jsTest by getting {
//            dependencies{
//                implementation(kotlin("test.js"))
//            }
//        }
    }
}


