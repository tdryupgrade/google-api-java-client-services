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

package com.google.api.services.cloudasset.v1p7beta1.model;

/**
 * ListAssets response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAssetUpdatesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Asset updates in the time window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Asset> assetUpdates;

  static {
    // hack to force ProGuard to consider Asset used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Asset.class);
  }

  /**
   * Token to retrieve the next page of results. Set to empty if there are no remaining results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Time window configuration of the list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpdateTimeWindow updateTimeWindow;

  /**
   * Asset updates in the time window.
   * @return value or {@code null} for none
   */
  public java.util.List<Asset> getAssetUpdates() {
    return assetUpdates;
  }

  /**
   * Asset updates in the time window.
   * @param assetUpdates assetUpdates or {@code null} for none
   */
  public ListAssetUpdatesResponse setAssetUpdates(java.util.List<Asset> assetUpdates) {
    this.assetUpdates = assetUpdates;
    return this;
  }

  /**
   * Token to retrieve the next page of results. Set to empty if there are no remaining results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results. Set to empty if there are no remaining results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAssetUpdatesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Time window configuration of the list request.
   * @return value or {@code null} for none
   */
  public UpdateTimeWindow getUpdateTimeWindow() {
    return updateTimeWindow;
  }

  /**
   * Time window configuration of the list request.
   * @param updateTimeWindow updateTimeWindow or {@code null} for none
   */
  public ListAssetUpdatesResponse setUpdateTimeWindow(UpdateTimeWindow updateTimeWindow) {
    this.updateTimeWindow = updateTimeWindow;
    return this;
  }

  @Override
  public ListAssetUpdatesResponse set(String fieldName, Object value) {
    return (ListAssetUpdatesResponse) super.set(fieldName, value);
  }

  @Override
  public ListAssetUpdatesResponse clone() {
    return (ListAssetUpdatesResponse) super.clone();
  }

}
