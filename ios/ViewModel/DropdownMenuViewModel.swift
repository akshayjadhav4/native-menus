//
//  DropdownMenuViewModel.swift
//  NativeMenus
//
//  Created by Akshay Anil Jadhav on 11/06/24.
//

import ExpoModulesCore
import Foundation


struct MenuItemIcon: Record {
  @Field
  var ios: String?
}

struct MenuItemProps: Record {
  @Field
  var title: String = ""
    
  @Field
  var icon: MenuItemIcon?
}

class DropdownMenuViewModel : ObservableObject {
    @Published var  menuItems: [MenuItemProps] = []
}
