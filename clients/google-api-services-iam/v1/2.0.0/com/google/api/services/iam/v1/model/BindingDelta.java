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

package com.google.api.services.iam.v1.model;

/**
 * One delta entry for Binding. Each individual change (only one member in each entry) to a binding
 * will be a separate entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BindingDelta extends com.google.api.client.json.GenericJson {

  /**
   * The action that was performed on a Binding. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * The condition that is associated with this binding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Expr condition;

  /**
   * A single identity requesting access for a Google Cloud resource. Follows the same format of
   * Binding.members. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String member;

  /**
   * Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   * `roles/owner`. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * The action that was performed on a Binding. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The action that was performed on a Binding. Required
   * @param action action or {@code null} for none
   */
  public BindingDelta setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * The condition that is associated with this binding.
   * @return value or {@code null} for none
   */
  public Expr getCondition() {
    return condition;
  }

  /**
   * The condition that is associated with this binding.
   * @param condition condition or {@code null} for none
   */
  public BindingDelta setCondition(Expr condition) {
    this.condition = condition;
    return this;
  }

  /**
   * A single identity requesting access for a Google Cloud resource. Follows the same format of
   * Binding.members. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getMember() {
    return member;
  }

  /**
   * A single identity requesting access for a Google Cloud resource. Follows the same format of
   * Binding.members. Required
   * @param member member or {@code null} for none
   */
  public BindingDelta setMember(java.lang.String member) {
    this.member = member;
    return this;
  }

  /**
   * Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   * `roles/owner`. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   * `roles/owner`. Required
   * @param role role or {@code null} for none
   */
  public BindingDelta setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  @Override
  public BindingDelta set(String fieldName, Object value) {
    return (BindingDelta) super.set(fieldName, value);
  }

  @Override
  public BindingDelta clone() {
    return (BindingDelta) super.clone();
  }

}
