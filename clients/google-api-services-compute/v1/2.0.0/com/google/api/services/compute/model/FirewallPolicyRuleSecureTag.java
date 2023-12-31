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

package com.google.api.services.compute.model;

/**
 * Model definition for FirewallPolicyRuleSecureTag.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirewallPolicyRuleSecureTag extends com.google.api.client.json.GenericJson {

  /**
   * Name of the secure tag, created with TagManager's TagValue API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is
   * `INEFFECTIVE` when it is deleted or its network is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Name of the secure tag, created with TagManager's TagValue API.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the secure tag, created with TagManager's TagValue API.
   * @param name name or {@code null} for none
   */
  public FirewallPolicyRuleSecureTag setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is
   * `INEFFECTIVE` when it is deleted or its network is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is
   * `INEFFECTIVE` when it is deleted or its network is deleted.
   * @param state state or {@code null} for none
   */
  public FirewallPolicyRuleSecureTag setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public FirewallPolicyRuleSecureTag set(String fieldName, Object value) {
    return (FirewallPolicyRuleSecureTag) super.set(fieldName, value);
  }

  @Override
  public FirewallPolicyRuleSecureTag clone() {
    return (FirewallPolicyRuleSecureTag) super.clone();
  }

}
