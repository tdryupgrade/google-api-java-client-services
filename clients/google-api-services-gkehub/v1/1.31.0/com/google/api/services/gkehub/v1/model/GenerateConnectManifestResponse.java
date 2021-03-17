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

package com.google.api.services.gkehub.v1.model;

/**
 * GenerateConnectManifestResponse contains manifest information for installing/upgrading a Connect
 * agent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateConnectManifestResponse extends com.google.api.client.json.GenericJson {

  /**
   * The ordered list of Kubernetes resources that need to be applied to the cluster for GKE Connect
   * agent installation/upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConnectAgentResource> manifest;

  static {
    // hack to force ProGuard to consider ConnectAgentResource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConnectAgentResource.class);
  }

  /**
   * The ordered list of Kubernetes resources that need to be applied to the cluster for GKE Connect
   * agent installation/upgrade.
   * @return value or {@code null} for none
   */
  public java.util.List<ConnectAgentResource> getManifest() {
    return manifest;
  }

  /**
   * The ordered list of Kubernetes resources that need to be applied to the cluster for GKE Connect
   * agent installation/upgrade.
   * @param manifest manifest or {@code null} for none
   */
  public GenerateConnectManifestResponse setManifest(java.util.List<ConnectAgentResource> manifest) {
    this.manifest = manifest;
    return this;
  }

  @Override
  public GenerateConnectManifestResponse set(String fieldName, Object value) {
    return (GenerateConnectManifestResponse) super.set(fieldName, value);
  }

  @Override
  public GenerateConnectManifestResponse clone() {
    return (GenerateConnectManifestResponse) super.clone();
  }

}
