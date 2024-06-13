//
//  DropdownMenuComponent.swift
//  NativeMenus
//
//  Created by Akshay Anil Jadhav on 06/06/24.
//

import SwiftUI

struct DropdownMenuComponent: View {
    @StateObject var viewModel: DropdownMenuViewModel
    var menuItems: [MenuItemProps] {
            return viewModel.menuItems
    }
    var onPress: (Int) -> Void
    var body: some View {
            Menu {
                ForEach(menuItems.indices, id: \.self) { index in
                    Button() {
                        onPress(index)
                    } label: {
                        Text(menuItems[index].title)
                    }
                }
            } label: {
                Image(systemName: "ellipsis")
                    .font(.title)
                    .padding()
            }
    }
}

