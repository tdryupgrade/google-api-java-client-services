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

package com.google.api.services.serviceusage.v1.model;

/**
 * ServiceValue contains information of a service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceValue extends com.google.api.client.json.GenericJson {

  /**
   * The DNS address at which this service is available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dnsAddress;

  /**
   * The name of the value. Example: `services/storage.googleapis.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A link to pricing information for the service, such as
   * https://cloud.google.com/bigquery/pricing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pricingLink;

  /**
   * Terms of Service
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TermsOfService> tos;

  /**
   * The DNS address at which this service is available.
   * @return value or {@code null} for none
   */
  public java.lang.String getDnsAddress() {
    return dnsAddress;
  }

  /**
   * The DNS address at which this service is available.
   * @param dnsAddress dnsAddress or {@code null} for none
   */
  public ServiceValue setDnsAddress(java.lang.String dnsAddress) {
    this.dnsAddress = dnsAddress;
    return this;
  }

  /**
   * The name of the value. Example: `services/storage.googleapis.com`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the value. Example: `services/storage.googleapis.com`.
   * @param name name or {@code null} for none
   */
  public ServiceValue setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A link to pricing information for the service, such as
   * https://cloud.google.com/bigquery/pricing.
   * @return value or {@code null} for none
   */
  public java.lang.String getPricingLink() {
    return pricingLink;
  }

  /**
   * A link to pricing information for the service, such as
   * https://cloud.google.com/bigquery/pricing.
   * @param pricingLink pricingLink or {@code null} for none
   */
  public ServiceValue setPricingLink(java.lang.String pricingLink) {
    this.pricingLink = pricingLink;
    return this;
  }

  /**
   * Terms of Service
   * @return value or {@code null} for none
   */
  public java.util.List<TermsOfService> getTos() {
    return tos;
  }

  /**
   * Terms of Service
   * @param tos tos or {@code null} for none
   */
  public ServiceValue setTos(java.util.List<TermsOfService> tos) {
    this.tos = tos;
    return this;
  }

  @Override
  public ServiceValue set(String fieldName, Object value) {
    return (ServiceValue) super.set(fieldName, value);
  }

  @Override
  public ServiceValue clone() {
    return (ServiceValue) super.clone();
  }

}
