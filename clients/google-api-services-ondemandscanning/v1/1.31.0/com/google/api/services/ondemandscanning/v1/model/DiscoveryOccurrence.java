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
 * Provides information about the analysis status of a discovered resource.
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
public final class DiscoveryOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * The status of discovery for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String analysisStatus;

  /**
   * When an error is encountered this will contain a LocalizedMessage under details to show to the
   * user. The LocalizedMessage is output only and populated by the API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status analysisStatusError;

  /**
   * Whether the resource is continuously analyzed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String continuousAnalysis;

  /**
   * The CPE of the resource being scanned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpe;

  /**
   * The last time this resource was scanned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastScanTime;

  /**
   * The status of discovery for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnalysisStatus() {
    return analysisStatus;
  }

  /**
   * The status of discovery for the resource.
   * @param analysisStatus analysisStatus or {@code null} for none
   */
  public DiscoveryOccurrence setAnalysisStatus(java.lang.String analysisStatus) {
    this.analysisStatus = analysisStatus;
    return this;
  }

  /**
   * When an error is encountered this will contain a LocalizedMessage under details to show to the
   * user. The LocalizedMessage is output only and populated by the API.
   * @return value or {@code null} for none
   */
  public Status getAnalysisStatusError() {
    return analysisStatusError;
  }

  /**
   * When an error is encountered this will contain a LocalizedMessage under details to show to the
   * user. The LocalizedMessage is output only and populated by the API.
   * @param analysisStatusError analysisStatusError or {@code null} for none
   */
  public DiscoveryOccurrence setAnalysisStatusError(Status analysisStatusError) {
    this.analysisStatusError = analysisStatusError;
    return this;
  }

  /**
   * Whether the resource is continuously analyzed.
   * @return value or {@code null} for none
   */
  public java.lang.String getContinuousAnalysis() {
    return continuousAnalysis;
  }

  /**
   * Whether the resource is continuously analyzed.
   * @param continuousAnalysis continuousAnalysis or {@code null} for none
   */
  public DiscoveryOccurrence setContinuousAnalysis(java.lang.String continuousAnalysis) {
    this.continuousAnalysis = continuousAnalysis;
    return this;
  }

  /**
   * The CPE of the resource being scanned.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpe() {
    return cpe;
  }

  /**
   * The CPE of the resource being scanned.
   * @param cpe cpe or {@code null} for none
   */
  public DiscoveryOccurrence setCpe(java.lang.String cpe) {
    this.cpe = cpe;
    return this;
  }

  /**
   * The last time this resource was scanned.
   * @return value or {@code null} for none
   */
  public String getLastScanTime() {
    return lastScanTime;
  }

  /**
   * The last time this resource was scanned.
   * @param lastScanTime lastScanTime or {@code null} for none
   */
  public DiscoveryOccurrence setLastScanTime(String lastScanTime) {
    this.lastScanTime = lastScanTime;
    return this;
  }

  @Override
  public DiscoveryOccurrence set(String fieldName, Object value) {
    return (DiscoveryOccurrence) super.set(fieldName, value);
  }

  @Override
  public DiscoveryOccurrence clone() {
    return (DiscoveryOccurrence) super.clone();
  }

}
