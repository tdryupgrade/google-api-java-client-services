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
 * GkeHubClusterReference represents a reference to a Kubernetes cluster registered through GKE Hub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GkeHubClusterReference extends com.google.api.client.json.GenericJson {

  /**
   * The full or partial name of a GKE Hub membership, using one of the following forms: * `https://
   * gkehub.googleapis.com/v1beta1/projects/{project_id}/locations/global/memberships/{membership_id
   * }` * `projects/{project_id}/locations/global/memberships/{membership_id}` * `{membership_id}`
   * If project is not specified, the project of the GameServerCluster resource is used to generate
   * the full name of the GKE Hub membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String membership;

  /**
   * The full or partial name of a GKE Hub membership, using one of the following forms: * `https://
   * gkehub.googleapis.com/v1beta1/projects/{project_id}/locations/global/memberships/{membership_id
   * }` * `projects/{project_id}/locations/global/memberships/{membership_id}` * `{membership_id}`
   * If project is not specified, the project of the GameServerCluster resource is used to generate
   * the full name of the GKE Hub membership.
   * @return value or {@code null} for none
   */
  public java.lang.String getMembership() {
    return membership;
  }

  /**
   * The full or partial name of a GKE Hub membership, using one of the following forms: * `https://
   * gkehub.googleapis.com/v1beta1/projects/{project_id}/locations/global/memberships/{membership_id
   * }` * `projects/{project_id}/locations/global/memberships/{membership_id}` * `{membership_id}`
   * If project is not specified, the project of the GameServerCluster resource is used to generate
   * the full name of the GKE Hub membership.
   * @param membership membership or {@code null} for none
   */
  public GkeHubClusterReference setMembership(java.lang.String membership) {
    this.membership = membership;
    return this;
  }

  @Override
  public GkeHubClusterReference set(String fieldName, Object value) {
    return (GkeHubClusterReference) super.set(fieldName, value);
  }

  @Override
  public GkeHubClusterReference clone() {
    return (GkeHubClusterReference) super.clone();
  }

}
