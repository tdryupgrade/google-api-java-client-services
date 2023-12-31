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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Data for an Assistant suggestion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteSharedAssistantSuggestion extends com.google.api.client.json.GenericJson {

  /**
   * Info regarding suggestion debug information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedAssistantDebugContext debugContext;

  /**
   * Data for rendering feedback.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedAssistantFeedbackContext feedbackContext;

  /**
   * Suggestion type that suggests documents (docs, slides, sheets).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedFindDocumentSuggestion findDocumentSuggestion;

  /**
   * String representation of the suggestions provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serializedSuggestions;

  /**
   * Session context specific to the Assistant suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedAssistantSessionContext sessionContext;

  /**
   * Info regarding suggestion debug information.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedAssistantDebugContext getDebugContext() {
    return debugContext;
  }

  /**
   * Info regarding suggestion debug information.
   * @param debugContext debugContext or {@code null} for none
   */
  public AppsDynamiteSharedAssistantSuggestion setDebugContext(AppsDynamiteSharedAssistantDebugContext debugContext) {
    this.debugContext = debugContext;
    return this;
  }

  /**
   * Data for rendering feedback.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedAssistantFeedbackContext getFeedbackContext() {
    return feedbackContext;
  }

  /**
   * Data for rendering feedback.
   * @param feedbackContext feedbackContext or {@code null} for none
   */
  public AppsDynamiteSharedAssistantSuggestion setFeedbackContext(AppsDynamiteSharedAssistantFeedbackContext feedbackContext) {
    this.feedbackContext = feedbackContext;
    return this;
  }

  /**
   * Suggestion type that suggests documents (docs, slides, sheets).
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedFindDocumentSuggestion getFindDocumentSuggestion() {
    return findDocumentSuggestion;
  }

  /**
   * Suggestion type that suggests documents (docs, slides, sheets).
   * @param findDocumentSuggestion findDocumentSuggestion or {@code null} for none
   */
  public AppsDynamiteSharedAssistantSuggestion setFindDocumentSuggestion(AppsDynamiteSharedFindDocumentSuggestion findDocumentSuggestion) {
    this.findDocumentSuggestion = findDocumentSuggestion;
    return this;
  }

  /**
   * String representation of the suggestions provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getSerializedSuggestions() {
    return serializedSuggestions;
  }

  /**
   * String representation of the suggestions provided.
   * @param serializedSuggestions serializedSuggestions or {@code null} for none
   */
  public AppsDynamiteSharedAssistantSuggestion setSerializedSuggestions(java.lang.String serializedSuggestions) {
    this.serializedSuggestions = serializedSuggestions;
    return this;
  }

  /**
   * Session context specific to the Assistant suggestion.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedAssistantSessionContext getSessionContext() {
    return sessionContext;
  }

  /**
   * Session context specific to the Assistant suggestion.
   * @param sessionContext sessionContext or {@code null} for none
   */
  public AppsDynamiteSharedAssistantSuggestion setSessionContext(AppsDynamiteSharedAssistantSessionContext sessionContext) {
    this.sessionContext = sessionContext;
    return this;
  }

  @Override
  public AppsDynamiteSharedAssistantSuggestion set(String fieldName, Object value) {
    return (AppsDynamiteSharedAssistantSuggestion) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteSharedAssistantSuggestion clone() {
    return (AppsDynamiteSharedAssistantSuggestion) super.clone();
  }

}
