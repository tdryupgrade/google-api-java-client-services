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

package com.google.api.services.datacatalog.v1.model;

/**
 * Spec that applies to clusters of an Instance of Cloud Bigtable.
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
public final class GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec extends com.google.api.client.json.GenericJson {

  /**
   * Name of the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * A link back to the parent resource, in this case Instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedResource;

  /**
   * Location of the cluster, typically a Cloud zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Type of the resource. For a cluster this would be "CLUSTER".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Name of the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of the cluster.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A link back to the parent resource, in this case Instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedResource() {
    return linkedResource;
  }

  /**
   * A link back to the parent resource, in this case Instance.
   * @param linkedResource linkedResource or {@code null} for none
   */
  public GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec setLinkedResource(java.lang.String linkedResource) {
    this.linkedResource = linkedResource;
    return this;
  }

  /**
   * Location of the cluster, typically a Cloud zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location of the cluster, typically a Cloud zone.
   * @param location location or {@code null} for none
   */
  public GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Type of the resource. For a cluster this would be "CLUSTER".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the resource. For a cluster this would be "CLUSTER".
   * @param type type or {@code null} for none
   */
  public GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec clone() {
    return (GoogleCloudDatacatalogV1CloudBigtableInstanceSpecCloudBigtableClusterSpec) super.clone();
  }

}
