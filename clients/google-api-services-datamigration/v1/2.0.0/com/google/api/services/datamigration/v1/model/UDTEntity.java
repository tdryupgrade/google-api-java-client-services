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

package com.google.api.services.datamigration.v1.model;

/**
 * UDT's parent is a schema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UDTEntity extends com.google.api.client.json.GenericJson {

  /**
   * Custom engine specific features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> customFeatures;

  /**
   * The SQL code which creates the udt body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String udtBody;

  /**
   * The SQL code which creates the udt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String udtSqlCode;

  /**
   * Custom engine specific features.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getCustomFeatures() {
    return customFeatures;
  }

  /**
   * Custom engine specific features.
   * @param customFeatures customFeatures or {@code null} for none
   */
  public UDTEntity setCustomFeatures(java.util.Map<String, java.lang.Object> customFeatures) {
    this.customFeatures = customFeatures;
    return this;
  }

  /**
   * The SQL code which creates the udt body.
   * @return value or {@code null} for none
   */
  public java.lang.String getUdtBody() {
    return udtBody;
  }

  /**
   * The SQL code which creates the udt body.
   * @param udtBody udtBody or {@code null} for none
   */
  public UDTEntity setUdtBody(java.lang.String udtBody) {
    this.udtBody = udtBody;
    return this;
  }

  /**
   * The SQL code which creates the udt.
   * @return value or {@code null} for none
   */
  public java.lang.String getUdtSqlCode() {
    return udtSqlCode;
  }

  /**
   * The SQL code which creates the udt.
   * @param udtSqlCode udtSqlCode or {@code null} for none
   */
  public UDTEntity setUdtSqlCode(java.lang.String udtSqlCode) {
    this.udtSqlCode = udtSqlCode;
    return this;
  }

  @Override
  public UDTEntity set(String fieldName, Object value) {
    return (UDTEntity) super.set(fieldName, value);
  }

  @Override
  public UDTEntity clone() {
    return (UDTEntity) super.clone();
  }

}
