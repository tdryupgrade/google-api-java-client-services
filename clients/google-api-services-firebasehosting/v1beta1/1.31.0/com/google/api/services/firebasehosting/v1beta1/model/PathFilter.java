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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * A representation of filter path.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PathFilter extends com.google.api.client.json.GenericJson {

  /**
   * An array of RegEx values by which to filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> regexes;

  /**
   * An array of RegEx values by which to filter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegexes() {
    return regexes;
  }

  /**
   * An array of RegEx values by which to filter.
   * @param regexes regexes or {@code null} for none
   */
  public PathFilter setRegexes(java.util.List<java.lang.String> regexes) {
    this.regexes = regexes;
    return this;
  }

  @Override
  public PathFilter set(String fieldName, Object value) {
    return (PathFilter) super.set(fieldName, value);
  }

  @Override
  public PathFilter clone() {
    return (PathFilter) super.clone();
  }

}
