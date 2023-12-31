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

package com.google.api.services.ondemandscanning.v1.model;

/**
 * ListVulnerabilitiesResponse contains a single page of vulnerabilities resulting from a scan.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListVulnerabilitiesResponseV1 extends com.google.api.client.json.GenericJson {

  /**
   * A page token that can be used in a subsequent call to ListVulnerabilities to continue
   * retrieving results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of Vulnerability Occurrences resulting from a scan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Occurrence> occurrences;

  /**
   * A page token that can be used in a subsequent call to ListVulnerabilities to continue
   * retrieving results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A page token that can be used in a subsequent call to ListVulnerabilities to continue
   * retrieving results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListVulnerabilitiesResponseV1 setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of Vulnerability Occurrences resulting from a scan.
   * @return value or {@code null} for none
   */
  public java.util.List<Occurrence> getOccurrences() {
    return occurrences;
  }

  /**
   * The list of Vulnerability Occurrences resulting from a scan.
   * @param occurrences occurrences or {@code null} for none
   */
  public ListVulnerabilitiesResponseV1 setOccurrences(java.util.List<Occurrence> occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  @Override
  public ListVulnerabilitiesResponseV1 set(String fieldName, Object value) {
    return (ListVulnerabilitiesResponseV1) super.set(fieldName, value);
  }

  @Override
  public ListVulnerabilitiesResponseV1 clone() {
    return (ListVulnerabilitiesResponseV1) super.clone();
  }

}
