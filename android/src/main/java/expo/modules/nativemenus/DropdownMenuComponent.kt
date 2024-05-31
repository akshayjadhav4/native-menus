package expo.modules.nativemenus


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DropdownMenuComponent() {
    var expanded by remember { mutableStateOf(false) }
    Box(
        Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)
    ) {


        IconButton(onClick = { expanded = true }) {
            Icon(Icons.Default.MoreVert, contentDescription = "Localized description")
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = {
                Text("Edit")
            }, onClick = { expanded = false })
            DropdownMenuItem(text = {
                Text("Delete")
            }, onClick = { expanded = false })
            DropdownMenuItem(text = {
                Text("Move")
            }, onClick = { expanded = false })
            DropdownMenuItem(text = {
                Text("Refresh")
            }, onClick = { expanded = false })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropdownMenuComponentPreview() {
    DropdownMenuComponent()
}