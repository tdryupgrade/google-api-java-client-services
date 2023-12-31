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

package com.google.api.services.dataflow.model;

/**
 * Contains per-worker telemetry about the data sampling feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSamplingReport extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Delta of bytes written to file from previous report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bytesWrittenDelta;

  /**
   * Optional. Delta of bytes sampled from previous report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long elementsSampledBytes;

  /**
   * Optional. Delta of number of elements sampled from previous report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long elementsSampledCount;

  /**
   * Optional. Delta of number of samples taken from user code exceptions from previous report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long exceptionsSampledCount;

  /**
   * Optional. Delta of number of PCollections sampled from previous report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long pcollectionsSampledCount;

  /**
   * Optional. Delta of errors counts from persisting the samples from previous report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long persistenceErrorsCount;

  /**
   * Optional. Delta of errors counts from retrieving, or translating the samples from previous
   * report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long translationErrorsCount;

  /**
   * Optional. Delta of bytes written to file from previous report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBytesWrittenDelta() {
    return bytesWrittenDelta;
  }

  /**
   * Optional. Delta of bytes written to file from previous report.
   * @param bytesWrittenDelta bytesWrittenDelta or {@code null} for none
   */
  public DataSamplingReport setBytesWrittenDelta(java.lang.Long bytesWrittenDelta) {
    this.bytesWrittenDelta = bytesWrittenDelta;
    return this;
  }

  /**
   * Optional. Delta of bytes sampled from previous report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getElementsSampledBytes() {
    return elementsSampledBytes;
  }

  /**
   * Optional. Delta of bytes sampled from previous report.
   * @param elementsSampledBytes elementsSampledBytes or {@code null} for none
   */
  public DataSamplingReport setElementsSampledBytes(java.lang.Long elementsSampledBytes) {
    this.elementsSampledBytes = elementsSampledBytes;
    return this;
  }

  /**
   * Optional. Delta of number of elements sampled from previous report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getElementsSampledCount() {
    return elementsSampledCount;
  }

  /**
   * Optional. Delta of number of elements sampled from previous report.
   * @param elementsSampledCount elementsSampledCount or {@code null} for none
   */
  public DataSamplingReport setElementsSampledCount(java.lang.Long elementsSampledCount) {
    this.elementsSampledCount = elementsSampledCount;
    return this;
  }

  /**
   * Optional. Delta of number of samples taken from user code exceptions from previous report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExceptionsSampledCount() {
    return exceptionsSampledCount;
  }

  /**
   * Optional. Delta of number of samples taken from user code exceptions from previous report.
   * @param exceptionsSampledCount exceptionsSampledCount or {@code null} for none
   */
  public DataSamplingReport setExceptionsSampledCount(java.lang.Long exceptionsSampledCount) {
    this.exceptionsSampledCount = exceptionsSampledCount;
    return this;
  }

  /**
   * Optional. Delta of number of PCollections sampled from previous report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPcollectionsSampledCount() {
    return pcollectionsSampledCount;
  }

  /**
   * Optional. Delta of number of PCollections sampled from previous report.
   * @param pcollectionsSampledCount pcollectionsSampledCount or {@code null} for none
   */
  public DataSamplingReport setPcollectionsSampledCount(java.lang.Long pcollectionsSampledCount) {
    this.pcollectionsSampledCount = pcollectionsSampledCount;
    return this;
  }

  /**
   * Optional. Delta of errors counts from persisting the samples from previous report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPersistenceErrorsCount() {
    return persistenceErrorsCount;
  }

  /**
   * Optional. Delta of errors counts from persisting the samples from previous report.
   * @param persistenceErrorsCount persistenceErrorsCount or {@code null} for none
   */
  public DataSamplingReport setPersistenceErrorsCount(java.lang.Long persistenceErrorsCount) {
    this.persistenceErrorsCount = persistenceErrorsCount;
    return this;
  }

  /**
   * Optional. Delta of errors counts from retrieving, or translating the samples from previous
   * report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTranslationErrorsCount() {
    return translationErrorsCount;
  }

  /**
   * Optional. Delta of errors counts from retrieving, or translating the samples from previous
   * report.
   * @param translationErrorsCount translationErrorsCount or {@code null} for none
   */
  public DataSamplingReport setTranslationErrorsCount(java.lang.Long translationErrorsCount) {
    this.translationErrorsCount = translationErrorsCount;
    return this;
  }

  @Override
  public DataSamplingReport set(String fieldName, Object value) {
    return (DataSamplingReport) super.set(fieldName, value);
  }

  @Override
  public DataSamplingReport clone() {
    return (DataSamplingReport) super.clone();
  }

}
