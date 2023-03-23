// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

import {
  GetInstallationParameters,
  DeleteInstallationParameters,
  CreateOrUpdateInstallationParameters,
  UpdateInstallationParameters,
  SendNotificationParameters,
  CancelNotificationParameters,
  ScheduleNotificationParameters,
  GetFeedbackContainerUrlParameters,
} from "./parameters";
import {
  GetInstallation200Response,
  GetInstallationDefaultResponse,
  DeleteInstallation204Response,
  DeleteInstallationDefaultResponse,
  CreateOrUpdateInstallation200Response,
  CreateOrUpdateInstallation201Response,
  CreateOrUpdateInstallationDefaultResponse,
  UpdateInstallation201Response,
  SendNotification201Response,
  CancelNotification201Response,
  ScheduleNotification201Response,
  GetFeedbackContainerUrl200Response,
} from "./responses";
import { Client, StreamableMethod } from "@azure-rest/core-client";

export interface GetInstallation {
  /** Get an installation by ID */
  get(
    options?: GetInstallationParameters
  ): StreamableMethod<
    GetInstallation200Response | GetInstallationDefaultResponse
  >;
  /** Delete an installation by ID */
  delete(
    options?: DeleteInstallationParameters
  ): StreamableMethod<
    DeleteInstallation204Response | DeleteInstallationDefaultResponse
  >;
  /** Creates or updates an Installation */
  put(
    options: CreateOrUpdateInstallationParameters
  ): StreamableMethod<
    | CreateOrUpdateInstallation200Response
    | CreateOrUpdateInstallation201Response
    | CreateOrUpdateInstallationDefaultResponse
  >;
}

export interface UpdateInstallation {
  /** Update an Azure Notification Hubs installation using JSON Patch semantics */
  patch(
    options: UpdateInstallationParameters
  ): StreamableMethod<UpdateInstallation201Response>;
}

export interface SendNotification {
  /** Send a notification using Azure Notification Hubs */
  post(
    options: SendNotificationParameters
  ): StreamableMethod<SendNotification201Response>;
}

export interface CancelNotification {
  /** Cancel a scheduled notification */
  delete(
    options?: CancelNotificationParameters
  ): StreamableMethod<CancelNotification201Response>;
}

export interface ScheduleNotification {
  /** Schedule a notification */
  post(
    options: ScheduleNotificationParameters
  ): StreamableMethod<ScheduleNotification201Response>;
}

export interface GetFeedbackContainerUrl {
  /** Get the feedback for a notification hub */
  get(
    options?: GetFeedbackContainerUrlParameters
  ): StreamableMethod<GetFeedbackContainerUrl200Response>;
}

export interface Routes {
  /** Resource for '/installations/installation/\{installationId\}' has methods for the following verbs: get, delete, put */
  (
    path: "/installations/installation/{installationId}",
    installationId: string
  ): GetInstallation;
  /** Resource for '/installations/\{installationId\}' has methods for the following verbs: patch */
  (
    path: "/installations/{installationId}",
    installationId: string
  ): UpdateInstallation;
  /** Resource for '/messages' has methods for the following verbs: post */
  (path: "/messages"): SendNotification;
  /** Resource for '/schedulednotifications/\{notificationId\}' has methods for the following verbs: delete */
  (
    path: "/schedulednotifications/{notificationId}",
    notificationId: string
  ): CancelNotification;
  /** Resource for '/schedulednotifications' has methods for the following verbs: post */
  (path: "/schedulednotifications"): ScheduleNotification;
  /** Resource for '/feedbackcontainer' has methods for the following verbs: get */
  (path: "/feedbackcontainer"): GetFeedbackContainerUrl;
}

export type AzureNotificationHubsServiceClient = Client & {
  path: Routes;
};
