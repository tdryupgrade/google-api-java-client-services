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

package com.google.api.services.datastore.v1.model;

/**
 * Options specific to read-only transactions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReadOnly extends com.google.api.client.json.GenericJson {

  /**
   * Reads entities at the given time. This must be a microsecond precision timestamp within the
   * past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole minute
   * timestamp within the past 7 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * Reads entities at the given time. This must be a microsecond precision timestamp within the
   * past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole minute
   * timestamp within the past 7 days.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Reads entities at the given time. This must be a microsecond precision timestamp within the
   * past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole minute
   * timestamp within the past 7 days.
   * @param readTime readTime or {@code null} for none
   */
  public ReadOnly setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  @Override
  public ReadOnly set(String fieldName, Object value) {
    return (ReadOnly) super.set(fieldName, value);
  }

  @Override
  public ReadOnly clone() {
    return (ReadOnly) super.clone();
  }

}
