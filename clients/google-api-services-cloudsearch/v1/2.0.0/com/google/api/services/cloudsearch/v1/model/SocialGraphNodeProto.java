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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Represents a user pseudonym. Pseudonyms are linked accounts on Google and third-party services
 * (e.g. YouTube or Twitter) and are described by a Social Graph Node.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SocialGraphNodeProto extends com.google.api.client.json.GenericJson {

  /**
   * The fields from ccc/socialgraph/socialgraphnode.proto:SgnNode that uniquely identify a social
   * graph node. The 'ident' field is not included here because its value can be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sgnDomain;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sgnPk;

  /**
   * The fields from ccc/socialgraph/socialgraphnode.proto:SgnNode that uniquely identify a social
   * graph node. The 'ident' field is not included here because its value can be changed.
   * @return value or {@code null} for none
   */
  public java.lang.String getSgnDomain() {
    return sgnDomain;
  }

  /**
   * The fields from ccc/socialgraph/socialgraphnode.proto:SgnNode that uniquely identify a social
   * graph node. The 'ident' field is not included here because its value can be changed.
   * @param sgnDomain sgnDomain or {@code null} for none
   */
  public SocialGraphNodeProto setSgnDomain(java.lang.String sgnDomain) {
    this.sgnDomain = sgnDomain;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSgnPk() {
    return sgnPk;
  }

  /**
   * @param sgnPk sgnPk or {@code null} for none
   */
  public SocialGraphNodeProto setSgnPk(java.lang.String sgnPk) {
    this.sgnPk = sgnPk;
    return this;
  }

  @Override
  public SocialGraphNodeProto set(String fieldName, Object value) {
    return (SocialGraphNodeProto) super.set(fieldName, value);
  }

  @Override
  public SocialGraphNodeProto clone() {
    return (SocialGraphNodeProto) super.clone();
  }

}
