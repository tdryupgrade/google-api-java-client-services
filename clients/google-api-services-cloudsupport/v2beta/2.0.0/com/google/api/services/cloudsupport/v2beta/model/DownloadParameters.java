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

package com.google.api.services.cloudsupport.v2beta.model;

/**
 * # gdata.* are outside protos with mising documentation
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Support API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DownloadParameters extends com.google.api.client.json.GenericJson {

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowGzipCompression;

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreRange;

  /**
   * # gdata.* are outside protos with mising documentation
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowGzipCompression() {
    return allowGzipCompression;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @param allowGzipCompression allowGzipCompression or {@code null} for none
   */
  public DownloadParameters setAllowGzipCompression(java.lang.Boolean allowGzipCompression) {
    this.allowGzipCompression = allowGzipCompression;
    return this;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreRange() {
    return ignoreRange;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @param ignoreRange ignoreRange or {@code null} for none
   */
  public DownloadParameters setIgnoreRange(java.lang.Boolean ignoreRange) {
    this.ignoreRange = ignoreRange;
    return this;
  }

  @Override
  public DownloadParameters set(String fieldName, Object value) {
    return (DownloadParameters) super.set(fieldName, value);
  }

  @Override
  public DownloadParameters clone() {
    return (DownloadParameters) super.clone();
  }

}
