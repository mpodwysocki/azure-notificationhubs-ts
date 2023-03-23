// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

import { RawHttpHeaders } from "@azure/core-rest-pipeline";
import { HttpResponse, ErrorResponse } from "@azure-rest/core-client";
import { InstallationOutput } from "./outputModels";

/** The request has succeeded. */
export interface GetInstallation200Response extends HttpResponse {
  status: "200";
  body: InstallationOutput;
}

export interface GetInstallationDefaultHeaders {
  /** String error code indicating what went wrong. */
  "x-ms-error-code"?: string;
}

export interface GetInstallationDefaultResponse extends HttpResponse {
  status: string;
  body: ErrorResponse;
  headers: RawHttpHeaders & GetInstallationDefaultHeaders;
}

/** There is no content to send for this request, but the headers may be useful. */
export interface DeleteInstallation204Response extends HttpResponse {
  status: "204";
}

export interface DeleteInstallationDefaultHeaders {
  /** String error code indicating what went wrong. */
  "x-ms-error-code"?: string;
}

export interface DeleteInstallationDefaultResponse extends HttpResponse {
  status: string;
  body: ErrorResponse;
  headers: RawHttpHeaders & DeleteInstallationDefaultHeaders;
}

/** The request has succeeded. */
export interface CreateOrUpdateInstallation200Response extends HttpResponse {
  status: "200";
  body: InstallationOutput;
}

/** The request has succeeded and a new resource has been created as a result. */
export interface CreateOrUpdateInstallation201Response extends HttpResponse {
  status: "201";
  body: InstallationOutput;
}

export interface CreateOrUpdateInstallationDefaultHeaders {
  /** String error code indicating what went wrong. */
  "x-ms-error-code"?: string;
}

export interface CreateOrUpdateInstallationDefaultResponse
  extends HttpResponse {
  status: string;
  body: ErrorResponse;
  headers: RawHttpHeaders & CreateOrUpdateInstallationDefaultHeaders;
}

export interface UpdateInstallation201Headers {
  /** The location header from the response */
  location?: string;
  /** The tracking ID header from the response */
  "tracking-id": string;
  /** The correlation ID header from the response */
  "x-ms-correlation-request-id": string;
}

/** The response to a notification hub create or update operation. */
export interface UpdateInstallation201Response extends HttpResponse {
  status: "201";
  body: string;
  headers: RawHttpHeaders & UpdateInstallation201Headers;
}

export interface SendNotification201Headers {
  /** The location header from the response */
  location?: string;
  /** The tracking ID header from the response */
  "tracking-id": string;
  /** The correlation ID header from the response */
  "x-ms-correlation-request-id": string;
}

/** The response to a notification hub create or update operation. */
export interface SendNotification201Response extends HttpResponse {
  status: "201";
  body: string;
  headers: RawHttpHeaders & SendNotification201Headers;
}

export interface CancelNotification201Headers {
  /** The location header from the response */
  location?: string;
  /** The tracking ID header from the response */
  "tracking-id": string;
  /** The correlation ID header from the response */
  "x-ms-correlation-request-id": string;
}

/** The response to a notification hub create or update operation. */
export interface CancelNotification201Response extends HttpResponse {
  status: "201";
  body: string;
  headers: RawHttpHeaders & CancelNotification201Headers;
}

export interface ScheduleNotification201Headers {
  /** The location header from the response */
  location?: string;
  /** The tracking ID header from the response */
  "tracking-id": string;
  /** The correlation ID header from the response */
  "x-ms-correlation-request-id": string;
}

/** The response to a notification hub create or update operation. */
export interface ScheduleNotification201Response extends HttpResponse {
  status: "201";
  body: string;
  headers: RawHttpHeaders & ScheduleNotification201Headers;
}

/** Represents a Feedback Container response */
export interface GetFeedbackContainerUrl200Response extends HttpResponse {
  status: "200";
  body: string;
}
