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
 * MITRE ATT tactics and techniques related to this finding. See: https://attack.mitre.org
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
public final class MitreAttack extends com.google.api.client.json.GenericJson {

  /**
   * Additional MITRE ATT tactics related to this finding, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> additionalTactics;

  /**
   * Additional MITRE ATT techniques related to this finding, if any, along with any of their
   * respective parent techniques.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> additionalTechniques;

  /**
   * The MITRE ATT tactic most closely represented by this finding, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryTactic;

  /**
   * The MITRE ATT technique most closely represented by this finding, if any. primary_techniques is
   * a repeated field because there are multiple levels of MITRE ATT techniques. If the technique
   * most closely represented by this finding is a sub-technique (e.g. SCANNING_IP_BLOCKS), both the
   * sub-technique and its parent technique(s) will be listed (e.g. SCANNING_IP_BLOCKS,
   * ACTIVE_SCANNING).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> primaryTechniques;

  /**
   * The MITRE ATT version referenced by the above fields. E.g. "8".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Additional MITRE ATT tactics related to this finding, if any.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdditionalTactics() {
    return additionalTactics;
  }

  /**
   * Additional MITRE ATT tactics related to this finding, if any.
   * @param additionalTactics additionalTactics or {@code null} for none
   */
  public MitreAttack setAdditionalTactics(java.util.List<java.lang.String> additionalTactics) {
    this.additionalTactics = additionalTactics;
    return this;
  }

  /**
   * Additional MITRE ATT techniques related to this finding, if any, along with any of their
   * respective parent techniques.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdditionalTechniques() {
    return additionalTechniques;
  }

  /**
   * Additional MITRE ATT techniques related to this finding, if any, along with any of their
   * respective parent techniques.
   * @param additionalTechniques additionalTechniques or {@code null} for none
   */
  public MitreAttack setAdditionalTechniques(java.util.List<java.lang.String> additionalTechniques) {
    this.additionalTechniques = additionalTechniques;
    return this;
  }

  /**
   * The MITRE ATT tactic most closely represented by this finding, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryTactic() {
    return primaryTactic;
  }

  /**
   * The MITRE ATT tactic most closely represented by this finding, if any.
   * @param primaryTactic primaryTactic or {@code null} for none
   */
  public MitreAttack setPrimaryTactic(java.lang.String primaryTactic) {
    this.primaryTactic = primaryTactic;
    return this;
  }

  /**
   * The MITRE ATT technique most closely represented by this finding, if any. primary_techniques is
   * a repeated field because there are multiple levels of MITRE ATT techniques. If the technique
   * most closely represented by this finding is a sub-technique (e.g. SCANNING_IP_BLOCKS), both the
   * sub-technique and its parent technique(s) will be listed (e.g. SCANNING_IP_BLOCKS,
   * ACTIVE_SCANNING).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrimaryTechniques() {
    return primaryTechniques;
  }

  /**
   * The MITRE ATT technique most closely represented by this finding, if any. primary_techniques is
   * a repeated field because there are multiple levels of MITRE ATT techniques. If the technique
   * most closely represented by this finding is a sub-technique (e.g. SCANNING_IP_BLOCKS), both the
   * sub-technique and its parent technique(s) will be listed (e.g. SCANNING_IP_BLOCKS,
   * ACTIVE_SCANNING).
   * @param primaryTechniques primaryTechniques or {@code null} for none
   */
  public MitreAttack setPrimaryTechniques(java.util.List<java.lang.String> primaryTechniques) {
    this.primaryTechniques = primaryTechniques;
    return this;
  }

  /**
   * The MITRE ATT version referenced by the above fields. E.g. "8".
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The MITRE ATT version referenced by the above fields. E.g. "8".
   * @param version version or {@code null} for none
   */
  public MitreAttack setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public MitreAttack set(String fieldName, Object value) {
    return (MitreAttack) super.set(fieldName, value);
  }

  @Override
  public MitreAttack clone() {
    return (MitreAttack) super.clone();
  }

}
