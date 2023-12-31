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

package com.google.api.services.cloudtasks.v2beta2.model;

/**
 * Contains information needed for generating an [OAuth
 * token](https://developers.google.com/identity/protocols/OAuth2). This type of authorization
 * should generally only be used when calling Google APIs hosted on *.googleapis.com.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OAuthToken extends com.google.api.client.json.GenericJson {

  /**
   * OAuth scope to be used for generating OAuth access token. If not specified,
   * "https://www.googleapis.com/auth/cloud-platform" will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for
   * generating OAuth token. The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmail;

  /**
   * OAuth scope to be used for generating OAuth access token. If not specified,
   * "https://www.googleapis.com/auth/cloud-platform" will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * OAuth scope to be used for generating OAuth access token. If not specified,
   * "https://www.googleapis.com/auth/cloud-platform" will be used.
   * @param scope scope or {@code null} for none
   */
  public OAuthToken setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for
   * generating OAuth token. The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for
   * generating OAuth token. The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service account.
   * @param serviceAccountEmail serviceAccountEmail or {@code null} for none
   */
  public OAuthToken setServiceAccountEmail(java.lang.String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  @Override
  public OAuthToken set(String fieldName, Object value) {
    return (OAuthToken) super.set(fieldName, value);
  }

  @Override
  public OAuthToken clone() {
    return (OAuthToken) super.clone();
  }

}
