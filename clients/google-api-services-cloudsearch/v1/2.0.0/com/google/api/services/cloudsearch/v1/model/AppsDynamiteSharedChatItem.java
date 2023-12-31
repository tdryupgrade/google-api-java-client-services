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
 * Next Id: 5
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteSharedChatItem extends com.google.api.client.json.GenericJson {

  /**
   * Information needed to render the specific type of feed item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsDynamiteSharedChatItemActivityInfo> activityInfo;

  /**
   * Only populated on read path and should not be persisted in storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedChatItemGroupInfo groupInfo;

  /**
   * Additional information about the original chat message that isn't captured in the top-level
   * message proto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedMessageInfo messageInfo;

  /**
   * Information needed to render the specific type of feed item.
   * @return value or {@code null} for none
   */
  public java.util.List<AppsDynamiteSharedChatItemActivityInfo> getActivityInfo() {
    return activityInfo;
  }

  /**
   * Information needed to render the specific type of feed item.
   * @param activityInfo activityInfo or {@code null} for none
   */
  public AppsDynamiteSharedChatItem setActivityInfo(java.util.List<AppsDynamiteSharedChatItemActivityInfo> activityInfo) {
    this.activityInfo = activityInfo;
    return this;
  }

  /**
   * Only populated on read path and should not be persisted in storage.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedChatItemGroupInfo getGroupInfo() {
    return groupInfo;
  }

  /**
   * Only populated on read path and should not be persisted in storage.
   * @param groupInfo groupInfo or {@code null} for none
   */
  public AppsDynamiteSharedChatItem setGroupInfo(AppsDynamiteSharedChatItemGroupInfo groupInfo) {
    this.groupInfo = groupInfo;
    return this;
  }

  /**
   * Additional information about the original chat message that isn't captured in the top-level
   * message proto.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedMessageInfo getMessageInfo() {
    return messageInfo;
  }

  /**
   * Additional information about the original chat message that isn't captured in the top-level
   * message proto.
   * @param messageInfo messageInfo or {@code null} for none
   */
  public AppsDynamiteSharedChatItem setMessageInfo(AppsDynamiteSharedMessageInfo messageInfo) {
    this.messageInfo = messageInfo;
    return this;
  }

  @Override
  public AppsDynamiteSharedChatItem set(String fieldName, Object value) {
    return (AppsDynamiteSharedChatItem) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteSharedChatItem clone() {
    return (AppsDynamiteSharedChatItem) super.clone();
  }

}
