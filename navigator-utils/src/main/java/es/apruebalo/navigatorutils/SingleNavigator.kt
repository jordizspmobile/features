package es.apruebalo.navigatorutils

import androidx.compose.runtime.staticCompositionLocalOf

val LocalNavigator = staticCompositionLocalOf<Navigator> {
    error("No Navigator provided")
}