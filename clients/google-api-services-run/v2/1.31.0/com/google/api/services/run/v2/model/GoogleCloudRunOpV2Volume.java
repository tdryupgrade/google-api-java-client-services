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

package com.google.api.services.run.v2.model;

/**
 * Volume represents a named volume in a container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunOpV2Volume extends com.google.api.client.json.GenericJson {

  /**
   * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect
   * Cloud SQL and Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunOpV2CloudSqlInstance cloudSqlInstance;

  /**
   * Required. Volume's name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Secret represents a secret that should populate this volume. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#secret
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunOpV2SecretVolumeSource secret;

  /**
   * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect
   * Cloud SQL and Cloud Run.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunOpV2CloudSqlInstance getCloudSqlInstance() {
    return cloudSqlInstance;
  }

  /**
   * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect
   * Cloud SQL and Cloud Run.
   * @param cloudSqlInstance cloudSqlInstance or {@code null} for none
   */
  public GoogleCloudRunOpV2Volume setCloudSqlInstance(GoogleCloudRunOpV2CloudSqlInstance cloudSqlInstance) {
    this.cloudSqlInstance = cloudSqlInstance;
    return this;
  }

  /**
   * Required. Volume's name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Volume's name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudRunOpV2Volume setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Secret represents a secret that should populate this volume. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return value or {@code null} for none
   */
  public GoogleCloudRunOpV2SecretVolumeSource getSecret() {
    return secret;
  }

  /**
   * Secret represents a secret that should populate this volume. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @param secret secret or {@code null} for none
   */
  public GoogleCloudRunOpV2Volume setSecret(GoogleCloudRunOpV2SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

  @Override
  public GoogleCloudRunOpV2Volume set(String fieldName, Object value) {
    return (GoogleCloudRunOpV2Volume) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunOpV2Volume clone() {
    return (GoogleCloudRunOpV2Volume) super.clone();
  }

}
