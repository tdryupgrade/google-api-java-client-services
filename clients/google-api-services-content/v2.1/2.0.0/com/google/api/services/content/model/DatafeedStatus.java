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
 * The status of a datafeed, that is, the result of the last retrieval of the datafeed computed
 * asynchronously when the feed processing is finished.
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
public final class DatafeedStatus extends com.google.api.client.json.GenericJson {

  /**
   * The country for which the status is reported, represented as a CLDR territory code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The ID of the feed for which the status is reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger datafeedId;

  /**
   * The list of errors occurring in the feed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DatafeedStatusError> errors;

  /**
   * The feed label status is reported for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String feedLabel;

  /**
   * The number of items in the feed that were processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger itemsTotal;

  /**
   * The number of items in the feed that were valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger itemsValid;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#datafeedStatus`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The two-letter ISO 639-1 language for which the status is reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The last date at which the feed was uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastUploadDate;

  /**
   * The processing status of the feed. Acceptable values are: - "`"`failure`": The feed could not
   * be processed or all items had errors.`" - "`in progress`": The feed is being processed. -
   * "`none`": The feed has not yet been processed. For example, a feed that has never been uploaded
   * will have this processing status. - "`success`": The feed was processed successfully, though
   * some items might have had errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String processingStatus;

  /**
   * The list of errors occurring in the feed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DatafeedStatusError> warnings;

  /**
   * The country for which the status is reported, represented as a CLDR territory code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * The country for which the status is reported, represented as a CLDR territory code.
   * @param country country or {@code null} for none
   */
  public DatafeedStatus setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * The ID of the feed for which the status is reported.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getDatafeedId() {
    return datafeedId;
  }

  /**
   * The ID of the feed for which the status is reported.
   * @param datafeedId datafeedId or {@code null} for none
   */
  public DatafeedStatus setDatafeedId(java.math.BigInteger datafeedId) {
    this.datafeedId = datafeedId;
    return this;
  }

  /**
   * The list of errors occurring in the feed.
   * @return value or {@code null} for none
   */
  public java.util.List<DatafeedStatusError> getErrors() {
    return errors;
  }

  /**
   * The list of errors occurring in the feed.
   * @param errors errors or {@code null} for none
   */
  public DatafeedStatus setErrors(java.util.List<DatafeedStatusError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The feed label status is reported for.
   * @return value or {@code null} for none
   */
  public java.lang.String getFeedLabel() {
    return feedLabel;
  }

  /**
   * The feed label status is reported for.
   * @param feedLabel feedLabel or {@code null} for none
   */
  public DatafeedStatus setFeedLabel(java.lang.String feedLabel) {
    this.feedLabel = feedLabel;
    return this;
  }

  /**
   * The number of items in the feed that were processed.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getItemsTotal() {
    return itemsTotal;
  }

  /**
   * The number of items in the feed that were processed.
   * @param itemsTotal itemsTotal or {@code null} for none
   */
  public DatafeedStatus setItemsTotal(java.math.BigInteger itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

  /**
   * The number of items in the feed that were valid.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getItemsValid() {
    return itemsValid;
  }

  /**
   * The number of items in the feed that were valid.
   * @param itemsValid itemsValid or {@code null} for none
   */
  public DatafeedStatus setItemsValid(java.math.BigInteger itemsValid) {
    this.itemsValid = itemsValid;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#datafeedStatus`"
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#datafeedStatus`"
   * @param kind kind or {@code null} for none
   */
  public DatafeedStatus setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The two-letter ISO 639-1 language for which the status is reported.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The two-letter ISO 639-1 language for which the status is reported.
   * @param language language or {@code null} for none
   */
  public DatafeedStatus setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * The last date at which the feed was uploaded.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastUploadDate() {
    return lastUploadDate;
  }

  /**
   * The last date at which the feed was uploaded.
   * @param lastUploadDate lastUploadDate or {@code null} for none
   */
  public DatafeedStatus setLastUploadDate(java.lang.String lastUploadDate) {
    this.lastUploadDate = lastUploadDate;
    return this;
  }

  /**
   * The processing status of the feed. Acceptable values are: - "`"`failure`": The feed could not
   * be processed or all items had errors.`" - "`in progress`": The feed is being processed. -
   * "`none`": The feed has not yet been processed. For example, a feed that has never been uploaded
   * will have this processing status. - "`success`": The feed was processed successfully, though
   * some items might have had errors.
   * @return value or {@code null} for none
   */
  public java.lang.String getProcessingStatus() {
    return processingStatus;
  }

  /**
   * The processing status of the feed. Acceptable values are: - "`"`failure`": The feed could not
   * be processed or all items had errors.`" - "`in progress`": The feed is being processed. -
   * "`none`": The feed has not yet been processed. For example, a feed that has never been uploaded
   * will have this processing status. - "`success`": The feed was processed successfully, though
   * some items might have had errors.
   * @param processingStatus processingStatus or {@code null} for none
   */
  public DatafeedStatus setProcessingStatus(java.lang.String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * The list of errors occurring in the feed.
   * @return value or {@code null} for none
   */
  public java.util.List<DatafeedStatusError> getWarnings() {
    return warnings;
  }

  /**
   * The list of errors occurring in the feed.
   * @param warnings warnings or {@code null} for none
   */
  public DatafeedStatus setWarnings(java.util.List<DatafeedStatusError> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public DatafeedStatus set(String fieldName, Object value) {
    return (DatafeedStatus) super.set(fieldName, value);
  }

  @Override
  public DatafeedStatus clone() {
    return (DatafeedStatus) super.clone();
  }

}
