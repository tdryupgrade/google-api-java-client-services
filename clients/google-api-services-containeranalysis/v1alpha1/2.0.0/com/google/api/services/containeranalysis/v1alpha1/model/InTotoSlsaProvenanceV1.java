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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Model definition for InTotoSlsaProvenanceV1.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InTotoSlsaProvenanceV1 extends com.google.api.client.json.GenericJson {

  /**
   * InToto spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("_type")
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlsaProvenanceV1 predicate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predicateType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Subject> subject;

  /**
   * InToto spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * InToto spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement
   * @param type type or {@code null} for none
   */
  public InTotoSlsaProvenanceV1 setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SlsaProvenanceV1 getPredicate() {
    return predicate;
  }

  /**
   * @param predicate predicate or {@code null} for none
   */
  public InTotoSlsaProvenanceV1 setPredicate(SlsaProvenanceV1 predicate) {
    this.predicate = predicate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPredicateType() {
    return predicateType;
  }

  /**
   * @param predicateType predicateType or {@code null} for none
   */
  public InTotoSlsaProvenanceV1 setPredicateType(java.lang.String predicateType) {
    this.predicateType = predicateType;
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
  public InTotoSlsaProvenanceV1 setSubject(java.util.List<Subject> subject) {
    this.subject = subject;
    return this;
  }

  @Override
  public InTotoSlsaProvenanceV1 set(String fieldName, Object value) {
    return (InTotoSlsaProvenanceV1) super.set(fieldName, value);
  }

  @Override
  public InTotoSlsaProvenanceV1 clone() {
    return (InTotoSlsaProvenanceV1) super.clone();
  }

}
