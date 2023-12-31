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

package com.google.api.services.cloudidentity.v1.model;

/**
 * The details of an update to a `MembershipRole`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateMembershipRolesParams extends com.google.api.client.json.GenericJson {

  /**
   * The fully-qualified names of fields to update. May only contain the field
   * `expiry_detail.expire_time`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fieldMask;

  /**
   * The `MembershipRole`s to be updated. Only `MEMBER` `MembershipRole` can currently be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MembershipRole membershipRole;

  /**
   * The fully-qualified names of fields to update. May only contain the field
   * `expiry_detail.expire_time`.
   * @return value or {@code null} for none
   */
  public String getFieldMask() {
    return fieldMask;
  }

  /**
   * The fully-qualified names of fields to update. May only contain the field
   * `expiry_detail.expire_time`.
   * @param fieldMask fieldMask or {@code null} for none
   */
  public UpdateMembershipRolesParams setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  /**
   * The `MembershipRole`s to be updated. Only `MEMBER` `MembershipRole` can currently be updated.
   * @return value or {@code null} for none
   */
  public MembershipRole getMembershipRole() {
    return membershipRole;
  }

  /**
   * The `MembershipRole`s to be updated. Only `MEMBER` `MembershipRole` can currently be updated.
   * @param membershipRole membershipRole or {@code null} for none
   */
  public UpdateMembershipRolesParams setMembershipRole(MembershipRole membershipRole) {
    this.membershipRole = membershipRole;
    return this;
  }

  @Override
  public UpdateMembershipRolesParams set(String fieldName, Object value) {
    return (UpdateMembershipRolesParams) super.set(fieldName, value);
  }

  @Override
  public UpdateMembershipRolesParams clone() {
    return (UpdateMembershipRolesParams) super.clone();
  }

}
