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

package com.google.api.services.androidpublisher.model;

/**
 * Represents an sdk version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SdkVersion extends com.google.api.client.json.GenericJson {

  /**
   * Inclusive minimum value of an sdk version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer min;

  /**
   * Inclusive minimum value of an sdk version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMin() {
    return min;
  }

  /**
   * Inclusive minimum value of an sdk version.
   * @param min min or {@code null} for none
   */
  public SdkVersion setMin(java.lang.Integer min) {
    this.min = min;
    return this;
  }

  @Override
  public SdkVersion set(String fieldName, Object value) {
    return (SdkVersion) super.set(fieldName, value);
  }

  @Override
  public SdkVersion clone() {
    return (SdkVersion) super.clone();
  }

}
