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

package com.google.api.services.retail.v2alpha.model;

/**
 * Promotion information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaPromotion extends com.google.api.client.json.GenericJson {

  /**
   * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a
   * length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or
   * ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center
   * property [promotion](https://support.google.com/merchants/answer/7050148).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String promotionId;

  /**
   * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a
   * length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or
   * ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center
   * property [promotion](https://support.google.com/merchants/answer/7050148).
   * @return value or {@code null} for none
   */
  public java.lang.String getPromotionId() {
    return promotionId;
  }

  /**
   * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a
   * length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or
   * ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center
   * property [promotion](https://support.google.com/merchants/answer/7050148).
   * @param promotionId promotionId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPromotion setPromotionId(java.lang.String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaPromotion set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaPromotion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaPromotion clone() {
    return (GoogleCloudRetailV2alphaPromotion) super.clone();
  }

}
