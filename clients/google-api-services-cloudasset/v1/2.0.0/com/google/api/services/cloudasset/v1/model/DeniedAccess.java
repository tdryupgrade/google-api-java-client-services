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

package com.google.api.services.cloudasset.v1.model;

/**
 * A denied access contains details about an access tuple that is blocked by IAM deny policies.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeniedAccess extends com.google.api.client.json.GenericJson {

  /**
   * A denied access tuple that is either fully or partially denied by IAM deny rules. This access
   * tuple should match at least one access tuple derived from IamPolicyAnalysisResult.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssetV1DeniedAccessAccessTuple deniedAccessTuple;

  /**
   * The details about how denied_access_tuple is denied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssetV1DeniedAccessDenyDetail> denyDetails;

  /**
   * A denied access tuple that is either fully or partially denied by IAM deny rules. This access
   * tuple should match at least one access tuple derived from IamPolicyAnalysisResult.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssetV1DeniedAccessAccessTuple getDeniedAccessTuple() {
    return deniedAccessTuple;
  }

  /**
   * A denied access tuple that is either fully or partially denied by IAM deny rules. This access
   * tuple should match at least one access tuple derived from IamPolicyAnalysisResult.
   * @param deniedAccessTuple deniedAccessTuple or {@code null} for none
   */
  public DeniedAccess setDeniedAccessTuple(GoogleCloudAssetV1DeniedAccessAccessTuple deniedAccessTuple) {
    this.deniedAccessTuple = deniedAccessTuple;
    return this;
  }

  /**
   * The details about how denied_access_tuple is denied.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssetV1DeniedAccessDenyDetail> getDenyDetails() {
    return denyDetails;
  }

  /**
   * The details about how denied_access_tuple is denied.
   * @param denyDetails denyDetails or {@code null} for none
   */
  public DeniedAccess setDenyDetails(java.util.List<GoogleCloudAssetV1DeniedAccessDenyDetail> denyDetails) {
    this.denyDetails = denyDetails;
    return this;
  }

  @Override
  public DeniedAccess set(String fieldName, Object value) {
    return (DeniedAccess) super.set(fieldName, value);
  }

  @Override
  public DeniedAccess clone() {
    return (DeniedAccess) super.clone();
  }

}
