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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * A secret value used for sending hits to Measurement Protocol.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret extends com.google.api.client.json.GenericJson {

  /**
   * Required. Human-readable display name for this secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Resource name of this secret. This secret may be a child of any type of stream.
   * Format: properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementP
   * rotocolSecret}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The measurement protocol secret value. Pass this value to the api_secret field of
   * the Measurement Protocol API when sending hits to this secret's parent property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretValue;

  /**
   * Required. Human-readable display name for this secret.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Human-readable display name for this secret.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Resource name of this secret. This secret may be a child of any type of stream.
   * Format: properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementP
   * rotocolSecret}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of this secret. This secret may be a child of any type of stream.
   * Format: properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementP
   * rotocolSecret}
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The measurement protocol secret value. Pass this value to the api_secret field of
   * the Measurement Protocol API when sending hits to this secret's parent property.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretValue() {
    return secretValue;
  }

  /**
   * Output only. The measurement protocol secret value. Pass this value to the api_secret field of
   * the Measurement Protocol API when sending hits to this secret's parent property.
   * @param secretValue secretValue or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret setSecretValue(java.lang.String secretValue) {
    this.secretValue = secretValue;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret clone() {
    return (GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret) super.clone();
  }

}
