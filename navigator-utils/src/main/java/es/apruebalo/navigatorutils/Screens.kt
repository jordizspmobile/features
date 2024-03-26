package es.apruebalo.navigatorutils

sealed class Screens(val route: String) {
    object SplashScreen: Screens(route = "splash_screen")
    object HomeScreen: Screens(route = "home_screen")
}