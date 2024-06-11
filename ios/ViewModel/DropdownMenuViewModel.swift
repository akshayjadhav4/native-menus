//
//  DropdownMenuViewModel.swift
//  NativeMenus
//
//  Created by Akshay Anil Jadhav on 11/06/24.
//


import Foundation


class DropdownMenuViewModel : ObservableObject {
    @Published var  menuItems: [MenuItemProps] = []
}
