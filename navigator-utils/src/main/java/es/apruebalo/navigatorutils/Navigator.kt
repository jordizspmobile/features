package es.apruebalo.navigatorutils

import androidx.compose.runtime.Composable
import es.apruebalo.navigatorutils.models.NavigationModel

interface Navigator {
    @Composable
    fun CreateNavHost()
    fun navigateTo(screen: Screens)
    fun<T>navigateTo(screen: Screens, params: NavigationModel<T>? = null)
    fun goBack()
    fun goBackTo(screen: Screens, inclusive: Boolean = true)
}