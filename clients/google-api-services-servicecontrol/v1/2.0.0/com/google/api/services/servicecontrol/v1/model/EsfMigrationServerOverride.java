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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Esf migration server override during chemist check v2 migration
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EsfMigrationServerOverride extends com.google.api.client.json.GenericJson {

  /**
   * Esf migration override mode
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overrideMode;

  /**
   * Esf migration override mode
   * @return value or {@code null} for none
   */
  public java.lang.String getOverrideMode() {
    return overrideMode;
  }

  /**
   * Esf migration override mode
   * @param overrideMode overrideMode or {@code null} for none
   */
  public EsfMigrationServerOverride setOverrideMode(java.lang.String overrideMode) {
    this.overrideMode = overrideMode;
    return this;
  }

  @Override
  public EsfMigrationServerOverride set(String fieldName, Object value) {
    return (EsfMigrationServerOverride) super.set(fieldName, value);
  }

  @Override
  public EsfMigrationServerOverride clone() {
    return (EsfMigrationServerOverride) super.clone();
  }

}
