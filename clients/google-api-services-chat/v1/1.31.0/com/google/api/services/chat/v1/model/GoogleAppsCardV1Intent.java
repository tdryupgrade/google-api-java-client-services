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

package com.google.api.services.chat.v1.model;

/**
 * Android intent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1Intent extends com.google.api.client.json.GenericJson {

  /**
   * A list of extra data for the android intent. For example, for a calendar event edit intent, the
   * event title information can be passed as extra data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsCardV1ExtraData> extraData;

  static {
    // hack to force ProGuard to consider GoogleAppsCardV1ExtraData used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAppsCardV1ExtraData.class);
  }

  /**
   * An android intent action string for the {@link android.content.Intent} object. For example: for
   * the view intent action type, a valid value will be android.content.Intent.ACTION_VIEW.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intentAction;

  /**
   * A list of extra data for the android intent. For example, for a calendar event edit intent, the
   * event title information can be passed as extra data.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsCardV1ExtraData> getExtraData() {
    return extraData;
  }

  /**
   * A list of extra data for the android intent. For example, for a calendar event edit intent, the
   * event title information can be passed as extra data.
   * @param extraData extraData or {@code null} for none
   */
  public GoogleAppsCardV1Intent setExtraData(java.util.List<GoogleAppsCardV1ExtraData> extraData) {
    this.extraData = extraData;
    return this;
  }

  /**
   * An android intent action string for the {@link android.content.Intent} object. For example: for
   * the view intent action type, a valid value will be android.content.Intent.ACTION_VIEW.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntentAction() {
    return intentAction;
  }

  /**
   * An android intent action string for the {@link android.content.Intent} object. For example: for
   * the view intent action type, a valid value will be android.content.Intent.ACTION_VIEW.
   * @param intentAction intentAction or {@code null} for none
   */
  public GoogleAppsCardV1Intent setIntentAction(java.lang.String intentAction) {
    this.intentAction = intentAction;
    return this;
  }

  @Override
  public GoogleAppsCardV1Intent set(String fieldName, Object value) {
    return (GoogleAppsCardV1Intent) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1Intent clone() {
    return (GoogleAppsCardV1Intent) super.clone();
  }

}
