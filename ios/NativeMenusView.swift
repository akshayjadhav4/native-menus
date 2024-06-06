import ExpoModulesCore
import SwiftUI
import UIKit

// This view will be used as a native component. Make sure to inherit from `ExpoView`
// to apply the proper styling (e.g. border radius and shadows).
class NativeMenusView: ExpoView {
    private let contentView: UIHostingController<DropdownMenuComponent>
        
        required init(appContext: AppContext? = nil) {
            contentView = UIHostingController(rootView: DropdownMenuComponent())
            
            super.init(appContext: appContext)
            
            clipsToBounds = true
            addSubview(contentView.view)
        }
        
        override func layoutSubviews() {
            contentView.view.frame = bounds
        }
}
