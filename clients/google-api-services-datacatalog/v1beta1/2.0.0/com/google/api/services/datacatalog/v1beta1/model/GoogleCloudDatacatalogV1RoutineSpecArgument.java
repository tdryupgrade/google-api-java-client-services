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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Input or output argument of a function or stored procedure.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1RoutineSpecArgument extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether the argument is input or output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * The name of the argument. A return argument of a function might not have a name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Type of the argument. The exact value depends on the source system and the language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Specifies whether the argument is input or output.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * Specifies whether the argument is input or output.
   * @param mode mode or {@code null} for none
   */
  public GoogleCloudDatacatalogV1RoutineSpecArgument setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The name of the argument. A return argument of a function might not have a name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the argument. A return argument of a function might not have a name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatacatalogV1RoutineSpecArgument setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Type of the argument. The exact value depends on the source system and the language.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the argument. The exact value depends on the source system and the language.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDatacatalogV1RoutineSpecArgument setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1RoutineSpecArgument set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1RoutineSpecArgument) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1RoutineSpecArgument clone() {
    return (GoogleCloudDatacatalogV1RoutineSpecArgument) super.clone();
  }

}
