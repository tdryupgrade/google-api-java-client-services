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

package com.google.api.services.dialogflow.v2.model;

/**
 * Google Cloud Storage location for the output.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1GcsDestination extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Google Cloud Storage URIs for the output. A URI is of the form: gs://bucket
   * /object-prefix-or-name Whether a prefix or name is used depends on the use case. The requesting
   * user must have "write-permission" to the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Required. The Google Cloud Storage URIs for the output. A URI is of the form: gs://bucket
   * /object-prefix-or-name Whether a prefix or name is used depends on the use case. The requesting
   * user must have "write-permission" to the bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. The Google Cloud Storage URIs for the output. A URI is of the form: gs://bucket
   * /object-prefix-or-name Whether a prefix or name is used depends on the use case. The requesting
   * user must have "write-permission" to the bucket.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1GcsDestination setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1GcsDestination set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1GcsDestination) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1GcsDestination clone() {
    return (GoogleCloudDialogflowV2beta1GcsDestination) super.clone();
  }

}
