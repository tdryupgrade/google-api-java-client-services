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

package com.google.api.services.apigeeregistry.v1.model;

/**
 * An Api is a top-level description of an API. Apis are produced by producers and are commitments
 * to provide services.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee Registry API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Api extends com.google.api.client.json.GenericJson {

  /**
   * Annotations attach non-identifying metadata to resources. Annotation keys and values are less
   * restricted than those of labels, but should be generally used for small values of broad
   * interest. Larger, topic- specific metadata should be stored in Artifacts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * A user-definable description of the availability of this service. Format: free-form, but we
   * expect single words that describe availability, e.g. "NONE", "TESTING", "PREVIEW", "GENERAL",
   * "DEPRECATED", "SHUTDOWN".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availability;

  /**
   * Output only. Creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A detailed description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Human-meaningful name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Labels attach identifying metadata to resources. Identifying metadata can be used to filter
   * list operations. Label keys and values can be no longer than 64 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters, underscores and dashes.
   * International characters are allowed. No more than 64 user labels can be associated with one
   * resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and
   * examples of labels. System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The recommended deployment of the API. Format: apis/{api}/deployments/{deployment}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recommendedDeployment;

  /**
   * The recommended version of the API. Format: apis/{api}/versions/{version}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recommendedVersion;

  /**
   * Output only. Last update timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Annotations attach non-identifying metadata to resources. Annotation keys and values are less
   * restricted than those of labels, but should be generally used for small values of broad
   * interest. Larger, topic- specific metadata should be stored in Artifacts.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Annotations attach non-identifying metadata to resources. Annotation keys and values are less
   * restricted than those of labels, but should be generally used for small values of broad
   * interest. Larger, topic- specific metadata should be stored in Artifacts.
   * @param annotations annotations or {@code null} for none
   */
  public Api setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * A user-definable description of the availability of this service. Format: free-form, but we
   * expect single words that describe availability, e.g. "NONE", "TESTING", "PREVIEW", "GENERAL",
   * "DEPRECATED", "SHUTDOWN".
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailability() {
    return availability;
  }

  /**
   * A user-definable description of the availability of this service. Format: free-form, but we
   * expect single words that describe availability, e.g. "NONE", "TESTING", "PREVIEW", "GENERAL",
   * "DEPRECATED", "SHUTDOWN".
   * @param availability availability or {@code null} for none
   */
  public Api setAvailability(java.lang.String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Output only. Creation timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Creation timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public Api setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A detailed description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A detailed description.
   * @param description description or {@code null} for none
   */
  public Api setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-meaningful name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Human-meaningful name.
   * @param displayName displayName or {@code null} for none
   */
  public Api setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Labels attach identifying metadata to resources. Identifying metadata can be used to filter
   * list operations. Label keys and values can be no longer than 64 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters, underscores and dashes.
   * International characters are allowed. No more than 64 user labels can be associated with one
   * resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and
   * examples of labels. System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels attach identifying metadata to resources. Identifying metadata can be used to filter
   * list operations. Label keys and values can be no longer than 64 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters, underscores and dashes.
   * International characters are allowed. No more than 64 user labels can be associated with one
   * resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and
   * examples of labels. System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * @param labels labels or {@code null} for none
   */
  public Api setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name.
   * @param name name or {@code null} for none
   */
  public Api setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The recommended deployment of the API. Format: apis/{api}/deployments/{deployment}
   * @return value or {@code null} for none
   */
  public java.lang.String getRecommendedDeployment() {
    return recommendedDeployment;
  }

  /**
   * The recommended deployment of the API. Format: apis/{api}/deployments/{deployment}
   * @param recommendedDeployment recommendedDeployment or {@code null} for none
   */
  public Api setRecommendedDeployment(java.lang.String recommendedDeployment) {
    this.recommendedDeployment = recommendedDeployment;
    return this;
  }

  /**
   * The recommended version of the API. Format: apis/{api}/versions/{version}
   * @return value or {@code null} for none
   */
  public java.lang.String getRecommendedVersion() {
    return recommendedVersion;
  }

  /**
   * The recommended version of the API. Format: apis/{api}/versions/{version}
   * @param recommendedVersion recommendedVersion or {@code null} for none
   */
  public Api setRecommendedVersion(java.lang.String recommendedVersion) {
    this.recommendedVersion = recommendedVersion;
    return this;
  }

  /**
   * Output only. Last update timestamp.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Last update timestamp.
   * @param updateTime updateTime or {@code null} for none
   */
  public Api setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Api set(String fieldName, Object value) {
    return (Api) super.set(fieldName, value);
  }

  @Override
  public Api clone() {
    return (Api) super.clone();
  }

}
