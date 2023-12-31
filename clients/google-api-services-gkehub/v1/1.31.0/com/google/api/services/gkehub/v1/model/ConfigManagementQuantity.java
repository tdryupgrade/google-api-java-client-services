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

package com.google.api.services.gkehub.v1.model;

/**
 * The view model of a single quantity, e.g. "800 MiB". Corresponds to https://github.com/kubernetes
 * /kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/generated.proto
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementQuantity extends com.google.api.client.json.GenericJson {

  /**
   * Stringified version of the quantity, e.g., "800 MiB".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("string")
  private java.lang.String string__;

  /**
   * Stringified version of the quantity, e.g., "800 MiB".
   * @return value or {@code null} for none
   */
  public java.lang.String getString() {
    return string__;
  }

  /**
   * Stringified version of the quantity, e.g., "800 MiB".
   * @param string__ string__ or {@code null} for none
   */
  public ConfigManagementQuantity setString(java.lang.String string__) {
    this.string__ = string__;
    return this;
  }

  @Override
  public ConfigManagementQuantity set(String fieldName, Object value) {
    return (ConfigManagementQuantity) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementQuantity clone() {
    return (ConfigManagementQuantity) super.clone();
  }

}
