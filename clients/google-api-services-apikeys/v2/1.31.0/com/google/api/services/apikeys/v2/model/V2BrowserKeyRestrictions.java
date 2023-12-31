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

package com.google.api.services.apikeys.v2.model;

/**
 * The HTTP referrers (websites) that are allowed to use the key.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Keys API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class V2BrowserKeyRestrictions extends com.google.api.client.json.GenericJson {

  /**
   * A list of regular expressions for the referrer URLs that are allowed to make API calls with
   * this key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedReferrers;

  /**
   * A list of regular expressions for the referrer URLs that are allowed to make API calls with
   * this key.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedReferrers() {
    return allowedReferrers;
  }

  /**
   * A list of regular expressions for the referrer URLs that are allowed to make API calls with
   * this key.
   * @param allowedReferrers allowedReferrers or {@code null} for none
   */
  public V2BrowserKeyRestrictions setAllowedReferrers(java.util.List<java.lang.String> allowedReferrers) {
    this.allowedReferrers = allowedReferrers;
    return this;
  }

  @Override
  public V2BrowserKeyRestrictions set(String fieldName, Object value) {
    return (V2BrowserKeyRestrictions) super.set(fieldName, value);
  }

  @Override
  public V2BrowserKeyRestrictions clone() {
    return (V2BrowserKeyRestrictions) super.clone();
  }

}
