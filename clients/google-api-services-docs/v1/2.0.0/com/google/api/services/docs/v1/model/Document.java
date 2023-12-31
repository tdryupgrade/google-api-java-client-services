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

package com.google.api.services.docs.v1.model;

/**
 * A Google Docs document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Document extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The main body of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Body body;

  /**
   * Output only. The ID of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentId;

  /**
   * Output only. The style of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DocumentStyle documentStyle;

  /**
   * Output only. The footers in the document, keyed by footer ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Footer> footers;

  /**
   * Output only. The footnotes in the document, keyed by footnote ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Footnote> footnotes;

  /**
   * Output only. The headers in the document, keyed by header ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Header> headers;

  /**
   * Output only. The inline objects in the document, keyed by object ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, InlineObject> inlineObjects;

  /**
   * Output only. The lists in the document, keyed by list ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, List> lists;

  /**
   * Output only. The named ranges in the document, keyed by name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, NamedRanges> namedRanges;

  /**
   * Output only. The named styles of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamedStyles namedStyles;

  /**
   * Output only. The positioned objects in the document, keyed by object ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, PositionedObject> positionedObjects;

  /**
   * Output only. The revision ID of the document. Can be used in update requests to specify which
   * revision of a document to apply updates to and how the request should behave if the document
   * has been edited since that revision. Only populated if the user has edit access to the
   * document. The revision ID is not a sequential number but an opaque string. The format of the
   * revision ID might change over time. A returned revision ID is only guaranteed to be valid for
   * 24 hours after it has been returned and cannot be shared across users. If the revision ID is
   * unchanged between calls, then the document has not changed. Conversely, a changed ID (for the
   * same document and user) usually means the document has been updated. However, a changed ID can
   * also be due to internal factors such as ID format changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * Output only. The suggested changes to the style of the document, keyed by suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedDocumentStyle> suggestedDocumentStyleChanges;

  /**
   * Output only. The suggested changes to the named styles of the document, keyed by suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedNamedStyles> suggestedNamedStylesChanges;

  /**
   * Output only. The suggestions view mode applied to the document. Note: When editing a document,
   * changes must be based on a document with SUGGESTIONS_INLINE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestionsViewMode;

  /**
   * The title of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. The main body of the document.
   * @return value or {@code null} for none
   */
  public Body getBody() {
    return body;
  }

  /**
   * Output only. The main body of the document.
   * @param body body or {@code null} for none
   */
  public Document setBody(Body body) {
    this.body = body;
    return this;
  }

  /**
   * Output only. The ID of the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentId() {
    return documentId;
  }

  /**
   * Output only. The ID of the document.
   * @param documentId documentId or {@code null} for none
   */
  public Document setDocumentId(java.lang.String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Output only. The style of the document.
   * @return value or {@code null} for none
   */
  public DocumentStyle getDocumentStyle() {
    return documentStyle;
  }

  /**
   * Output only. The style of the document.
   * @param documentStyle documentStyle or {@code null} for none
   */
  public Document setDocumentStyle(DocumentStyle documentStyle) {
    this.documentStyle = documentStyle;
    return this;
  }

  /**
   * Output only. The footers in the document, keyed by footer ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Footer> getFooters() {
    return footers;
  }

  /**
   * Output only. The footers in the document, keyed by footer ID.
   * @param footers footers or {@code null} for none
   */
  public Document setFooters(java.util.Map<String, Footer> footers) {
    this.footers = footers;
    return this;
  }

  /**
   * Output only. The footnotes in the document, keyed by footnote ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Footnote> getFootnotes() {
    return footnotes;
  }

  /**
   * Output only. The footnotes in the document, keyed by footnote ID.
   * @param footnotes footnotes or {@code null} for none
   */
  public Document setFootnotes(java.util.Map<String, Footnote> footnotes) {
    this.footnotes = footnotes;
    return this;
  }

  /**
   * Output only. The headers in the document, keyed by header ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Header> getHeaders() {
    return headers;
  }

  /**
   * Output only. The headers in the document, keyed by header ID.
   * @param headers headers or {@code null} for none
   */
  public Document setHeaders(java.util.Map<String, Header> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Output only. The inline objects in the document, keyed by object ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, InlineObject> getInlineObjects() {
    return inlineObjects;
  }

  /**
   * Output only. The inline objects in the document, keyed by object ID.
   * @param inlineObjects inlineObjects or {@code null} for none
   */
  public Document setInlineObjects(java.util.Map<String, InlineObject> inlineObjects) {
    this.inlineObjects = inlineObjects;
    return this;
  }

  /**
   * Output only. The lists in the document, keyed by list ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, List> getLists() {
    return lists;
  }

  /**
   * Output only. The lists in the document, keyed by list ID.
   * @param lists lists or {@code null} for none
   */
  public Document setLists(java.util.Map<String, List> lists) {
    this.lists = lists;
    return this;
  }

  /**
   * Output only. The named ranges in the document, keyed by name.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, NamedRanges> getNamedRanges() {
    return namedRanges;
  }

  /**
   * Output only. The named ranges in the document, keyed by name.
   * @param namedRanges namedRanges or {@code null} for none
   */
  public Document setNamedRanges(java.util.Map<String, NamedRanges> namedRanges) {
    this.namedRanges = namedRanges;
    return this;
  }

  /**
   * Output only. The named styles of the document.
   * @return value or {@code null} for none
   */
  public NamedStyles getNamedStyles() {
    return namedStyles;
  }

  /**
   * Output only. The named styles of the document.
   * @param namedStyles namedStyles or {@code null} for none
   */
  public Document setNamedStyles(NamedStyles namedStyles) {
    this.namedStyles = namedStyles;
    return this;
  }

  /**
   * Output only. The positioned objects in the document, keyed by object ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, PositionedObject> getPositionedObjects() {
    return positionedObjects;
  }

  /**
   * Output only. The positioned objects in the document, keyed by object ID.
   * @param positionedObjects positionedObjects or {@code null} for none
   */
  public Document setPositionedObjects(java.util.Map<String, PositionedObject> positionedObjects) {
    this.positionedObjects = positionedObjects;
    return this;
  }

  /**
   * Output only. The revision ID of the document. Can be used in update requests to specify which
   * revision of a document to apply updates to and how the request should behave if the document
   * has been edited since that revision. Only populated if the user has edit access to the
   * document. The revision ID is not a sequential number but an opaque string. The format of the
   * revision ID might change over time. A returned revision ID is only guaranteed to be valid for
   * 24 hours after it has been returned and cannot be shared across users. If the revision ID is
   * unchanged between calls, then the document has not changed. Conversely, a changed ID (for the
   * same document and user) usually means the document has been updated. However, a changed ID can
   * also be due to internal factors such as ID format changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. The revision ID of the document. Can be used in update requests to specify which
   * revision of a document to apply updates to and how the request should behave if the document
   * has been edited since that revision. Only populated if the user has edit access to the
   * document. The revision ID is not a sequential number but an opaque string. The format of the
   * revision ID might change over time. A returned revision ID is only guaranteed to be valid for
   * 24 hours after it has been returned and cannot be shared across users. If the revision ID is
   * unchanged between calls, then the document has not changed. Conversely, a changed ID (for the
   * same document and user) usually means the document has been updated. However, a changed ID can
   * also be due to internal factors such as ID format changes.
   * @param revisionId revisionId or {@code null} for none
   */
  public Document setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Output only. The suggested changes to the style of the document, keyed by suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedDocumentStyle> getSuggestedDocumentStyleChanges() {
    return suggestedDocumentStyleChanges;
  }

  /**
   * Output only. The suggested changes to the style of the document, keyed by suggestion ID.
   * @param suggestedDocumentStyleChanges suggestedDocumentStyleChanges or {@code null} for none
   */
  public Document setSuggestedDocumentStyleChanges(java.util.Map<String, SuggestedDocumentStyle> suggestedDocumentStyleChanges) {
    this.suggestedDocumentStyleChanges = suggestedDocumentStyleChanges;
    return this;
  }

  /**
   * Output only. The suggested changes to the named styles of the document, keyed by suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedNamedStyles> getSuggestedNamedStylesChanges() {
    return suggestedNamedStylesChanges;
  }

  /**
   * Output only. The suggested changes to the named styles of the document, keyed by suggestion ID.
   * @param suggestedNamedStylesChanges suggestedNamedStylesChanges or {@code null} for none
   */
  public Document setSuggestedNamedStylesChanges(java.util.Map<String, SuggestedNamedStyles> suggestedNamedStylesChanges) {
    this.suggestedNamedStylesChanges = suggestedNamedStylesChanges;
    return this;
  }

  /**
   * Output only. The suggestions view mode applied to the document. Note: When editing a document,
   * changes must be based on a document with SUGGESTIONS_INLINE.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestionsViewMode() {
    return suggestionsViewMode;
  }

  /**
   * Output only. The suggestions view mode applied to the document. Note: When editing a document,
   * changes must be based on a document with SUGGESTIONS_INLINE.
   * @param suggestionsViewMode suggestionsViewMode or {@code null} for none
   */
  public Document setSuggestionsViewMode(java.lang.String suggestionsViewMode) {
    this.suggestionsViewMode = suggestionsViewMode;
    return this;
  }

  /**
   * The title of the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the document.
   * @param title title or {@code null} for none
   */
  public Document setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Document set(String fieldName, Object value) {
    return (Document) super.set(fieldName, value);
  }

  @Override
  public Document clone() {
    return (Document) super.clone();
  }

}
