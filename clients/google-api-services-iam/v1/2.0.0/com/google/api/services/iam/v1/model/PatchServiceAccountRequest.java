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

package com.google.api.services.iam.v1.model;

/**
 * The service account patch request. You can patch only the `display_name` and `description`
 * fields. You must use the `update_mask` field to specify which of these fields you want to patch.
 * Only the fields specified in the request are guaranteed to be returned in the response. Other
 * fields may be empty in the response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PatchServiceAccountRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceAccount serviceAccount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * @return value or {@code null} for none
   */
  public ServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  /**
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public PatchServiceAccountRequest setServiceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * @param updateMask updateMask or {@code null} for none
   */
  public PatchServiceAccountRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public PatchServiceAccountRequest set(String fieldName, Object value) {
    return (PatchServiceAccountRequest) super.set(fieldName, value);
  }

  @Override
  public PatchServiceAccountRequest clone() {
    return (PatchServiceAccountRequest) super.clone();
  }

}
