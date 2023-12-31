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

package com.google.api.services.artifactregistry.v1.model;

/**
 * GoModule represents a Go module.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoModule extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the Go module is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The resource name of a Go module.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The time when the Go module is updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The version of the Go module. Must be a valid canonical version as defined in
   * https://go.dev/ref/mod#glos-canonical-version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Output only. The time when the Go module is created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the Go module is created.
   * @param createTime createTime or {@code null} for none
   */
  public GoModule setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The resource name of a Go module.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of a Go module.
   * @param name name or {@code null} for none
   */
  public GoModule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The time when the Go module is updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the Go module is updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoModule setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The version of the Go module. Must be a valid canonical version as defined in
   * https://go.dev/ref/mod#glos-canonical-version.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of the Go module. Must be a valid canonical version as defined in
   * https://go.dev/ref/mod#glos-canonical-version.
   * @param version version or {@code null} for none
   */
  public GoModule setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public GoModule set(String fieldName, Object value) {
    return (GoModule) super.set(fieldName, value);
  }

  @Override
  public GoModule clone() {
    return (GoModule) super.clone();
  }

}
