// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

import { getClient, ClientOptions } from "@azure-rest/core-client";
import { AzureNotificationHubsServiceClient } from "./clientDefinitions";

/**
 * Initialize a new instance of `AzureNotificationHubsServiceClient`
 * @param namespaceName type: string, Notification Hubs Namespace
 * @param hubName type: string, Notification Hub Name
 * @param options type: ClientOptions, the parameter for all optional parameters
 */
export default function createClient(
  namespaceName: string,
  hubName: string,
  options: ClientOptions = {}
): AzureNotificationHubsServiceClient {
  const baseUrl =
    options.baseUrl ??
    `https://${namespaceName}.servicebus.windows.net/${hubName}`;
  options.apiVersion = options.apiVersion ?? "2020-06";
  const userAgentInfo = `azsdk-js-notification-hubs-rest/1.0.0-beta.1`;
  const userAgentPrefix =
    options.userAgentOptions && options.userAgentOptions.userAgentPrefix
      ? `${options.userAgentOptions.userAgentPrefix} ${userAgentInfo}`
      : `${userAgentInfo}`;
  options = {
    ...options,
    userAgentOptions: {
      userAgentPrefix,
    },
  };

  const client = getClient(
    baseUrl,
    options
  ) as AzureNotificationHubsServiceClient;

  return client;
}
