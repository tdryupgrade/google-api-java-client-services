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

package com.google.api.services.connectors.v1.model;

/**
 * ConfigVariableTemplate provides metadata about a `ConfigVariable` that is used in a Connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigVariableTemplate extends com.google.api.client.json.GenericJson {

  /**
   * Description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display name of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Key of the config variable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Flag represents that this `ConfigVariable` must be provided for a connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean required;

  /**
   * Role grant configuration for the config variable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RoleGrant roleGrant;

  /**
   * Regular expression in RE2 syntax used for validating the `value` of a `ConfigVariable`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validationRegex;

  /**
   * Type of the parameter: string, int, bool etc. consider custom type for the benefit for the
   * validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * Description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description.
   * @param description description or {@code null} for none
   */
  public ConfigVariableTemplate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display name of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name of the parameter.
   * @param displayName displayName or {@code null} for none
   */
  public ConfigVariableTemplate setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Key of the config variable.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Key of the config variable.
   * @param key key or {@code null} for none
   */
  public ConfigVariableTemplate setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Flag represents that this `ConfigVariable` must be provided for a connection.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequired() {
    return required;
  }

  /**
   * Flag represents that this `ConfigVariable` must be provided for a connection.
   * @param required required or {@code null} for none
   */
  public ConfigVariableTemplate setRequired(java.lang.Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Role grant configuration for the config variable.
   * @return value or {@code null} for none
   */
  public RoleGrant getRoleGrant() {
    return roleGrant;
  }

  /**
   * Role grant configuration for the config variable.
   * @param roleGrant roleGrant or {@code null} for none
   */
  public ConfigVariableTemplate setRoleGrant(RoleGrant roleGrant) {
    this.roleGrant = roleGrant;
    return this;
  }

  /**
   * Regular expression in RE2 syntax used for validating the `value` of a `ConfigVariable`.
   * @return value or {@code null} for none
   */
  public java.lang.String getValidationRegex() {
    return validationRegex;
  }

  /**
   * Regular expression in RE2 syntax used for validating the `value` of a `ConfigVariable`.
   * @param validationRegex validationRegex or {@code null} for none
   */
  public ConfigVariableTemplate setValidationRegex(java.lang.String validationRegex) {
    this.validationRegex = validationRegex;
    return this;
  }

  /**
   * Type of the parameter: string, int, bool etc. consider custom type for the benefit for the
   * validation.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * Type of the parameter: string, int, bool etc. consider custom type for the benefit for the
   * validation.
   * @param valueType valueType or {@code null} for none
   */
  public ConfigVariableTemplate setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public ConfigVariableTemplate set(String fieldName, Object value) {
    return (ConfigVariableTemplate) super.set(fieldName, value);
  }

  @Override
  public ConfigVariableTemplate clone() {
    return (ConfigVariableTemplate) super.clone();
  }

}
