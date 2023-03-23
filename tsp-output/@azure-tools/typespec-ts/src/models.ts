// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/** Represents an Azure Notification Hubs Installation */
export interface InstallationParent {
  /** The installation ID */
  installationId: string;
  /** The user ID */
  userId?: string;
  /** The itags for the installation */
  tags?: string[];
  /** The templates for the installation */
  templates?: Record<string, string>;
  platform: "Installation" | "browser" | "gcm";
}

/** Represents an Web Push based Azure Notification Hubs Installation */
export interface BrowserInstallation extends InstallationParent {
  /** The platform for the installation */
  platform: "browser";
  /** The Web API push handle for the installation */
  pushHandle: BrowserPushHandle;
}

/** Represents a Web Push push handle */
export interface BrowserPushHandle {
  /** The Web Push API endpoint */
  endpoint: string;
  /** The Web Push API P256DH key */
  p256dh: string;
  /** The Web Push API auth secret */
  auth: string;
}

/** Represents an FCM Legacy based Azure Notification Hubs Installation */
export interface FcmLegacyInstallation extends InstallationParent {
  /** The platform for the installation */
  platform: "gcm";
}

/** Represents a JSON Patch operation */
export interface JsonPatch {
  /**
   * The JSON patch operation type
   *
   * Possible values: add, remove, replace
   */
  op: string;
  /** The JSON patch path */
  path: string;
  /** The JSON patch value */
  value?: string;
}

/** Represents an Azure Notification Hubs Installation */
export type Installation = BrowserInstallation | FcmLegacyInstallation;
