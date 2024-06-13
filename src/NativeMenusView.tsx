import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";

import {
  NativeMenus,
  NativeMenusViewProps,
  OnPressEvent,
} from "./NativeMenus.types";

const NativeView: React.ComponentType<NativeMenus> =
  requireNativeViewManager("NativeMenus");

export default function NativeMenusView(props: NativeMenusViewProps) {
  const onPress = (event: { nativeEvent: OnPressEvent }) => {
    props?.menuItems[event.nativeEvent.index]?.onPress();
  };
  return (
    <NativeView
      style={{ width: 50, height: 50 }}
      onPressEvent={onPress}
      menuItems={props?.menuItems}
    />
  );
}
