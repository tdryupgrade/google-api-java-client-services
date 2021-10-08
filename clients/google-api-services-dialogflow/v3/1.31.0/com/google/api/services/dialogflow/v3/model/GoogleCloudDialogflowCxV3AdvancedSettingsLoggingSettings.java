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
 * Define behaviors on logging.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings extends com.google.api.client.json.GenericJson {

  /**
   * If true, DF Interaction logging is currently enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableInteractionLogging;

  /**
   * If true, StackDriver logging is currently enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStackdriverLogging;

  /**
   * If true, DF Interaction logging is currently enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableInteractionLogging() {
    return enableInteractionLogging;
  }

  /**
   * If true, DF Interaction logging is currently enabled.
   * @param enableInteractionLogging enableInteractionLogging or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings setEnableInteractionLogging(java.lang.Boolean enableInteractionLogging) {
    this.enableInteractionLogging = enableInteractionLogging;
    return this;
  }

  /**
   * If true, StackDriver logging is currently enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStackdriverLogging() {
    return enableStackdriverLogging;
  }

  /**
   * If true, StackDriver logging is currently enabled.
   * @param enableStackdriverLogging enableStackdriverLogging or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings setEnableStackdriverLogging(java.lang.Boolean enableStackdriverLogging) {
    this.enableStackdriverLogging = enableStackdriverLogging;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings clone() {
    return (GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings) super.clone();
  }

}
