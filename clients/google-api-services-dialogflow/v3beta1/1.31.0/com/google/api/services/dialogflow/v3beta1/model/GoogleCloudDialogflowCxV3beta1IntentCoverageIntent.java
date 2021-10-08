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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * The agent's intent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1IntentCoverageIntent extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not the intent is covered by at least one of the agent's test cases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean covered;

  /**
   * The intent full resource name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intent;

  /**
   * Whether or not the intent is covered by at least one of the agent's test cases.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCovered() {
    return covered;
  }

  /**
   * Whether or not the intent is covered by at least one of the agent's test cases.
   * @param covered covered or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1IntentCoverageIntent setCovered(java.lang.Boolean covered) {
    this.covered = covered;
    return this;
  }

  /**
   * The intent full resource name
   * @return value or {@code null} for none
   */
  public java.lang.String getIntent() {
    return intent;
  }

  /**
   * The intent full resource name
   * @param intent intent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1IntentCoverageIntent setIntent(java.lang.String intent) {
    this.intent = intent;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1IntentCoverageIntent set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1IntentCoverageIntent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1IntentCoverageIntent clone() {
    return (GoogleCloudDialogflowCxV3beta1IntentCoverageIntent) super.clone();
  }

}
