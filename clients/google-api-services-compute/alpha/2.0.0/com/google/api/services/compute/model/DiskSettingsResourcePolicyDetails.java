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
 * This is the object for storing the detail information about the Resource Policy that will be set
 * as default ones for the Disks that is using the DiskSettings. It contains: - one target Resource
 * Policy referenced by its Fully-Qualified URL, - [output only] Disk Types that will be excluded
 * from using this Resource Policy, - Other filtering support (e.g. Label filtering) for Default
 * Resource Policy can be added here as well
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskSettingsResourcePolicyDetails extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] A list of Disk Types that will be excluded from applying the Resource Policy
   * referenced here. If absent, Disks created in any DiskType can use the referenced default
   * Resource Policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedDiskTypes;

  /**
   * The target Resource Policies identified by their Fully-Qualified URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourcePolicy;

  /**
   * [Output Only] A list of Disk Types that will be excluded from applying the Resource Policy
   * referenced here. If absent, Disks created in any DiskType can use the referenced default
   * Resource Policy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedDiskTypes() {
    return excludedDiskTypes;
  }

  /**
   * [Output Only] A list of Disk Types that will be excluded from applying the Resource Policy
   * referenced here. If absent, Disks created in any DiskType can use the referenced default
   * Resource Policy.
   * @param excludedDiskTypes excludedDiskTypes or {@code null} for none
   */
  public DiskSettingsResourcePolicyDetails setExcludedDiskTypes(java.util.List<java.lang.String> excludedDiskTypes) {
    this.excludedDiskTypes = excludedDiskTypes;
    return this;
  }

  /**
   * The target Resource Policies identified by their Fully-Qualified URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourcePolicy() {
    return resourcePolicy;
  }

  /**
   * The target Resource Policies identified by their Fully-Qualified URL.
   * @param resourcePolicy resourcePolicy or {@code null} for none
   */
  public DiskSettingsResourcePolicyDetails setResourcePolicy(java.lang.String resourcePolicy) {
    this.resourcePolicy = resourcePolicy;
    return this;
  }

  @Override
  public DiskSettingsResourcePolicyDetails set(String fieldName, Object value) {
    return (DiskSettingsResourcePolicyDetails) super.set(fieldName, value);
  }

  @Override
  public DiskSettingsResourcePolicyDetails clone() {
    return (DiskSettingsResourcePolicyDetails) super.clone();
  }

}
