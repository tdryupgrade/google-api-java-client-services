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
 * Model definition for Card.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Card extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CardAction> cardActions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayStyle;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedFooter fixedFooter;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CardHeader header;

  /**
   * Name of the card used in CardNavigation.pop_to_card_name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * When displaying contextual content, the peek card header acts as a placeholder so that the user
   * can navigate forward between the homepage cards and the contextual cards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CardHeader peekCardHeader;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Section> sections;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<CardAction> getCardActions() {
    return cardActions;
  }

  /**
   * @param cardActions cardActions or {@code null} for none
   */
  public Card setCardActions(java.util.List<CardAction> cardActions) {
    this.cardActions = cardActions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayStyle() {
    return displayStyle;
  }

  /**
   * @param displayStyle displayStyle or {@code null} for none
   */
  public Card setDisplayStyle(java.lang.String displayStyle) {
    this.displayStyle = displayStyle;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public FixedFooter getFixedFooter() {
    return fixedFooter;
  }

  /**
   * @param fixedFooter fixedFooter or {@code null} for none
   */
  public Card setFixedFooter(FixedFooter fixedFooter) {
    this.fixedFooter = fixedFooter;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public CardHeader getHeader() {
    return header;
  }

  /**
   * @param header header or {@code null} for none
   */
  public Card setHeader(CardHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Name of the card used in CardNavigation.pop_to_card_name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the card used in CardNavigation.pop_to_card_name.
   * @param name name or {@code null} for none
   */
  public Card setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * When displaying contextual content, the peek card header acts as a placeholder so that the user
   * can navigate forward between the homepage cards and the contextual cards.
   * @return value or {@code null} for none
   */
  public CardHeader getPeekCardHeader() {
    return peekCardHeader;
  }

  /**
   * When displaying contextual content, the peek card header acts as a placeholder so that the user
   * can navigate forward between the homepage cards and the contextual cards.
   * @param peekCardHeader peekCardHeader or {@code null} for none
   */
  public Card setPeekCardHeader(CardHeader peekCardHeader) {
    this.peekCardHeader = peekCardHeader;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Section> getSections() {
    return sections;
  }

  /**
   * @param sections sections or {@code null} for none
   */
  public Card setSections(java.util.List<Section> sections) {
    this.sections = sections;
    return this;
  }

  @Override
  public Card set(String fieldName, Object value) {
    return (Card) super.set(fieldName, value);
  }

  @Override
  public Card clone() {
    return (Card) super.clone();
  }

}
