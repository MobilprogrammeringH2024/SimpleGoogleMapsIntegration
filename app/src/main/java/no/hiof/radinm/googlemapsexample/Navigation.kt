package no.hiof.radinm.googlemapsexample

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType

@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun Navigation() {
    var properties by remember { mutableStateOf(MapProperties(mapType = MapType.NORMAL)) }

    fun toggleMapType() {
        properties = properties.copy(
            mapType = if (properties.mapType == MapType.NORMAL) MapType.SATELLITE else MapType.NORMAL
        )
    }

    Scaffold (bottomBar = { BottomAppBar( actions = {
        IconButton(
            onClick = { toggleMapType()},
            modifier = Modifier.weight(1f)
            ) {
            Icon(Icons.Filled.Edit, contentDescription = "Satelite view")
        }
    }, Modifier.height(70.dp))

    },

    ) { paddingValues ->
        MapScreen(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            properties = properties)
            }



}
