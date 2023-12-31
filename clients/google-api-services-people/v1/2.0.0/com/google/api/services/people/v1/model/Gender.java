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

package com.google.api.services.people.v1.model;

/**
 * A person's gender.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Gender extends com.google.api.client.json.GenericJson {

  /**
   * Free form text field for pronouns that should be used to address the person. Common values are:
   * * `he`/`him` * `she`/`her` * `they`/`them`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressMeAs;

  /**
   * Output only. The value of the gender translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale. Unspecified or custom value are not localized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedValue;

  /**
   * Metadata about the gender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The gender for the person. The gender can be custom or one of these predefined values: * `male`
   * * `female` * `unspecified`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Free form text field for pronouns that should be used to address the person. Common values are:
   * * `he`/`him` * `she`/`her` * `they`/`them`
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressMeAs() {
    return addressMeAs;
  }

  /**
   * Free form text field for pronouns that should be used to address the person. Common values are:
   * * `he`/`him` * `she`/`her` * `they`/`them`
   * @param addressMeAs addressMeAs or {@code null} for none
   */
  public Gender setAddressMeAs(java.lang.String addressMeAs) {
    this.addressMeAs = addressMeAs;
    return this;
  }

  /**
   * Output only. The value of the gender translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale. Unspecified or custom value are not localized.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedValue() {
    return formattedValue;
  }

  /**
   * Output only. The value of the gender translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale. Unspecified or custom value are not localized.
   * @param formattedValue formattedValue or {@code null} for none
   */
  public Gender setFormattedValue(java.lang.String formattedValue) {
    this.formattedValue = formattedValue;
    return this;
  }

  /**
   * Metadata about the gender.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the gender.
   * @param metadata metadata or {@code null} for none
   */
  public Gender setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The gender for the person. The gender can be custom or one of these predefined values: * `male`
   * * `female` * `unspecified`
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The gender for the person. The gender can be custom or one of these predefined values: * `male`
   * * `female` * `unspecified`
   * @param value value or {@code null} for none
   */
  public Gender setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Gender set(String fieldName, Object value) {
    return (Gender) super.set(fieldName, value);
  }

  @Override
  public Gender clone() {
    return (Gender) super.clone();
  }

}
