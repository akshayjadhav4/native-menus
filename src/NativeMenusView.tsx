import { requireNativeViewManager } from 'expo-modules-core';
import * as React from 'react';

import { NativeMenusViewProps } from './NativeMenus.types';

const NativeView: React.ComponentType<NativeMenusViewProps> =
  requireNativeViewManager('NativeMenus');

export default function NativeMenusView(props: NativeMenusViewProps) {
  return <NativeView {...props} />;
}
