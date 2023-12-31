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

package com.google.api.services.forms.v1.model;

/**
 * Create a new watch.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Forms API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateWatchRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The watch object. No ID should be set on this object; use `watch_id` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Watch watch;

  /**
   * The ID to use for the watch. If specified, the ID must not already be in use. If not specified,
   * an ID is generated. This value should be 4-63 characters, and valid characters are /a-z-/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String watchId;

  /**
   * Required. The watch object. No ID should be set on this object; use `watch_id` instead.
   * @return value or {@code null} for none
   */
  public Watch getWatch() {
    return watch;
  }

  /**
   * Required. The watch object. No ID should be set on this object; use `watch_id` instead.
   * @param watch watch or {@code null} for none
   */
  public CreateWatchRequest setWatch(Watch watch) {
    this.watch = watch;
    return this;
  }

  /**
   * The ID to use for the watch. If specified, the ID must not already be in use. If not specified,
   * an ID is generated. This value should be 4-63 characters, and valid characters are /a-z-/.
   * @return value or {@code null} for none
   */
  public java.lang.String getWatchId() {
    return watchId;
  }

  /**
   * The ID to use for the watch. If specified, the ID must not already be in use. If not specified,
   * an ID is generated. This value should be 4-63 characters, and valid characters are /a-z-/.
   * @param watchId watchId or {@code null} for none
   */
  public CreateWatchRequest setWatchId(java.lang.String watchId) {
    this.watchId = watchId;
    return this;
  }

  @Override
  public CreateWatchRequest set(String fieldName, Object value) {
    return (CreateWatchRequest) super.set(fieldName, value);
  }

  @Override
  public CreateWatchRequest clone() {
    return (CreateWatchRequest) super.clone();
  }

}
