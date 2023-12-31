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

package com.google.api.services.identitytoolkit.v1.model;

/**
 * Response for IssueSamlResponse request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse extends com.google.api.client.json.GenericJson {

  /**
   * The ACS endpoint which consumes the returned SAMLResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acsEndpoint;

  /**
   * Email of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * First name of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstName;

  /**
   * Whether the logged in user was created by this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isNewUser;

  /**
   * Last name of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastName;

  /**
   * Generated RelayState.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relayState;

  /**
   * Signed SAMLResponse created for the Relying Party.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String samlResponse;

  /**
   * The ACS endpoint which consumes the returned SAMLResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcsEndpoint() {
    return acsEndpoint;
  }

  /**
   * The ACS endpoint which consumes the returned SAMLResponse.
   * @param acsEndpoint acsEndpoint or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse setAcsEndpoint(java.lang.String acsEndpoint) {
    this.acsEndpoint = acsEndpoint;
    return this;
  }

  /**
   * Email of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Email of the user.
   * @param email email or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * First name of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstName() {
    return firstName;
  }

  /**
   * First name of the user.
   * @param firstName firstName or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse setFirstName(java.lang.String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Whether the logged in user was created by this request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsNewUser() {
    return isNewUser;
  }

  /**
   * Whether the logged in user was created by this request.
   * @param isNewUser isNewUser or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse setIsNewUser(java.lang.Boolean isNewUser) {
    this.isNewUser = isNewUser;
    return this;
  }

  /**
   * Last name of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastName() {
    return lastName;
  }

  /**
   * Last name of the user.
   * @param lastName lastName or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse setLastName(java.lang.String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Generated RelayState.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelayState() {
    return relayState;
  }

  /**
   * Generated RelayState.
   * @param relayState relayState or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse setRelayState(java.lang.String relayState) {
    this.relayState = relayState;
    return this;
  }

  /**
   * Signed SAMLResponse created for the Relying Party.
   * @return value or {@code null} for none
   */
  public java.lang.String getSamlResponse() {
    return samlResponse;
  }

  /**
   * Signed SAMLResponse created for the Relying Party.
   * @param samlResponse samlResponse or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse setSamlResponse(java.lang.String samlResponse) {
    this.samlResponse = samlResponse;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse clone() {
    return (GoogleCloudIdentitytoolkitV1IssueSamlResponseResponse) super.clone();
  }

}
