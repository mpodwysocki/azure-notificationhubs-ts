// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a JSON Patch operation. */
@Fluent
public final class JsonPatch {
    /*
     * The JSON patch operation type
     */
    @JsonProperty(value = "op", required = true)
    private JsonPatchOperation op;

    /*
     * The JSON patch path
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /*
     * The JSON patch value
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of JsonPatch class.
     *
     * @param op the op value to set.
     * @param path the path value to set.
     */
    @JsonCreator
    public JsonPatch(
            @JsonProperty(value = "op", required = true) JsonPatchOperation op,
            @JsonProperty(value = "path", required = true) String path) {
        this.op = op;
        this.path = path;
    }

    /**
     * Get the op property: The JSON patch operation type.
     *
     * @return the op value.
     */
    public JsonPatchOperation getOp() {
        return this.op;
    }

    /**
     * Get the path property: The JSON patch path.
     *
     * @return the path value.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Get the value property: The JSON patch value.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The JSON patch value.
     *
     * @param value the value value to set.
     * @return the JsonPatch object itself.
     */
    public JsonPatch setValue(String value) {
        this.value = value;
        return this;
    }
}
