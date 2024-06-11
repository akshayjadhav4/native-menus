//
//  DropdownMenuComponent.swift
//  NativeMenus
//
//  Created by Akshay Anil Jadhav on 06/06/24.
//

import SwiftUI

struct DropdownMenuComponent: View {
    @StateObject var viewModel: DropdownMenuViewModel
    var body: some View {
            Menu {
                ForEach(viewModel.menuItems, id: \.title) { menu in
                    Button() {
                        print("Pressed")
                    } label: {
                        Text(menu.title)
                    }
                }
            } label: {
                Image(systemName: "ellipsis")
                    .font(.title)
                    .padding()
            }
    }
}

