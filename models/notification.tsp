// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.
import "@typespec/http";
import "@typespec/rest";
import "@typespec/versioning";
import "@azure-tools/typespec-azure-core";
import "@azure-tools/typespec-autorest";

using TypeSpec.Http;
using TypeSpec.Rest;
using TypeSpec.Versioning;
using Azure.Core;

namespace NotificationHubs.Models;

@doc("The request to a notification hub scheduled send action.")
model ScheduledNotificationSendRequest {
  @doc("Content-Type header for the request")
  @header("Content-Type") contentType: "application/json;charset=utf-8" | "application/xml;charset=utf-8" | "application/octet-stream",
  @doc("The notification to send")
  @body notification: string,
  @doc("The notification target platform")
  @header("ServiceBusNotification-Format") platform: string,
  @doc("The notification target device handle")
  @header("ServiceBusNotification-DeviceHandle") deviceHandle?: string;
  @doc("The notification target tag expression")
  @header("ServiceBusNotification-Tags") tags?: string;
  @doc("The notification schedule time")
  @header("ServiceBusNotification-ScheduleTime") scheduleTime: string;
}

@doc("The request to a notification hub send action.")
model NotificationSendRequest {
  @doc("Content-Type header for the request")
  @header("Content-Type") contentType: "application/json;charset=utf-8" | "application/xml;charset=utf-8" | "application/octet-stream",
  @doc("Direct send operation")
  @query direct?: boolean,
  @doc("Enables test send for debug purposes")
  @query test: boolean,
  @doc("The notification to send")
  @body notification: string,
  @doc("The notification target platform")
  @header("ServiceBusNotification-Format") platform: string,
  @doc("The notification target device handle")
  @header("ServiceBusNotification-DeviceHandle") deviceHandle?: string;
  @doc("The notification target tag expression")
  @header("ServiceBusNotification-Tags") tags?: string
}

@doc("The response to a notification hub create or update operation.")
model NotificationResponse {
  @doc("Successful status code from the response")
  @statusCode statusCode: 201;
  @doc("The location header from the response")
  @header location?: string;
  @doc("The tracking ID header from the response")
  @header trackingId: string;
  @doc("The correlation ID header from the response")
  @header("x-ms-correlation-request-id") correlationId: string;
  @doc("The body which may contain an error in XML format")
  @body outcome?: string;
}
