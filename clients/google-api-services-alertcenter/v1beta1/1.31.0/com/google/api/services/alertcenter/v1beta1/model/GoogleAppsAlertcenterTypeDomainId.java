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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * Domain ID of Gmail phishing alerts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsAlertcenterTypeDomainId extends com.google.api.client.json.GenericJson {

  /**
   * The primary domain for the customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerPrimaryDomain;

  /**
   * The primary domain for the customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerPrimaryDomain() {
    return customerPrimaryDomain;
  }

  /**
   * The primary domain for the customer.
   * @param customerPrimaryDomain customerPrimaryDomain or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDomainId setCustomerPrimaryDomain(java.lang.String customerPrimaryDomain) {
    this.customerPrimaryDomain = customerPrimaryDomain;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterTypeDomainId set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterTypeDomainId) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterTypeDomainId clone() {
    return (GoogleAppsAlertcenterTypeDomainId) super.clone();
  }

}
