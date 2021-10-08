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

package com.google.api.services.dialogflow.v2.model;

/**
 * An intent represents a user's intent to interact with a conversational agent. You can provide
 * information for the Dialogflow API to use to match user input to an intent by adding training
 * phrases (i.e., examples of user input) to your intent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1Intent extends com.google.api.client.json.GenericJson {

  /**
   * Human readable description for better understanding an intent like its scope, content, result
   * etc. Maximum character limit: 140 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The human-readable name of the intent, unique within the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed
   * in the agent, which is added upon agent creation. Adding training phrases to fallback intent is
   * useful in the case of requests that are mistakenly matched, since training phrases assigned to
   * fallback intents act as negative examples that triggers no-match event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isFallback;

  /**
   * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the
   * symbols '-' and '_'. International characters are allowed, including letters from unicase
   * alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently
   * allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not
   * require value. "sys-head" means the intent is a head intent. "sys-contextual" means the intent
   * is a contextual intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The unique identifier of the intent. Required for the Intents.UpdateIntent method.
   * Intents.CreateIntent populates the name automatically. Format:
   * `projects//locations//agents//intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The collection of parameters associated with the intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1IntentParameter> parameters;

  /**
   * The priority of this intent. Higher numbers represent higher priorities. - If the supplied
   * value is unspecified or 0, the service translates the value to 500,000, which corresponds to
   * the `Normal` priority in the console. - If the supplied value is negative, the intent is
   * ignored in runtime detect intent requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * The collection of training phrases the agent is trained on to identify the intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrase> trainingPhrases;

  /**
   * Human readable description for better understanding an intent like its scope, content, result
   * etc. Maximum character limit: 140 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human readable description for better understanding an intent like its scope, content, result
   * etc. Maximum character limit: 140 characters.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The human-readable name of the intent, unique within the agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The human-readable name of the intent, unique within the agent.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed
   * in the agent, which is added upon agent creation. Adding training phrases to fallback intent is
   * useful in the case of requests that are mistakenly matched, since training phrases assigned to
   * fallback intents act as negative examples that triggers no-match event.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsFallback() {
    return isFallback;
  }

  /**
   * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed
   * in the agent, which is added upon agent creation. Adding training phrases to fallback intent is
   * useful in the case of requests that are mistakenly matched, since training phrases assigned to
   * fallback intents act as negative examples that triggers no-match event.
   * @param isFallback isFallback or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setIsFallback(java.lang.Boolean isFallback) {
    this.isFallback = isFallback;
    return this;
  }

  /**
   * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the
   * symbols '-' and '_'. International characters are allowed, including letters from unicase
   * alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently
   * allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not
   * require value. "sys-head" means the intent is a head intent. "sys-contextual" means the intent
   * is a contextual intent.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the
   * symbols '-' and '_'. International characters are allowed, including letters from unicase
   * alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently
   * allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not
   * require value. "sys-head" means the intent is a head intent. "sys-contextual" means the intent
   * is a contextual intent.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The unique identifier of the intent. Required for the Intents.UpdateIntent method.
   * Intents.CreateIntent populates the name automatically. Format:
   * `projects//locations//agents//intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the intent. Required for the Intents.UpdateIntent method.
   * Intents.CreateIntent populates the name automatically. Format:
   * `projects//locations//agents//intents/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The collection of parameters associated with the intent.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1IntentParameter> getParameters() {
    return parameters;
  }

  /**
   * The collection of parameters associated with the intent.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setParameters(java.util.List<GoogleCloudDialogflowCxV3beta1IntentParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * The priority of this intent. Higher numbers represent higher priorities. - If the supplied
   * value is unspecified or 0, the service translates the value to 500,000, which corresponds to
   * the `Normal` priority in the console. - If the supplied value is negative, the intent is
   * ignored in runtime detect intent requests.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * The priority of this intent. Higher numbers represent higher priorities. - If the supplied
   * value is unspecified or 0, the service translates the value to 500,000, which corresponds to
   * the `Normal` priority in the console. - If the supplied value is negative, the intent is
   * ignored in runtime detect intent requests.
   * @param priority priority or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The collection of training phrases the agent is trained on to identify the intent.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrase> getTrainingPhrases() {
    return trainingPhrases;
  }

  /**
   * The collection of training phrases the agent is trained on to identify the intent.
   * @param trainingPhrases trainingPhrases or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent setTrainingPhrases(java.util.List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrase> trainingPhrases) {
    this.trainingPhrases = trainingPhrases;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1Intent set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1Intent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1Intent clone() {
    return (GoogleCloudDialogflowCxV3beta1Intent) super.clone();
  }

}
