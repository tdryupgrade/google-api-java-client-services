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
 * EventType includes fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventType extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Created time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Schema of the event payload after enriched. Will be null if read before send is
   * not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enrichedEventPayloadSchema;

  /**
   * Output only. Runtime entity type name. Will be null if entity type map is not available. Used
   * for read before send feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityType;

  /**
   * Output only. Schema of webhook event payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventPayloadSchema;

  /**
   * Output only. Event type id. Example: `ticket.created`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventTypeId;

  /**
   * Output only. Id path denotes the path of id in webhook payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idPath;

  /**
   * Output only. Resource name of the eventtype. Format: projects/{project}/locations/{location}/pr
   * oviders/{provider}/connectors/{connector}/versions/{version}/eventtypes/{eventtype} Only global
   * location is supported for Connector resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Created time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time.
   * @param createTime createTime or {@code null} for none
   */
  public EventType setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Schema of the event payload after enriched. Will be null if read before send is
   * not supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnrichedEventPayloadSchema() {
    return enrichedEventPayloadSchema;
  }

  /**
   * Output only. Schema of the event payload after enriched. Will be null if read before send is
   * not supported.
   * @param enrichedEventPayloadSchema enrichedEventPayloadSchema or {@code null} for none
   */
  public EventType setEnrichedEventPayloadSchema(java.lang.String enrichedEventPayloadSchema) {
    this.enrichedEventPayloadSchema = enrichedEventPayloadSchema;
    return this;
  }

  /**
   * Output only. Runtime entity type name. Will be null if entity type map is not available. Used
   * for read before send feature.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityType() {
    return entityType;
  }

  /**
   * Output only. Runtime entity type name. Will be null if entity type map is not available. Used
   * for read before send feature.
   * @param entityType entityType or {@code null} for none
   */
  public EventType setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Output only. Schema of webhook event payload.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventPayloadSchema() {
    return eventPayloadSchema;
  }

  /**
   * Output only. Schema of webhook event payload.
   * @param eventPayloadSchema eventPayloadSchema or {@code null} for none
   */
  public EventType setEventPayloadSchema(java.lang.String eventPayloadSchema) {
    this.eventPayloadSchema = eventPayloadSchema;
    return this;
  }

  /**
   * Output only. Event type id. Example: `ticket.created`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventTypeId() {
    return eventTypeId;
  }

  /**
   * Output only. Event type id. Example: `ticket.created`.
   * @param eventTypeId eventTypeId or {@code null} for none
   */
  public EventType setEventTypeId(java.lang.String eventTypeId) {
    this.eventTypeId = eventTypeId;
    return this;
  }

  /**
   * Output only. Id path denotes the path of id in webhook payload.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdPath() {
    return idPath;
  }

  /**
   * Output only. Id path denotes the path of id in webhook payload.
   * @param idPath idPath or {@code null} for none
   */
  public EventType setIdPath(java.lang.String idPath) {
    this.idPath = idPath;
    return this;
  }

  /**
   * Output only. Resource name of the eventtype. Format: projects/{project}/locations/{location}/pr
   * oviders/{provider}/connectors/{connector}/versions/{version}/eventtypes/{eventtype} Only global
   * location is supported for Connector resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the eventtype. Format: projects/{project}/locations/{location}/pr
   * oviders/{provider}/connectors/{connector}/versions/{version}/eventtypes/{eventtype} Only global
   * location is supported for Connector resource.
   * @param name name or {@code null} for none
   */
  public EventType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Updated time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Updated time.
   * @param updateTime updateTime or {@code null} for none
   */
  public EventType setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public EventType set(String fieldName, Object value) {
    return (EventType) super.set(fieldName, value);
  }

  @Override
  public EventType clone() {
    return (EventType) super.clone();
  }

}
