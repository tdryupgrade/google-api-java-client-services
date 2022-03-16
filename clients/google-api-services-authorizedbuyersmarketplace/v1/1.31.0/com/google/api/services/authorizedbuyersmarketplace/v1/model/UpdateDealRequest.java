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

package com.google.api.services.authorizedbuyersmarketplace.v1.model;

/**
 * Request message for updating the deal at the given revision number.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Authorized Buyers Marketplace API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateDealRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The deal to update. The deal's `name` field is used to identify the deal to be
   * updated. Note: proposal_revision will have to be provided within the resource or else an error
   * will be thrown. Format: buyers/{accountId}/proposals/{proposalId}/deals/{dealId}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Deal deal;

  /**
   * List of fields to be updated. If empty or unspecified, the service will update all fields
   * populated in the update request excluding the output only fields and primitive fields with
   * default value. Note that explicit field mask is required in order to reset a primitive field
   * back to its default value, for example, false for boolean fields, 0 for integer fields. A
   * special field mask consisting of a single path "*" can be used to indicate full replacement(the
   * equivalent of PUT method), updatable fields unset or unspecified in the input will be cleared
   * or set to default value. Output only fields will be ignored regardless of the value of
   * updateMask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The deal to update. The deal's `name` field is used to identify the deal to be
   * updated. Note: proposal_revision will have to be provided within the resource or else an error
   * will be thrown. Format: buyers/{accountId}/proposals/{proposalId}/deals/{dealId}
   * @return value or {@code null} for none
   */
  public Deal getDeal() {
    return deal;
  }

  /**
   * Required. The deal to update. The deal's `name` field is used to identify the deal to be
   * updated. Note: proposal_revision will have to be provided within the resource or else an error
   * will be thrown. Format: buyers/{accountId}/proposals/{proposalId}/deals/{dealId}
   * @param deal deal or {@code null} for none
   */
  public UpdateDealRequest setDeal(Deal deal) {
    this.deal = deal;
    return this;
  }

  /**
   * List of fields to be updated. If empty or unspecified, the service will update all fields
   * populated in the update request excluding the output only fields and primitive fields with
   * default value. Note that explicit field mask is required in order to reset a primitive field
   * back to its default value, for example, false for boolean fields, 0 for integer fields. A
   * special field mask consisting of a single path "*" can be used to indicate full replacement(the
   * equivalent of PUT method), updatable fields unset or unspecified in the input will be cleared
   * or set to default value. Output only fields will be ignored regardless of the value of
   * updateMask.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * List of fields to be updated. If empty or unspecified, the service will update all fields
   * populated in the update request excluding the output only fields and primitive fields with
   * default value. Note that explicit field mask is required in order to reset a primitive field
   * back to its default value, for example, false for boolean fields, 0 for integer fields. A
   * special field mask consisting of a single path "*" can be used to indicate full replacement(the
   * equivalent of PUT method), updatable fields unset or unspecified in the input will be cleared
   * or set to default value. Output only fields will be ignored regardless of the value of
   * updateMask.
   * @param updateMask updateMask or {@code null} for none
   */
  public UpdateDealRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public UpdateDealRequest set(String fieldName, Object value) {
    return (UpdateDealRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateDealRequest clone() {
    return (UpdateDealRequest) super.clone();
  }

}
