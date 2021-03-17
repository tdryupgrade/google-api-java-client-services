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

package com.google.api.services.gkehub.v1alpha2.model;

/**
 * Response message for the InitializeHub method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InitializeHubResponse extends com.google.api.client.json.GenericJson {

  /**
   * Name of the Hub default service identity, in the format: service-@gcp-sa-
   * gkehub.iam.gserviceaccount.com The service account has `roles/gkehub.serviceAgent` in the Hub
   * project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceIdentity;

  /**
   * The Workload Identity Pool used for Workload Identity-enabled clusters registered with this
   * Hub. Format: `.hub.id.goog`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workloadIdentityPool;

  /**
   * Name of the Hub default service identity, in the format: service-@gcp-sa-
   * gkehub.iam.gserviceaccount.com The service account has `roles/gkehub.serviceAgent` in the Hub
   * project.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceIdentity() {
    return serviceIdentity;
  }

  /**
   * Name of the Hub default service identity, in the format: service-@gcp-sa-
   * gkehub.iam.gserviceaccount.com The service account has `roles/gkehub.serviceAgent` in the Hub
   * project.
   * @param serviceIdentity serviceIdentity or {@code null} for none
   */
  public InitializeHubResponse setServiceIdentity(java.lang.String serviceIdentity) {
    this.serviceIdentity = serviceIdentity;
    return this;
  }

  /**
   * The Workload Identity Pool used for Workload Identity-enabled clusters registered with this
   * Hub. Format: `.hub.id.goog`
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkloadIdentityPool() {
    return workloadIdentityPool;
  }

  /**
   * The Workload Identity Pool used for Workload Identity-enabled clusters registered with this
   * Hub. Format: `.hub.id.goog`
   * @param workloadIdentityPool workloadIdentityPool or {@code null} for none
   */
  public InitializeHubResponse setWorkloadIdentityPool(java.lang.String workloadIdentityPool) {
    this.workloadIdentityPool = workloadIdentityPool;
    return this;
  }

  @Override
  public InitializeHubResponse set(String fieldName, Object value) {
    return (InitializeHubResponse) super.set(fieldName, value);
  }

  @Override
  public InitializeHubResponse clone() {
    return (InitializeHubResponse) super.clone();
  }

}
