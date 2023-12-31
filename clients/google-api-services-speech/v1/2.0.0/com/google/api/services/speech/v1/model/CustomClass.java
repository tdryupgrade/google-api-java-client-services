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

package com.google.api.services.speech.v1.model;

/**
 * A set of words or phrases that represents a common concept likely to appear in your audio, for
 * example a list of passenger ship names. CustomClass items can be substituted into placeholders
 * that you set in PhraseSet phrases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomClass extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Allows users to store small amounts of arbitrary data. Both the key and the value
   * must be 63 characters or less each. At most 100 annotations. This field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * If this custom class is a resource, the custom_class_id is the resource id of the CustomClass.
   * Case sensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customClassId;

  /**
   * Output only. The time at which this resource was requested for deletion. This field is not
   * used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Output only. User-settable, human-readable name for the CustomClass. Must be 63 characters or
   * less. This field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. This checksum is computed by the server based on the value of other fields. This
   * may be sent on update, undelete, and delete requests to ensure the client has an up-to-date
   * value before proceeding. This field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. The time at which this resource will be purged. This field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * A collection of class items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ClassItem> items;

  static {
    // hack to force ProGuard to consider ClassItem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ClassItem.class);
  }

  /**
   * Output only. The [KMS key name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) with
   * which the content of the ClassItem is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * Output only. The [KMS key version name](https://cloud.google.com/kms/docs/resource-
   * hierarchy#key_versions) with which content of the ClassItem is encrypted. The expected format
   * is `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoK
   * eyVersions/{crypto_key_version}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyVersionName;

  /**
   * The resource name of the custom class.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Whether or not this CustomClass is in the process of being updated. This field is
   * not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * Output only. The CustomClass lifecycle state. This field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. System-assigned unique identifier for the CustomClass. This field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. Allows users to store small amounts of arbitrary data. Both the key and the value
   * must be 63 characters or less each. At most 100 annotations. This field is not used.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Output only. Allows users to store small amounts of arbitrary data. Both the key and the value
   * must be 63 characters or less each. At most 100 annotations. This field is not used.
   * @param annotations annotations or {@code null} for none
   */
  public CustomClass setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * If this custom class is a resource, the custom_class_id is the resource id of the CustomClass.
   * Case sensitive.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomClassId() {
    return customClassId;
  }

  /**
   * If this custom class is a resource, the custom_class_id is the resource id of the CustomClass.
   * Case sensitive.
   * @param customClassId customClassId or {@code null} for none
   */
  public CustomClass setCustomClassId(java.lang.String customClassId) {
    this.customClassId = customClassId;
    return this;
  }

  /**
   * Output only. The time at which this resource was requested for deletion. This field is not
   * used.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The time at which this resource was requested for deletion. This field is not
   * used.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public CustomClass setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Output only. User-settable, human-readable name for the CustomClass. Must be 63 characters or
   * less. This field is not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. User-settable, human-readable name for the CustomClass. Must be 63 characters or
   * less. This field is not used.
   * @param displayName displayName or {@code null} for none
   */
  public CustomClass setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields. This
   * may be sent on update, undelete, and delete requests to ensure the client has an up-to-date
   * value before proceeding. This field is not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields. This
   * may be sent on update, undelete, and delete requests to ensure the client has an up-to-date
   * value before proceeding. This field is not used.
   * @param etag etag or {@code null} for none
   */
  public CustomClass setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. The time at which this resource will be purged. This field is not used.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. The time at which this resource will be purged. This field is not used.
   * @param expireTime expireTime or {@code null} for none
   */
  public CustomClass setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * A collection of class items.
   * @return value or {@code null} for none
   */
  public java.util.List<ClassItem> getItems() {
    return items;
  }

  /**
   * A collection of class items.
   * @param items items or {@code null} for none
   */
  public CustomClass setItems(java.util.List<ClassItem> items) {
    this.items = items;
    return this;
  }

  /**
   * Output only. The [KMS key name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) with
   * which the content of the ClassItem is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * Output only. The [KMS key name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) with
   * which the content of the ClassItem is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public CustomClass setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * Output only. The [KMS key version name](https://cloud.google.com/kms/docs/resource-
   * hierarchy#key_versions) with which content of the ClassItem is encrypted. The expected format
   * is `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoK
   * eyVersions/{crypto_key_version}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyVersionName() {
    return kmsKeyVersionName;
  }

  /**
   * Output only. The [KMS key version name](https://cloud.google.com/kms/docs/resource-
   * hierarchy#key_versions) with which content of the ClassItem is encrypted. The expected format
   * is `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoK
   * eyVersions/{crypto_key_version}`.
   * @param kmsKeyVersionName kmsKeyVersionName or {@code null} for none
   */
  public CustomClass setKmsKeyVersionName(java.lang.String kmsKeyVersionName) {
    this.kmsKeyVersionName = kmsKeyVersionName;
    return this;
  }

  /**
   * The resource name of the custom class.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the custom class.
   * @param name name or {@code null} for none
   */
  public CustomClass setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Whether or not this CustomClass is in the process of being updated. This field is
   * not used.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. Whether or not this CustomClass is in the process of being updated. This field is
   * not used.
   * @param reconciling reconciling or {@code null} for none
   */
  public CustomClass setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * Output only. The CustomClass lifecycle state. This field is not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The CustomClass lifecycle state. This field is not used.
   * @param state state or {@code null} for none
   */
  public CustomClass setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. System-assigned unique identifier for the CustomClass. This field is not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. System-assigned unique identifier for the CustomClass. This field is not used.
   * @param uid uid or {@code null} for none
   */
  public CustomClass setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public CustomClass set(String fieldName, Object value) {
    return (CustomClass) super.set(fieldName, value);
  }

  @Override
  public CustomClass clone() {
    return (CustomClass) super.clone();
  }

}
