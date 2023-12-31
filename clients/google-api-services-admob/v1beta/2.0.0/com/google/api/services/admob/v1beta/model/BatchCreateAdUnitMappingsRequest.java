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

package com.google.api.services.admob.v1beta.model;

/**
 * Request to create a batch of ad unit mappings under the specific AdMob account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchCreateAdUnitMappingsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The request message specifying the ad unit mappings to create. A maximum of 100 ad
   * unit mappings can be created in a batch. If the number of ad unit mappings in the batch request
   * exceed 100, the entire request will be rejected and no ad unit mappings will be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CreateAdUnitMappingRequest> requests;

  /**
   * Required. The request message specifying the ad unit mappings to create. A maximum of 100 ad
   * unit mappings can be created in a batch. If the number of ad unit mappings in the batch request
   * exceed 100, the entire request will be rejected and no ad unit mappings will be created.
   * @return value or {@code null} for none
   */
  public java.util.List<CreateAdUnitMappingRequest> getRequests() {
    return requests;
  }

  /**
   * Required. The request message specifying the ad unit mappings to create. A maximum of 100 ad
   * unit mappings can be created in a batch. If the number of ad unit mappings in the batch request
   * exceed 100, the entire request will be rejected and no ad unit mappings will be created.
   * @param requests requests or {@code null} for none
   */
  public BatchCreateAdUnitMappingsRequest setRequests(java.util.List<CreateAdUnitMappingRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public BatchCreateAdUnitMappingsRequest set(String fieldName, Object value) {
    return (BatchCreateAdUnitMappingsRequest) super.set(fieldName, value);
  }

  @Override
  public BatchCreateAdUnitMappingsRequest clone() {
    return (BatchCreateAdUnitMappingsRequest) super.clone();
  }

}
