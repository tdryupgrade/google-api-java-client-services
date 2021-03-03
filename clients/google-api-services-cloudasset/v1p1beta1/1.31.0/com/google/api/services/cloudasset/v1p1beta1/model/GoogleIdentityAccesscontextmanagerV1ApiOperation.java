/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudasset.v1p1beta1.model;

/**
 * Identification for an API Operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1ApiOperation extends com.google.api.client.json.GenericJson {

  /**
   * API methods or permissions to allow. Method or permission must belong to the service specified
   * by `service_name` field. A single MethodSelector entry with `*` specified for the `method`
   * field will allow all methods AND permissions for the service specified in `service_name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleIdentityAccesscontextmanagerV1MethodSelector> methodSelectors;

  /**
   * The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to
   * allow. A single ApiOperation with `service_name` field set to `*` will allow all methods AND
   * permissions for all services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * API methods or permissions to allow. Method or permission must belong to the service specified
   * by `service_name` field. A single MethodSelector entry with `*` specified for the `method`
   * field will allow all methods AND permissions for the service specified in `service_name`.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleIdentityAccesscontextmanagerV1MethodSelector> getMethodSelectors() {
    return methodSelectors;
  }

  /**
   * API methods or permissions to allow. Method or permission must belong to the service specified
   * by `service_name` field. A single MethodSelector entry with `*` specified for the `method`
   * field will allow all methods AND permissions for the service specified in `service_name`.
   * @param methodSelectors methodSelectors or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ApiOperation setMethodSelectors(java.util.List<GoogleIdentityAccesscontextmanagerV1MethodSelector> methodSelectors) {
    this.methodSelectors = methodSelectors;
    return this;
  }

  /**
   * The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to
   * allow. A single ApiOperation with `service_name` field set to `*` will allow all methods AND
   * permissions for all services.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to
   * allow. A single ApiOperation with `service_name` field set to `*` will allow all methods AND
   * permissions for all services.
   * @param serviceName serviceName or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ApiOperation setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1ApiOperation set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1ApiOperation) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1ApiOperation clone() {
    return (GoogleIdentityAccesscontextmanagerV1ApiOperation) super.clone();
  }

}
