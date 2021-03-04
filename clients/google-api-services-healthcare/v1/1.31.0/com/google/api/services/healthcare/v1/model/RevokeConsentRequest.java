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

package com.google.api.services.healthcare.v1.model;

/**
 * Revokes the latest revision of the specified Consent by committing a new revision with `state`
 * updated to `REVOKED`. If the latest revision of the given Consent is in the `REVOKED` state, no
 * new revision is committed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RevokeConsentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The resource name of the Consent artifact that contains proof of the user's
   * revocation of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/
   * {dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consentArtifact;

  /**
   * Optional. The resource name of the Consent artifact that contains proof of the user's
   * revocation of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/
   * {dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsentArtifact() {
    return consentArtifact;
  }

  /**
   * Optional. The resource name of the Consent artifact that contains proof of the user's
   * revocation of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/
   * {dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
   * @param consentArtifact consentArtifact or {@code null} for none
   */
  public RevokeConsentRequest setConsentArtifact(java.lang.String consentArtifact) {
    this.consentArtifact = consentArtifact;
    return this;
  }

  @Override
  public RevokeConsentRequest set(String fieldName, Object value) {
    return (RevokeConsentRequest) super.set(fieldName, value);
  }

  @Override
  public RevokeConsentRequest clone() {
    return (RevokeConsentRequest) super.clone();
  }

}
