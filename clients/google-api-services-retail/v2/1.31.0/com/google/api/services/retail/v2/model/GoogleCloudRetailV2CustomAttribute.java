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

package com.google.api.services.retail.v2.model;

/**
 * A custom attribute that is not explicitly modeled in Product.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2CustomAttribute extends com.google.api.client.json.GenericJson {

  /**
   * This field will only be used when AttributesConfig.attribute_config_level of the Catalog is
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG', if true, custom attribute values are indexed, so that it can
   * be filtered, faceted or boosted in SearchService.Search. This field is ignored in a UserEvent.
   * See SearchRequest.filter, SearchRequest.facet_specs and SearchRequest.boost_spec for more
   * details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean indexable;

  /**
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]` when the key is
   * "lengths_cm". Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> numbers;

  /**
   * This field will only be used when AttributesConfig.attribute_config_level of the Catalog is
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG', if true, custom attribute values are searchable by text
   * queries in SearchService.Search. This field is ignored in a UserEvent. Only set if type text is
   * set. Otherwise, a INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean searchable;

  /**
   * The textual values of this custom attribute. For example, `["yellow", "green"]` when the key is
   * "color". Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> text;

  /**
   * This field will only be used when AttributesConfig.attribute_config_level of the Catalog is
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG', if true, custom attribute values are indexed, so that it can
   * be filtered, faceted or boosted in SearchService.Search. This field is ignored in a UserEvent.
   * See SearchRequest.filter, SearchRequest.facet_specs and SearchRequest.boost_spec for more
   * details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIndexable() {
    return indexable;
  }

  /**
   * This field will only be used when AttributesConfig.attribute_config_level of the Catalog is
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG', if true, custom attribute values are indexed, so that it can
   * be filtered, faceted or boosted in SearchService.Search. This field is ignored in a UserEvent.
   * See SearchRequest.filter, SearchRequest.facet_specs and SearchRequest.boost_spec for more
   * details.
   * @param indexable indexable or {@code null} for none
   */
  public GoogleCloudRetailV2CustomAttribute setIndexable(java.lang.Boolean indexable) {
    this.indexable = indexable;
    return this;
  }

  /**
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]` when the key is
   * "lengths_cm". Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getNumbers() {
    return numbers;
  }

  /**
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]` when the key is
   * "lengths_cm". Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * @param numbers numbers or {@code null} for none
   */
  public GoogleCloudRetailV2CustomAttribute setNumbers(java.util.List<java.lang.Double> numbers) {
    this.numbers = numbers;
    return this;
  }

  /**
   * This field will only be used when AttributesConfig.attribute_config_level of the Catalog is
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG', if true, custom attribute values are searchable by text
   * queries in SearchService.Search. This field is ignored in a UserEvent. Only set if type text is
   * set. Otherwise, a INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSearchable() {
    return searchable;
  }

  /**
   * This field will only be used when AttributesConfig.attribute_config_level of the Catalog is
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG', if true, custom attribute values are searchable by text
   * queries in SearchService.Search. This field is ignored in a UserEvent. Only set if type text is
   * set. Otherwise, a INVALID_ARGUMENT error is returned.
   * @param searchable searchable or {@code null} for none
   */
  public GoogleCloudRetailV2CustomAttribute setSearchable(java.lang.Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

  /**
   * The textual values of this custom attribute. For example, `["yellow", "green"]` when the key is
   * "color". Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getText() {
    return text;
  }

  /**
   * The textual values of this custom attribute. For example, `["yellow", "green"]` when the key is
   * "color". Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * @param text text or {@code null} for none
   */
  public GoogleCloudRetailV2CustomAttribute setText(java.util.List<java.lang.String> text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudRetailV2CustomAttribute set(String fieldName, Object value) {
    return (GoogleCloudRetailV2CustomAttribute) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2CustomAttribute clone() {
    return (GoogleCloudRetailV2CustomAttribute) super.clone();
  }

}
