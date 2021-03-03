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
 * Used in `policy_type` to specify how `list_policy` behaves at this resource. `ListPolicy` can
 * define specific values and subtrees of Cloud Resource Manager resource hierarchy
 * (`Organizations`, `Folders`, `Projects`) that are allowed or denied by setting the
 * `allowed_values` and `denied_values` fields. This is achieved by using the `under:` and optional
 * `is:` prefixes. The `under:` prefix is used to denote resource subtree values. The `is:` prefix
 * is used to denote specific values, and is required only if the value contains a ":". Values
 * prefixed with "is:" are treated the same as values with no prefix. Ancestry subtrees must be in
 * one of the following formats: - "projects/", e.g. "projects/tokyo-rain-123" - "folders/", e.g.
 * "folders/1234" - "organizations/", e.g. "organizations/1234" The `supports_under` field of the
 * associated `Constraint` defines whether ancestry prefixes can be used. You can set
 * `allowed_values` and `denied_values` in the same `Policy` if `all_values` is
 * `ALL_VALUES_UNSPECIFIED`. `ALLOW` or `DENY` are used to allow or deny all values. If `all_values`
 * is set to either `ALLOW` or `DENY`, `allowed_values` and `denied_values` must be unset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudOrgpolicyV1ListPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The policy all_values state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String allValues;

  /**
   * List of values allowed at this resource. Can only be set if `all_values` is set to
   * `ALL_VALUES_UNSPECIFIED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedValues;

  /**
   * List of values denied at this resource. Can only be set if `all_values` is set to
   * `ALL_VALUES_UNSPECIFIED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> deniedValues;

  /**
   * Determines the inheritance behavior for this `Policy`. By default, a `ListPolicy` set at a
   * resource supersedes any `Policy` set anywhere up the resource hierarchy. However, if
   * `inherit_from_parent` is set to `true`, then the values from the effective `Policy` of the
   * parent resource are inherited, meaning the values set in this `Policy` are added to the values
   * inherited up the hierarchy. Setting `Policy` hierarchies that inherit both allowed values and
   * denied values isn't recommended in most circumstances to keep the configuration simple and
   * understandable. However, it is possible to set a `Policy` with `allowed_values` set that
   * inherits a `Policy` with `denied_values` set. In this case, the values that are allowed must be
   * in `allowed_values` and not present in `denied_values`. For example, suppose you have a
   * `Constraint` `constraints/serviceuser.services`, which has a `constraint_type` of
   * `list_constraint`, and with `constraint_default` set to `ALLOW`. Suppose that at the
   * Organization level, a `Policy` is applied that restricts the allowed API activations to {`E1`,
   * `E2`}. Then, if a `Policy` is applied to a project below the Organization that has
   * `inherit_from_parent` set to `false` and field all_values set to DENY, then an attempt to
   * activate any API will be denied. The following examples demonstrate different possible
   * layerings for `projects/bar` parented by `organizations/foo`: Example 1 (no inherited values):
   * `organizations/foo` has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"}
   * `projects/bar` has `inherit_from_parent` `false` and values: {allowed_values: "E3"
   * allowed_values: "E4"} The accepted values at `organizations/foo` are `E1`, `E2`. The accepted
   * values at `projects/bar` are `E3`, and `E4`. Example 2 (inherited values): `organizations/foo`
   * has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"} `projects/bar` has a
   * `Policy` with values: {value: "E3" value: "E4" inherit_from_parent: true} The accepted values
   * at `organizations/foo` are `E1`, `E2`. The accepted values at `projects/bar` are `E1`, `E2`,
   * `E3`, and `E4`. Example 3 (inheriting both allowed and denied values): `organizations/foo` has
   * a `Policy` with values: {allowed_values: "E1" allowed_values: "E2"} `projects/bar` has a
   * `Policy` with: {denied_values: "E1"} The accepted values at `organizations/foo` are `E1`, `E2`.
   * The value accepted at `projects/bar` is `E2`. Example 4 (RestoreDefault): `organizations/foo`
   * has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"} `projects/bar` has a
   * `Policy` with values: {RestoreDefault: {}} The accepted values at `organizations/foo` are `E1`,
   * `E2`. The accepted values at `projects/bar` are either all or none depending on the value of
   * `constraint_default` (if `ALLOW`, all; if `DENY`, none). Example 5 (no policy inherits parent
   * policy): `organizations/foo` has no `Policy` set. `projects/bar` has no `Policy` set. The
   * accepted values at both levels are either all or none depending on the value of
   * `constraint_default` (if `ALLOW`, all; if `DENY`, none). Example 6 (ListConstraint allowing
   * all): `organizations/foo` has a `Policy` with values: {allowed_values: "E1" allowed_values:
   * "E2"} `projects/bar` has a `Policy` with: {all: ALLOW} The accepted values at
   * `organizations/foo` are `E1`, E2`. Any value is accepted at `projects/bar`. Example 7
   * (ListConstraint allowing none): `organizations/foo` has a `Policy` with values:
   * {allowed_values: "E1" allowed_values: "E2"} `projects/bar` has a `Policy` with: {all: DENY} The
   * accepted values at `organizations/foo` are `E1`, E2`. No value is accepted at `projects/bar`.
   * Example 10 (allowed and denied subtrees of Resource Manager hierarchy): Given the following
   * resource hierarchy O1->{F1, F2}; F1->{P1}; F2->{P2, P3}, `organizations/foo` has a `Policy`
   * with values: {allowed_values: "under:organizations/O1"} `projects/bar` has a `Policy` with:
   * {allowed_values: "under:projects/P3"} {denied_values: "under:folders/F2"} The accepted values
   * at `organizations/foo` are `organizations/O1`, `folders/F1`, `folders/F2`, `projects/P1`,
   * `projects/P2`, `projects/P3`. The accepted values at `projects/bar` are `organizations/O1`,
   * `folders/F1`, `projects/P1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean inheritFromParent;

  /**
   * Optional. The Google Cloud Console will try to default to a configuration that matches the
   * value specified in this `Policy`. If `suggested_value` is not set, it will inherit the value
   * specified higher in the hierarchy, unless `inherit_from_parent` is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestedValue;

  /**
   * The policy all_values state.
   * @return value or {@code null} for none
   */
  public java.lang.String getAllValues() {
    return allValues;
  }

  /**
   * The policy all_values state.
   * @param allValues allValues or {@code null} for none
   */
  public GoogleCloudOrgpolicyV1ListPolicy setAllValues(java.lang.String allValues) {
    this.allValues = allValues;
    return this;
  }

  /**
   * List of values allowed at this resource. Can only be set if `all_values` is set to
   * `ALL_VALUES_UNSPECIFIED`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedValues() {
    return allowedValues;
  }

  /**
   * List of values allowed at this resource. Can only be set if `all_values` is set to
   * `ALL_VALUES_UNSPECIFIED`.
   * @param allowedValues allowedValues or {@code null} for none
   */
  public GoogleCloudOrgpolicyV1ListPolicy setAllowedValues(java.util.List<java.lang.String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * List of values denied at this resource. Can only be set if `all_values` is set to
   * `ALL_VALUES_UNSPECIFIED`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDeniedValues() {
    return deniedValues;
  }

  /**
   * List of values denied at this resource. Can only be set if `all_values` is set to
   * `ALL_VALUES_UNSPECIFIED`.
   * @param deniedValues deniedValues or {@code null} for none
   */
  public GoogleCloudOrgpolicyV1ListPolicy setDeniedValues(java.util.List<java.lang.String> deniedValues) {
    this.deniedValues = deniedValues;
    return this;
  }

  /**
   * Determines the inheritance behavior for this `Policy`. By default, a `ListPolicy` set at a
   * resource supersedes any `Policy` set anywhere up the resource hierarchy. However, if
   * `inherit_from_parent` is set to `true`, then the values from the effective `Policy` of the
   * parent resource are inherited, meaning the values set in this `Policy` are added to the values
   * inherited up the hierarchy. Setting `Policy` hierarchies that inherit both allowed values and
   * denied values isn't recommended in most circumstances to keep the configuration simple and
   * understandable. However, it is possible to set a `Policy` with `allowed_values` set that
   * inherits a `Policy` with `denied_values` set. In this case, the values that are allowed must be
   * in `allowed_values` and not present in `denied_values`. For example, suppose you have a
   * `Constraint` `constraints/serviceuser.services`, which has a `constraint_type` of
   * `list_constraint`, and with `constraint_default` set to `ALLOW`. Suppose that at the
   * Organization level, a `Policy` is applied that restricts the allowed API activations to {`E1`,
   * `E2`}. Then, if a `Policy` is applied to a project below the Organization that has
   * `inherit_from_parent` set to `false` and field all_values set to DENY, then an attempt to
   * activate any API will be denied. The following examples demonstrate different possible
   * layerings for `projects/bar` parented by `organizations/foo`: Example 1 (no inherited values):
   * `organizations/foo` has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"}
   * `projects/bar` has `inherit_from_parent` `false` and values: {allowed_values: "E3"
   * allowed_values: "E4"} The accepted values at `organizations/foo` are `E1`, `E2`. The accepted
   * values at `projects/bar` are `E3`, and `E4`. Example 2 (inherited values): `organizations/foo`
   * has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"} `projects/bar` has a
   * `Policy` with values: {value: "E3" value: "E4" inherit_from_parent: true} The accepted values
   * at `organizations/foo` are `E1`, `E2`. The accepted values at `projects/bar` are `E1`, `E2`,
   * `E3`, and `E4`. Example 3 (inheriting both allowed and denied values): `organizations/foo` has
   * a `Policy` with values: {allowed_values: "E1" allowed_values: "E2"} `projects/bar` has a
   * `Policy` with: {denied_values: "E1"} The accepted values at `organizations/foo` are `E1`, `E2`.
   * The value accepted at `projects/bar` is `E2`. Example 4 (RestoreDefault): `organizations/foo`
   * has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"} `projects/bar` has a
   * `Policy` with values: {RestoreDefault: {}} The accepted values at `organizations/foo` are `E1`,
   * `E2`. The accepted values at `projects/bar` are either all or none depending on the value of
   * `constraint_default` (if `ALLOW`, all; if `DENY`, none). Example 5 (no policy inherits parent
   * policy): `organizations/foo` has no `Policy` set. `projects/bar` has no `Policy` set. The
   * accepted values at both levels are either all or none depending on the value of
   * `constraint_default` (if `ALLOW`, all; if `DENY`, none). Example 6 (ListConstraint allowing
   * all): `organizations/foo` has a `Policy` with values: {allowed_values: "E1" allowed_values:
   * "E2"} `projects/bar` has a `Policy` with: {all: ALLOW} The accepted values at
   * `organizations/foo` are `E1`, E2`. Any value is accepted at `projects/bar`. Example 7
   * (ListConstraint allowing none): `organizations/foo` has a `Policy` with values:
   * {allowed_values: "E1" allowed_values: "E2"} `projects/bar` has a `Policy` with: {all: DENY} The
   * accepted values at `organizations/foo` are `E1`, E2`. No value is accepted at `projects/bar`.
   * Example 10 (allowed and denied subtrees of Resource Manager hierarchy): Given the following
   * resource hierarchy O1->{F1, F2}; F1->{P1}; F2->{P2, P3}, `organizations/foo` has a `Policy`
   * with values: {allowed_values: "under:organizations/O1"} `projects/bar` has a `Policy` with:
   * {allowed_values: "under:projects/P3"} {denied_values: "under:folders/F2"} The accepted values
   * at `organizations/foo` are `organizations/O1`, `folders/F1`, `folders/F2`, `projects/P1`,
   * `projects/P2`, `projects/P3`. The accepted values at `projects/bar` are `organizations/O1`,
   * `folders/F1`, `projects/P1`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInheritFromParent() {
    return inheritFromParent;
  }

  /**
   * Determines the inheritance behavior for this `Policy`. By default, a `ListPolicy` set at a
   * resource supersedes any `Policy` set anywhere up the resource hierarchy. However, if
   * `inherit_from_parent` is set to `true`, then the values from the effective `Policy` of the
   * parent resource are inherited, meaning the values set in this `Policy` are added to the values
   * inherited up the hierarchy. Setting `Policy` hierarchies that inherit both allowed values and
   * denied values isn't recommended in most circumstances to keep the configuration simple and
   * understandable. However, it is possible to set a `Policy` with `allowed_values` set that
   * inherits a `Policy` with `denied_values` set. In this case, the values that are allowed must be
   * in `allowed_values` and not present in `denied_values`. For example, suppose you have a
   * `Constraint` `constraints/serviceuser.services`, which has a `constraint_type` of
   * `list_constraint`, and with `constraint_default` set to `ALLOW`. Suppose that at the
   * Organization level, a `Policy` is applied that restricts the allowed API activations to {`E1`,
   * `E2`}. Then, if a `Policy` is applied to a project below the Organization that has
   * `inherit_from_parent` set to `false` and field all_values set to DENY, then an attempt to
   * activate any API will be denied. The following examples demonstrate different possible
   * layerings for `projects/bar` parented by `organizations/foo`: Example 1 (no inherited values):
   * `organizations/foo` has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"}
   * `projects/bar` has `inherit_from_parent` `false` and values: {allowed_values: "E3"
   * allowed_values: "E4"} The accepted values at `organizations/foo` are `E1`, `E2`. The accepted
   * values at `projects/bar` are `E3`, and `E4`. Example 2 (inherited values): `organizations/foo`
   * has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"} `projects/bar` has a
   * `Policy` with values: {value: "E3" value: "E4" inherit_from_parent: true} The accepted values
   * at `organizations/foo` are `E1`, `E2`. The accepted values at `projects/bar` are `E1`, `E2`,
   * `E3`, and `E4`. Example 3 (inheriting both allowed and denied values): `organizations/foo` has
   * a `Policy` with values: {allowed_values: "E1" allowed_values: "E2"} `projects/bar` has a
   * `Policy` with: {denied_values: "E1"} The accepted values at `organizations/foo` are `E1`, `E2`.
   * The value accepted at `projects/bar` is `E2`. Example 4 (RestoreDefault): `organizations/foo`
   * has a `Policy` with values: {allowed_values: "E1" allowed_values:"E2"} `projects/bar` has a
   * `Policy` with values: {RestoreDefault: {}} The accepted values at `organizations/foo` are `E1`,
   * `E2`. The accepted values at `projects/bar` are either all or none depending on the value of
   * `constraint_default` (if `ALLOW`, all; if `DENY`, none). Example 5 (no policy inherits parent
   * policy): `organizations/foo` has no `Policy` set. `projects/bar` has no `Policy` set. The
   * accepted values at both levels are either all or none depending on the value of
   * `constraint_default` (if `ALLOW`, all; if `DENY`, none). Example 6 (ListConstraint allowing
   * all): `organizations/foo` has a `Policy` with values: {allowed_values: "E1" allowed_values:
   * "E2"} `projects/bar` has a `Policy` with: {all: ALLOW} The accepted values at
   * `organizations/foo` are `E1`, E2`. Any value is accepted at `projects/bar`. Example 7
   * (ListConstraint allowing none): `organizations/foo` has a `Policy` with values:
   * {allowed_values: "E1" allowed_values: "E2"} `projects/bar` has a `Policy` with: {all: DENY} The
   * accepted values at `organizations/foo` are `E1`, E2`. No value is accepted at `projects/bar`.
   * Example 10 (allowed and denied subtrees of Resource Manager hierarchy): Given the following
   * resource hierarchy O1->{F1, F2}; F1->{P1}; F2->{P2, P3}, `organizations/foo` has a `Policy`
   * with values: {allowed_values: "under:organizations/O1"} `projects/bar` has a `Policy` with:
   * {allowed_values: "under:projects/P3"} {denied_values: "under:folders/F2"} The accepted values
   * at `organizations/foo` are `organizations/O1`, `folders/F1`, `folders/F2`, `projects/P1`,
   * `projects/P2`, `projects/P3`. The accepted values at `projects/bar` are `organizations/O1`,
   * `folders/F1`, `projects/P1`.
   * @param inheritFromParent inheritFromParent or {@code null} for none
   */
  public GoogleCloudOrgpolicyV1ListPolicy setInheritFromParent(java.lang.Boolean inheritFromParent) {
    this.inheritFromParent = inheritFromParent;
    return this;
  }

  /**
   * Optional. The Google Cloud Console will try to default to a configuration that matches the
   * value specified in this `Policy`. If `suggested_value` is not set, it will inherit the value
   * specified higher in the hierarchy, unless `inherit_from_parent` is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestedValue() {
    return suggestedValue;
  }

  /**
   * Optional. The Google Cloud Console will try to default to a configuration that matches the
   * value specified in this `Policy`. If `suggested_value` is not set, it will inherit the value
   * specified higher in the hierarchy, unless `inherit_from_parent` is `false`.
   * @param suggestedValue suggestedValue or {@code null} for none
   */
  public GoogleCloudOrgpolicyV1ListPolicy setSuggestedValue(java.lang.String suggestedValue) {
    this.suggestedValue = suggestedValue;
    return this;
  }

  @Override
  public GoogleCloudOrgpolicyV1ListPolicy set(String fieldName, Object value) {
    return (GoogleCloudOrgpolicyV1ListPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudOrgpolicyV1ListPolicy clone() {
    return (GoogleCloudOrgpolicyV1ListPolicy) super.clone();
  }

}
