// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/** Represents an Azure Notification Hubs Installation */
export interface InstallationOutputParent {
  /** The installation ID */
  installationId: string;
  /** The user ID */
  userId?: string;
  /** The installation expiration time */
  readonly expirationTime?: string;
  /** The last updated date */
  readonly lastUpdate?: string;
  /** The itags for the installation */
  tags?: string[];
  /** The templates for the installation */
  templates?: Record<string, string>;
  platform: "Installation" | "browser" | "gcm";
}

/** Represents an Web Push based Azure Notification Hubs Installation */
export interface BrowserInstallationOutput extends InstallationOutputParent {
  /** The platform for the installation */
  platform: "browser";
  /** The Web API push handle for the installation */
  pushHandle: BrowserPushHandleOutput;
}

/** Represents a Web Push push handle */
export interface BrowserPushHandleOutput {
  /** The Web Push API endpoint */
  endpoint: string;
  /** The Web Push API P256DH key */
  p256dh: string;
  /** The Web Push API auth secret */
  auth: string;
}

/** Represents an FCM Legacy based Azure Notification Hubs Installation */
export interface FcmLegacyInstallationOutput extends InstallationOutputParent {
  /** The platform for the installation */
  platform: "gcm";
}

/** Represents an Azure Notification Hubs Installation */
export type InstallationOutput =
  | BrowserInstallationOutput
  | FcmLegacyInstallationOutput;
