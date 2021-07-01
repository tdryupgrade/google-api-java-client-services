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

package com.google.api.services.dataproc.model;

/**
 * A request to start a cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StartClusterRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Specifying the cluster_uuid means the RPC will fail (with error NOT_FOUND) if a
   * cluster with the specified UUID does not exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterUuid;

  /**
   * Optional. A unique ID used to identify the request. If the server receives two
   * StartClusterRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc
   * .v1#google.cloud.dataproc.v1.StartClusterRequest)s with the same id, then the second request
   * will be ignored and the first google.longrunning.Operation created and stored in the backend is
   * returned.Recommendation: Set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The ID must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Optional. Specifying the cluster_uuid means the RPC will fail (with error NOT_FOUND) if a
   * cluster with the specified UUID does not exist.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterUuid() {
    return clusterUuid;
  }

  /**
   * Optional. Specifying the cluster_uuid means the RPC will fail (with error NOT_FOUND) if a
   * cluster with the specified UUID does not exist.
   * @param clusterUuid clusterUuid or {@code null} for none
   */
  public StartClusterRequest setClusterUuid(java.lang.String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

  /**
   * Optional. A unique ID used to identify the request. If the server receives two
   * StartClusterRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc
   * .v1#google.cloud.dataproc.v1.StartClusterRequest)s with the same id, then the second request
   * will be ignored and the first google.longrunning.Operation created and stored in the backend is
   * returned.Recommendation: Set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The ID must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. A unique ID used to identify the request. If the server receives two
   * StartClusterRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc
   * .v1#google.cloud.dataproc.v1.StartClusterRequest)s with the same id, then the second request
   * will be ignored and the first google.longrunning.Operation created and stored in the backend is
   * returned.Recommendation: Set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The ID must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * @param requestId requestId or {@code null} for none
   */
  public StartClusterRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public StartClusterRequest set(String fieldName, Object value) {
    return (StartClusterRequest) super.set(fieldName, value);
  }

  @Override
  public StartClusterRequest clone() {
    return (StartClusterRequest) super.clone();
  }

}
