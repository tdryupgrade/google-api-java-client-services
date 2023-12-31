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

package com.google.api.services.osconfig.v1.model;

/**
 * A response message for listing patch deployments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListPatchDeploymentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A pagination token that can be used to get the next page of patch deployments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of patch deployments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PatchDeployment> patchDeployments;

  /**
   * A pagination token that can be used to get the next page of patch deployments.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token that can be used to get the next page of patch deployments.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListPatchDeploymentsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of patch deployments.
   * @return value or {@code null} for none
   */
  public java.util.List<PatchDeployment> getPatchDeployments() {
    return patchDeployments;
  }

  /**
   * The list of patch deployments.
   * @param patchDeployments patchDeployments or {@code null} for none
   */
  public ListPatchDeploymentsResponse setPatchDeployments(java.util.List<PatchDeployment> patchDeployments) {
    this.patchDeployments = patchDeployments;
    return this;
  }

  @Override
  public ListPatchDeploymentsResponse set(String fieldName, Object value) {
    return (ListPatchDeploymentsResponse) super.set(fieldName, value);
  }

  @Override
  public ListPatchDeploymentsResponse clone() {
    return (ListPatchDeploymentsResponse) super.clone();
  }

}
