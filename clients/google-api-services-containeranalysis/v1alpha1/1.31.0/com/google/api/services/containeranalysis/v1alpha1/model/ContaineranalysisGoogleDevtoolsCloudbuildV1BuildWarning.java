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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * A non-fatal problem encountered during the execution of the build.
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
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning extends com.google.api.client.json.GenericJson {

  /**
   * The priority for this warning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priority;

  /**
   * Explanation of the warning generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The priority for this warning.
   * @return value or {@code null} for none
   */
  public java.lang.String getPriority() {
    return priority;
  }

  /**
   * The priority for this warning.
   * @param priority priority or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning setPriority(java.lang.String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Explanation of the warning generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Explanation of the warning generated.
   * @param text text or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning) super.clone();
  }

}
