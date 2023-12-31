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
 * Response for deleting existing printers in batch.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchDeletePrintersResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of update failures.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FailureInfo> failedPrinters;

  /**
   * A list of Printer.id that were successfully deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> printerIds;

  /**
   * A list of update failures.
   * @return value or {@code null} for none
   */
  public java.util.List<FailureInfo> getFailedPrinters() {
    return failedPrinters;
  }

  /**
   * A list of update failures.
   * @param failedPrinters failedPrinters or {@code null} for none
   */
  public BatchDeletePrintersResponse setFailedPrinters(java.util.List<FailureInfo> failedPrinters) {
    this.failedPrinters = failedPrinters;
    return this;
  }

  /**
   * A list of Printer.id that were successfully deleted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrinterIds() {
    return printerIds;
  }

  /**
   * A list of Printer.id that were successfully deleted.
   * @param printerIds printerIds or {@code null} for none
   */
  public BatchDeletePrintersResponse setPrinterIds(java.util.List<java.lang.String> printerIds) {
    this.printerIds = printerIds;
    return this;
  }

  @Override
  public BatchDeletePrintersResponse set(String fieldName, Object value) {
    return (BatchDeletePrintersResponse) super.set(fieldName, value);
  }

  @Override
  public BatchDeletePrintersResponse clone() {
    return (BatchDeletePrintersResponse) super.clone();
  }

}
