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
 * Response for listing allowed printer models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListPrinterModelsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Printer models that are currently allowed to be configured for ChromeOs. Some printers may be
   * added or removed over time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PrinterModel> printerModels;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListPrinterModelsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Printer models that are currently allowed to be configured for ChromeOs. Some printers may be
   * added or removed over time.
   * @return value or {@code null} for none
   */
  public java.util.List<PrinterModel> getPrinterModels() {
    return printerModels;
  }

  /**
   * Printer models that are currently allowed to be configured for ChromeOs. Some printers may be
   * added or removed over time.
   * @param printerModels printerModels or {@code null} for none
   */
  public ListPrinterModelsResponse setPrinterModels(java.util.List<PrinterModel> printerModels) {
    this.printerModels = printerModels;
    return this;
  }

  @Override
  public ListPrinterModelsResponse set(String fieldName, Object value) {
    return (ListPrinterModelsResponse) super.set(fieldName, value);
  }

  @Override
  public ListPrinterModelsResponse clone() {
    return (ListPrinterModelsResponse) super.clone();
  }

}
