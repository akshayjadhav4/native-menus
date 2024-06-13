package expo.modules.nativemenus

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.records.Field
import expo.modules.kotlin.records.Record
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.views.ExpoView

class MenuItemIcon : Record {
    @Field
    var android: String? = null

    fun isIconNamePresent(): Boolean {
        // Check if icon is not null and icon.name is not null or blank
        return android?.isNotBlank() ?: false
    }
}

class MenuItemProps : Record {
    @Field
    var title: String = ""

    @Field
    var icon:MenuItemIcon? = null
}

class NativeMenusView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    var menuItemsState by mutableStateOf(listOf<MenuItemProps>())
    private val onPressEvent by EventDispatcher()

    internal  val composeView = ComposeView(context).also {
        it.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        it.setContent {
            DropdownMenuComponent(menuItemsState) {index ->
                onPressEvent(mapOf("index" to index))
            }
        }
        addView(it)
    }

    fun setData(data: ArrayList<MenuItemProps>) {
        val items: ArrayList<MenuItemProps> = ArrayList()
        for (menuItem in data) {
            items.add(menuItem)
        }
        menuItemsState = items
    }
}
