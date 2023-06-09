// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.notificationhubs;

import com.azure.core.util.ServiceVersion;

/** Service version of NotificationHubsClient. */
public enum NotificationHubsServiceVersion implements ServiceVersion {
    /** Enum value 2020-06. */
    V2020_06("2020-06");

    private final String version;

    NotificationHubsServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link NotificationHubsServiceVersion}.
     */
    public static NotificationHubsServiceVersion getLatest() {
        return V2020_06;
    }
}
