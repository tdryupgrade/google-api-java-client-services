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

package com.google.api.services.binaryauthorization.v1.model;

/**
 * A Binary Authorization policy for a GKE cluster. This is one type of policy that can occur as a
 * `PlatformPolicy`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GkePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The `CheckSet` objects to apply, scoped by namespace or namespace and service
   * account. Exactly one `CheckSet` will be evaluated for a given Pod (unless the list is empty, in
   * which case the behavior is "always allow"). If multiple `CheckSet` objects have scopes that
   * match the namespace and service account of the Pod being evaluated, only the `CheckSet` with
   * the MOST SPECIFIC scope will match. `CheckSet` objects must be listed in order of decreasing
   * specificity, i.e. if a scope matches a given service account (which must include the
   * namespace), it must come before a `CheckSet` with a scope matching just that namespace. This
   * property is enforced by server-side validation. The purpose of this restriction is to ensure
   * that if more than one `CheckSet` matches a given Pod, the `CheckSet` that will be evaluated
   * will always be the first in the list to match (because if any other matches, it must be less
   * specific). If `check_sets` is empty, the default behavior is to allow all images. If
   * `check_sets` is non-empty, the last `check_sets` entry must always be a `CheckSet` with no
   * scope set, i.e. a catchall to handle any situation not caught by the preceding `CheckSet`
   * objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CheckSet> checkSets;

  static {
    // hack to force ProGuard to consider CheckSet used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CheckSet.class);
  }

  /**
   * Optional. Images exempted from this policy. If any of the patterns match the image being
   * evaluated, the rest of the policy will not be evaluated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageAllowlist imageAllowlist;

  /**
   * Optional. The `CheckSet` objects to apply, scoped by namespace or namespace and service
   * account. Exactly one `CheckSet` will be evaluated for a given Pod (unless the list is empty, in
   * which case the behavior is "always allow"). If multiple `CheckSet` objects have scopes that
   * match the namespace and service account of the Pod being evaluated, only the `CheckSet` with
   * the MOST SPECIFIC scope will match. `CheckSet` objects must be listed in order of decreasing
   * specificity, i.e. if a scope matches a given service account (which must include the
   * namespace), it must come before a `CheckSet` with a scope matching just that namespace. This
   * property is enforced by server-side validation. The purpose of this restriction is to ensure
   * that if more than one `CheckSet` matches a given Pod, the `CheckSet` that will be evaluated
   * will always be the first in the list to match (because if any other matches, it must be less
   * specific). If `check_sets` is empty, the default behavior is to allow all images. If
   * `check_sets` is non-empty, the last `check_sets` entry must always be a `CheckSet` with no
   * scope set, i.e. a catchall to handle any situation not caught by the preceding `CheckSet`
   * objects.
   * @return value or {@code null} for none
   */
  public java.util.List<CheckSet> getCheckSets() {
    return checkSets;
  }

  /**
   * Optional. The `CheckSet` objects to apply, scoped by namespace or namespace and service
   * account. Exactly one `CheckSet` will be evaluated for a given Pod (unless the list is empty, in
   * which case the behavior is "always allow"). If multiple `CheckSet` objects have scopes that
   * match the namespace and service account of the Pod being evaluated, only the `CheckSet` with
   * the MOST SPECIFIC scope will match. `CheckSet` objects must be listed in order of decreasing
   * specificity, i.e. if a scope matches a given service account (which must include the
   * namespace), it must come before a `CheckSet` with a scope matching just that namespace. This
   * property is enforced by server-side validation. The purpose of this restriction is to ensure
   * that if more than one `CheckSet` matches a given Pod, the `CheckSet` that will be evaluated
   * will always be the first in the list to match (because if any other matches, it must be less
   * specific). If `check_sets` is empty, the default behavior is to allow all images. If
   * `check_sets` is non-empty, the last `check_sets` entry must always be a `CheckSet` with no
   * scope set, i.e. a catchall to handle any situation not caught by the preceding `CheckSet`
   * objects.
   * @param checkSets checkSets or {@code null} for none
   */
  public GkePolicy setCheckSets(java.util.List<CheckSet> checkSets) {
    this.checkSets = checkSets;
    return this;
  }

  /**
   * Optional. Images exempted from this policy. If any of the patterns match the image being
   * evaluated, the rest of the policy will not be evaluated.
   * @return value or {@code null} for none
   */
  public ImageAllowlist getImageAllowlist() {
    return imageAllowlist;
  }

  /**
   * Optional. Images exempted from this policy. If any of the patterns match the image being
   * evaluated, the rest of the policy will not be evaluated.
   * @param imageAllowlist imageAllowlist or {@code null} for none
   */
  public GkePolicy setImageAllowlist(ImageAllowlist imageAllowlist) {
    this.imageAllowlist = imageAllowlist;
    return this;
  }

  @Override
  public GkePolicy set(String fieldName, Object value) {
    return (GkePolicy) super.set(fieldName, value);
  }

  @Override
  public GkePolicy clone() {
    return (GkePolicy) super.clone();
  }

}
