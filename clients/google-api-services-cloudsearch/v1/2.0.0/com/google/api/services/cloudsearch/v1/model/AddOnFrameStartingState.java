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
 * Starting state for an individual add-on frame.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AddOnFrameStartingState extends com.google.api.client.json.GenericJson {

  /**
   * Additional data internal to the add-on that can be used to initialize itself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String additionalData;

  /**
   * The uri of the artifact being used for an add-on co-activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Additional data internal to the add-on that can be used to initialize itself.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdditionalData() {
    return additionalData;
  }

  /**
   * Additional data internal to the add-on that can be used to initialize itself.
   * @param additionalData additionalData or {@code null} for none
   */
  public AddOnFrameStartingState setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  /**
   * The uri of the artifact being used for an add-on co-activity.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The uri of the artifact being used for an add-on co-activity.
   * @param uri uri or {@code null} for none
   */
  public AddOnFrameStartingState setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public AddOnFrameStartingState set(String fieldName, Object value) {
    return (AddOnFrameStartingState) super.set(fieldName, value);
  }

  @Override
  public AddOnFrameStartingState clone() {
    return (AddOnFrameStartingState) super.clone();
  }

}
