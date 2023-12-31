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

package com.google.api.services.cloudchannel.v1.model;

/**
 * Request message for CloudChannelService.UpdateChannelPartnerLink
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1UpdateChannelPartnerLinkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The channel partner link to update. Only channel_partner_link.link_state is allowed
   * for updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1ChannelPartnerLink channelPartnerLink;

  /**
   * Required. The update mask that applies to the resource. The only allowable value for an update
   * mask is channel_partner_link.link_state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The channel partner link to update. Only channel_partner_link.link_state is allowed
   * for updates.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1ChannelPartnerLink getChannelPartnerLink() {
    return channelPartnerLink;
  }

  /**
   * Required. The channel partner link to update. Only channel_partner_link.link_state is allowed
   * for updates.
   * @param channelPartnerLink channelPartnerLink or {@code null} for none
   */
  public GoogleCloudChannelV1UpdateChannelPartnerLinkRequest setChannelPartnerLink(GoogleCloudChannelV1ChannelPartnerLink channelPartnerLink) {
    this.channelPartnerLink = channelPartnerLink;
    return this;
  }

  /**
   * Required. The update mask that applies to the resource. The only allowable value for an update
   * mask is channel_partner_link.link_state.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Required. The update mask that applies to the resource. The only allowable value for an update
   * mask is channel_partner_link.link_state.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleCloudChannelV1UpdateChannelPartnerLinkRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleCloudChannelV1UpdateChannelPartnerLinkRequest set(String fieldName, Object value) {
    return (GoogleCloudChannelV1UpdateChannelPartnerLinkRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1UpdateChannelPartnerLinkRequest clone() {
    return (GoogleCloudChannelV1UpdateChannelPartnerLinkRequest) super.clone();
  }

}
