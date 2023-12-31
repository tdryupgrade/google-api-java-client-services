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

package com.google.api.services.apigee.v1.model;

/**
 * A message type used to describe a single bundle validation error.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EdgeConfigstoreBundleBadBundleViolation extends com.google.api.client.json.GenericJson {

  /**
   * A description of why the bundle is invalid and how to fix it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The filename (including relative path from the bundle root) in which the error occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filename;

  /**
   * A description of why the bundle is invalid and how to fix it.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of why the bundle is invalid and how to fix it.
   * @param description description or {@code null} for none
   */
  public EdgeConfigstoreBundleBadBundleViolation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The filename (including relative path from the bundle root) in which the error occurred.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilename() {
    return filename;
  }

  /**
   * The filename (including relative path from the bundle root) in which the error occurred.
   * @param filename filename or {@code null} for none
   */
  public EdgeConfigstoreBundleBadBundleViolation setFilename(java.lang.String filename) {
    this.filename = filename;
    return this;
  }

  @Override
  public EdgeConfigstoreBundleBadBundleViolation set(String fieldName, Object value) {
    return (EdgeConfigstoreBundleBadBundleViolation) super.set(fieldName, value);
  }

  @Override
  public EdgeConfigstoreBundleBadBundleViolation clone() {
    return (EdgeConfigstoreBundleBadBundleViolation) super.clone();
  }

}
