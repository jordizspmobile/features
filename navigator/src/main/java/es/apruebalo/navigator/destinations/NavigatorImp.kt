package es.apruebalo.navigator.destinations

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import es.apruebalo.home.HomeScreen
import es.apruebalo.navigatorutils.models.NavigationModel
import es.apruebalo.navigatorutils.Navigator
import es.apruebalo.navigatorutils.Screens
import es.apruebalo.splash.SplashScreen

class NavigatorImp(
    private val navController: NavHostController
): Navigator {

    @Composable
    override fun CreateNavHost() {
        NavHost(
            navController = navController,
            startDestination = Screens.SplashScreen.route
        ) {
            composable(Screens.SplashScreen.route) { SplashScreen() }
            composable(Screens.HomeScreen.route) { HomeScreen() }
        }
    }

    override fun navigateTo(screen: Screens) {
        navController.navigate(screen.route)
    }

    override fun <T> navigateTo(screen: Screens, params: NavigationModel<T>?) {
        navController.navigate(screen.route)
    }

    override fun goBack() {
        navController.popBackStack()
    }

    override fun goBackTo(screen: Screens, inclusive: Boolean) {
        navController.popBackStack(screen.route, inclusive)
    }
}