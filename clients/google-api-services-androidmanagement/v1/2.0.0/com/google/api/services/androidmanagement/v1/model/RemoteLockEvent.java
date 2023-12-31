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

package com.google.api.services.androidmanagement.v1.model;

/**
 * The device or profile has been remotely locked via the LOCK command.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RemoteLockEvent extends com.google.api.client.json.GenericJson {

  /**
   * Package name of the admin app requesting the change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adminPackageName;

  /**
   * User ID of the admin app from the which the change was requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer adminUserId;

  /**
   * User ID in which the change was requested in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetUserId;

  /**
   * Package name of the admin app requesting the change.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdminPackageName() {
    return adminPackageName;
  }

  /**
   * Package name of the admin app requesting the change.
   * @param adminPackageName adminPackageName or {@code null} for none
   */
  public RemoteLockEvent setAdminPackageName(java.lang.String adminPackageName) {
    this.adminPackageName = adminPackageName;
    return this;
  }

  /**
   * User ID of the admin app from the which the change was requested.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAdminUserId() {
    return adminUserId;
  }

  /**
   * User ID of the admin app from the which the change was requested.
   * @param adminUserId adminUserId or {@code null} for none
   */
  public RemoteLockEvent setAdminUserId(java.lang.Integer adminUserId) {
    this.adminUserId = adminUserId;
    return this;
  }

  /**
   * User ID in which the change was requested in.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetUserId() {
    return targetUserId;
  }

  /**
   * User ID in which the change was requested in.
   * @param targetUserId targetUserId or {@code null} for none
   */
  public RemoteLockEvent setTargetUserId(java.lang.Integer targetUserId) {
    this.targetUserId = targetUserId;
    return this;
  }

  @Override
  public RemoteLockEvent set(String fieldName, Object value) {
    return (RemoteLockEvent) super.set(fieldName, value);
  }

  @Override
  public RemoteLockEvent clone() {
    return (RemoteLockEvent) super.clone();
  }

}
