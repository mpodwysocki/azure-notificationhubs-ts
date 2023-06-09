# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for license information.
# Code generated by Microsoft (R) Python Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is regenerated.
# --------------------------------------------------------------------------

from copy import deepcopy
from typing import Any, Optional

from azure.core import PipelineClient
from azure.core.rest import HttpRequest, HttpResponse

from ._configuration import NotificationHubsClientConfiguration
from ._operations import NotificationHubsClientOperationsMixin
from ._serialization import Deserializer, Serializer


class NotificationHubsClient(
    NotificationHubsClientOperationsMixin
):  # pylint: disable=client-accepts-api-version-keyword
    """The Azure Notification Hubs service.

    :param api_version: The API version to use for this operation. Required.
    :type api_version: str
    :param namespace_name: Notification Hubs Namespace. Default value is None.
    :type namespace_name: str
    :param hub_name: Notification Hub Name. Default value is None.
    :type hub_name: str
    """

    def __init__(  # pylint: disable=missing-client-constructor-parameter-credential
        self, api_version: str, namespace_name: Optional[str] = None, hub_name: Optional[str] = None, **kwargs: Any
    ) -> None:
        super().__init__()
        _endpoint = "https://{namespaceName}.servicebus.windows.net/{hubName}"
        self._config = NotificationHubsClientConfiguration(
            api_version=api_version, namespace_name=namespace_name, hub_name=hub_name, **kwargs
        )
        self._client: PipelineClient = PipelineClient(base_url=_endpoint, config=self._config, **kwargs)

        self._serialize = Serializer()
        self._deserialize = Deserializer()
        self._serialize.client_side_validation = False

    def send_request(self, request: HttpRequest, **kwargs: Any) -> HttpResponse:
        """Runs the network request through the client's chained policies.

        >>> from azure.core.rest import HttpRequest
        >>> request = HttpRequest("GET", "https://www.example.org/")
        <HttpRequest [GET], url: 'https://www.example.org/'>
        >>> response = client.send_request(request)
        <HttpResponse: 200 OK>

        For more information on this code flow, see https://aka.ms/azsdk/dpcodegen/python/send_request

        :param request: The network request you want to make. Required.
        :type request: ~azure.core.rest.HttpRequest
        :keyword bool stream: Whether the response payload will be streamed. Defaults to False.
        :return: The response of your network call. Does not do error handling on your response.
        :rtype: ~azure.core.rest.HttpResponse
        """

        request_copy = deepcopy(request)
        path_format_arguments = {
            "namespaceName": self._serialize.url(
                "self._config.namespace_name", self._config.namespace_name, "str", skip_quote=True
            ),
            "hubName": self._serialize.url("self._config.hub_name", self._config.hub_name, "str", skip_quote=True),
        }

        request_copy.url = self._client.format_url(request_copy.url, **path_format_arguments)
        return self._client.send_request(request_copy, **kwargs)

    def close(self) -> None:
        self._client.close()

    def __enter__(self) -> "NotificationHubsClient":
        self._client.__enter__()
        return self

    def __exit__(self, *exc_details: Any) -> None:
        self._client.__exit__(*exc_details)
