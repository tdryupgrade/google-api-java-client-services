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

package com.google.api.services.searchconsole.v1.model;

/**
 * Mobile-usability inspection results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Search Console API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MobileUsabilityInspectionResult extends com.google.api.client.json.GenericJson {

  /**
   * A list of zero or more mobile-usability issues detected for this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MobileUsabilityIssue> issues;

  /**
   * High-level mobile-usability inspection result for this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verdict;

  /**
   * A list of zero or more mobile-usability issues detected for this URL.
   * @return value or {@code null} for none
   */
  public java.util.List<MobileUsabilityIssue> getIssues() {
    return issues;
  }

  /**
   * A list of zero or more mobile-usability issues detected for this URL.
   * @param issues issues or {@code null} for none
   */
  public MobileUsabilityInspectionResult setIssues(java.util.List<MobileUsabilityIssue> issues) {
    this.issues = issues;
    return this;
  }

  /**
   * High-level mobile-usability inspection result for this URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerdict() {
    return verdict;
  }

  /**
   * High-level mobile-usability inspection result for this URL.
   * @param verdict verdict or {@code null} for none
   */
  public MobileUsabilityInspectionResult setVerdict(java.lang.String verdict) {
    this.verdict = verdict;
    return this;
  }

  @Override
  public MobileUsabilityInspectionResult set(String fieldName, Object value) {
    return (MobileUsabilityInspectionResult) super.set(fieldName, value);
  }

  @Override
  public MobileUsabilityInspectionResult clone() {
    return (MobileUsabilityInspectionResult) super.clone();
  }

}
