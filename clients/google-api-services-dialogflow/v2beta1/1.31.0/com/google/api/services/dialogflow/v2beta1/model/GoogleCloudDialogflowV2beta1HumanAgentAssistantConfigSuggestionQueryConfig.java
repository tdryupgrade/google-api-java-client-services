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
 * Config for suggestion query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig extends com.google.api.client.json.GenericJson {

  /**
   * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range
   * [0.0, 1.0], based on the relevance between the suggestion and the current conversation context.
   * A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with
   * a score greater than or equal to the value of this field are included in the results. For a
   * baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom
   * model, there is no recommended value. Tune this value by starting from a very low value and
   * slowly increasing until you have desired results. If this field is not set, it is default to
   * 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION,
   * FAQ, SMART_REPLY, SMART_COMPOSE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceThreshold;

  /**
   * Determines how recent conversation context is filtered when generating suggestions. If
   * unspecified, no messages will be dropped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings contextFilterSettings;

  /**
   * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySource dialogflowQuerySource;

  /**
   * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySource documentQuerySource;

  /**
   * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource knowledgeBaseQuerySource;

  /**
   * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is
   * 20.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxResults;

  /**
   * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range
   * [0.0, 1.0], based on the relevance between the suggestion and the current conversation context.
   * A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with
   * a score greater than or equal to the value of this field are included in the results. For a
   * baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom
   * model, there is no recommended value. Tune this value by starting from a very low value and
   * slowly increasing until you have desired results. If this field is not set, it is default to
   * 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION,
   * FAQ, SMART_REPLY, SMART_COMPOSE.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  /**
   * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range
   * [0.0, 1.0], based on the relevance between the suggestion and the current conversation context.
   * A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with
   * a score greater than or equal to the value of this field are included in the results. For a
   * baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom
   * model, there is no recommended value. Tune this value by starting from a very low value and
   * slowly increasing until you have desired results. If this field is not set, it is default to
   * 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION,
   * FAQ, SMART_REPLY, SMART_COMPOSE.
   * @param confidenceThreshold confidenceThreshold or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig setConfidenceThreshold(java.lang.Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Determines how recent conversation context is filtered when generating suggestions. If
   * unspecified, no messages will be dropped.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings getContextFilterSettings() {
    return contextFilterSettings;
  }

  /**
   * Determines how recent conversation context is filtered when generating suggestions. If
   * unspecified, no messages will be dropped.
   * @param contextFilterSettings contextFilterSettings or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig setContextFilterSettings(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings contextFilterSettings) {
    this.contextFilterSettings = contextFilterSettings;
    return this;
  }

  /**
   * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySource getDialogflowQuerySource() {
    return dialogflowQuerySource;
  }

  /**
   * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
   * @param dialogflowQuerySource dialogflowQuerySource or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig setDialogflowQuerySource(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySource dialogflowQuerySource) {
    this.dialogflowQuerySource = dialogflowQuerySource;
    return this;
  }

  /**
   * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySource getDocumentQuerySource() {
    return documentQuerySource;
  }

  /**
   * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
   * @param documentQuerySource documentQuerySource or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig setDocumentQuerySource(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySource documentQuerySource) {
    this.documentQuerySource = documentQuerySource;
    return this;
  }

  /**
   * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource getKnowledgeBaseQuerySource() {
    return knowledgeBaseQuerySource;
  }

  /**
   * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
   * @param knowledgeBaseQuerySource knowledgeBaseQuerySource or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig setKnowledgeBaseQuerySource(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource knowledgeBaseQuerySource) {
    this.knowledgeBaseQuerySource = knowledgeBaseQuerySource;
    return this;
  }

  /**
   * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is
   * 20.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxResults() {
    return maxResults;
  }

  /**
   * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is
   * 20.
   * @param maxResults maxResults or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig setMaxResults(java.lang.Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig clone() {
    return (GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig) super.clone();
  }

}
