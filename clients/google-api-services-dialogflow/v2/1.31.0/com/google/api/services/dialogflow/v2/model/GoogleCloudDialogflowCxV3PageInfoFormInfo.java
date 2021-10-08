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

package com.google.api.services.dialogflow.v2.model;

/**
 * Represents form information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3PageInfoFormInfo extends com.google.api.client.json.GenericJson {

  /**
   * Optional for both WebhookRequest and WebhookResponse. The parameters contained in the form.
   * Note that the webhook cannot add or remove any form parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo> parameterInfo;

  /**
   * Optional for both WebhookRequest and WebhookResponse. The parameters contained in the form.
   * Note that the webhook cannot add or remove any form parameter.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo> getParameterInfo() {
    return parameterInfo;
  }

  /**
   * Optional for both WebhookRequest and WebhookResponse. The parameters contained in the form.
   * Note that the webhook cannot add or remove any form parameter.
   * @param parameterInfo parameterInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3PageInfoFormInfo setParameterInfo(java.util.List<GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo> parameterInfo) {
    this.parameterInfo = parameterInfo;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3PageInfoFormInfo set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3PageInfoFormInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3PageInfoFormInfo clone() {
    return (GoogleCloudDialogflowCxV3PageInfoFormInfo) super.clone();
  }

}
