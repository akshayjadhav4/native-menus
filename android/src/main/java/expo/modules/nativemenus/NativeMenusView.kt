package expo.modules.nativemenus

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.kotlin.records.Field
import expo.modules.kotlin.records.Record
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import expo.modules.kotlin.viewevent.EventDispatcher

class MenuItemProps : Record {
    @Field
    var title: String = ""
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
