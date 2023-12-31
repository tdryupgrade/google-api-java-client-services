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

package com.google.api.services.containeranalysis.v1.model;

/**
 * Note kind that represents a logical attestation "role" or "authority". For example, an
 * organization might have one `Authority` for "QA" and one for "build". This note is intended to
 * act strictly as a grouping mechanism for the attached occurrences (Attestations). This grouping
 * mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to
 * attach an occurrence to a given note. It also provides a single point of lookup to find all
 * attached attestation occurrences, even if they don't all live in the same project.
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
public final class AttestationNote extends com.google.api.client.json.GenericJson {

  /**
   * Hint hints at the purpose of the attestation authority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Hint hint;

  /**
   * Hint hints at the purpose of the attestation authority.
   * @return value or {@code null} for none
   */
  public Hint getHint() {
    return hint;
  }

  /**
   * Hint hints at the purpose of the attestation authority.
   * @param hint hint or {@code null} for none
   */
  public AttestationNote setHint(Hint hint) {
    this.hint = hint;
    return this;
  }

  @Override
  public AttestationNote set(String fieldName, Object value) {
    return (AttestationNote) super.set(fieldName, value);
  }

  @Override
  public AttestationNote clone() {
    return (AttestationNote) super.clone();
  }

}
