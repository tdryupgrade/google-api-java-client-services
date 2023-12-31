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

package com.google.api.services.healthcare.v1.model;

/**
 * Request to import messages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportMessagesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsSource gcsSource;

  /**
   * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage location.
   * @return value or {@code null} for none
   */
  public GcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage location.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public ImportMessagesRequest setGcsSource(GcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  @Override
  public ImportMessagesRequest set(String fieldName, Object value) {
    return (ImportMessagesRequest) super.set(fieldName, value);
  }

  @Override
  public ImportMessagesRequest clone() {
    return (ImportMessagesRequest) super.clone();
  }

}
