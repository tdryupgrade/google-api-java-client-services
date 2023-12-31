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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Next tag: 43
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SciencePerDocData extends com.google.api.client.json.GenericJson {

  /**
   * The first hit position after the end of the abstract. We index the abstract immediately after
   * the body, so all hits between BodyEndPosition and AbstractEndPosition are from the abstract.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("AbstractEndPosition")
  private java.lang.Integer abstractEndPosition;

  /**
   * The first hit position past the last body hit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("BodyEndPosition")
  private java.lang.Integer bodyEndPosition;

  /**
   * Input features used to compute PredictedCitations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("CitationPredictionSignal")
  private java.util.List<ScholarCitationPredictionSignal> citationPredictionSignal;

  static {
    // hack to force ProGuard to consider ScholarCitationPredictionSignal used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ScholarCitationPredictionSignal.class);
  }

  /**
   * Used for sorting legal documents by court; e.g. Supreme Court > Appeals Court > Trial Court
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("CourtLevel")
  private java.lang.Integer courtLevel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("DEPRECATEDCrawlTime") @com.google.api.client.json.JsonString
  private java.lang.Long dEPRECATEDCrawlTime;

  /**
   * The age in days since discovery date at the time of indexing. Used to compute
   * PredictedCitations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("DiscoveryAgeInDays")
  private java.lang.Integer discoveryAgeInDays;

  /**
   * Used for sorting articles by date, and as an input for recent-query ranking. Stored in
   * Universal time scale (100 ns ticks since 0001 AD).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("DiscoveryTimestamp") @com.google.api.client.json.JsonString
  private java.lang.Long discoveryTimestamp;

  /**
   * citation-only marker - for use in scorer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("IsCitationOnly")
  private java.lang.Boolean isCitationOnly;

  /**
   * Scoring penalty for non-scholarly articles. In the range [0, 1], with 0 being no penalty and 1
   * being the full penalty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("NonScholarlinessPenalty")
  private java.lang.Float nonScholarlinessPenalty;

  /**
   * Summary statistics, for display in the FE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("NumBackwardLinks")
  private java.lang.Integer numBackwardLinks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("NumRelated")
  private java.lang.Integer numRelated;

  /**
   * Used for exact title boost in Scholar, as of 1/7/2008.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("NumTitleWords")
  private java.lang.Integer numTitleWords;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("NumVersions")
  private java.lang.Integer numVersions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("OffDomAnchors")
  private java.lang.Integer offDomAnchors;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("OnSiteAnchors")
  private java.lang.Integer onSiteAnchors;

  /**
   * The predicted new citations for this document once it reaches 5 years after its discovery date.
   * Not set for: - Documents 5 years or older - Citation only documents - Patents and legal
   * documents
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("PredictedCitations")
  private java.lang.Float predictedCitations;

  /**
   * The predicted new citations for this document over the next 5 years. This differs from the
   * PredictedCitations field in that this is set for documents of all ages, whereas
   * PredictedCitations is only set for new documents. This is also a prediction over a fixed time
   * interval, whereas the time interval for PredictedCitations depends on the document's age.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("PredictedCitationsNext5Years")
  private java.lang.Float predictedCitationsNext5Years;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("PublicationDay")
  private java.lang.Integer publicationDay;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("PublicationMonth")
  private java.lang.Integer publicationMonth;

  /**
   * Publication date. Used both for ranking of recent articles and for display in the FE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("PublicationYear")
  private java.lang.Integer publicationYear;

  /**
   * For links from websearch to scholar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ScholarId") @com.google.api.client.json.JsonString
  private java.math.BigInteger scholarId;

  /**
   * DEPRECATED e.g., fp("med")
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Subject")
  private java.lang.Long subject;

  /**
   * A string encoding the uni-, bi-, and trigram weights in the title. This is encoded and decoded
   * by science_search/util/title_ngrams.h.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("TitleNgrams")
  private java.lang.String titleNgrams;

  /**
   * Anchor count info for scorer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("TotalAnchors")
  private java.lang.Integer totalAnchors;

  /**
   * The type of the article - paper, review, patent, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Type")
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SciencePerDocDataAuthor> author;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SciencePerDocDataReferenceDiscussion> referencediscussion;

  /**
   * Section markers, sorted by begin_position, no overlapping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SciencePerDocDataSection> section;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SciencePerDocDataSignal> signal;

  /**
   * The first hit position after the end of the abstract. We index the abstract immediately after
   * the body, so all hits between BodyEndPosition and AbstractEndPosition are from the abstract.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAbstractEndPosition() {
    return abstractEndPosition;
  }

  /**
   * The first hit position after the end of the abstract. We index the abstract immediately after
   * the body, so all hits between BodyEndPosition and AbstractEndPosition are from the abstract.
   * @param abstractEndPosition abstractEndPosition or {@code null} for none
   */
  public SciencePerDocData setAbstractEndPosition(java.lang.Integer abstractEndPosition) {
    this.abstractEndPosition = abstractEndPosition;
    return this;
  }

  /**
   * The first hit position past the last body hit.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBodyEndPosition() {
    return bodyEndPosition;
  }

  /**
   * The first hit position past the last body hit.
   * @param bodyEndPosition bodyEndPosition or {@code null} for none
   */
  public SciencePerDocData setBodyEndPosition(java.lang.Integer bodyEndPosition) {
    this.bodyEndPosition = bodyEndPosition;
    return this;
  }

  /**
   * Input features used to compute PredictedCitations.
   * @return value or {@code null} for none
   */
  public java.util.List<ScholarCitationPredictionSignal> getCitationPredictionSignal() {
    return citationPredictionSignal;
  }

  /**
   * Input features used to compute PredictedCitations.
   * @param citationPredictionSignal citationPredictionSignal or {@code null} for none
   */
  public SciencePerDocData setCitationPredictionSignal(java.util.List<ScholarCitationPredictionSignal> citationPredictionSignal) {
    this.citationPredictionSignal = citationPredictionSignal;
    return this;
  }

  /**
   * Used for sorting legal documents by court; e.g. Supreme Court > Appeals Court > Trial Court
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCourtLevel() {
    return courtLevel;
  }

  /**
   * Used for sorting legal documents by court; e.g. Supreme Court > Appeals Court > Trial Court
   * @param courtLevel courtLevel or {@code null} for none
   */
  public SciencePerDocData setCourtLevel(java.lang.Integer courtLevel) {
    this.courtLevel = courtLevel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDEPRECATEDCrawlTime() {
    return dEPRECATEDCrawlTime;
  }

  /**
   * @param dEPRECATEDCrawlTime dEPRECATEDCrawlTime or {@code null} for none
   */
  public SciencePerDocData setDEPRECATEDCrawlTime(java.lang.Long dEPRECATEDCrawlTime) {
    this.dEPRECATEDCrawlTime = dEPRECATEDCrawlTime;
    return this;
  }

  /**
   * The age in days since discovery date at the time of indexing. Used to compute
   * PredictedCitations.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDiscoveryAgeInDays() {
    return discoveryAgeInDays;
  }

  /**
   * The age in days since discovery date at the time of indexing. Used to compute
   * PredictedCitations.
   * @param discoveryAgeInDays discoveryAgeInDays or {@code null} for none
   */
  public SciencePerDocData setDiscoveryAgeInDays(java.lang.Integer discoveryAgeInDays) {
    this.discoveryAgeInDays = discoveryAgeInDays;
    return this;
  }

  /**
   * Used for sorting articles by date, and as an input for recent-query ranking. Stored in
   * Universal time scale (100 ns ticks since 0001 AD).
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiscoveryTimestamp() {
    return discoveryTimestamp;
  }

  /**
   * Used for sorting articles by date, and as an input for recent-query ranking. Stored in
   * Universal time scale (100 ns ticks since 0001 AD).
   * @param discoveryTimestamp discoveryTimestamp or {@code null} for none
   */
  public SciencePerDocData setDiscoveryTimestamp(java.lang.Long discoveryTimestamp) {
    this.discoveryTimestamp = discoveryTimestamp;
    return this;
  }

  /**
   * citation-only marker - for use in scorer
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCitationOnly() {
    return isCitationOnly;
  }

  /**
   * citation-only marker - for use in scorer
   * @param isCitationOnly isCitationOnly or {@code null} for none
   */
  public SciencePerDocData setIsCitationOnly(java.lang.Boolean isCitationOnly) {
    this.isCitationOnly = isCitationOnly;
    return this;
  }

  /**
   * Scoring penalty for non-scholarly articles. In the range [0, 1], with 0 being no penalty and 1
   * being the full penalty.
   * @return value or {@code null} for none
   */
  public java.lang.Float getNonScholarlinessPenalty() {
    return nonScholarlinessPenalty;
  }

  /**
   * Scoring penalty for non-scholarly articles. In the range [0, 1], with 0 being no penalty and 1
   * being the full penalty.
   * @param nonScholarlinessPenalty nonScholarlinessPenalty or {@code null} for none
   */
  public SciencePerDocData setNonScholarlinessPenalty(java.lang.Float nonScholarlinessPenalty) {
    this.nonScholarlinessPenalty = nonScholarlinessPenalty;
    return this;
  }

  /**
   * Summary statistics, for display in the FE.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumBackwardLinks() {
    return numBackwardLinks;
  }

  /**
   * Summary statistics, for display in the FE.
   * @param numBackwardLinks numBackwardLinks or {@code null} for none
   */
  public SciencePerDocData setNumBackwardLinks(java.lang.Integer numBackwardLinks) {
    this.numBackwardLinks = numBackwardLinks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumRelated() {
    return numRelated;
  }

  /**
   * @param numRelated numRelated or {@code null} for none
   */
  public SciencePerDocData setNumRelated(java.lang.Integer numRelated) {
    this.numRelated = numRelated;
    return this;
  }

  /**
   * Used for exact title boost in Scholar, as of 1/7/2008.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumTitleWords() {
    return numTitleWords;
  }

  /**
   * Used for exact title boost in Scholar, as of 1/7/2008.
   * @param numTitleWords numTitleWords or {@code null} for none
   */
  public SciencePerDocData setNumTitleWords(java.lang.Integer numTitleWords) {
    this.numTitleWords = numTitleWords;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumVersions() {
    return numVersions;
  }

  /**
   * @param numVersions numVersions or {@code null} for none
   */
  public SciencePerDocData setNumVersions(java.lang.Integer numVersions) {
    this.numVersions = numVersions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOffDomAnchors() {
    return offDomAnchors;
  }

  /**
   * @param offDomAnchors offDomAnchors or {@code null} for none
   */
  public SciencePerDocData setOffDomAnchors(java.lang.Integer offDomAnchors) {
    this.offDomAnchors = offDomAnchors;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOnSiteAnchors() {
    return onSiteAnchors;
  }

  /**
   * @param onSiteAnchors onSiteAnchors or {@code null} for none
   */
  public SciencePerDocData setOnSiteAnchors(java.lang.Integer onSiteAnchors) {
    this.onSiteAnchors = onSiteAnchors;
    return this;
  }

  /**
   * The predicted new citations for this document once it reaches 5 years after its discovery date.
   * Not set for: - Documents 5 years or older - Citation only documents - Patents and legal
   * documents
   * @return value or {@code null} for none
   */
  public java.lang.Float getPredictedCitations() {
    return predictedCitations;
  }

  /**
   * The predicted new citations for this document once it reaches 5 years after its discovery date.
   * Not set for: - Documents 5 years or older - Citation only documents - Patents and legal
   * documents
   * @param predictedCitations predictedCitations or {@code null} for none
   */
  public SciencePerDocData setPredictedCitations(java.lang.Float predictedCitations) {
    this.predictedCitations = predictedCitations;
    return this;
  }

  /**
   * The predicted new citations for this document over the next 5 years. This differs from the
   * PredictedCitations field in that this is set for documents of all ages, whereas
   * PredictedCitations is only set for new documents. This is also a prediction over a fixed time
   * interval, whereas the time interval for PredictedCitations depends on the document's age.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPredictedCitationsNext5Years() {
    return predictedCitationsNext5Years;
  }

  /**
   * The predicted new citations for this document over the next 5 years. This differs from the
   * PredictedCitations field in that this is set for documents of all ages, whereas
   * PredictedCitations is only set for new documents. This is also a prediction over a fixed time
   * interval, whereas the time interval for PredictedCitations depends on the document's age.
   * @param predictedCitationsNext5Years predictedCitationsNext5Years or {@code null} for none
   */
  public SciencePerDocData setPredictedCitationsNext5Years(java.lang.Float predictedCitationsNext5Years) {
    this.predictedCitationsNext5Years = predictedCitationsNext5Years;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPublicationDay() {
    return publicationDay;
  }

  /**
   * @param publicationDay publicationDay or {@code null} for none
   */
  public SciencePerDocData setPublicationDay(java.lang.Integer publicationDay) {
    this.publicationDay = publicationDay;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPublicationMonth() {
    return publicationMonth;
  }

  /**
   * @param publicationMonth publicationMonth or {@code null} for none
   */
  public SciencePerDocData setPublicationMonth(java.lang.Integer publicationMonth) {
    this.publicationMonth = publicationMonth;
    return this;
  }

  /**
   * Publication date. Used both for ranking of recent articles and for display in the FE.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPublicationYear() {
    return publicationYear;
  }

  /**
   * Publication date. Used both for ranking of recent articles and for display in the FE.
   * @param publicationYear publicationYear or {@code null} for none
   */
  public SciencePerDocData setPublicationYear(java.lang.Integer publicationYear) {
    this.publicationYear = publicationYear;
    return this;
  }

  /**
   * For links from websearch to scholar.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getScholarId() {
    return scholarId;
  }

  /**
   * For links from websearch to scholar.
   * @param scholarId scholarId or {@code null} for none
   */
  public SciencePerDocData setScholarId(java.math.BigInteger scholarId) {
    this.scholarId = scholarId;
    return this;
  }

  /**
   * DEPRECATED e.g., fp("med")
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubject() {
    return subject;
  }

  /**
   * DEPRECATED e.g., fp("med")
   * @param subject subject or {@code null} for none
   */
  public SciencePerDocData setSubject(java.lang.Long subject) {
    this.subject = subject;
    return this;
  }

  /**
   * A string encoding the uni-, bi-, and trigram weights in the title. This is encoded and decoded
   * by science_search/util/title_ngrams.h.
   * @see #decodeTitleNgrams()
   * @return value or {@code null} for none
   */
  public java.lang.String getTitleNgrams() {
    return titleNgrams;
  }

  /**
   * A string encoding the uni-, bi-, and trigram weights in the title. This is encoded and decoded
   * by science_search/util/title_ngrams.h.
   * @see #getTitleNgrams()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTitleNgrams() {
    return com.google.api.client.util.Base64.decodeBase64(titleNgrams);
  }

  /**
   * A string encoding the uni-, bi-, and trigram weights in the title. This is encoded and decoded
   * by science_search/util/title_ngrams.h.
   * @see #encodeTitleNgrams()
   * @param titleNgrams titleNgrams or {@code null} for none
   */
  public SciencePerDocData setTitleNgrams(java.lang.String titleNgrams) {
    this.titleNgrams = titleNgrams;
    return this;
  }

  /**
   * A string encoding the uni-, bi-, and trigram weights in the title. This is encoded and decoded
   * by science_search/util/title_ngrams.h.
   * @see #setTitleNgrams()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SciencePerDocData encodeTitleNgrams(byte[] titleNgrams) {
    this.titleNgrams = com.google.api.client.util.Base64.encodeBase64URLSafeString(titleNgrams);
    return this;
  }

  /**
   * Anchor count info for scorer
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalAnchors() {
    return totalAnchors;
  }

  /**
   * Anchor count info for scorer
   * @param totalAnchors totalAnchors or {@code null} for none
   */
  public SciencePerDocData setTotalAnchors(java.lang.Integer totalAnchors) {
    this.totalAnchors = totalAnchors;
    return this;
  }

  /**
   * The type of the article - paper, review, patent, etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the article - paper, review, patent, etc.
   * @param type type or {@code null} for none
   */
  public SciencePerDocData setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SciencePerDocDataAuthor> getAuthor() {
    return author;
  }

  /**
   * @param author author or {@code null} for none
   */
  public SciencePerDocData setAuthor(java.util.List<SciencePerDocDataAuthor> author) {
    this.author = author;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SciencePerDocDataReferenceDiscussion> getReferencediscussion() {
    return referencediscussion;
  }

  /**
   * @param referencediscussion referencediscussion or {@code null} for none
   */
  public SciencePerDocData setReferencediscussion(java.util.List<SciencePerDocDataReferenceDiscussion> referencediscussion) {
    this.referencediscussion = referencediscussion;
    return this;
  }

  /**
   * Section markers, sorted by begin_position, no overlapping.
   * @return value or {@code null} for none
   */
  public java.util.List<SciencePerDocDataSection> getSection() {
    return section;
  }

  /**
   * Section markers, sorted by begin_position, no overlapping.
   * @param section section or {@code null} for none
   */
  public SciencePerDocData setSection(java.util.List<SciencePerDocDataSection> section) {
    this.section = section;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SciencePerDocDataSignal> getSignal() {
    return signal;
  }

  /**
   * @param signal signal or {@code null} for none
   */
  public SciencePerDocData setSignal(java.util.List<SciencePerDocDataSignal> signal) {
    this.signal = signal;
    return this;
  }

  @Override
  public SciencePerDocData set(String fieldName, Object value) {
    return (SciencePerDocData) super.set(fieldName, value);
  }

  @Override
  public SciencePerDocData clone() {
    return (SciencePerDocData) super.clone();
  }

}
