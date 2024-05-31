package expo.modules.nativemenus

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class NativeMenusModule : Module() {

    override fun definition() = ModuleDefinition {

        Name("NativeMenus")


        View(NativeMenusView::class) {
            Prop("name") { view: NativeMenusView, prop: String ->
                println(prop)
            }
        }
    }
}
