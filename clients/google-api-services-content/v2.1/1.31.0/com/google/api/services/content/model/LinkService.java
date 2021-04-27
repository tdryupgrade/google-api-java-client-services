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

package com.google.api.services.content.model;

/**
 * Model definition for LinkService.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LinkService extends com.google.api.client.json.GenericJson {

  /**
   * Service provided to or by the linked account. Acceptable values are: -
   * "`shoppingActionsOrderManagement`" - "`shoppingActionsProductManagement`" -
   * "`shoppingAdsProductManagement`" - "`paymentProcessing`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * Status of the link Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Service provided to or by the linked account. Acceptable values are: -
   * "`shoppingActionsOrderManagement`" - "`shoppingActionsProductManagement`" -
   * "`shoppingAdsProductManagement`" - "`paymentProcessing`"
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Service provided to or by the linked account. Acceptable values are: -
   * "`shoppingActionsOrderManagement`" - "`shoppingActionsProductManagement`" -
   * "`shoppingAdsProductManagement`" - "`paymentProcessing`"
   * @param service service or {@code null} for none
   */
  public LinkService setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * Status of the link Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the link Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
   * @param status status or {@code null} for none
   */
  public LinkService setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public LinkService set(String fieldName, Object value) {
    return (LinkService) super.set(fieldName, value);
  }

  @Override
  public LinkService clone() {
    return (LinkService) super.clone();
  }

}
