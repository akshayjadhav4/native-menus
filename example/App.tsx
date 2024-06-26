import { NativeMenusView } from "native-menus";
import { SafeAreaView, StyleSheet, Text, View } from "react-native";

export default function App() {
  return (
    <SafeAreaView style={{ flex: 1 }}>
      <View style={styles.container}>
        <Text>Dropdown Menus</Text>
        <NativeMenusView
          menuItems={[
            {
              title: "Edit",
              icon: { android: "Edit", ios: "pencil" },
              onPress: () => console.log("Pressed Edit"),
            },
            {
              title: "Refresh",
              onPress: () => console.log("Pressed Refersh"),
              icon: { android: "Refresh", ios: "arrow.clockwise" },
            },
            { title: "Delete", onPress: () => console.log("Pressed Delete") },
          ]}
        />
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    width: "100%",
    padding: 10,
    flexDirection: "row",
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "space-between",
  },
});
