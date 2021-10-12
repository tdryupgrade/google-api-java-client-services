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
 * Request message for batch updating deals.
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
public final class BatchUpdateDealsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. List of request messages to update deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UpdateDealRequest> requests;

  /**
   * Required. List of request messages to update deals.
   * @return value or {@code null} for none
   */
  public java.util.List<UpdateDealRequest> getRequests() {
    return requests;
  }

  /**
   * Required. List of request messages to update deals.
   * @param requests requests or {@code null} for none
   */
  public BatchUpdateDealsRequest setRequests(java.util.List<UpdateDealRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public BatchUpdateDealsRequest set(String fieldName, Object value) {
    return (BatchUpdateDealsRequest) super.set(fieldName, value);
  }

  @Override
  public BatchUpdateDealsRequest clone() {
    return (BatchUpdateDealsRequest) super.clone();
  }

}
