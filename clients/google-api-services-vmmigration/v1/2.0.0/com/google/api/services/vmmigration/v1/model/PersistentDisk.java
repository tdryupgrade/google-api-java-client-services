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

package com.google.api.services.vmmigration.v1.model;

/**
 * Details of a created Persistent Disk.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PersistentDisk extends com.google.api.client.json.GenericJson {

  /**
   * The URI of the Persistent Disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskUri;

  /**
   * The ordinal number of the source VM disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sourceDiskNumber;

  /**
   * The URI of the Persistent Disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskUri() {
    return diskUri;
  }

  /**
   * The URI of the Persistent Disk.
   * @param diskUri diskUri or {@code null} for none
   */
  public PersistentDisk setDiskUri(java.lang.String diskUri) {
    this.diskUri = diskUri;
    return this;
  }

  /**
   * The ordinal number of the source VM disk.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSourceDiskNumber() {
    return sourceDiskNumber;
  }

  /**
   * The ordinal number of the source VM disk.
   * @param sourceDiskNumber sourceDiskNumber or {@code null} for none
   */
  public PersistentDisk setSourceDiskNumber(java.lang.Integer sourceDiskNumber) {
    this.sourceDiskNumber = sourceDiskNumber;
    return this;
  }

  @Override
  public PersistentDisk set(String fieldName, Object value) {
    return (PersistentDisk) super.set(fieldName, value);
  }

  @Override
  public PersistentDisk clone() {
    return (PersistentDisk) super.clone();
  }

}
