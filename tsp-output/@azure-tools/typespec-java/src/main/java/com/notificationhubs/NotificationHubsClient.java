// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.notificationhubs;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.notificationhubs.models.ContentType;
import com.notificationhubs.models.Installation;
import com.notificationhubs.models.JsonPatch;
import java.util.List;

/** Initializes a new instance of the synchronous NotificationHubsClient type. */
@ServiceClient(builder = NotificationHubsClientBuilder.class)
public final class NotificationHubsClient {
    @Generated private final NotificationHubsAsyncClient client;

    /**
     * Initializes an instance of NotificationHubsClient class.
     *
     * @param client the async client.
     */
    @Generated
    NotificationHubsClient(NotificationHubsAsyncClient client) {
        this.client = client;
    }

    /**
     * Gets an Azure Notification Hubs installation by Installation ID.
     *
     * <p>Get an installation by ID.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     installationId: String (Required)
     *     userId: String (Optional)
     *     expirationTime: String (Optional)
     *     lastUpdate: String (Optional)
     *     tags (Required): [
     *         String (Required)
     *     ]
     *     templates (Required): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param installationId The installation ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an installation by ID along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getInstallationWithResponse(String installationId, RequestOptions requestOptions) {
        return this.client.getInstallationWithResponse(installationId, requestOptions).block();
    }

    /**
     * Delete an installation by ID.
     *
     * @param installationId The installation ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteInstallationWithResponse(String installationId, RequestOptions requestOptions) {
        return this.client.deleteInstallationWithResponse(installationId, requestOptions).block();
    }

    /**
     * Creates or overwrites an existing installation in the Notification Hub.
     *
     * <p>Creates or updates an Installation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     installationId: String (Required)
     *     userId: String (Optional)
     *     expirationTime: String (Optional)
     *     lastUpdate: String (Optional)
     *     tags (Required): [
     *         String (Required)
     *     ]
     *     templates (Required): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     installationId: String (Required)
     *     userId: String (Optional)
     *     expirationTime: String (Optional)
     *     lastUpdate: String (Optional)
     *     tags (Required): [
     *         String (Required)
     *     ]
     *     templates (Required): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param installationId The installation ID.
     * @param resource The resource instance.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents an Azure Notification Hubs Installation along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateInstallationWithResponse(
            String installationId, BinaryData resource, RequestOptions requestOptions) {
        return this.client.createOrUpdateInstallationWithResponse(installationId, resource, requestOptions).block();
    }

    /**
     * Update an Azure Notification Hubs installation using JSON Patch semantics.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         op: String(add/remove/replace) (Required)
     *         path: String (Required)
     *         value: String (Optional)
     *     }
     * ]
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * @param installationId The installation ID.
     * @param updates The installation patches.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateInstallationWithResponse(
            String installationId, BinaryData updates, RequestOptions requestOptions) {
        return this.client.updateInstallationWithResponse(installationId, updates, requestOptions).block();
    }

    /**
     * Send a notification using Azure Notification Hubs.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>direct</td><td>Boolean</td><td>No</td><td>Direct send operation</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ServiceBusNotification-DeviceHandle</td><td>String</td><td>No</td><td>The notification target device handle</td></tr>
     *     <tr><td>ServiceBusNotification-Tags</td><td>String</td><td>No</td><td>The notification target tag expression</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * @param contentType Content-Type header for the request. Allowed values: "application/json;charset=utf-8",
     *     "application/xml;charset=utf-8", "application/octet-stream".
     * @param test Enables test send for debug purposes.
     * @param platform The notification target platform.
     * @param notification The notification to send.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> sendNotificationWithResponse(
            String contentType, boolean test, String platform, BinaryData notification, RequestOptions requestOptions) {
        return this.client
                .sendNotificationWithResponse(contentType, test, platform, notification, requestOptions)
                .block();
    }

    /**
     * Cancel a scheduled notification.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * @param notificationId The ID of the notification to cancel.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> cancelNotificationWithResponse(String notificationId, RequestOptions requestOptions) {
        return this.client.cancelNotificationWithResponse(notificationId, requestOptions).block();
    }

    /**
     * Schedule a notification.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ServiceBusNotification-DeviceHandle</td><td>String</td><td>No</td><td>The notification target device handle</td></tr>
     *     <tr><td>ServiceBusNotification-Tags</td><td>String</td><td>No</td><td>The notification target tag expression</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * @param contentType Content-Type header for the request. Allowed values: "application/json;charset=utf-8",
     *     "application/xml;charset=utf-8", "application/octet-stream".
     * @param platform The notification target platform.
     * @param scheduleTime The notification schedule time.
     * @param notification The notification to send.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> scheduleNotificationWithResponse(
            String contentType,
            String platform,
            String scheduleTime,
            BinaryData notification,
            RequestOptions requestOptions) {
        return this.client
                .scheduleNotificationWithResponse(contentType, platform, scheduleTime, notification, requestOptions)
                .block();
    }

    /**
     * Get the feedback for a notification hub.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the feedback for a notification hub along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getFeedbackContainerUrlWithResponse(RequestOptions requestOptions) {
        return this.client.getFeedbackContainerUrlWithResponse(requestOptions).block();
    }

    /**
     * Gets an Azure Notification Hubs installation by Installation ID.
     *
     * <p>Get an installation by ID.
     *
     * @param installationId The installation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an installation by ID.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Installation getInstallation(String installationId) {
        // Generated convenience method for getInstallationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getInstallationWithResponse(installationId, requestOptions).getValue().toObject(Installation.class);
    }

    /**
     * Delete an installation by ID.
     *
     * @param installationId The installation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteInstallation(String installationId) {
        // Generated convenience method for deleteInstallationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        deleteInstallationWithResponse(installationId, requestOptions).getValue();
    }

    /**
     * Creates or overwrites an existing installation in the Notification Hub.
     *
     * <p>Creates or updates an Installation.
     *
     * @param installationId The installation ID.
     * @param resource The resource instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Notification Hubs Installation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Installation createOrUpdateInstallation(String installationId, Installation resource) {
        // Generated convenience method for createOrUpdateInstallationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createOrUpdateInstallationWithResponse(installationId, BinaryData.fromObject(resource), requestOptions)
                .getValue()
                .toObject(Installation.class);
    }

    /**
     * Update an Azure Notification Hubs installation using JSON Patch semantics.
     *
     * @param installationId The installation ID.
     * @param updates The installation patches.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String updateInstallation(String installationId, List<JsonPatch> updates) {
        // Generated convenience method for updateInstallationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return updateInstallationWithResponse(installationId, BinaryData.fromObject(updates), requestOptions)
                .getValue()
                .toObject(String.class);
    }

    /**
     * Send a notification using Azure Notification Hubs.
     *
     * @param contentType Content-Type header for the request.
     * @param test Enables test send for debug purposes.
     * @param platform The notification target platform.
     * @param notification The notification to send.
     * @param direct Direct send operation.
     * @param deviceHandle The notification target device handle.
     * @param tags The notification target tag expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String sendNotification(
            ContentType contentType,
            boolean test,
            String platform,
            String notification,
            Boolean direct,
            String deviceHandle,
            String tags) {
        // Generated convenience method for sendNotificationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (direct != null) {
            requestOptions.addQueryParam("direct", String.valueOf(direct), false);
        }
        if (deviceHandle != null) {
            requestOptions.setHeader("ServiceBusNotification-DeviceHandle", deviceHandle);
        }
        if (tags != null) {
            requestOptions.setHeader("ServiceBusNotification-Tags", tags);
        }
        return sendNotificationWithResponse(
                        contentType.toString(), test, platform, BinaryData.fromObject(notification), requestOptions)
                .getValue()
                .toObject(String.class);
    }

    /**
     * Send a notification using Azure Notification Hubs.
     *
     * @param contentType Content-Type header for the request.
     * @param test Enables test send for debug purposes.
     * @param platform The notification target platform.
     * @param notification The notification to send.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String sendNotification(ContentType contentType, boolean test, String platform, String notification) {
        // Generated convenience method for sendNotificationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return sendNotificationWithResponse(
                        contentType.toString(), test, platform, BinaryData.fromObject(notification), requestOptions)
                .getValue()
                .toObject(String.class);
    }

    /**
     * Cancel a scheduled notification.
     *
     * @param notificationId The ID of the notification to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String cancelNotification(String notificationId) {
        // Generated convenience method for cancelNotificationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return cancelNotificationWithResponse(notificationId, requestOptions).getValue().toObject(String.class);
    }

    /**
     * Schedule a notification.
     *
     * @param contentType Content-Type header for the request.
     * @param platform The notification target platform.
     * @param scheduleTime The notification schedule time.
     * @param notification The notification to send.
     * @param deviceHandle The notification target device handle.
     * @param tags The notification target tag expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String scheduleNotification(
            ContentType contentType,
            String platform,
            String scheduleTime,
            String notification,
            String deviceHandle,
            String tags) {
        // Generated convenience method for scheduleNotificationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (deviceHandle != null) {
            requestOptions.setHeader("ServiceBusNotification-DeviceHandle", deviceHandle);
        }
        if (tags != null) {
            requestOptions.setHeader("ServiceBusNotification-Tags", tags);
        }
        return scheduleNotificationWithResponse(
                        contentType.toString(),
                        platform,
                        scheduleTime,
                        BinaryData.fromObject(notification),
                        requestOptions)
                .getValue()
                .toObject(String.class);
    }

    /**
     * Schedule a notification.
     *
     * @param contentType Content-Type header for the request.
     * @param platform The notification target platform.
     * @param scheduleTime The notification schedule time.
     * @param notification The notification to send.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String scheduleNotification(
            ContentType contentType, String platform, String scheduleTime, String notification) {
        // Generated convenience method for scheduleNotificationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return scheduleNotificationWithResponse(
                        contentType.toString(),
                        platform,
                        scheduleTime,
                        BinaryData.fromObject(notification),
                        requestOptions)
                .getValue()
                .toObject(String.class);
    }

    /**
     * Get the feedback for a notification hub.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the feedback for a notification hub.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String getFeedbackContainerUrl() {
        // Generated convenience method for getFeedbackContainerUrlWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getFeedbackContainerUrlWithResponse(requestOptions).getValue().toObject(String.class);
    }
}