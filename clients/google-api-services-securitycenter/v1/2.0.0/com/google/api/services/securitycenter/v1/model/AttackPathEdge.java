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

package com.google.api.services.securitycenter.v1.model;

/**
 * Represents a connection between a source node and a destination node in this attack path.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttackPathEdge extends com.google.api.client.json.GenericJson {

  /**
   * The attack node uuid of the destination node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * The attack node uuid of the source node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The attack node uuid of the destination node.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * The attack node uuid of the destination node.
   * @param destination destination or {@code null} for none
   */
  public AttackPathEdge setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * The attack node uuid of the source node.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * The attack node uuid of the source node.
   * @param source source or {@code null} for none
   */
  public AttackPathEdge setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public AttackPathEdge set(String fieldName, Object value) {
    return (AttackPathEdge) super.set(fieldName, value);
  }

  @Override
  public AttackPathEdge clone() {
    return (AttackPathEdge) super.clone();
  }

}
