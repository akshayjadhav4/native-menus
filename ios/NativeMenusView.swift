import ExpoModulesCore
import SwiftUI
import UIKit

struct MenuItemProps: Record {
  @Field
  var title: String = ""
}


class NativeMenusView: ExpoView {
    private let contentView: UIHostingController<DropdownMenuComponent>
    let viewModel = DropdownMenuViewModel()
    required init(appContext: AppContext? = nil) {
        contentView = UIHostingController(rootView: DropdownMenuComponent(viewModel: self.viewModel))
        
        super.init(appContext: appContext)
        
        clipsToBounds = true
        addSubview(contentView.view)
    }
    
    override func layoutSubviews() {
        contentView.view.frame = bounds
    }
}
