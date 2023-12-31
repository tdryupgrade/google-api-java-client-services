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
 * Model definition for TargetPoolsAddInstanceRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetPoolsAddInstanceRequest extends com.google.api.client.json.GenericJson {

  /**
   * A full or partial URL to an instance to add to this target pool. This can be a full or partial
   * URL. For example, the following are valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project-id/zones/zone /instances/instance-name -
   * projects/project-id/zones/zone/instances/instance-name - zones/zone/instances/instance-name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceReference> instances;

  static {
    // hack to force ProGuard to consider InstanceReference used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(InstanceReference.class);
  }

  /**
   * A full or partial URL to an instance to add to this target pool. This can be a full or partial
   * URL. For example, the following are valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project-id/zones/zone /instances/instance-name -
   * projects/project-id/zones/zone/instances/instance-name - zones/zone/instances/instance-name
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceReference> getInstances() {
    return instances;
  }

  /**
   * A full or partial URL to an instance to add to this target pool. This can be a full or partial
   * URL. For example, the following are valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project-id/zones/zone /instances/instance-name -
   * projects/project-id/zones/zone/instances/instance-name - zones/zone/instances/instance-name
   * @param instances instances or {@code null} for none
   */
  public TargetPoolsAddInstanceRequest setInstances(java.util.List<InstanceReference> instances) {
    this.instances = instances;
    return this;
  }

  @Override
  public TargetPoolsAddInstanceRequest set(String fieldName, Object value) {
    return (TargetPoolsAddInstanceRequest) super.set(fieldName, value);
  }

  @Override
  public TargetPoolsAddInstanceRequest clone() {
    return (TargetPoolsAddInstanceRequest) super.clone();
  }

}
