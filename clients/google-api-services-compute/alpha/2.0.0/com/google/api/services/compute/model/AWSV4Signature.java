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

package com.google.api.services.compute.model;

/**
 * Contains the configurations necessary to generate a signature for access to private storage
 * buckets that support Signature Version 4 for authentication. The service name for generating the
 * authentication header will always default to 's3'.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AWSV4Signature extends com.google.api.client.json.GenericJson {

  /**
   * The access key used for s3 bucket authentication. Required for updating or creating a backend
   * that uses AWS v4 signature authentication, but will not be returned as part of the
   * configuration when queried with a REST API GET request. @InputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessKey;

  /**
   * The identifier of an access key used for s3 bucket authentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessKeyId;

  /**
   * The optional version identifier for the access key. You can use this to keep track of different
   * iterations of your access key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessKeyVersion;

  /**
   * The name of the cloud region of your origin. This is a free-form field with the name of the
   * region your cloud uses to host your origin. For example, "us-east-1" for AWS or "us-ashburn-1"
   * for OCI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originRegion;

  /**
   * The access key used for s3 bucket authentication. Required for updating or creating a backend
   * that uses AWS v4 signature authentication, but will not be returned as part of the
   * configuration when queried with a REST API GET request. @InputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessKey() {
    return accessKey;
  }

  /**
   * The access key used for s3 bucket authentication. Required for updating or creating a backend
   * that uses AWS v4 signature authentication, but will not be returned as part of the
   * configuration when queried with a REST API GET request. @InputOnly
   * @param accessKey accessKey or {@code null} for none
   */
  public AWSV4Signature setAccessKey(java.lang.String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * The identifier of an access key used for s3 bucket authentication.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * The identifier of an access key used for s3 bucket authentication.
   * @param accessKeyId accessKeyId or {@code null} for none
   */
  public AWSV4Signature setAccessKeyId(java.lang.String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * The optional version identifier for the access key. You can use this to keep track of different
   * iterations of your access key.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessKeyVersion() {
    return accessKeyVersion;
  }

  /**
   * The optional version identifier for the access key. You can use this to keep track of different
   * iterations of your access key.
   * @param accessKeyVersion accessKeyVersion or {@code null} for none
   */
  public AWSV4Signature setAccessKeyVersion(java.lang.String accessKeyVersion) {
    this.accessKeyVersion = accessKeyVersion;
    return this;
  }

  /**
   * The name of the cloud region of your origin. This is a free-form field with the name of the
   * region your cloud uses to host your origin. For example, "us-east-1" for AWS or "us-ashburn-1"
   * for OCI.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginRegion() {
    return originRegion;
  }

  /**
   * The name of the cloud region of your origin. This is a free-form field with the name of the
   * region your cloud uses to host your origin. For example, "us-east-1" for AWS or "us-ashburn-1"
   * for OCI.
   * @param originRegion originRegion or {@code null} for none
   */
  public AWSV4Signature setOriginRegion(java.lang.String originRegion) {
    this.originRegion = originRegion;
    return this;
  }

  @Override
  public AWSV4Signature set(String fieldName, Object value) {
    return (AWSV4Signature) super.set(fieldName, value);
  }

  @Override
  public AWSV4Signature clone() {
    return (AWSV4Signature) super.clone();
  }

}