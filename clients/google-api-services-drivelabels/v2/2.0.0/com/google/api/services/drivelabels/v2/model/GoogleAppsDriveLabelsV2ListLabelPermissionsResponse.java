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

package com.google.api.services.drivelabels.v2.model;

/**
 * Response for listing the permissions on a Label.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2ListLabelPermissionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Label permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsDriveLabelsV2LabelPermission> labelPermissions;

  static {
    // hack to force ProGuard to consider GoogleAppsDriveLabelsV2LabelPermission used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAppsDriveLabelsV2LabelPermission.class);
  }

  /**
   * The token of the next page in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Label permissions.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsDriveLabelsV2LabelPermission> getLabelPermissions() {
    return labelPermissions;
  }

  /**
   * Label permissions.
   * @param labelPermissions labelPermissions or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse setLabelPermissions(java.util.List<GoogleAppsDriveLabelsV2LabelPermission> labelPermissions) {
    this.labelPermissions = labelPermissions;
    return this;
  }

  /**
   * The token of the next page in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token of the next page in the response.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2ListLabelPermissionsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2ListLabelPermissionsResponse clone() {
    return (GoogleAppsDriveLabelsV2ListLabelPermissionsResponse) super.clone();
  }

}
