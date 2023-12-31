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

package com.google.api.services.containeranalysis.v1.model;

/**
 * Metadata for all operations used and required for all operations that created by Container
 * Analysis Providers
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time this operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time that this operation was marked completed or failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. The time this operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time this operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time that this operation was marked completed or failed.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The time that this operation was marked completed or failed.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  @Override
  public GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata set(String fieldName, Object value) {
    return (GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata clone() {
    return (GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata) super.clone();
  }

}
