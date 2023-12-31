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

package com.google.api.services.directory.model;

/**
 * JSON template for a feature instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FeatureInstance extends com.google.api.client.json.GenericJson {

  /**
   * The feature that this is an instance of. A calendar resource may have multiple instances of a
   * feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Feature feature;

  /**
   * The feature that this is an instance of. A calendar resource may have multiple instances of a
   * feature.
   * @return value or {@code null} for none
   */
  public Feature getFeature() {
    return feature;
  }

  /**
   * The feature that this is an instance of. A calendar resource may have multiple instances of a
   * feature.
   * @param feature feature or {@code null} for none
   */
  public FeatureInstance setFeature(Feature feature) {
    this.feature = feature;
    return this;
  }

  @Override
  public FeatureInstance set(String fieldName, Object value) {
    return (FeatureInstance) super.set(fieldName, value);
  }

  @Override
  public FeatureInstance clone() {
    return (FeatureInstance) super.clone();
  }

}
