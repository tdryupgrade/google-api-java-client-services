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
 * Options to configure rule type MultiEntityRename. The rule is used to rename multiple entities.
 * The rule filter field can refer to one or more entities. The rule scope can be one of: Database,
 * Schema, Table, Column, Constraint, Index, View, Function, Stored Procedure, Materialized View,
 * Sequence, UDT
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
public final class MultiEntityRename extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The pattern used to generate the new entity's name. This pattern must include the
   * characters '{name}', which will be replaced with the name of the original entity. For example,
   * the pattern 't_{name}' for an entity name jobs would be converted to 't_jobs'. If unspecified,
   * the default value for this field is '{name}'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newNamePattern;

  /**
   * Optional. Additional transformation that can be done on the source entity name before it is
   * being used by the new_name_pattern, for example lower case. If no transformation is desired,
   * use NO_TRANSFORMATION
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceNameTransformation;

  /**
   * Optional. The pattern used to generate the new entity's name. This pattern must include the
   * characters '{name}', which will be replaced with the name of the original entity. For example,
   * the pattern 't_{name}' for an entity name jobs would be converted to 't_jobs'. If unspecified,
   * the default value for this field is '{name}'
   * @return value or {@code null} for none
   */
  public java.lang.String getNewNamePattern() {
    return newNamePattern;
  }

  /**
   * Optional. The pattern used to generate the new entity's name. This pattern must include the
   * characters '{name}', which will be replaced with the name of the original entity. For example,
   * the pattern 't_{name}' for an entity name jobs would be converted to 't_jobs'. If unspecified,
   * the default value for this field is '{name}'
   * @param newNamePattern newNamePattern or {@code null} for none
   */
  public MultiEntityRename setNewNamePattern(java.lang.String newNamePattern) {
    this.newNamePattern = newNamePattern;
    return this;
  }

  /**
   * Optional. Additional transformation that can be done on the source entity name before it is
   * being used by the new_name_pattern, for example lower case. If no transformation is desired,
   * use NO_TRANSFORMATION
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceNameTransformation() {
    return sourceNameTransformation;
  }

  /**
   * Optional. Additional transformation that can be done on the source entity name before it is
   * being used by the new_name_pattern, for example lower case. If no transformation is desired,
   * use NO_TRANSFORMATION
   * @param sourceNameTransformation sourceNameTransformation or {@code null} for none
   */
  public MultiEntityRename setSourceNameTransformation(java.lang.String sourceNameTransformation) {
    this.sourceNameTransformation = sourceNameTransformation;
    return this;
  }

  @Override
  public MultiEntityRename set(String fieldName, Object value) {
    return (MultiEntityRename) super.set(fieldName, value);
  }

  @Override
  public MultiEntityRename clone() {
    return (MultiEntityRename) super.clone();
  }

}
