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
 * One response of different type of suggestion response which is used in the response of
 * Participants.AnalyzeContent and Participants.AnalyzeContent, as well as HumanAgentAssistantEvent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1SuggestionResult extends com.google.api.client.json.GenericJson {

  /**
   * Error status if the request failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus error;

  /**
   * SuggestArticlesResponse if request is for ARTICLE_SUGGESTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1SuggestArticlesResponse suggestArticlesResponse;

  /**
   * SuggestFaqAnswersResponse if request is for FAQ_ANSWER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse suggestFaqAnswersResponse;

  /**
   * SuggestSmartRepliesResponse if request is for SMART_REPLY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse suggestSmartRepliesResponse;

  /**
   * Error status if the request failed.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getError() {
    return error;
  }

  /**
   * Error status if the request failed.
   * @param error error or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionResult setError(GoogleRpcStatus error) {
    this.error = error;
    return this;
  }

  /**
   * SuggestArticlesResponse if request is for ARTICLE_SUGGESTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestArticlesResponse getSuggestArticlesResponse() {
    return suggestArticlesResponse;
  }

  /**
   * SuggestArticlesResponse if request is for ARTICLE_SUGGESTION.
   * @param suggestArticlesResponse suggestArticlesResponse or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionResult setSuggestArticlesResponse(GoogleCloudDialogflowV2beta1SuggestArticlesResponse suggestArticlesResponse) {
    this.suggestArticlesResponse = suggestArticlesResponse;
    return this;
  }

  /**
   * SuggestFaqAnswersResponse if request is for FAQ_ANSWER.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse getSuggestFaqAnswersResponse() {
    return suggestFaqAnswersResponse;
  }

  /**
   * SuggestFaqAnswersResponse if request is for FAQ_ANSWER.
   * @param suggestFaqAnswersResponse suggestFaqAnswersResponse or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionResult setSuggestFaqAnswersResponse(GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse suggestFaqAnswersResponse) {
    this.suggestFaqAnswersResponse = suggestFaqAnswersResponse;
    return this;
  }

  /**
   * SuggestSmartRepliesResponse if request is for SMART_REPLY.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse getSuggestSmartRepliesResponse() {
    return suggestSmartRepliesResponse;
  }

  /**
   * SuggestSmartRepliesResponse if request is for SMART_REPLY.
   * @param suggestSmartRepliesResponse suggestSmartRepliesResponse or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionResult setSuggestSmartRepliesResponse(GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse suggestSmartRepliesResponse) {
    this.suggestSmartRepliesResponse = suggestSmartRepliesResponse;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestionResult set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1SuggestionResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestionResult clone() {
    return (GoogleCloudDialogflowV2beta1SuggestionResult) super.clone();
  }

}
