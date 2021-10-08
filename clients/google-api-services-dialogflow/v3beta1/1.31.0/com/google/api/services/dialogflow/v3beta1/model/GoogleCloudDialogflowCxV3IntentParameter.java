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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Represents an intent parameter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3IntentParameter extends com.google.api.client.json.GenericJson {

  /**
   * Required. The entity type of the parameter. Format:
   * `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example,
   * `projects/-/locations/-/agents/-/entityTypes/sys.date`), or
   * `projects//locations//agents//entityTypes/` for developer entity types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityType;

  /**
   * Required. The unique identifier of the parameter. This field is used by training phrases to
   * annotate their parts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Indicates whether the parameter represents a list of values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isList;

  /**
   * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the
   * parameter content will be replaced by parameter name during logging. Note: the parameter
   * content is subject to redaction if either parameter level redaction or entity type level
   * redaction is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean redact;

  /**
   * Required. The entity type of the parameter. Format:
   * `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example,
   * `projects/-/locations/-/agents/-/entityTypes/sys.date`), or
   * `projects//locations//agents//entityTypes/` for developer entity types.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityType() {
    return entityType;
  }

  /**
   * Required. The entity type of the parameter. Format:
   * `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example,
   * `projects/-/locations/-/agents/-/entityTypes/sys.date`), or
   * `projects//locations//agents//entityTypes/` for developer entity types.
   * @param entityType entityType or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3IntentParameter setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Required. The unique identifier of the parameter. This field is used by training phrases to
   * annotate their parts.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The unique identifier of the parameter. This field is used by training phrases to
   * annotate their parts.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3IntentParameter setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Indicates whether the parameter represents a list of values.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsList() {
    return isList;
  }

  /**
   * Indicates whether the parameter represents a list of values.
   * @param isList isList or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3IntentParameter setIsList(java.lang.Boolean isList) {
    this.isList = isList;
    return this;
  }

  /**
   * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the
   * parameter content will be replaced by parameter name during logging. Note: the parameter
   * content is subject to redaction if either parameter level redaction or entity type level
   * redaction is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRedact() {
    return redact;
  }

  /**
   * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the
   * parameter content will be replaced by parameter name during logging. Note: the parameter
   * content is subject to redaction if either parameter level redaction or entity type level
   * redaction is enabled.
   * @param redact redact or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3IntentParameter setRedact(java.lang.Boolean redact) {
    this.redact = redact;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3IntentParameter set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3IntentParameter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3IntentParameter clone() {
    return (GoogleCloudDialogflowCxV3IntentParameter) super.clone();
  }

}
