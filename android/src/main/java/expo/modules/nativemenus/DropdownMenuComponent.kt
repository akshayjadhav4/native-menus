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
fun DropdownMenuComponent(menuItemsState: List<MenuItemProps>, onPress: (Int) -> Unit) {
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
            menuItemsState.forEachIndexed { index, menuItem ->
                DropdownMenuItem(text = {
                    Text(menuItem.title)
                }, onClick = {
                    onPress(index)
                    expanded = false
                })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropdownMenuComponentPreview() {
    val dummyData = listOf(
        MenuItemProps().apply { title = "Dummy Item 1" },
        MenuItemProps().apply { title = "Dummy Item 2" },
        MenuItemProps().apply { title = "Dummy Item 3" }
    )
    DropdownMenuComponent(menuItemsState = dummyData) {index ->
        println("Pressed $index")
    }
}