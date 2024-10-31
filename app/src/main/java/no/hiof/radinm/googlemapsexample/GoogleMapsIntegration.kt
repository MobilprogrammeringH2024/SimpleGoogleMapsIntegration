package no.hiof.radinm.googlemapsexample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapScreen() {
    var isMapLoaded by remember { mutableStateOf(false) }

    // Adds starting position as Oslo
    val oslo = LatLng(59.91273, 10.74609)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(oslo, 15f)
    }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp)
    ) {

        // Google maps composable
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            onMapLoaded = { isMapLoaded = true },
            cameraPositionState = cameraPositionState

        )
    }

}