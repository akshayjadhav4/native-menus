import * as React from 'react';

import { NativeMenusViewProps } from './NativeMenus.types';

export default function NativeMenusView(props: NativeMenusViewProps) {
  return (
    <div>
      <span>{props.name}</span>
    </div>
  );
}
