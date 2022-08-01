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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Optional. Provides a search operator for date properties. Search operators let users restrict the
 * query to specific fields relevant to the type of item being searched.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateOperatorOptions extends com.google.api.client.json.GenericJson {

  /**
   * Indicates the operator name required in the query in order to isolate the date property using
   * the greater-than operator. For example, if greaterThanOperatorName is *closedafter* and the
   * property's name is *closeDate*, then queries like *closedafter:* show results only where the
   * value of the property named *closeDate* is later than **. The operator name can only contain
   * lowercase letters (a-z). The maximum length is 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String greaterThanOperatorName;

  /**
   * Indicates the operator name required in the query in order to isolate the date property using
   * the less-than operator. For example, if lessThanOperatorName is *closedbefore* and the
   * property's name is *closeDate*, then queries like *closedbefore:* show results only where the
   * value of the property named *closeDate* is earlier than **. The operator name can only contain
   * lowercase letters (a-z). The maximum length is 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lessThanOperatorName;

  /**
   * Indicates the actual string required in the query in order to isolate the date property. For
   * example, suppose an issue tracking schema object has a property named *closeDate* that
   * specifies an operator with an operatorName of *closedon*. For searches on that data, queries
   * like *closedon:* show results only where the value of the *closeDate* property matches **. By
   * contrast, a search that uses the same ** without an operator returns all items where ** matches
   * the value of any String properties or text within the content field for the indexed datasource.
   * The operator name can only contain lowercase letters (a-z). The maximum length is 32
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operatorName;

  /**
   * Indicates the operator name required in the query in order to isolate the date property using
   * the greater-than operator. For example, if greaterThanOperatorName is *closedafter* and the
   * property's name is *closeDate*, then queries like *closedafter:* show results only where the
   * value of the property named *closeDate* is later than **. The operator name can only contain
   * lowercase letters (a-z). The maximum length is 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getGreaterThanOperatorName() {
    return greaterThanOperatorName;
  }

  /**
   * Indicates the operator name required in the query in order to isolate the date property using
   * the greater-than operator. For example, if greaterThanOperatorName is *closedafter* and the
   * property's name is *closeDate*, then queries like *closedafter:* show results only where the
   * value of the property named *closeDate* is later than **. The operator name can only contain
   * lowercase letters (a-z). The maximum length is 32 characters.
   * @param greaterThanOperatorName greaterThanOperatorName or {@code null} for none
   */
  public DateOperatorOptions setGreaterThanOperatorName(java.lang.String greaterThanOperatorName) {
    this.greaterThanOperatorName = greaterThanOperatorName;
    return this;
  }

  /**
   * Indicates the operator name required in the query in order to isolate the date property using
   * the less-than operator. For example, if lessThanOperatorName is *closedbefore* and the
   * property's name is *closeDate*, then queries like *closedbefore:* show results only where the
   * value of the property named *closeDate* is earlier than **. The operator name can only contain
   * lowercase letters (a-z). The maximum length is 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getLessThanOperatorName() {
    return lessThanOperatorName;
  }

  /**
   * Indicates the operator name required in the query in order to isolate the date property using
   * the less-than operator. For example, if lessThanOperatorName is *closedbefore* and the
   * property's name is *closeDate*, then queries like *closedbefore:* show results only where the
   * value of the property named *closeDate* is earlier than **. The operator name can only contain
   * lowercase letters (a-z). The maximum length is 32 characters.
   * @param lessThanOperatorName lessThanOperatorName or {@code null} for none
   */
  public DateOperatorOptions setLessThanOperatorName(java.lang.String lessThanOperatorName) {
    this.lessThanOperatorName = lessThanOperatorName;
    return this;
  }

  /**
   * Indicates the actual string required in the query in order to isolate the date property. For
   * example, suppose an issue tracking schema object has a property named *closeDate* that
   * specifies an operator with an operatorName of *closedon*. For searches on that data, queries
   * like *closedon:* show results only where the value of the *closeDate* property matches **. By
   * contrast, a search that uses the same ** without an operator returns all items where ** matches
   * the value of any String properties or text within the content field for the indexed datasource.
   * The operator name can only contain lowercase letters (a-z). The maximum length is 32
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperatorName() {
    return operatorName;
  }

  /**
   * Indicates the actual string required in the query in order to isolate the date property. For
   * example, suppose an issue tracking schema object has a property named *closeDate* that
   * specifies an operator with an operatorName of *closedon*. For searches on that data, queries
   * like *closedon:* show results only where the value of the *closeDate* property matches **. By
   * contrast, a search that uses the same ** without an operator returns all items where ** matches
   * the value of any String properties or text within the content field for the indexed datasource.
   * The operator name can only contain lowercase letters (a-z). The maximum length is 32
   * characters.
   * @param operatorName operatorName or {@code null} for none
   */
  public DateOperatorOptions setOperatorName(java.lang.String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

  @Override
  public DateOperatorOptions set(String fieldName, Object value) {
    return (DateOperatorOptions) super.set(fieldName, value);
  }

  @Override
  public DateOperatorOptions clone() {
    return (DateOperatorOptions) super.clone();
  }

}
