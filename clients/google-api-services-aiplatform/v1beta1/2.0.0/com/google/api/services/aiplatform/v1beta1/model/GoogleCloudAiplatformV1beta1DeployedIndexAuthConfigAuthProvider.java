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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Configuration for an authentication provider, including support for [JSON Web Token
 * (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1DeployedIndexAuthConfigAuthProvider extends com.google.api.client.json.GenericJson {

  /**
   * A list of allowed JWT issuers. Each entry must be a valid Google service account, in the
   * following format: `service-account-name@project-id.iam.gserviceaccount.com`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedIssuers;

  /**
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> audiences;

  /**
   * A list of allowed JWT issuers. Each entry must be a valid Google service account, in the
   * following format: `service-account-name@project-id.iam.gserviceaccount.com`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedIssuers() {
    return allowedIssuers;
  }

  /**
   * A list of allowed JWT issuers. Each entry must be a valid Google service account, in the
   * following format: `service-account-name@project-id.iam.gserviceaccount.com`
   * @param allowedIssuers allowedIssuers or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DeployedIndexAuthConfigAuthProvider setAllowedIssuers(java.util.List<java.lang.String> allowedIssuers) {
    this.allowedIssuers = allowedIssuers;
    return this;
  }

  /**
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAudiences() {
    return audiences;
  }

  /**
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted.
   * @param audiences audiences or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DeployedIndexAuthConfigAuthProvider setAudiences(java.util.List<java.lang.String> audiences) {
    this.audiences = audiences;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1DeployedIndexAuthConfigAuthProvider set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1DeployedIndexAuthConfigAuthProvider) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1DeployedIndexAuthConfigAuthProvider clone() {
    return (GoogleCloudAiplatformV1beta1DeployedIndexAuthConfigAuthProvider) super.clone();
  }

}
