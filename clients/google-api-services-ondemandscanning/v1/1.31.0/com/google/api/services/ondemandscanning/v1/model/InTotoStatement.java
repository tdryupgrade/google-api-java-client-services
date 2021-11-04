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

package com.google.api.services.ondemandscanning.v1.model;

/**
 * Spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement The serialized
 * InTotoStatement will be stored as Envelope.payload. Envelope.payloadType is always
 * "application/vnd.in-toto+json".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InTotoStatement extends com.google.api.client.json.GenericJson {

  /**
   * Always "https://in-toto.io/Statement/v0.1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("_type")
  private java.lang.String type;

  /**
   * "https://slsa.dev/provenance/v0.1" for SlsaProvenance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predicateType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InTotoProvenance provenance;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlsaProvenance slsaProvenance;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Subject> subject;

  /**
   * Always "https://in-toto.io/Statement/v0.1".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Always "https://in-toto.io/Statement/v0.1".
   * @param type type or {@code null} for none
   */
  public InTotoStatement setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * "https://slsa.dev/provenance/v0.1" for SlsaProvenance.
   * @return value or {@code null} for none
   */
  public java.lang.String getPredicateType() {
    return predicateType;
  }

  /**
   * "https://slsa.dev/provenance/v0.1" for SlsaProvenance.
   * @param predicateType predicateType or {@code null} for none
   */
  public InTotoStatement setPredicateType(java.lang.String predicateType) {
    this.predicateType = predicateType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public InTotoProvenance getProvenance() {
    return provenance;
  }

  /**
   * @param provenance provenance or {@code null} for none
   */
  public InTotoStatement setProvenance(InTotoProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SlsaProvenance getSlsaProvenance() {
    return slsaProvenance;
  }

  /**
   * @param slsaProvenance slsaProvenance or {@code null} for none
   */
  public InTotoStatement setSlsaProvenance(SlsaProvenance slsaProvenance) {
    this.slsaProvenance = slsaProvenance;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Subject> getSubject() {
    return subject;
  }

  /**
   * @param subject subject or {@code null} for none
   */
  public InTotoStatement setSubject(java.util.List<Subject> subject) {
    this.subject = subject;
    return this;
  }

  @Override
  public InTotoStatement set(String fieldName, Object value) {
    return (InTotoStatement) super.set(fieldName, value);
  }

  @Override
  public InTotoStatement clone() {
    return (InTotoStatement) super.clone();
  }

}
