//
//  DropdownMenuComponent.swift
//  NativeMenus
//
//  Created by Akshay Anil Jadhav on 06/06/24.
//

import SwiftUI

struct DropdownMenuComponent: View {
    
    var body: some View {
        
        if #available(iOS 14.0, *) {
            Menu {
                Button(action: {
                    print("Option 1 selected")
                }) {
                    Text("Option 1")
                }
                
                Button(action: {
                    print("Option 2 selected")
                }) {
                    Text("Option 1")
                }
                
                Button(action: {
                    print("Option 3 selected")
                }) {
                    Text("Option 1")
                }
            } label: {
                Image(systemName: "ellipsis")
                    .font(.title)
                    .padding()
            }
        } else {
            Image(systemName: "ellipsis")
                .font(.title)
                .padding()
                .contextMenu {
                    Button(action: {
                        print("Option 1 selected")
                    }) {
                        Text("Option 1")
                        
                    }
                }
        }
    }
}

