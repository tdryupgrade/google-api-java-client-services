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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Information about a bot response, branched from shared/bot_response.proto without frontend User
 * proto as we never store it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BotResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserId botId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requiredAction;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseType;

  /**
   * URL for setting up bot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String setupUrl;

  /**
   * @return value or {@code null} for none
   */
  public UserId getBotId() {
    return botId;
  }

  /**
   * @param botId botId or {@code null} for none
   */
  public BotResponse setBotId(UserId botId) {
    this.botId = botId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRequiredAction() {
    return requiredAction;
  }

  /**
   * @param requiredAction requiredAction or {@code null} for none
   */
  public BotResponse setRequiredAction(java.lang.String requiredAction) {
    this.requiredAction = requiredAction;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseType() {
    return responseType;
  }

  /**
   * @param responseType responseType or {@code null} for none
   */
  public BotResponse setResponseType(java.lang.String responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * URL for setting up bot.
   * @return value or {@code null} for none
   */
  public java.lang.String getSetupUrl() {
    return setupUrl;
  }

  /**
   * URL for setting up bot.
   * @param setupUrl setupUrl or {@code null} for none
   */
  public BotResponse setSetupUrl(java.lang.String setupUrl) {
    this.setupUrl = setupUrl;
    return this;
  }

  @Override
  public BotResponse set(String fieldName, Object value) {
    return (BotResponse) super.set(fieldName, value);
  }

  @Override
  public BotResponse clone() {
    return (BotResponse) super.clone();
  }

}
