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

package com.google.api.services.compute.model;

/**
 * Model definition for CommitmentResourceStatusCancellationInformation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommitmentResourceStatusCancellationInformation extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] An optional amount of CUDs canceled so far in the last 365 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money canceledCommitment;

  /**
   * [Output Only] An optional last update time of canceled_commitment. RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canceledCommitmentLastUpdatedTimestamp;

  /**
   * [Output Only] An optional,the cancellation cap for how much commitments can be canceled in a
   * rolling 365 per billing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money cancellationCap;

  /**
   * [Output Only] An optional, cancellation fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money cancellationFee;

  /**
   * [Output Only] An optional, cancellation fee expiration time. RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cancellationFeeExpirationTimestamp;

  /**
   * [Output Only] An optional amount of CUDs canceled so far in the last 365 days.
   * @return value or {@code null} for none
   */
  public Money getCanceledCommitment() {
    return canceledCommitment;
  }

  /**
   * [Output Only] An optional amount of CUDs canceled so far in the last 365 days.
   * @param canceledCommitment canceledCommitment or {@code null} for none
   */
  public CommitmentResourceStatusCancellationInformation setCanceledCommitment(Money canceledCommitment) {
    this.canceledCommitment = canceledCommitment;
    return this;
  }

  /**
   * [Output Only] An optional last update time of canceled_commitment. RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanceledCommitmentLastUpdatedTimestamp() {
    return canceledCommitmentLastUpdatedTimestamp;
  }

  /**
   * [Output Only] An optional last update time of canceled_commitment. RFC3339 text format.
   * @param canceledCommitmentLastUpdatedTimestamp canceledCommitmentLastUpdatedTimestamp or {@code null} for none
   */
  public CommitmentResourceStatusCancellationInformation setCanceledCommitmentLastUpdatedTimestamp(java.lang.String canceledCommitmentLastUpdatedTimestamp) {
    this.canceledCommitmentLastUpdatedTimestamp = canceledCommitmentLastUpdatedTimestamp;
    return this;
  }

  /**
   * [Output Only] An optional,the cancellation cap for how much commitments can be canceled in a
   * rolling 365 per billing account.
   * @return value or {@code null} for none
   */
  public Money getCancellationCap() {
    return cancellationCap;
  }

  /**
   * [Output Only] An optional,the cancellation cap for how much commitments can be canceled in a
   * rolling 365 per billing account.
   * @param cancellationCap cancellationCap or {@code null} for none
   */
  public CommitmentResourceStatusCancellationInformation setCancellationCap(Money cancellationCap) {
    this.cancellationCap = cancellationCap;
    return this;
  }

  /**
   * [Output Only] An optional, cancellation fee.
   * @return value or {@code null} for none
   */
  public Money getCancellationFee() {
    return cancellationFee;
  }

  /**
   * [Output Only] An optional, cancellation fee.
   * @param cancellationFee cancellationFee or {@code null} for none
   */
  public CommitmentResourceStatusCancellationInformation setCancellationFee(Money cancellationFee) {
    this.cancellationFee = cancellationFee;
    return this;
  }

  /**
   * [Output Only] An optional, cancellation fee expiration time. RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCancellationFeeExpirationTimestamp() {
    return cancellationFeeExpirationTimestamp;
  }

  /**
   * [Output Only] An optional, cancellation fee expiration time. RFC3339 text format.
   * @param cancellationFeeExpirationTimestamp cancellationFeeExpirationTimestamp or {@code null} for none
   */
  public CommitmentResourceStatusCancellationInformation setCancellationFeeExpirationTimestamp(java.lang.String cancellationFeeExpirationTimestamp) {
    this.cancellationFeeExpirationTimestamp = cancellationFeeExpirationTimestamp;
    return this;
  }

  @Override
  public CommitmentResourceStatusCancellationInformation set(String fieldName, Object value) {
    return (CommitmentResourceStatusCancellationInformation) super.set(fieldName, value);
  }

  @Override
  public CommitmentResourceStatusCancellationInformation clone() {
    return (CommitmentResourceStatusCancellationInformation) super.clone();
  }

}
