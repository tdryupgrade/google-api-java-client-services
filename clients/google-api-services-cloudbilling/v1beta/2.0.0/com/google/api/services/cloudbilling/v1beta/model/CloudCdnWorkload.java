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

package com.google.api.services.cloudbilling.v1beta.model;

/**
 * Specifies usage for Cloud CDN resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudCdnWorkload extends com.google.api.client.json.GenericJson {

  /**
   * The source service for the cache fill.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cacheFillOriginService;

  /**
   * Cache fill usage. The rate of data transferred between cache fill regions. For example: units
   * such as "GiBy/s" or "TBy/mo".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Usage cacheFillRate;

  /**
   * The regions where data is transferred from Google data locations into Google global cache
   * servers. The SKU prices for cache fill across services are the same.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CacheFillRegions cacheFillRegions;

  /**
   * Cache look up requests. This is specified to indicate the number of requests. For example:
   * units such as "1/s".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Usage cacheLookUpRate;

  /**
   * The source service for the cache fill.
   * @return value or {@code null} for none
   */
  public java.lang.String getCacheFillOriginService() {
    return cacheFillOriginService;
  }

  /**
   * The source service for the cache fill.
   * @param cacheFillOriginService cacheFillOriginService or {@code null} for none
   */
  public CloudCdnWorkload setCacheFillOriginService(java.lang.String cacheFillOriginService) {
    this.cacheFillOriginService = cacheFillOriginService;
    return this;
  }

  /**
   * Cache fill usage. The rate of data transferred between cache fill regions. For example: units
   * such as "GiBy/s" or "TBy/mo".
   * @return value or {@code null} for none
   */
  public Usage getCacheFillRate() {
    return cacheFillRate;
  }

  /**
   * Cache fill usage. The rate of data transferred between cache fill regions. For example: units
   * such as "GiBy/s" or "TBy/mo".
   * @param cacheFillRate cacheFillRate or {@code null} for none
   */
  public CloudCdnWorkload setCacheFillRate(Usage cacheFillRate) {
    this.cacheFillRate = cacheFillRate;
    return this;
  }

  /**
   * The regions where data is transferred from Google data locations into Google global cache
   * servers. The SKU prices for cache fill across services are the same.
   * @return value or {@code null} for none
   */
  public CacheFillRegions getCacheFillRegions() {
    return cacheFillRegions;
  }

  /**
   * The regions where data is transferred from Google data locations into Google global cache
   * servers. The SKU prices for cache fill across services are the same.
   * @param cacheFillRegions cacheFillRegions or {@code null} for none
   */
  public CloudCdnWorkload setCacheFillRegions(CacheFillRegions cacheFillRegions) {
    this.cacheFillRegions = cacheFillRegions;
    return this;
  }

  /**
   * Cache look up requests. This is specified to indicate the number of requests. For example:
   * units such as "1/s".
   * @return value or {@code null} for none
   */
  public Usage getCacheLookUpRate() {
    return cacheLookUpRate;
  }

  /**
   * Cache look up requests. This is specified to indicate the number of requests. For example:
   * units such as "1/s".
   * @param cacheLookUpRate cacheLookUpRate or {@code null} for none
   */
  public CloudCdnWorkload setCacheLookUpRate(Usage cacheLookUpRate) {
    this.cacheLookUpRate = cacheLookUpRate;
    return this;
  }

  @Override
  public CloudCdnWorkload set(String fieldName, Object value) {
    return (CloudCdnWorkload) super.set(fieldName, value);
  }

  @Override
  public CloudCdnWorkload clone() {
    return (CloudCdnWorkload) super.clone();
  }

}
