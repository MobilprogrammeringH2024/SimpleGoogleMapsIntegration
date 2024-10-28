package no.hiof.radinm.googlemapsexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import no.hiof.radinm.googlemapsexample.ui.theme.GoogleMapsExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoogleMapsExampleTheme {
                MapScreen()
            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GoogleMapsExampleTheme {
        Greeting("Android")
    }
}
*/