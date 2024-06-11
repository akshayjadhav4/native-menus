import ExpoModulesCore

public class NativeMenusModule: Module {

  public func definition() -> ModuleDefinition {

    Name("NativeMenus")

    View(NativeMenusView.self) {
      // Defines a setter for the `name` prop.
        Prop("menuItems") { (view: NativeMenusView, prop: [MenuItemProps]) in
            view.viewModel.menuItems = prop
      }
    }
  }
}
