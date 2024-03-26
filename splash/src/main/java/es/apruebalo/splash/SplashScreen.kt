package es.apruebalo.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import es.apruebalo.navigatorutils.LocalNavigator
import es.apruebalo.navigatorutils.Navigator
import es.apruebalo.navigatorutils.Screens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen() {

    val navigator = LocalNavigator.current

    LaunchedEffect(key1 = true) {
        delay(5000)
        navigator.goBack()
        navigator.navigateTo(Screens.HomeScreen)
    }
    Splash()
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo licencia de armas",
            Modifier.size(150.dp, 150.dp)
        )
        Text(
            "Bienvenid@s",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}