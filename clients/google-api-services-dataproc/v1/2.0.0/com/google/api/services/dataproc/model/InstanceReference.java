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

package com.google.api.services.dataproc.model;

/**
 * A reference to a Compute Engine instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceReference extends com.google.api.client.json.GenericJson {

  /**
   * The unique identifier of the Compute Engine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceId;

  /**
   * The user-friendly name of the Compute Engine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceName;

  /**
   * The public ECIES key used for sharing data with this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicEciesKey;

  /**
   * The public RSA key used for sharing data with this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicKey;

  /**
   * The unique identifier of the Compute Engine instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceId() {
    return instanceId;
  }

  /**
   * The unique identifier of the Compute Engine instance.
   * @param instanceId instanceId or {@code null} for none
   */
  public InstanceReference setInstanceId(java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The user-friendly name of the Compute Engine instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceName() {
    return instanceName;
  }

  /**
   * The user-friendly name of the Compute Engine instance.
   * @param instanceName instanceName or {@code null} for none
   */
  public InstanceReference setInstanceName(java.lang.String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * The public ECIES key used for sharing data with this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicEciesKey() {
    return publicEciesKey;
  }

  /**
   * The public ECIES key used for sharing data with this instance.
   * @param publicEciesKey publicEciesKey or {@code null} for none
   */
  public InstanceReference setPublicEciesKey(java.lang.String publicEciesKey) {
    this.publicEciesKey = publicEciesKey;
    return this;
  }

  /**
   * The public RSA key used for sharing data with this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicKey() {
    return publicKey;
  }

  /**
   * The public RSA key used for sharing data with this instance.
   * @param publicKey publicKey or {@code null} for none
   */
  public InstanceReference setPublicKey(java.lang.String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  @Override
  public InstanceReference set(String fieldName, Object value) {
    return (InstanceReference) super.set(fieldName, value);
  }

  @Override
  public InstanceReference clone() {
    return (InstanceReference) super.clone();
  }

}
