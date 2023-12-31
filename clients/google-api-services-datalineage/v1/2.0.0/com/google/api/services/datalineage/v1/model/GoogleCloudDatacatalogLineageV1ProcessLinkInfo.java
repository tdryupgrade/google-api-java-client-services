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

package com.google.api.services.datalineage.v1.model;

/**
 * Link details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Lineage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogLineageV1ProcessLinkInfo extends com.google.api.client.json.GenericJson {

  /**
   * The end of the last event establishing this link-process tuple.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The name of the link in the format of `projects/{project}/locations/{location}/links/{link}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String link;

  /**
   * The start of the first event establishing this link-process tuple.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The end of the last event establishing this link-process tuple.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The end of the last event establishing this link-process tuple.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudDatacatalogLineageV1ProcessLinkInfo setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The name of the link in the format of `projects/{project}/locations/{location}/links/{link}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLink() {
    return link;
  }

  /**
   * The name of the link in the format of `projects/{project}/locations/{location}/links/{link}`.
   * @param link link or {@code null} for none
   */
  public GoogleCloudDatacatalogLineageV1ProcessLinkInfo setLink(java.lang.String link) {
    this.link = link;
    return this;
  }

  /**
   * The start of the first event establishing this link-process tuple.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The start of the first event establishing this link-process tuple.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudDatacatalogLineageV1ProcessLinkInfo setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogLineageV1ProcessLinkInfo set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogLineageV1ProcessLinkInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogLineageV1ProcessLinkInfo clone() {
    return (GoogleCloudDatacatalogLineageV1ProcessLinkInfo) super.clone();
  }

}
