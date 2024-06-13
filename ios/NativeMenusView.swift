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
    let onPressEvent = EventDispatcher()
    required init(appContext: AppContext? = nil) {
        var onPress: ((Int) -> Void)?
        contentView = UIHostingController(rootView: DropdownMenuComponent(viewModel: self.viewModel, onPress: { index in
            onPress?(index)
        }))
        
        super.init(appContext: appContext)
        onPress = { index in
            self.onPressEvent(["index": index])
        }
        clipsToBounds = true
        addSubview(contentView.view)
    }
    
    override func layoutSubviews() {
        contentView.view.frame = bounds
    }
}
