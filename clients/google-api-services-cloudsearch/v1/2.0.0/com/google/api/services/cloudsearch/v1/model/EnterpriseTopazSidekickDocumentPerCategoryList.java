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
 * Model definition for EnterpriseTopazSidekickDocumentPerCategoryList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseTopazSidekickDocumentPerCategoryList extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseTopazSidekickDocumentPerCategoryListDocumentPerCategoryListEntry> documents;

  /**
   * Localized message explaining how the documents were derived (e.g. from the last 30 days
   * activity). This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String helpMessage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String listType;

  /**
   * Description of the types of documents present in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String listTypeDescription;

  /**
   * Response message in case no documents are present in the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseMessage;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseTopazSidekickDocumentPerCategoryListDocumentPerCategoryListEntry> getDocuments() {
    return documents;
  }

  /**
   * @param documents documents or {@code null} for none
   */
  public EnterpriseTopazSidekickDocumentPerCategoryList setDocuments(java.util.List<EnterpriseTopazSidekickDocumentPerCategoryListDocumentPerCategoryListEntry> documents) {
    this.documents = documents;
    return this;
  }

  /**
   * Localized message explaining how the documents were derived (e.g. from the last 30 days
   * activity). This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getHelpMessage() {
    return helpMessage;
  }

  /**
   * Localized message explaining how the documents were derived (e.g. from the last 30 days
   * activity). This field is optional.
   * @param helpMessage helpMessage or {@code null} for none
   */
  public EnterpriseTopazSidekickDocumentPerCategoryList setHelpMessage(java.lang.String helpMessage) {
    this.helpMessage = helpMessage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getListType() {
    return listType;
  }

  /**
   * @param listType listType or {@code null} for none
   */
  public EnterpriseTopazSidekickDocumentPerCategoryList setListType(java.lang.String listType) {
    this.listType = listType;
    return this;
  }

  /**
   * Description of the types of documents present in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getListTypeDescription() {
    return listTypeDescription;
  }

  /**
   * Description of the types of documents present in the list.
   * @param listTypeDescription listTypeDescription or {@code null} for none
   */
  public EnterpriseTopazSidekickDocumentPerCategoryList setListTypeDescription(java.lang.String listTypeDescription) {
    this.listTypeDescription = listTypeDescription;
    return this;
  }

  /**
   * Response message in case no documents are present in the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseMessage() {
    return responseMessage;
  }

  /**
   * Response message in case no documents are present in the card.
   * @param responseMessage responseMessage or {@code null} for none
   */
  public EnterpriseTopazSidekickDocumentPerCategoryList setResponseMessage(java.lang.String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  @Override
  public EnterpriseTopazSidekickDocumentPerCategoryList set(String fieldName, Object value) {
    return (EnterpriseTopazSidekickDocumentPerCategoryList) super.set(fieldName, value);
  }

  @Override
  public EnterpriseTopazSidekickDocumentPerCategoryList clone() {
    return (EnterpriseTopazSidekickDocumentPerCategoryList) super.clone();
  }

}
