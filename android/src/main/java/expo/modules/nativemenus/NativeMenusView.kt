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

class MenuItemProps : Record {
    @Field
    var title: String = ""
}

class NativeMenusView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    var menuItemsState by mutableStateOf(listOf<MenuItemProps>())
    internal  val composeView = ComposeView(context).also {
        it.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        it.setContent {
            DropdownMenuComponent(menuItemsState)
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
