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

@doc("Represents a Feedback Container response")
model FeedbackContainerResponse {
  @doc("The URL of the Feedback Container")
  @body containerUrl: string;
}
