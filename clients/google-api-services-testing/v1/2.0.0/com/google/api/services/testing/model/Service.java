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

package com.google.api.services.testing.model;

/**
 * The section of an tag. https://developer.android.com/guide/topics/manifest/service-element
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Service extends com.google.api.client.json.GenericJson {

  /**
   * Intent filters in the service
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IntentFilter> intentFilter;

  static {
    // hack to force ProGuard to consider IntentFilter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(IntentFilter.class);
  }

  /**
   * The android:name value
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Intent filters in the service
   * @return value or {@code null} for none
   */
  public java.util.List<IntentFilter> getIntentFilter() {
    return intentFilter;
  }

  /**
   * Intent filters in the service
   * @param intentFilter intentFilter or {@code null} for none
   */
  public Service setIntentFilter(java.util.List<IntentFilter> intentFilter) {
    this.intentFilter = intentFilter;
    return this;
  }

  /**
   * The android:name value
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The android:name value
   * @param name name or {@code null} for none
   */
  public Service setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Service set(String fieldName, Object value) {
    return (Service) super.set(fieldName, value);
  }

  @Override
  public Service clone() {
    return (Service) super.clone();
  }

}
