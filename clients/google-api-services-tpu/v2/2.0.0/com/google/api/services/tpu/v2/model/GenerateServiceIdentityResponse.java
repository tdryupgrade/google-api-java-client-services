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

package com.google.api.services.tpu.v2.model;

/**
 * Response for GenerateServiceIdentity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateServiceIdentityResponse extends com.google.api.client.json.GenericJson {

  /**
   * ServiceIdentity that was created or retrieved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceIdentity identity;

  /**
   * ServiceIdentity that was created or retrieved.
   * @return value or {@code null} for none
   */
  public ServiceIdentity getIdentity() {
    return identity;
  }

  /**
   * ServiceIdentity that was created or retrieved.
   * @param identity identity or {@code null} for none
   */
  public GenerateServiceIdentityResponse setIdentity(ServiceIdentity identity) {
    this.identity = identity;
    return this;
  }

  @Override
  public GenerateServiceIdentityResponse set(String fieldName, Object value) {
    return (GenerateServiceIdentityResponse) super.set(fieldName, value);
  }

  @Override
  public GenerateServiceIdentityResponse clone() {
    return (GenerateServiceIdentityResponse) super.clone();
  }

}
