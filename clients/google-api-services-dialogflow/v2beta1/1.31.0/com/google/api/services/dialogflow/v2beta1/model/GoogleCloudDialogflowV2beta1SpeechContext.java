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
 * Hints for the speech recognizer to help with recognition in a specific conversation state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1SpeechContext extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Boost for this context compared to other contexts: * If the boost is positive,
   * Dialogflow will increase the probability that the phrases in this context are recognized over
   * similar sounding phrases. * If the boost is unspecified or non-positive, Dialogflow will not
   * apply any boost. Dialogflow recommends that you use boosts in the range (0, 20] and that you
   * find a value that fits your use case with binary search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float boost;

  /**
   * Optional. A list of strings containing words and phrases that the speech recognizer should
   * recognize with higher likelihood. This list can be used to: * improve accuracy for words and
   * phrases you expect the user to say, e.g. typical commands for your Dialogflow agent * add
   * additional words to the speech recognizer vocabulary * ... See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage limits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> phrases;

  /**
   * Optional. Boost for this context compared to other contexts: * If the boost is positive,
   * Dialogflow will increase the probability that the phrases in this context are recognized over
   * similar sounding phrases. * If the boost is unspecified or non-positive, Dialogflow will not
   * apply any boost. Dialogflow recommends that you use boosts in the range (0, 20] and that you
   * find a value that fits your use case with binary search.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBoost() {
    return boost;
  }

  /**
   * Optional. Boost for this context compared to other contexts: * If the boost is positive,
   * Dialogflow will increase the probability that the phrases in this context are recognized over
   * similar sounding phrases. * If the boost is unspecified or non-positive, Dialogflow will not
   * apply any boost. Dialogflow recommends that you use boosts in the range (0, 20] and that you
   * find a value that fits your use case with binary search.
   * @param boost boost or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SpeechContext setBoost(java.lang.Float boost) {
    this.boost = boost;
    return this;
  }

  /**
   * Optional. A list of strings containing words and phrases that the speech recognizer should
   * recognize with higher likelihood. This list can be used to: * improve accuracy for words and
   * phrases you expect the user to say, e.g. typical commands for your Dialogflow agent * add
   * additional words to the speech recognizer vocabulary * ... See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage limits.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhrases() {
    return phrases;
  }

  /**
   * Optional. A list of strings containing words and phrases that the speech recognizer should
   * recognize with higher likelihood. This list can be used to: * improve accuracy for words and
   * phrases you expect the user to say, e.g. typical commands for your Dialogflow agent * add
   * additional words to the speech recognizer vocabulary * ... See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage limits.
   * @param phrases phrases or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SpeechContext setPhrases(java.util.List<java.lang.String> phrases) {
    this.phrases = phrases;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1SpeechContext set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1SpeechContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1SpeechContext clone() {
    return (GoogleCloudDialogflowV2beta1SpeechContext) super.clone();
  }

}
