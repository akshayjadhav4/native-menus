package expo.modules.nativemenus

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class NativeMenusModule : Module() {

    override fun definition() = ModuleDefinition {

        Name("NativeMenus")


        View(NativeMenusView::class) {
            Prop("menuItems") { view: NativeMenusView, prop: ArrayList<MenuItemProps> ->
                view.setData(prop)
            }
        }
    }
}
