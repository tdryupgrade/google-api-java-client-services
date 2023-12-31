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

package com.google.api.services.ideahub.v1alpha.model;

/**
 * Represents a Topic umbrella for a list of questions that a Creator may want to respond to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Idea Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleSearchIdeahubV1alphaTopic extends com.google.api.client.json.GenericJson {

  /**
   * String displayed to the creator indicating the name of the Topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The mID of the topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * Unique identifier for the topic. Format: topics/{topic}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * String displayed to the creator indicating the name of the Topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * String displayed to the creator indicating the name of the Topic.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleSearchIdeahubV1alphaTopic setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The mID of the topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * The mID of the topic.
   * @param mid mid or {@code null} for none
   */
  public GoogleSearchIdeahubV1alphaTopic setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * Unique identifier for the topic. Format: topics/{topic}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Unique identifier for the topic. Format: topics/{topic}
   * @param name name or {@code null} for none
   */
  public GoogleSearchIdeahubV1alphaTopic setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleSearchIdeahubV1alphaTopic set(String fieldName, Object value) {
    return (GoogleSearchIdeahubV1alphaTopic) super.set(fieldName, value);
  }

  @Override
  public GoogleSearchIdeahubV1alphaTopic clone() {
    return (GoogleSearchIdeahubV1alphaTopic) super.clone();
  }

}
