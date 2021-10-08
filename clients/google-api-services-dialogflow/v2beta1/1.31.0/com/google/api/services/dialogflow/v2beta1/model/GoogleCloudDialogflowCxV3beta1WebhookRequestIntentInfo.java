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
 * Represents intent information communicated to the webhook.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo extends com.google.api.client.json.GenericJson {

  /**
   * The confidence of the matched intent. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Always present. The display name of the last matched intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Always present. The unique identifier of the last matched intent. Format:
   * `projects//locations//agents//intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastMatchedIntent;

  /**
   * Parameters identified as a result of intent matching. This is a map of the name of the
   * identified parameter to the value of the parameter identified from the user's utterance. All
   * parameters defined in the matched intent that are identified will be surfaced here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue> parameters;

  /**
   * The confidence of the matched intent. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain).
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * The confidence of the matched intent. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain).
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Always present. The display name of the last matched intent.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Always present. The display name of the last matched intent.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Always present. The unique identifier of the last matched intent. Format:
   * `projects//locations//agents//intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastMatchedIntent() {
    return lastMatchedIntent;
  }

  /**
   * Always present. The unique identifier of the last matched intent. Format:
   * `projects//locations//agents//intents/`.
   * @param lastMatchedIntent lastMatchedIntent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo setLastMatchedIntent(java.lang.String lastMatchedIntent) {
    this.lastMatchedIntent = lastMatchedIntent;
    return this;
  }

  /**
   * Parameters identified as a result of intent matching. This is a map of the name of the
   * identified parameter to the value of the parameter identified from the user's utterance. All
   * parameters defined in the matched intent that are identified will be surfaced here.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue> getParameters() {
    return parameters;
  }

  /**
   * Parameters identified as a result of intent matching. This is a map of the name of the
   * identified parameter to the value of the parameter identified from the user's utterance. All
   * parameters defined in the matched intent that are identified will be surfaced here.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo setParameters(java.util.Map<String, GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo clone() {
    return (GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo) super.clone();
  }

}
