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

package com.google.api.services.cloudasset.v1p4beta1.model;

/**
 * Used in `policy_type` to specify how `boolean_policy` will behave at this resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudOrgpolicyV1BooleanPolicy extends com.google.api.client.json.GenericJson {

  /**
   * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable.
   * Suppose you have a `Constraint` `constraints/compute.disableSerialPortAccess` with
   * `constraint_default` set to `ALLOW`. A `Policy` for that `Constraint` exhibits the following
   * behavior: - If the `Policy` at this resource has enforced set to `false`, serial port
   * connection attempts will be allowed. - If the `Policy` at this resource has enforced set to
   * `true`, serial port connection attempts will be refused. - If the `Policy` at this resource is
   * `RestoreDefault`, serial port connection attempts will be allowed. - If no `Policy` is set at
   * this resource or anywhere higher in the resource hierarchy, serial port connection attempts
   * will be allowed. - If no `Policy` is set at this resource, but one exists higher in the
   * resource hierarchy, the behavior is as if the`Policy` were set at this resource. The following
   * examples demonstrate the different possible layerings: Example 1 (nearest `Constraint` wins):
   * `organizations/foo` has a `Policy` with: {enforced: false} `projects/bar` has no `Policy` set.
   * The constraint at `projects/bar` and `organizations/foo` will not be enforced. Example 2
   * (enforcement gets replaced): `organizations/foo` has a `Policy` with: {enforced: false}
   * `projects/bar` has a `Policy` with: {enforced: true} The constraint at `organizations/foo` is
   * not enforced. The constraint at `projects/bar` is enforced. Example 3 (RestoreDefault):
   * `organizations/foo` has a `Policy` with: {enforced: true} `projects/bar` has a `Policy` with:
   * {RestoreDefault: {}} The constraint at `organizations/foo` is enforced. The constraint at
   * `projects/bar` is not enforced, because `constraint_default` for the `Constraint` is `ALLOW`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enforced;

  /**
   * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable.
   * Suppose you have a `Constraint` `constraints/compute.disableSerialPortAccess` with
   * `constraint_default` set to `ALLOW`. A `Policy` for that `Constraint` exhibits the following
   * behavior: - If the `Policy` at this resource has enforced set to `false`, serial port
   * connection attempts will be allowed. - If the `Policy` at this resource has enforced set to
   * `true`, serial port connection attempts will be refused. - If the `Policy` at this resource is
   * `RestoreDefault`, serial port connection attempts will be allowed. - If no `Policy` is set at
   * this resource or anywhere higher in the resource hierarchy, serial port connection attempts
   * will be allowed. - If no `Policy` is set at this resource, but one exists higher in the
   * resource hierarchy, the behavior is as if the`Policy` were set at this resource. The following
   * examples demonstrate the different possible layerings: Example 1 (nearest `Constraint` wins):
   * `organizations/foo` has a `Policy` with: {enforced: false} `projects/bar` has no `Policy` set.
   * The constraint at `projects/bar` and `organizations/foo` will not be enforced. Example 2
   * (enforcement gets replaced): `organizations/foo` has a `Policy` with: {enforced: false}
   * `projects/bar` has a `Policy` with: {enforced: true} The constraint at `organizations/foo` is
   * not enforced. The constraint at `projects/bar` is enforced. Example 3 (RestoreDefault):
   * `organizations/foo` has a `Policy` with: {enforced: true} `projects/bar` has a `Policy` with:
   * {RestoreDefault: {}} The constraint at `organizations/foo` is enforced. The constraint at
   * `projects/bar` is not enforced, because `constraint_default` for the `Constraint` is `ALLOW`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnforced() {
    return enforced;
  }

  /**
   * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable.
   * Suppose you have a `Constraint` `constraints/compute.disableSerialPortAccess` with
   * `constraint_default` set to `ALLOW`. A `Policy` for that `Constraint` exhibits the following
   * behavior: - If the `Policy` at this resource has enforced set to `false`, serial port
   * connection attempts will be allowed. - If the `Policy` at this resource has enforced set to
   * `true`, serial port connection attempts will be refused. - If the `Policy` at this resource is
   * `RestoreDefault`, serial port connection attempts will be allowed. - If no `Policy` is set at
   * this resource or anywhere higher in the resource hierarchy, serial port connection attempts
   * will be allowed. - If no `Policy` is set at this resource, but one exists higher in the
   * resource hierarchy, the behavior is as if the`Policy` were set at this resource. The following
   * examples demonstrate the different possible layerings: Example 1 (nearest `Constraint` wins):
   * `organizations/foo` has a `Policy` with: {enforced: false} `projects/bar` has no `Policy` set.
   * The constraint at `projects/bar` and `organizations/foo` will not be enforced. Example 2
   * (enforcement gets replaced): `organizations/foo` has a `Policy` with: {enforced: false}
   * `projects/bar` has a `Policy` with: {enforced: true} The constraint at `organizations/foo` is
   * not enforced. The constraint at `projects/bar` is enforced. Example 3 (RestoreDefault):
   * `organizations/foo` has a `Policy` with: {enforced: true} `projects/bar` has a `Policy` with:
   * {RestoreDefault: {}} The constraint at `organizations/foo` is enforced. The constraint at
   * `projects/bar` is not enforced, because `constraint_default` for the `Constraint` is `ALLOW`.
   * @param enforced enforced or {@code null} for none
   */
  public GoogleCloudOrgpolicyV1BooleanPolicy setEnforced(java.lang.Boolean enforced) {
    this.enforced = enforced;
    return this;
  }

  @Override
  public GoogleCloudOrgpolicyV1BooleanPolicy set(String fieldName, Object value) {
    return (GoogleCloudOrgpolicyV1BooleanPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudOrgpolicyV1BooleanPolicy clone() {
    return (GoogleCloudOrgpolicyV1BooleanPolicy) super.clone();
  }

}
