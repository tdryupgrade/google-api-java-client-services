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

package com.google.api.services.apigateway.v1.model;

/**
 * An API that can be served by one or more Gateways.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Gateway API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApigatewayApi extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Created time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-
   * infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be
   * created in the same project as this API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managedService;

  /**
   * Output only. Resource name of the API. Format: projects/{project}/locations/global/apis/{api}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of the API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Created time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time.
   * @param createTime createTime or {@code null} for none
   */
  public ApigatewayApi setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. Display name.
   * @param displayName displayName or {@code null} for none
   */
  public ApigatewayApi setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @param labels labels or {@code null} for none
   */
  public ApigatewayApi setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-
   * infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be
   * created in the same project as this API.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagedService() {
    return managedService;
  }

  /**
   * Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-
   * infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be
   * created in the same project as this API.
   * @param managedService managedService or {@code null} for none
   */
  public ApigatewayApi setManagedService(java.lang.String managedService) {
    this.managedService = managedService;
    return this;
  }

  /**
   * Output only. Resource name of the API. Format: projects/{project}/locations/global/apis/{api}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the API. Format: projects/{project}/locations/global/apis/{api}
   * @param name name or {@code null} for none
   */
  public ApigatewayApi setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of the API.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the API.
   * @param state state or {@code null} for none
   */
  public ApigatewayApi setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Updated time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Updated time.
   * @param updateTime updateTime or {@code null} for none
   */
  public ApigatewayApi setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ApigatewayApi set(String fieldName, Object value) {
    return (ApigatewayApi) super.set(fieldName, value);
  }

  @Override
  public ApigatewayApi clone() {
    return (ApigatewayApi) super.clone();
  }

}
