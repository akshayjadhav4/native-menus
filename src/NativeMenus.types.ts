import { ViewProps } from "react-native";

export type OnPressEvent = {
  index: number;
};

export type NativeMenus = {
  menuItems: { title: string }[];
  onPressEvent?: (event: { nativeEvent: OnPressEvent }) => void;
} & ViewProps;

export type NativeMenusViewProps = {
  menuItems: { title: string; onPress: () => void }[];
};
