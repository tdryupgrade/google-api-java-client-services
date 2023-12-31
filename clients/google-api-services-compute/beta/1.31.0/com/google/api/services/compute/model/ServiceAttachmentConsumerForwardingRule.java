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
 * [Output Only] A consumer forwarding rule connected to this service attachment. [Deprecated] Do
 * not use.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceAttachmentConsumerForwardingRule extends com.google.api.client.json.GenericJson {

  /**
   * The url of a consumer forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String forwardingRule;

  /**
   * The PSC connection id of the PSC Forwarding Rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger pscConnectionId;

  /**
   * The status of the forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The url of a consumer forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getForwardingRule() {
    return forwardingRule;
  }

  /**
   * The url of a consumer forwarding rule.
   * @param forwardingRule forwardingRule or {@code null} for none
   */
  public ServiceAttachmentConsumerForwardingRule setForwardingRule(java.lang.String forwardingRule) {
    this.forwardingRule = forwardingRule;
    return this;
  }

  /**
   * The PSC connection id of the PSC Forwarding Rule.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getPscConnectionId() {
    return pscConnectionId;
  }

  /**
   * The PSC connection id of the PSC Forwarding Rule.
   * @param pscConnectionId pscConnectionId or {@code null} for none
   */
  public ServiceAttachmentConsumerForwardingRule setPscConnectionId(java.math.BigInteger pscConnectionId) {
    this.pscConnectionId = pscConnectionId;
    return this;
  }

  /**
   * The status of the forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the forwarding rule.
   * @param status status or {@code null} for none
   */
  public ServiceAttachmentConsumerForwardingRule setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public ServiceAttachmentConsumerForwardingRule set(String fieldName, Object value) {
    return (ServiceAttachmentConsumerForwardingRule) super.set(fieldName, value);
  }

  @Override
  public ServiceAttachmentConsumerForwardingRule clone() {
    return (ServiceAttachmentConsumerForwardingRule) super.clone();
  }

}
