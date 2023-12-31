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

package com.google.api.services.webrisk.v1.model;

/**
 * Model definition for GoogleCloudWebriskV1ComputeThreatListDiffResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Web Risk API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudWebriskV1ComputeThreatListDiffResponse extends com.google.api.client.json.GenericJson {

  /**
   * A set of entries to add to a local threat type's list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudWebriskV1ThreatEntryAdditions additions;

  /**
   * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present
   * in the database after applying the provided diff. If the client state doesn't match the
   * expected state, the client must discard this diff and retry later.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum checksum;

  /**
   * The new opaque client version token. This should be retained by the client and passed into the
   * next call of ComputeThreatListDiff as 'version_token'. A separate version token should be
   * stored and used for each threatList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newVersionToken;

  /**
   * The soonest the client should wait before issuing any diff request. Querying sooner is unlikely
   * to produce a meaningful diff. Waiting longer is acceptable considering the use case. If this
   * field is not set clients may update as soon as they want.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String recommendedNextDiff;

  /**
   * A set of entries to remove from a local threat type's list. This field may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudWebriskV1ThreatEntryRemovals removals;

  /**
   * The type of response. This may indicate that an action must be taken by the client when the
   * response is received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseType;

  /**
   * A set of entries to add to a local threat type's list.
   * @return value or {@code null} for none
   */
  public GoogleCloudWebriskV1ThreatEntryAdditions getAdditions() {
    return additions;
  }

  /**
   * A set of entries to add to a local threat type's list.
   * @param additions additions or {@code null} for none
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse setAdditions(GoogleCloudWebriskV1ThreatEntryAdditions additions) {
    this.additions = additions;
    return this;
  }

  /**
   * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present
   * in the database after applying the provided diff. If the client state doesn't match the
   * expected state, the client must discard this diff and retry later.
   * @return value or {@code null} for none
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum getChecksum() {
    return checksum;
  }

  /**
   * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present
   * in the database after applying the provided diff. If the client state doesn't match the
   * expected state, the client must discard this diff and retry later.
   * @param checksum checksum or {@code null} for none
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse setChecksum(GoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * The new opaque client version token. This should be retained by the client and passed into the
   * next call of ComputeThreatListDiff as 'version_token'. A separate version token should be
   * stored and used for each threatList.
   * @see #decodeNewVersionToken()
   * @return value or {@code null} for none
   */
  public java.lang.String getNewVersionToken() {
    return newVersionToken;
  }

  /**
   * The new opaque client version token. This should be retained by the client and passed into the
   * next call of ComputeThreatListDiff as 'version_token'. A separate version token should be
   * stored and used for each threatList.
   * @see #getNewVersionToken()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeNewVersionToken() {
    return com.google.api.client.util.Base64.decodeBase64(newVersionToken);
  }

  /**
   * The new opaque client version token. This should be retained by the client and passed into the
   * next call of ComputeThreatListDiff as 'version_token'. A separate version token should be
   * stored and used for each threatList.
   * @see #encodeNewVersionToken()
   * @param newVersionToken newVersionToken or {@code null} for none
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse setNewVersionToken(java.lang.String newVersionToken) {
    this.newVersionToken = newVersionToken;
    return this;
  }

  /**
   * The new opaque client version token. This should be retained by the client and passed into the
   * next call of ComputeThreatListDiff as 'version_token'. A separate version token should be
   * stored and used for each threatList.
   * @see #setNewVersionToken()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse encodeNewVersionToken(byte[] newVersionToken) {
    this.newVersionToken = com.google.api.client.util.Base64.encodeBase64URLSafeString(newVersionToken);
    return this;
  }

  /**
   * The soonest the client should wait before issuing any diff request. Querying sooner is unlikely
   * to produce a meaningful diff. Waiting longer is acceptable considering the use case. If this
   * field is not set clients may update as soon as they want.
   * @return value or {@code null} for none
   */
  public String getRecommendedNextDiff() {
    return recommendedNextDiff;
  }

  /**
   * The soonest the client should wait before issuing any diff request. Querying sooner is unlikely
   * to produce a meaningful diff. Waiting longer is acceptable considering the use case. If this
   * field is not set clients may update as soon as they want.
   * @param recommendedNextDiff recommendedNextDiff or {@code null} for none
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse setRecommendedNextDiff(String recommendedNextDiff) {
    this.recommendedNextDiff = recommendedNextDiff;
    return this;
  }

  /**
   * A set of entries to remove from a local threat type's list. This field may be empty.
   * @return value or {@code null} for none
   */
  public GoogleCloudWebriskV1ThreatEntryRemovals getRemovals() {
    return removals;
  }

  /**
   * A set of entries to remove from a local threat type's list. This field may be empty.
   * @param removals removals or {@code null} for none
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse setRemovals(GoogleCloudWebriskV1ThreatEntryRemovals removals) {
    this.removals = removals;
    return this;
  }

  /**
   * The type of response. This may indicate that an action must be taken by the client when the
   * response is received.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseType() {
    return responseType;
  }

  /**
   * The type of response. This may indicate that an action must be taken by the client when the
   * response is received.
   * @param responseType responseType or {@code null} for none
   */
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse setResponseType(java.lang.String responseType) {
    this.responseType = responseType;
    return this;
  }

  @Override
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse set(String fieldName, Object value) {
    return (GoogleCloudWebriskV1ComputeThreatListDiffResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudWebriskV1ComputeThreatListDiffResponse clone() {
    return (GoogleCloudWebriskV1ComputeThreatListDiffResponse) super.clone();
  }

}
