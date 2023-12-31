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

package com.google.api.services.directory.model;

/**
 * Response for adding new printers in batch.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchCreatePrintersResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of create failures. Printer IDs are not populated, as printer were not created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FailureInfo> failures;

  /**
   * A list of successfully created printers with their IDs populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Printer> printers;

  /**
   * A list of create failures. Printer IDs are not populated, as printer were not created.
   * @return value or {@code null} for none
   */
  public java.util.List<FailureInfo> getFailures() {
    return failures;
  }

  /**
   * A list of create failures. Printer IDs are not populated, as printer were not created.
   * @param failures failures or {@code null} for none
   */
  public BatchCreatePrintersResponse setFailures(java.util.List<FailureInfo> failures) {
    this.failures = failures;
    return this;
  }

  /**
   * A list of successfully created printers with their IDs populated.
   * @return value or {@code null} for none
   */
  public java.util.List<Printer> getPrinters() {
    return printers;
  }

  /**
   * A list of successfully created printers with their IDs populated.
   * @param printers printers or {@code null} for none
   */
  public BatchCreatePrintersResponse setPrinters(java.util.List<Printer> printers) {
    this.printers = printers;
    return this;
  }

  @Override
  public BatchCreatePrintersResponse set(String fieldName, Object value) {
    return (BatchCreatePrintersResponse) super.set(fieldName, value);
  }

  @Override
  public BatchCreatePrintersResponse clone() {
    return (BatchCreatePrintersResponse) super.clone();
  }

}
