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

package com.google.api.services.content.model;

/**
 * Model definition for OrderreturnsAcknowledgeResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderreturnsAcknowledgeResponse extends com.google.api.client.json.GenericJson {

  /**
   * The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionStatus;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#orderreturnsAcknowledgeResponse`".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`"
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionStatus() {
    return executionStatus;
  }

  /**
   * The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`"
   * @param executionStatus executionStatus or {@code null} for none
   */
  public OrderreturnsAcknowledgeResponse setExecutionStatus(java.lang.String executionStatus) {
    this.executionStatus = executionStatus;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#orderreturnsAcknowledgeResponse`".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#orderreturnsAcknowledgeResponse`".
   * @param kind kind or {@code null} for none
   */
  public OrderreturnsAcknowledgeResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public OrderreturnsAcknowledgeResponse set(String fieldName, Object value) {
    return (OrderreturnsAcknowledgeResponse) super.set(fieldName, value);
  }

  @Override
  public OrderreturnsAcknowledgeResponse clone() {
    return (OrderreturnsAcknowledgeResponse) super.clone();
  }

}
