package no.hiof.radinm.googlemapsexample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import no.hiof.radinm.googlemapsexample.ui.theme.GoogleMapsExampleTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoogleMapsExampleTheme {
                GoogleMapsApp()
            }

        }
    }
}

@Composable
fun GoogleMapsApp() {
    // This is the main app structure
    Navigation()
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