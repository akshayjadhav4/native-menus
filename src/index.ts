import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to NativeMenus.web.ts
// and on native platforms to NativeMenus.ts
import NativeMenusModule from './NativeMenusModule';
import NativeMenusView from './NativeMenusView';
import { ChangeEventPayload, NativeMenusViewProps } from './NativeMenus.types';

// Get the native constant value.
export const PI = NativeMenusModule.PI;

export function hello(): string {
  return NativeMenusModule.hello();
}

export async function setValueAsync(value: string) {
  return await NativeMenusModule.setValueAsync(value);
}

const emitter = new EventEmitter(NativeMenusModule ?? NativeModulesProxy.NativeMenus);

export function addChangeListener(listener: (event: ChangeEventPayload) => void): Subscription {
  return emitter.addListener<ChangeEventPayload>('onChange', listener);
}

export { NativeMenusView, NativeMenusViewProps, ChangeEventPayload };
