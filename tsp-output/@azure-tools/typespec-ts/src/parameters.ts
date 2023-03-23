// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

import { RawHttpHeadersInput } from "@azure/core-rest-pipeline";
import { RequestParameters } from "@azure-rest/core-client";
import { Installation, JsonPatch } from "./models";

export type GetInstallationParameters = RequestParameters;
export type DeleteInstallationParameters = RequestParameters;

export interface CreateOrUpdateInstallationBodyParam {
  /** The resource instance. */
  body: Installation;
}

export type CreateOrUpdateInstallationParameters =
  CreateOrUpdateInstallationBodyParam & RequestParameters;

export interface UpdateInstallationBodyParam {
  /** The installation patches */
  body: Array<JsonPatch>;
}

export type UpdateInstallationParameters = UpdateInstallationBodyParam &
  RequestParameters;

export interface SendNotificationHeaders {
  /** The notification target platform */
  "ServiceBusNotification-Format": string;
  /** The notification target device handle */
  "ServiceBusNotification-DeviceHandle"?: string;
  /** The notification target tag expression */
  "ServiceBusNotification-Tags"?: string;
}

export interface SendNotificationBodyParam {
  /** The notification to send */
  body: string;
}

export interface SendNotificationQueryParamProperties {
  /** Direct send operation */
  direct?: boolean;
  /** Enables test send for debug purposes */
  test: boolean;
}

export interface SendNotificationQueryParam {
  queryParameters: SendNotificationQueryParamProperties;
}

export interface SendNotificationHeaderParam {
  headers: RawHttpHeadersInput & SendNotificationHeaders;
}

export interface SendNotificationMediaTypesParam {
  /** Content-Type header for the request */
  contentType:
    | "application/json;charset=utf-8"
    | "application/xml;charset=utf-8"
    | "application/octet-stream";
}

export type SendNotificationParameters = SendNotificationQueryParam &
  SendNotificationHeaderParam &
  SendNotificationMediaTypesParam &
  SendNotificationBodyParam &
  RequestParameters;
export type CancelNotificationParameters = RequestParameters;

export interface ScheduleNotificationHeaders {
  /** The notification target platform */
  "ServiceBusNotification-Format": string;
  /** The notification target device handle */
  "ServiceBusNotification-DeviceHandle"?: string;
  /** The notification target tag expression */
  "ServiceBusNotification-Tags"?: string;
  /** The notification schedule time */
  "ServiceBusNotification-ScheduleTime": string;
}

export interface ScheduleNotificationBodyParam {
  /** The notification to send */
  body: string;
}

export interface ScheduleNotificationHeaderParam {
  headers: RawHttpHeadersInput & ScheduleNotificationHeaders;
}

export interface ScheduleNotificationMediaTypesParam {
  /** Content-Type header for the request */
  contentType:
    | "application/json;charset=utf-8"
    | "application/xml;charset=utf-8"
    | "application/octet-stream";
}

export type ScheduleNotificationParameters = ScheduleNotificationHeaderParam &
  ScheduleNotificationMediaTypesParam &
  ScheduleNotificationBodyParam &
  RequestParameters;
export type GetFeedbackContainerUrlParameters = RequestParameters;
