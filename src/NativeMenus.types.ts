import { ViewProps } from "react-native";
import type { SFSymbol } from "sf-symbols-typescript";

export type OnPressEvent = {
  index: number;
};

type NativeMenusBaseTypes = {
  /** MenuItem Lebal */
  title: string;

  /**
   * An optional icon to display on the MenuItem, specified per platform.
   * @property {AndroidIcons} [android] - The filled icon name the Android platform.
   * @property {SFSymbol} [ios] - The icon name for the iOS platform.
   */
  icon?: {
    android?: AndroidIcons;
    ios?: SFSymbol;
  };
};

export type NativeMenus = {
  menuItems: NativeMenusBaseTypes[];
  onPressEvent?: (event: { nativeEvent: OnPressEvent }) => void;
} & ViewProps;

type MenusViewType = NativeMenusBaseTypes & {
  /**
   * A callback function that is called when the MenuItem is pressed.
   */
  onPress: () => void;
};

export type NativeMenusViewProps = {
  menuItems: MenusViewType[];
};

/**
 * List generated from https://developer.android.com/reference/kotlin/androidx/compose/material/icons/Icons.Filled using script
 */
type AndroidIcons =
  | "AccountBox"
  | "AccountCircle"
  | "AddCircle"
  | "Add"
  | "ArrowBack"
  | "ArrowDropDown"
  | "ArrowForward"
  | "Build"
  | "Call"
  | "CheckCircle"
  | "Check"
  | "Clear"
  | "Close"
  | "Create"
  | "DateRange"
  | "Delete"
  | "Done"
  | "Edit"
  | "Email"
  | "ExitToApp"
  | "Face"
  | "FavoriteBorder"
  | "Favorite"
  | "Home"
  | "Info"
  | "KeyboardArrowDown"
  | "KeyboardArrowLeft"
  | "KeyboardArrowRight"
  | "KeyboardArrowUp"
  | "List"
  | "LocationOn"
  | "Lock"
  | "MailOutline"
  | "Menu"
  | "MoreVert"
  | "Notifications"
  | "Person"
  | "Phone"
  | "Place"
  | "PlayArrow"
  | "Refresh"
  | "Search"
  | "Send"
  | "Settings"
  | "Share"
  | "ShoppingCart"
  | "Star"
  | "ThumbUp"
  | "Warning";
