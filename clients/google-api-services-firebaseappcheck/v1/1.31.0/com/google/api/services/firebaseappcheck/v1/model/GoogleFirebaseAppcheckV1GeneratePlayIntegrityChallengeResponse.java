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

package com.google.api.services.firebaseappcheck.v1.model;

/**
 * Response message for the GeneratePlayIntegrityChallenge method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse extends com.google.api.client.json.GenericJson {

  /**
   * A one-time use [challenge](https://developer.android.com/google/play/integrity/verdict#protect-
   * against-replay-attacks) for the client to pass to the Play Integrity API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String challenge;

  /**
   * The duration from the time this challenge is minted until its expiration. This field is
   * intended to ease client-side token management, since the client may have clock skew, but is
   * still able to accurately measure a duration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String ttl;

  /**
   * A one-time use [challenge](https://developer.android.com/google/play/integrity/verdict#protect-
   * against-replay-attacks) for the client to pass to the Play Integrity API.
   * @return value or {@code null} for none
   */
  public java.lang.String getChallenge() {
    return challenge;
  }

  /**
   * A one-time use [challenge](https://developer.android.com/google/play/integrity/verdict#protect-
   * against-replay-attacks) for the client to pass to the Play Integrity API.
   * @param challenge challenge or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse setChallenge(java.lang.String challenge) {
    this.challenge = challenge;
    return this;
  }

  /**
   * The duration from the time this challenge is minted until its expiration. This field is
   * intended to ease client-side token management, since the client may have clock skew, but is
   * still able to accurately measure a duration.
   * @return value or {@code null} for none
   */
  public String getTtl() {
    return ttl;
  }

  /**
   * The duration from the time this challenge is minted until its expiration. This field is
   * intended to ease client-side token management, since the client may have clock skew, but is
   * still able to accurately measure a duration.
   * @param ttl ttl or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse setTtl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse clone() {
    return (GoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse) super.clone();
  }

}
