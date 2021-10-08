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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Each case has a Boolean condition. When it is evaluated to be True, the corresponding messages
 * will be selected and evaluated recursively.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase extends com.google.api.client.json.GenericJson {

  /**
   * A list of case content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent> caseContent;

  /**
   * The condition to activate and select this case. Empty means the condition is always true. The
   * condition is evaluated against form parameters or session parameters. See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * A list of case content.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent> getCaseContent() {
    return caseContent;
  }

  /**
   * A list of case content.
   * @param caseContent caseContent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase setCaseContent(java.util.List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContent> caseContent) {
    this.caseContent = caseContent;
    return this;
  }

  /**
   * The condition to activate and select this case. Empty means the condition is always true. The
   * condition is evaluated against form parameters or session parameters. See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * The condition to activate and select this case. Empty means the condition is always true. The
   * condition is evaluated against form parameters or session parameters. See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * @param condition condition or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase clone() {
    return (GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase) super.clone();
  }

}
