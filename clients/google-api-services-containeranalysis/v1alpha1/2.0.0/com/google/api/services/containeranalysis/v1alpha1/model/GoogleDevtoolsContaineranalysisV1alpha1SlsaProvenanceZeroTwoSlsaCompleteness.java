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
 * Indicates that the builder claims certain fields in this message to be complete.
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
public final class GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness extends com.google.api.client.json.GenericJson {

  /**
   * If true, the builder claims that invocation.environment is complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean environment;

  /**
   * If true, the builder claims that materials is complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean materials;

  /**
   * If true, the builder claims that invocation.parameters is complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean parameters;

  /**
   * If true, the builder claims that invocation.environment is complete.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnvironment() {
    return environment;
  }

  /**
   * If true, the builder claims that invocation.environment is complete.
   * @param environment environment or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness setEnvironment(java.lang.Boolean environment) {
    this.environment = environment;
    return this;
  }

  /**
   * If true, the builder claims that materials is complete.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMaterials() {
    return materials;
  }

  /**
   * If true, the builder claims that materials is complete.
   * @param materials materials or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness setMaterials(java.lang.Boolean materials) {
    this.materials = materials;
    return this;
  }

  /**
   * If true, the builder claims that invocation.parameters is complete.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getParameters() {
    return parameters;
  }

  /**
   * If true, the builder claims that invocation.parameters is complete.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness setParameters(java.lang.Boolean parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness set(String fieldName, Object value) {
    return (GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness clone() {
    return (GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness) super.clone();
  }

}
