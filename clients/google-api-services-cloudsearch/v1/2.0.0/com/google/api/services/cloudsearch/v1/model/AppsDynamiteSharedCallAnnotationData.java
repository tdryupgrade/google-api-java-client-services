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
 * Data used to render Meet or Google Voice chips in Chat. See go/dynamite-calling-artifacts-in-
 * chat.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteSharedCallAnnotationData extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp when the call ended. Used to render the call ended system message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String callEndedTimestamp;

  /**
   * Required. Call metadata required to create the call artifacts. For now, the metadata contains
   * only the call id to identify the call. This field allows additional data (e.g. voice call type)
   * to be added if needed in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedCallMetadata callMetadata;

  /**
   * Required. Indicates the call status for the space. Used to determine the chip's state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callStatus;

  /**
   * Timestamp when the call ended. Used to render the call ended system message.
   * @return value or {@code null} for none
   */
  public String getCallEndedTimestamp() {
    return callEndedTimestamp;
  }

  /**
   * Timestamp when the call ended. Used to render the call ended system message.
   * @param callEndedTimestamp callEndedTimestamp or {@code null} for none
   */
  public AppsDynamiteSharedCallAnnotationData setCallEndedTimestamp(String callEndedTimestamp) {
    this.callEndedTimestamp = callEndedTimestamp;
    return this;
  }

  /**
   * Required. Call metadata required to create the call artifacts. For now, the metadata contains
   * only the call id to identify the call. This field allows additional data (e.g. voice call type)
   * to be added if needed in the future.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedCallMetadata getCallMetadata() {
    return callMetadata;
  }

  /**
   * Required. Call metadata required to create the call artifacts. For now, the metadata contains
   * only the call id to identify the call. This field allows additional data (e.g. voice call type)
   * to be added if needed in the future.
   * @param callMetadata callMetadata or {@code null} for none
   */
  public AppsDynamiteSharedCallAnnotationData setCallMetadata(AppsDynamiteSharedCallMetadata callMetadata) {
    this.callMetadata = callMetadata;
    return this;
  }

  /**
   * Required. Indicates the call status for the space. Used to determine the chip's state.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallStatus() {
    return callStatus;
  }

  /**
   * Required. Indicates the call status for the space. Used to determine the chip's state.
   * @param callStatus callStatus or {@code null} for none
   */
  public AppsDynamiteSharedCallAnnotationData setCallStatus(java.lang.String callStatus) {
    this.callStatus = callStatus;
    return this;
  }

  @Override
  public AppsDynamiteSharedCallAnnotationData set(String fieldName, Object value) {
    return (AppsDynamiteSharedCallAnnotationData) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteSharedCallAnnotationData clone() {
    return (AppsDynamiteSharedCallAnnotationData) super.clone();
  }

}
