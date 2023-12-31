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

package com.google.api.services.servicecontrol.v2.model;

/**
 * An individual log entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class V2LogEntry extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private V2HttpRequest httpRequest;

  /**
   * A unique ID for the log entry used for deduplication. If omitted, the implementation will
   * generate one based on operation_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertId;

  /**
   * A set of user-defined (key, value) data that provides additional information about the log
   * entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * A set of user-defined (key, value) data that provides additional information about the
   * moniotored resource that the log entry belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> monitoredResourceLabels;

  /**
   * Required. The log to which this log entry belongs. Examples: `"syslog"`, `"book_log"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private V2LogEntryOperation operation;

  /**
   * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. The
   * only accepted type currently is AuditLog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> protoPayload;

  /**
   * The severity of the log entry. The default value is `LogSeverity.DEFAULT`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private V2LogEntrySourceLocation sourceLocation;

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> structPayload;

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textPayload;

  /**
   * The time the event described by the log entry occurred. If omitted, defaults to operation start
   * time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * Optional. Resource name of the trace associated with the log entry, if any. If this field
   * contains a relative resource name, you can assume the name is relative to
   * `//tracing.googleapis.com`. Example: `projects/my-
   * projectid/traces/06796866738c859f2f19b7cfb3214824`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trace;

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * @return value or {@code null} for none
   */
  public V2HttpRequest getHttpRequest() {
    return httpRequest;
  }

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * @param httpRequest httpRequest or {@code null} for none
   */
  public V2LogEntry setHttpRequest(V2HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
    return this;
  }

  /**
   * A unique ID for the log entry used for deduplication. If omitted, the implementation will
   * generate one based on operation_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertId() {
    return insertId;
  }

  /**
   * A unique ID for the log entry used for deduplication. If omitted, the implementation will
   * generate one based on operation_id.
   * @param insertId insertId or {@code null} for none
   */
  public V2LogEntry setInsertId(java.lang.String insertId) {
    this.insertId = insertId;
    return this;
  }

  /**
   * A set of user-defined (key, value) data that provides additional information about the log
   * entry.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * A set of user-defined (key, value) data that provides additional information about the log
   * entry.
   * @param labels labels or {@code null} for none
   */
  public V2LogEntry setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * A set of user-defined (key, value) data that provides additional information about the
   * moniotored resource that the log entry belongs to.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMonitoredResourceLabels() {
    return monitoredResourceLabels;
  }

  /**
   * A set of user-defined (key, value) data that provides additional information about the
   * moniotored resource that the log entry belongs to.
   * @param monitoredResourceLabels monitoredResourceLabels or {@code null} for none
   */
  public V2LogEntry setMonitoredResourceLabels(java.util.Map<String, java.lang.String> monitoredResourceLabels) {
    this.monitoredResourceLabels = monitoredResourceLabels;
    return this;
  }

  /**
   * Required. The log to which this log entry belongs. Examples: `"syslog"`, `"book_log"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The log to which this log entry belongs. Examples: `"syslog"`, `"book_log"`.
   * @param name name or {@code null} for none
   */
  public V2LogEntry setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @return value or {@code null} for none
   */
  public V2LogEntryOperation getOperation() {
    return operation;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @param operation operation or {@code null} for none
   */
  public V2LogEntry setOperation(V2LogEntryOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. The
   * only accepted type currently is AuditLog.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getProtoPayload() {
    return protoPayload;
  }

  /**
   * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. The
   * only accepted type currently is AuditLog.
   * @param protoPayload protoPayload or {@code null} for none
   */
  public V2LogEntry setProtoPayload(java.util.Map<String, java.lang.Object> protoPayload) {
    this.protoPayload = protoPayload;
    return this;
  }

  /**
   * The severity of the log entry. The default value is `LogSeverity.DEFAULT`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity of the log entry. The default value is `LogSeverity.DEFAULT`.
   * @param severity severity or {@code null} for none
   */
  public V2LogEntry setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * @return value or {@code null} for none
   */
  public V2LogEntrySourceLocation getSourceLocation() {
    return sourceLocation;
  }

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * @param sourceLocation sourceLocation or {@code null} for none
   */
  public V2LogEntry setSourceLocation(V2LogEntrySourceLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getStructPayload() {
    return structPayload;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @param structPayload structPayload or {@code null} for none
   */
  public V2LogEntry setStructPayload(java.util.Map<String, java.lang.Object> structPayload) {
    this.structPayload = structPayload;
    return this;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @return value or {@code null} for none
   */
  public java.lang.String getTextPayload() {
    return textPayload;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @param textPayload textPayload or {@code null} for none
   */
  public V2LogEntry setTextPayload(java.lang.String textPayload) {
    this.textPayload = textPayload;
    return this;
  }

  /**
   * The time the event described by the log entry occurred. If omitted, defaults to operation start
   * time.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * The time the event described by the log entry occurred. If omitted, defaults to operation start
   * time.
   * @param timestamp timestamp or {@code null} for none
   */
  public V2LogEntry setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Optional. Resource name of the trace associated with the log entry, if any. If this field
   * contains a relative resource name, you can assume the name is relative to
   * `//tracing.googleapis.com`. Example: `projects/my-
   * projectid/traces/06796866738c859f2f19b7cfb3214824`
   * @return value or {@code null} for none
   */
  public java.lang.String getTrace() {
    return trace;
  }

  /**
   * Optional. Resource name of the trace associated with the log entry, if any. If this field
   * contains a relative resource name, you can assume the name is relative to
   * `//tracing.googleapis.com`. Example: `projects/my-
   * projectid/traces/06796866738c859f2f19b7cfb3214824`
   * @param trace trace or {@code null} for none
   */
  public V2LogEntry setTrace(java.lang.String trace) {
    this.trace = trace;
    return this;
  }

  @Override
  public V2LogEntry set(String fieldName, Object value) {
    return (V2LogEntry) super.set(fieldName, value);
  }

  @Override
  public V2LogEntry clone() {
    return (V2LogEntry) super.clone();
  }

}
