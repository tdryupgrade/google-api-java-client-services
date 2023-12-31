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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Capabilities with regard to support of outputting TTS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantDevicesPlatformProtoTtsOutputCapability extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether client supports out-of-band TTS synthesis. When this is enabled, client could
   * receive TTS request message in `SpeechOutputArgs.structured_tts` which it can then use to make
   * request to S3 for synthesizing TTS audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsStructuredTts;

  /**
   * Specifies whether client supports out-of-band TTS synthesis. When this is enabled, client could
   * receive TTS request message in `SpeechOutputArgs.structured_tts` which it can then use to make
   * request to S3 for synthesizing TTS audio.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsStructuredTts() {
    return supportsStructuredTts;
  }

  /**
   * Specifies whether client supports out-of-band TTS synthesis. When this is enabled, client could
   * receive TTS request message in `SpeechOutputArgs.structured_tts` which it can then use to make
   * request to S3 for synthesizing TTS audio.
   * @param supportsStructuredTts supportsStructuredTts or {@code null} for none
   */
  public AssistantDevicesPlatformProtoTtsOutputCapability setSupportsStructuredTts(java.lang.Boolean supportsStructuredTts) {
    this.supportsStructuredTts = supportsStructuredTts;
    return this;
  }

  @Override
  public AssistantDevicesPlatformProtoTtsOutputCapability set(String fieldName, Object value) {
    return (AssistantDevicesPlatformProtoTtsOutputCapability) super.set(fieldName, value);
  }

  @Override
  public AssistantDevicesPlatformProtoTtsOutputCapability clone() {
    return (AssistantDevicesPlatformProtoTtsOutputCapability) super.clone();
  }

}
