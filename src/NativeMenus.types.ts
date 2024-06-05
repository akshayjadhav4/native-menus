import { ViewProps } from "react-native";

type MenuItemProps = {
  title: string;
};

export type NativeMenusViewProps = {
  menuItems: MenuItemProps[];
} & ViewProps;
