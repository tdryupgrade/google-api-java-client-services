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
 * In the context of a search, the MatchInfo contains information about which Items matched the
 * query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FuseboxItemThreadMatchInfo extends com.google.api.client.json.GenericJson {

  /**
   * If SearchQuery.Options.Clustering is present, the query will be treated as a cluster query, and
   * this field may be populated with the cluster ID of the cluster to which this thread belongs, if
   * any. The cluster ID will be a label on the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * The server id of the last item that matched the query. This is always set, regardless of the
   * compute_matching_items_per_thread option. This is the value by which search results are sorted,
   * in descending (i.e. newest first) order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger lastMatchingItemId;

  /**
   * The MultiKey of the last item that matched the query. This is always set, regardless of the
   * compute_matching_items_per_thread option. This is the value by which search results are sorted,
   * in descending (i.e. newest first) order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MultiKey lastMatchingItemKey;

  /**
   * If SearchQuery.Options.compute_matching_items_per_thread, this field will contain the keys of
   * all items that matched the query, in ascending order. Note that this option requires extra
   * computation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MultiKey> matchingItemKey;

  /**
   * The rank of this ItemThread in the result set of the query. This rank may be used to sort
   * ItemThreads in proper order. Ranks are specific to a query, and stable for a given query at a
   * specific time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Rank rank;

  /**
   * If SearchQuery.Options.Clustering is present, the query will be treated as a cluster query, and
   * this field may be populated with the cluster ID of the cluster to which this thread belongs, if
   * any. The cluster ID will be a label on the message.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * If SearchQuery.Options.Clustering is present, the query will be treated as a cluster query, and
   * this field may be populated with the cluster ID of the cluster to which this thread belongs, if
   * any. The cluster ID will be a label on the message.
   * @param clusterId clusterId or {@code null} for none
   */
  public FuseboxItemThreadMatchInfo setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The server id of the last item that matched the query. This is always set, regardless of the
   * compute_matching_items_per_thread option. This is the value by which search results are sorted,
   * in descending (i.e. newest first) order.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getLastMatchingItemId() {
    return lastMatchingItemId;
  }

  /**
   * The server id of the last item that matched the query. This is always set, regardless of the
   * compute_matching_items_per_thread option. This is the value by which search results are sorted,
   * in descending (i.e. newest first) order.
   * @param lastMatchingItemId lastMatchingItemId or {@code null} for none
   */
  public FuseboxItemThreadMatchInfo setLastMatchingItemId(java.math.BigInteger lastMatchingItemId) {
    this.lastMatchingItemId = lastMatchingItemId;
    return this;
  }

  /**
   * The MultiKey of the last item that matched the query. This is always set, regardless of the
   * compute_matching_items_per_thread option. This is the value by which search results are sorted,
   * in descending (i.e. newest first) order.
   * @return value or {@code null} for none
   */
  public MultiKey getLastMatchingItemKey() {
    return lastMatchingItemKey;
  }

  /**
   * The MultiKey of the last item that matched the query. This is always set, regardless of the
   * compute_matching_items_per_thread option. This is the value by which search results are sorted,
   * in descending (i.e. newest first) order.
   * @param lastMatchingItemKey lastMatchingItemKey or {@code null} for none
   */
  public FuseboxItemThreadMatchInfo setLastMatchingItemKey(MultiKey lastMatchingItemKey) {
    this.lastMatchingItemKey = lastMatchingItemKey;
    return this;
  }

  /**
   * If SearchQuery.Options.compute_matching_items_per_thread, this field will contain the keys of
   * all items that matched the query, in ascending order. Note that this option requires extra
   * computation.
   * @return value or {@code null} for none
   */
  public java.util.List<MultiKey> getMatchingItemKey() {
    return matchingItemKey;
  }

  /**
   * If SearchQuery.Options.compute_matching_items_per_thread, this field will contain the keys of
   * all items that matched the query, in ascending order. Note that this option requires extra
   * computation.
   * @param matchingItemKey matchingItemKey or {@code null} for none
   */
  public FuseboxItemThreadMatchInfo setMatchingItemKey(java.util.List<MultiKey> matchingItemKey) {
    this.matchingItemKey = matchingItemKey;
    return this;
  }

  /**
   * The rank of this ItemThread in the result set of the query. This rank may be used to sort
   * ItemThreads in proper order. Ranks are specific to a query, and stable for a given query at a
   * specific time.
   * @return value or {@code null} for none
   */
  public Rank getRank() {
    return rank;
  }

  /**
   * The rank of this ItemThread in the result set of the query. This rank may be used to sort
   * ItemThreads in proper order. Ranks are specific to a query, and stable for a given query at a
   * specific time.
   * @param rank rank or {@code null} for none
   */
  public FuseboxItemThreadMatchInfo setRank(Rank rank) {
    this.rank = rank;
    return this;
  }

  @Override
  public FuseboxItemThreadMatchInfo set(String fieldName, Object value) {
    return (FuseboxItemThreadMatchInfo) super.set(fieldName, value);
  }

  @Override
  public FuseboxItemThreadMatchInfo clone() {
    return (FuseboxItemThreadMatchInfo) super.clone();
  }

}
