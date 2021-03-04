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
 * Activates the latest revision of the specified Consent by committing a new revision with `state`
 * updated to `ACTIVE`. If the latest revision of the given Consent is in the `ACTIVE` state, no new
 * revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the given
 * consent is in the `REJECTED` or `REVOKED` state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActivateConsentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The resource name of the Consent artifact that contains documentation of the user's
   * consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/conse
   * ntStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. If the draft Consent had a
   * Consent artifact, this Consent artifact overwrites it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consentArtifact;

  /**
   * Timestamp in UTC of when this Consent is considered expired.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The time to live for this Consent from when it is marked as active.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String ttl;

  /**
   * Required. The resource name of the Consent artifact that contains documentation of the user's
   * consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/conse
   * ntStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. If the draft Consent had a
   * Consent artifact, this Consent artifact overwrites it.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsentArtifact() {
    return consentArtifact;
  }

  /**
   * Required. The resource name of the Consent artifact that contains documentation of the user's
   * consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/conse
   * ntStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. If the draft Consent had a
   * Consent artifact, this Consent artifact overwrites it.
   * @param consentArtifact consentArtifact or {@code null} for none
   */
  public ActivateConsentRequest setConsentArtifact(java.lang.String consentArtifact) {
    this.consentArtifact = consentArtifact;
    return this;
  }

  /**
   * Timestamp in UTC of when this Consent is considered expired.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Timestamp in UTC of when this Consent is considered expired.
   * @param expireTime expireTime or {@code null} for none
   */
  public ActivateConsentRequest setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * The time to live for this Consent from when it is marked as active.
   * @return value or {@code null} for none
   */
  public String getTtl() {
    return ttl;
  }

  /**
   * The time to live for this Consent from when it is marked as active.
   * @param ttl ttl or {@code null} for none
   */
  public ActivateConsentRequest setTtl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  @Override
  public ActivateConsentRequest set(String fieldName, Object value) {
    return (ActivateConsentRequest) super.set(fieldName, value);
  }

  @Override
  public ActivateConsentRequest clone() {
    return (ActivateConsentRequest) super.clone();
  }

}
