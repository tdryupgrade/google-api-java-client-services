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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * One point viewable on a tensor metric plot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1TensorboardTensor extends com.google.api.client.json.GenericJson {

  /**
   * Required. Serialized form of
   * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Optional. Version number of TensorProto used to serialize value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer versionNumber;

  /**
   * Required. Serialized form of
   * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
   * @see #decodeValue()
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Required. Serialized form of
   * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
   * @see #getValue()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeValue() {
    return com.google.api.client.util.Base64.decodeBase64(value);
  }

  /**
   * Required. Serialized form of
   * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
   * @see #encodeValue()
   * @param value value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardTensor setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Required. Serialized form of
   * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
   * @see #setValue()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudAiplatformV1beta1TensorboardTensor encodeValue(byte[] value) {
    this.value = com.google.api.client.util.Base64.encodeBase64URLSafeString(value);
    return this;
  }

  /**
   * Optional. Version number of TensorProto used to serialize value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersionNumber() {
    return versionNumber;
  }

  /**
   * Optional. Version number of TensorProto used to serialize value.
   * @param versionNumber versionNumber or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardTensor setVersionNumber(java.lang.Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1TensorboardTensor set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1TensorboardTensor) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1TensorboardTensor clone() {
    return (GoogleCloudAiplatformV1beta1TensorboardTensor) super.clone();
  }

}
