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

package com.google.api.services.notebooks.v2.model;

/**
 * Definition of a custom Compute Engine virtual machine image for starting a notebook instance with
 * the environment installed directly on the VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VmImage extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Use this VM image family to find the image; the newest image in this family will be
   * used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String family;

  /**
   * Optional. Use VM image name to find the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The name of the Google Cloud project that this VM image belongs to. Format:
   * `{project_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * Optional. Use this VM image family to find the image; the newest image in this family will be
   * used.
   * @return value or {@code null} for none
   */
  public java.lang.String getFamily() {
    return family;
  }

  /**
   * Optional. Use this VM image family to find the image; the newest image in this family will be
   * used.
   * @param family family or {@code null} for none
   */
  public VmImage setFamily(java.lang.String family) {
    this.family = family;
    return this;
  }

  /**
   * Optional. Use VM image name to find the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. Use VM image name to find the image.
   * @param name name or {@code null} for none
   */
  public VmImage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The name of the Google Cloud project that this VM image belongs to. Format:
   * `{project_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * Required. The name of the Google Cloud project that this VM image belongs to. Format:
   * `{project_id}`
   * @param project project or {@code null} for none
   */
  public VmImage setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  @Override
  public VmImage set(String fieldName, Object value) {
    return (VmImage) super.set(fieldName, value);
  }

  @Override
  public VmImage clone() {
    return (VmImage) super.clone();
  }

}
