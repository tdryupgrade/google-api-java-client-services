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

package com.google.api.services.compute.model;

/**
 * Model definition for InstantSnapshotResourceStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstantSnapshotResourceStatus extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The storage size of this instant snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageSizeBytes;

  /**
   * [Output Only] The storage size of this instant snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageSizeBytes() {
    return storageSizeBytes;
  }

  /**
   * [Output Only] The storage size of this instant snapshot.
   * @param storageSizeBytes storageSizeBytes or {@code null} for none
   */
  public InstantSnapshotResourceStatus setStorageSizeBytes(java.lang.Long storageSizeBytes) {
    this.storageSizeBytes = storageSizeBytes;
    return this;
  }

  @Override
  public InstantSnapshotResourceStatus set(String fieldName, Object value) {
    return (InstantSnapshotResourceStatus) super.set(fieldName, value);
  }

  @Override
  public InstantSnapshotResourceStatus clone() {
    return (InstantSnapshotResourceStatus) super.clone();
  }

}
