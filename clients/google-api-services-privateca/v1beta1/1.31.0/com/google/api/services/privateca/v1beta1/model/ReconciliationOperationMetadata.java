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

package com.google.api.services.privateca.v1beta1.model;

/**
 * Operation metadata returned by the CLH during resource state reconciliation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReconciliationOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * If set to TRUE, the resource has to be deleted. When using this bit, the CLH should fail the
   * operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleteResource;

  /**
   * If set to TRUE, the resource has to be deleted. When using this bit, the CLH should fail the
   * operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleteResource() {
    return deleteResource;
  }

  /**
   * If set to TRUE, the resource has to be deleted. When using this bit, the CLH should fail the
   * operation.
   * @param deleteResource deleteResource or {@code null} for none
   */
  public ReconciliationOperationMetadata setDeleteResource(java.lang.Boolean deleteResource) {
    this.deleteResource = deleteResource;
    return this;
  }

  @Override
  public ReconciliationOperationMetadata set(String fieldName, Object value) {
    return (ReconciliationOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public ReconciliationOperationMetadata clone() {
    return (ReconciliationOperationMetadata) super.clone();
  }

}
