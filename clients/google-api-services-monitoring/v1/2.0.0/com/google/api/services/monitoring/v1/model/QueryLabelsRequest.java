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

package com.google.api.services.monitoring.v1.model;

/**
 * QueryLabelsRequest holds all parameters of the Prometheus upstream API for returning a list of
 * label names.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryLabelsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String end;

  /**
   * A list of matchers encoded in the Prometheus label matcher format to constrain the values to
   * series that satisfy them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String match;

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String start;

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnd() {
    return end;
  }

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * @param end end or {@code null} for none
   */
  public QueryLabelsRequest setEnd(java.lang.String end) {
    this.end = end;
    return this;
  }

  /**
   * A list of matchers encoded in the Prometheus label matcher format to constrain the values to
   * series that satisfy them.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatch() {
    return match;
  }

  /**
   * A list of matchers encoded in the Prometheus label matcher format to constrain the values to
   * series that satisfy them.
   * @param match match or {@code null} for none
   */
  public QueryLabelsRequest setMatch(java.lang.String match) {
    this.match = match;
    return this;
  }

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.String getStart() {
    return start;
  }

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * @param start start or {@code null} for none
   */
  public QueryLabelsRequest setStart(java.lang.String start) {
    this.start = start;
    return this;
  }

  @Override
  public QueryLabelsRequest set(String fieldName, Object value) {
    return (QueryLabelsRequest) super.set(fieldName, value);
  }

  @Override
  public QueryLabelsRequest clone() {
    return (QueryLabelsRequest) super.clone();
  }

}
