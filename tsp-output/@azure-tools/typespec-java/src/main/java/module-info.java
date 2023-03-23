// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.notificationhubs {
    requires transitive com.azure.core;

    exports com.notificationhubs;
    exports com.notificationhubs.models;

    opens com.notificationhubs.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}