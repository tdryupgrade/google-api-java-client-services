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

package com.google.api.services.datatransfer.model;

/**
 * A Transfer resource represents the transfer of the ownership of user data between users.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataTransfer extends com.google.api.client.json.GenericJson {

  /**
   * The list of per-application data transfer resources. It contains details of the applications
   * associated with this transfer resource, and also specifies the applications for which data
   * transfer has to be done at the time of the transfer resource creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApplicationDataTransfer> applicationDataTransfers;

  static {
    // hack to force ProGuard to consider ApplicationDataTransfer used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ApplicationDataTransfer.class);
  }

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Read-only. The transfer's ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies the resource as a DataTransfer request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * ID of the user to whom the data is being transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newOwnerUserId;

  /**
   * ID of the user whose data is being transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oldOwnerUserId;

  /**
   * Read-only. Overall transfer status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overallTransferStatusCode;

  /**
   * Read-only. The time at which the data transfer was requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime requestTime;

  /**
   * The list of per-application data transfer resources. It contains details of the applications
   * associated with this transfer resource, and also specifies the applications for which data
   * transfer has to be done at the time of the transfer resource creation.
   * @return value or {@code null} for none
   */
  public java.util.List<ApplicationDataTransfer> getApplicationDataTransfers() {
    return applicationDataTransfers;
  }

  /**
   * The list of per-application data transfer resources. It contains details of the applications
   * associated with this transfer resource, and also specifies the applications for which data
   * transfer has to be done at the time of the transfer resource creation.
   * @param applicationDataTransfers applicationDataTransfers or {@code null} for none
   */
  public DataTransfer setApplicationDataTransfers(java.util.List<ApplicationDataTransfer> applicationDataTransfers) {
    this.applicationDataTransfers = applicationDataTransfers;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public DataTransfer setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Read-only. The transfer's ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Read-only. The transfer's ID.
   * @param id id or {@code null} for none
   */
  public DataTransfer setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the resource as a DataTransfer request.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a DataTransfer request.
   * @param kind kind or {@code null} for none
   */
  public DataTransfer setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * ID of the user to whom the data is being transferred.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewOwnerUserId() {
    return newOwnerUserId;
  }

  /**
   * ID of the user to whom the data is being transferred.
   * @param newOwnerUserId newOwnerUserId or {@code null} for none
   */
  public DataTransfer setNewOwnerUserId(java.lang.String newOwnerUserId) {
    this.newOwnerUserId = newOwnerUserId;
    return this;
  }

  /**
   * ID of the user whose data is being transferred.
   * @return value or {@code null} for none
   */
  public java.lang.String getOldOwnerUserId() {
    return oldOwnerUserId;
  }

  /**
   * ID of the user whose data is being transferred.
   * @param oldOwnerUserId oldOwnerUserId or {@code null} for none
   */
  public DataTransfer setOldOwnerUserId(java.lang.String oldOwnerUserId) {
    this.oldOwnerUserId = oldOwnerUserId;
    return this;
  }

  /**
   * Read-only. Overall transfer status.
   * @return value or {@code null} for none
   */
  public java.lang.String getOverallTransferStatusCode() {
    return overallTransferStatusCode;
  }

  /**
   * Read-only. Overall transfer status.
   * @param overallTransferStatusCode overallTransferStatusCode or {@code null} for none
   */
  public DataTransfer setOverallTransferStatusCode(java.lang.String overallTransferStatusCode) {
    this.overallTransferStatusCode = overallTransferStatusCode;
    return this;
  }

  /**
   * Read-only. The time at which the data transfer was requested.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getRequestTime() {
    return requestTime;
  }

  /**
   * Read-only. The time at which the data transfer was requested.
   * @param requestTime requestTime or {@code null} for none
   */
  public DataTransfer setRequestTime(com.google.api.client.util.DateTime requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  @Override
  public DataTransfer set(String fieldName, Object value) {
    return (DataTransfer) super.set(fieldName, value);
  }

  @Override
  public DataTransfer clone() {
    return (DataTransfer) super.clone();
  }

}
