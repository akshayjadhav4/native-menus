package expo.modules.nativemenus

import android.content.Context
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

class NativeMenusView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    internal  val composeView = ComposeView(context).also {
        it.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        it.setContent {
            DropdownMenuComponent()
        }
        addView(it)
    }
}
