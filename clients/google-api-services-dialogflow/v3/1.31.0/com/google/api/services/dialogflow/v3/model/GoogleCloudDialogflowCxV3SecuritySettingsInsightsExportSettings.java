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

package com.google.api.services.dialogflow.v3.model;

/**
 * Settings for exporting conversations to
 * [Insights](https://cloud.google.com/dialogflow/priv/docs/insights).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings extends com.google.api.client.json.GenericJson {

  /**
   * If enabled, we will automatically exports conversations to Insights and Insights runs its
   * analyzers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableInsightsExport;

  /**
   * If enabled, we will automatically exports conversations to Insights and Insights runs its
   * analyzers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableInsightsExport() {
    return enableInsightsExport;
  }

  /**
   * If enabled, we will automatically exports conversations to Insights and Insights runs its
   * analyzers.
   * @param enableInsightsExport enableInsightsExport or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings setEnableInsightsExport(java.lang.Boolean enableInsightsExport) {
    this.enableInsightsExport = enableInsightsExport;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings clone() {
    return (GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings) super.clone();
  }

}
