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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Information on speech adaptation use in results
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpeechAdaptationInfo extends com.google.api.client.json.GenericJson {

  /**
   * Whether there was a timeout when applying speech adaptation. If true, adaptation had no effect
   * in the response transcript.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adaptationTimeout;

  /**
   * If set, returns a message specifying which part of the speech adaptation request timed out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeoutMessage;

  /**
   * Whether there was a timeout when applying speech adaptation. If true, adaptation had no effect
   * in the response transcript.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdaptationTimeout() {
    return adaptationTimeout;
  }

  /**
   * Whether there was a timeout when applying speech adaptation. If true, adaptation had no effect
   * in the response transcript.
   * @param adaptationTimeout adaptationTimeout or {@code null} for none
   */
  public SpeechAdaptationInfo setAdaptationTimeout(java.lang.Boolean adaptationTimeout) {
    this.adaptationTimeout = adaptationTimeout;
    return this;
  }

  /**
   * If set, returns a message specifying which part of the speech adaptation request timed out.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeoutMessage() {
    return timeoutMessage;
  }

  /**
   * If set, returns a message specifying which part of the speech adaptation request timed out.
   * @param timeoutMessage timeoutMessage or {@code null} for none
   */
  public SpeechAdaptationInfo setTimeoutMessage(java.lang.String timeoutMessage) {
    this.timeoutMessage = timeoutMessage;
    return this;
  }

  @Override
  public SpeechAdaptationInfo set(String fieldName, Object value) {
    return (SpeechAdaptationInfo) super.set(fieldName, value);
  }

  @Override
  public SpeechAdaptationInfo clone() {
    return (SpeechAdaptationInfo) super.clone();
  }

}
