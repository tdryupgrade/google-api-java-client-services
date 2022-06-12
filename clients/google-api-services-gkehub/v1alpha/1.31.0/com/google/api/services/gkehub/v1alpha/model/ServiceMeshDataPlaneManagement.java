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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * Status of data plane management. Only reported per-member.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceMeshDataPlaneManagement extends com.google.api.client.json.GenericJson {

  /**
   * Explanation of the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceMeshStatusDetails> details;

  /**
   * Lifecycle status of data plane management.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Explanation of the status.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceMeshStatusDetails> getDetails() {
    return details;
  }

  /**
   * Explanation of the status.
   * @param details details or {@code null} for none
   */
  public ServiceMeshDataPlaneManagement setDetails(java.util.List<ServiceMeshStatusDetails> details) {
    this.details = details;
    return this;
  }

  /**
   * Lifecycle status of data plane management.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Lifecycle status of data plane management.
   * @param state state or {@code null} for none
   */
  public ServiceMeshDataPlaneManagement setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public ServiceMeshDataPlaneManagement set(String fieldName, Object value) {
    return (ServiceMeshDataPlaneManagement) super.set(fieldName, value);
  }

  @Override
  public ServiceMeshDataPlaneManagement clone() {
    return (ServiceMeshDataPlaneManagement) super.clone();
  }

}
