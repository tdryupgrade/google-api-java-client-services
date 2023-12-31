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

package com.google.api.services.gameservices.v1beta.model;

/**
 * The game server deployment rollout which represents the desired rollout state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GameServerDeploymentRollout extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The default game server config is applied to all realms unless overridden in the rollout. For
   * example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-
   * config`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultGameServerConfig;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Contains the game server config rollout overrides. Overrides are processed in the order they
   * are listed. Once a match is found for a realm, the rest of the list is not processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GameServerConfigOverride> gameServerConfigOverrides;

  static {
    // hack to force ProGuard to consider GameServerConfigOverride used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GameServerConfigOverride.class);
  }

  /**
   * The resource name of the game server deployment rollout, in the following form:
   * `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}/rollout`. For
   * example, `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public GameServerDeploymentRollout setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The default game server config is applied to all realms unless overridden in the rollout. For
   * example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-
   * config`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultGameServerConfig() {
    return defaultGameServerConfig;
  }

  /**
   * The default game server config is applied to all realms unless overridden in the rollout. For
   * example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-
   * config`.
   * @param defaultGameServerConfig defaultGameServerConfig or {@code null} for none
   */
  public GameServerDeploymentRollout setDefaultGameServerConfig(java.lang.String defaultGameServerConfig) {
    this.defaultGameServerConfig = defaultGameServerConfig;
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
  public GameServerDeploymentRollout setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Contains the game server config rollout overrides. Overrides are processed in the order they
   * are listed. Once a match is found for a realm, the rest of the list is not processed.
   * @return value or {@code null} for none
   */
  public java.util.List<GameServerConfigOverride> getGameServerConfigOverrides() {
    return gameServerConfigOverrides;
  }

  /**
   * Contains the game server config rollout overrides. Overrides are processed in the order they
   * are listed. Once a match is found for a realm, the rest of the list is not processed.
   * @param gameServerConfigOverrides gameServerConfigOverrides or {@code null} for none
   */
  public GameServerDeploymentRollout setGameServerConfigOverrides(java.util.List<GameServerConfigOverride> gameServerConfigOverrides) {
    this.gameServerConfigOverrides = gameServerConfigOverrides;
    return this;
  }

  /**
   * The resource name of the game server deployment rollout, in the following form:
   * `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}/rollout`. For
   * example, `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the game server deployment rollout, in the following form:
   * `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}/rollout`. For
   * example, `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
   * @param name name or {@code null} for none
   */
  public GameServerDeploymentRollout setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GameServerDeploymentRollout setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GameServerDeploymentRollout set(String fieldName, Object value) {
    return (GameServerDeploymentRollout) super.set(fieldName, value);
  }

  @Override
  public GameServerDeploymentRollout clone() {
    return (GameServerDeploymentRollout) super.clone();
  }

}
