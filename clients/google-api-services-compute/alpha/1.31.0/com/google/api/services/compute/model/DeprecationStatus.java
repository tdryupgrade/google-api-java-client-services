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
 * Deprecation status for a public resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeprecationStatus extends com.google.api.client.json.GenericJson {

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to DELETED. This is only informational and the status will not change unless the client
   * explicitly changes it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deleted;

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to DEPRECATED. This is only informational and the status will not change unless the
   * client explicitly changes it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deprecated;

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to OBSOLETE. This is only informational and the status will not change unless the client
   * explicitly changes it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String obsolete;

  /**
   * The URL of the suggested replacement for a deprecated resource. The suggested replacement
   * resource must be the same kind of resource as the deprecated resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replacement;

  /**
   * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED.
   * Operations which communicate the end of life date for an image, can use ACTIVE. Operations
   * which create a new resource using a DEPRECATED resource will return successfully, but with a
   * warning indicating the deprecated resource and recommending its replacement. Operations which
   * use OBSOLETE or DELETED resources will be rejected and result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The rollout policy of this deprecation. This policy is only enforced by image family views. The
   * rollout policy restricts the zones where the associated resource is considered in a deprecated
   * state. When the rollout policy does not include the user specified zone, or if the zone is
   * rolled out, the associated resource is considered in a deprecated state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RolloutPolicy stateOverride;

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to DELETED. This is only informational and the status will not change unless the client
   * explicitly changes it.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeleted() {
    return deleted;
  }

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to DELETED. This is only informational and the status will not change unless the client
   * explicitly changes it.
   * @param deleted deleted or {@code null} for none
   */
  public DeprecationStatus setDeleted(java.lang.String deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to DEPRECATED. This is only informational and the status will not change unless the
   * client explicitly changes it.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeprecated() {
    return deprecated;
  }

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to DEPRECATED. This is only informational and the status will not change unless the
   * client explicitly changes it.
   * @param deprecated deprecated or {@code null} for none
   */
  public DeprecationStatus setDeprecated(java.lang.String deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to OBSOLETE. This is only informational and the status will not change unless the client
   * explicitly changes it.
   * @return value or {@code null} for none
   */
  public java.lang.String getObsolete() {
    return obsolete;
  }

  /**
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to
   * change to OBSOLETE. This is only informational and the status will not change unless the client
   * explicitly changes it.
   * @param obsolete obsolete or {@code null} for none
   */
  public DeprecationStatus setObsolete(java.lang.String obsolete) {
    this.obsolete = obsolete;
    return this;
  }

  /**
   * The URL of the suggested replacement for a deprecated resource. The suggested replacement
   * resource must be the same kind of resource as the deprecated resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplacement() {
    return replacement;
  }

  /**
   * The URL of the suggested replacement for a deprecated resource. The suggested replacement
   * resource must be the same kind of resource as the deprecated resource.
   * @param replacement replacement or {@code null} for none
   */
  public DeprecationStatus setReplacement(java.lang.String replacement) {
    this.replacement = replacement;
    return this;
  }

  /**
   * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED.
   * Operations which communicate the end of life date for an image, can use ACTIVE. Operations
   * which create a new resource using a DEPRECATED resource will return successfully, but with a
   * warning indicating the deprecated resource and recommending its replacement. Operations which
   * use OBSOLETE or DELETED resources will be rejected and result in an error.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED.
   * Operations which communicate the end of life date for an image, can use ACTIVE. Operations
   * which create a new resource using a DEPRECATED resource will return successfully, but with a
   * warning indicating the deprecated resource and recommending its replacement. Operations which
   * use OBSOLETE or DELETED resources will be rejected and result in an error.
   * @param state state or {@code null} for none
   */
  public DeprecationStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The rollout policy of this deprecation. This policy is only enforced by image family views. The
   * rollout policy restricts the zones where the associated resource is considered in a deprecated
   * state. When the rollout policy does not include the user specified zone, or if the zone is
   * rolled out, the associated resource is considered in a deprecated state.
   * @return value or {@code null} for none
   */
  public RolloutPolicy getStateOverride() {
    return stateOverride;
  }

  /**
   * The rollout policy of this deprecation. This policy is only enforced by image family views. The
   * rollout policy restricts the zones where the associated resource is considered in a deprecated
   * state. When the rollout policy does not include the user specified zone, or if the zone is
   * rolled out, the associated resource is considered in a deprecated state.
   * @param stateOverride stateOverride or {@code null} for none
   */
  public DeprecationStatus setStateOverride(RolloutPolicy stateOverride) {
    this.stateOverride = stateOverride;
    return this;
  }

  @Override
  public DeprecationStatus set(String fieldName, Object value) {
    return (DeprecationStatus) super.set(fieldName, value);
  }

  @Override
  public DeprecationStatus clone() {
    return (DeprecationStatus) super.clone();
  }

}
