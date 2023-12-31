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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Request to configure the search parameters for the specified FHIR store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigureSearchRequest extends com.google.api.client.json.GenericJson {

  /**
   * The canonical URLs of the search parameters that are intended to be used for the FHIR store.
   * See https://www.hl7.org/fhir/references.html#canonical for explanation on FHIR canonical urls
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> canonicalUrls;

  /**
   * If `validate_only` is set to true, the method will compile all the search parameters without
   * actually setting the search config for the store and triggering the reindex.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * The canonical URLs of the search parameters that are intended to be used for the FHIR store.
   * See https://www.hl7.org/fhir/references.html#canonical for explanation on FHIR canonical urls
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCanonicalUrls() {
    return canonicalUrls;
  }

  /**
   * The canonical URLs of the search parameters that are intended to be used for the FHIR store.
   * See https://www.hl7.org/fhir/references.html#canonical for explanation on FHIR canonical urls
   * @param canonicalUrls canonicalUrls or {@code null} for none
   */
  public ConfigureSearchRequest setCanonicalUrls(java.util.List<java.lang.String> canonicalUrls) {
    this.canonicalUrls = canonicalUrls;
    return this;
  }

  /**
   * If `validate_only` is set to true, the method will compile all the search parameters without
   * actually setting the search config for the store and triggering the reindex.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * If `validate_only` is set to true, the method will compile all the search parameters without
   * actually setting the search config for the store and triggering the reindex.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public ConfigureSearchRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  @Override
  public ConfigureSearchRequest set(String fieldName, Object value) {
    return (ConfigureSearchRequest) super.set(fieldName, value);
  }

  @Override
  public ConfigureSearchRequest clone() {
    return (ConfigureSearchRequest) super.clone();
  }

}
