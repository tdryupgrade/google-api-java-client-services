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

package com.google.api.services.monitoring.v3.model;

/**
 * App Engine service. Learn more at https://cloud.google.com/appengine.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngine extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the App Engine module underlying this service. Corresponds to the module_id resource
   * label in the gae_app monitored resource
   * (https://cloud.google.com/monitoring/api/resources#tag_gae_app).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String moduleId;

  /**
   * The ID of the App Engine module underlying this service. Corresponds to the module_id resource
   * label in the gae_app monitored resource
   * (https://cloud.google.com/monitoring/api/resources#tag_gae_app).
   * @return value or {@code null} for none
   */
  public java.lang.String getModuleId() {
    return moduleId;
  }

  /**
   * The ID of the App Engine module underlying this service. Corresponds to the module_id resource
   * label in the gae_app monitored resource
   * (https://cloud.google.com/monitoring/api/resources#tag_gae_app).
   * @param moduleId moduleId or {@code null} for none
   */
  public AppEngine setModuleId(java.lang.String moduleId) {
    this.moduleId = moduleId;
    return this;
  }

  @Override
  public AppEngine set(String fieldName, Object value) {
    return (AppEngine) super.set(fieldName, value);
  }

  @Override
  public AppEngine clone() {
    return (AppEngine) super.clone();
  }

}
