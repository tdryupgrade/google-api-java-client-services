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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Represents a principal which possesses a particular, presumably secret, string. Useful for things
 * like "auth keys," used for anonymous sharing. Since representing this principal with the actual
 * secret included reveals the secret, it's best if the requisite condition is enforced in some
 * other way, for example via Keystore wrapping attributes (Keystore will unwrap only if the
 * specified secret, aka "attribute", is presented). All that's stored here is an identifying label.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SimpleSecretHolderProto extends com.google.api.client.json.GenericJson {

  /**
   * A descriptive label to help identify a relevant ACL entry or otherwise disambiguate this
   * instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SimpleSecretLabelProto label;

  /**
   * A descriptive label to help identify a relevant ACL entry or otherwise disambiguate this
   * instance.
   * @return value or {@code null} for none
   */
  public SimpleSecretLabelProto getLabel() {
    return label;
  }

  /**
   * A descriptive label to help identify a relevant ACL entry or otherwise disambiguate this
   * instance.
   * @param label label or {@code null} for none
   */
  public SimpleSecretHolderProto setLabel(SimpleSecretLabelProto label) {
    this.label = label;
    return this;
  }

  @Override
  public SimpleSecretHolderProto set(String fieldName, Object value) {
    return (SimpleSecretHolderProto) super.set(fieldName, value);
  }

  @Override
  public SimpleSecretHolderProto clone() {
    return (SimpleSecretHolderProto) super.clone();
  }

}
