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
 * A data source representing a Google Chat space. Format: spaces/{space} [Developer
 * Preview](https://developers.google.com/workspace/preview).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpaceDataSource extends com.google.api.client.json.GenericJson {

  /**
   * When `true`, uses the card's Google Chat space as the default selection. The default value is
   * `false`. [Developer Preview](https://developers.google.com/workspace/preview).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean defaultToCurrentSpace;

  /**
   * When `true`, uses the card's Google Chat space as the default selection. The default value is
   * `false`. [Developer Preview](https://developers.google.com/workspace/preview).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDefaultToCurrentSpace() {
    return defaultToCurrentSpace;
  }

  /**
   * When `true`, uses the card's Google Chat space as the default selection. The default value is
   * `false`. [Developer Preview](https://developers.google.com/workspace/preview).
   * @param defaultToCurrentSpace defaultToCurrentSpace or {@code null} for none
   */
  public SpaceDataSource setDefaultToCurrentSpace(java.lang.Boolean defaultToCurrentSpace) {
    this.defaultToCurrentSpace = defaultToCurrentSpace;
    return this;
  }

  @Override
  public SpaceDataSource set(String fieldName, Object value) {
    return (SpaceDataSource) super.set(fieldName, value);
  }

  @Override
  public SpaceDataSource clone() {
    return (SpaceDataSource) super.clone();
  }

}
