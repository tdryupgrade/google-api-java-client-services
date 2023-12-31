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

package com.google.api.services.spanner.v1.model;

/**
 * A message representing a key prefix node in the key prefix hierarchy. for eg. Bigtable keyspaces
 * are lexicographically ordered mappings of keys to values. Keys often have a shared prefix
 * structure where users use the keys to organize data. Eg employee In this case Keysight will
 * possibly use one node for a company and reuse it for all employees that fall under the company.
 * Doing so improves legibility in the UI.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PrefixNode extends com.google.api.client.json.GenericJson {

  /**
   * Whether this corresponds to a data_source name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dataSourceNode;

  /**
   * The depth in the prefix hierarchy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer depth;

  /**
   * The index of the end key bucket of the range that this node spans.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer endIndex;

  /**
   * The index of the start key bucket of the range that this node spans.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The string represented by the prefix node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String word;

  /**
   * Whether this corresponds to a data_source name.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDataSourceNode() {
    return dataSourceNode;
  }

  /**
   * Whether this corresponds to a data_source name.
   * @param dataSourceNode dataSourceNode or {@code null} for none
   */
  public PrefixNode setDataSourceNode(java.lang.Boolean dataSourceNode) {
    this.dataSourceNode = dataSourceNode;
    return this;
  }

  /**
   * The depth in the prefix hierarchy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDepth() {
    return depth;
  }

  /**
   * The depth in the prefix hierarchy.
   * @param depth depth or {@code null} for none
   */
  public PrefixNode setDepth(java.lang.Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * The index of the end key bucket of the range that this node spans.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEndIndex() {
    return endIndex;
  }

  /**
   * The index of the end key bucket of the range that this node spans.
   * @param endIndex endIndex or {@code null} for none
   */
  public PrefixNode setEndIndex(java.lang.Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * The index of the start key bucket of the range that this node spans.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * The index of the start key bucket of the range that this node spans.
   * @param startIndex startIndex or {@code null} for none
   */
  public PrefixNode setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The string represented by the prefix node.
   * @return value or {@code null} for none
   */
  public java.lang.String getWord() {
    return word;
  }

  /**
   * The string represented by the prefix node.
   * @param word word or {@code null} for none
   */
  public PrefixNode setWord(java.lang.String word) {
    this.word = word;
    return this;
  }

  @Override
  public PrefixNode set(String fieldName, Object value) {
    return (PrefixNode) super.set(fieldName, value);
  }

  @Override
  public PrefixNode clone() {
    return (PrefixNode) super.clone();
  }

}
