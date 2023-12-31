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

package com.google.api.services.cloudbuild.v1.model;

/**
 * RPC response object returned by ListBitbucketServerConfigs RPC method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListBitbucketServerConfigsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of BitbucketServerConfigs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BitbucketServerConfig> bitbucketServerConfigs;

  static {
    // hack to force ProGuard to consider BitbucketServerConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BitbucketServerConfig.class);
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of BitbucketServerConfigs
   * @return value or {@code null} for none
   */
  public java.util.List<BitbucketServerConfig> getBitbucketServerConfigs() {
    return bitbucketServerConfigs;
  }

  /**
   * A list of BitbucketServerConfigs
   * @param bitbucketServerConfigs bitbucketServerConfigs or {@code null} for none
   */
  public ListBitbucketServerConfigsResponse setBitbucketServerConfigs(java.util.List<BitbucketServerConfig> bitbucketServerConfigs) {
    this.bitbucketServerConfigs = bitbucketServerConfigs;
    return this;
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListBitbucketServerConfigsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListBitbucketServerConfigsResponse set(String fieldName, Object value) {
    return (ListBitbucketServerConfigsResponse) super.set(fieldName, value);
  }

  @Override
  public ListBitbucketServerConfigsResponse clone() {
    return (ListBitbucketServerConfigsResponse) super.clone();
  }

}
