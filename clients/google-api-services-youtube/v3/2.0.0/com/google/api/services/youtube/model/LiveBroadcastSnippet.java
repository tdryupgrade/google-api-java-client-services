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

package com.google.api.services.youtube.model;

/**
 * Basic broadcast information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveBroadcastSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The date and time that the broadcast actually ended. This information is only available once
   * the broadcast's state is complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime actualEndTime;

  /**
   * The date and time that the broadcast actually started. This information is only available once
   * the broadcast's state is live.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime actualStartTime;

  /**
   * The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The broadcast's description. As with the title, you can set this field by modifying the
   * broadcast resource or by setting the description field of the corresponding video resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Indicates whether this broadcast is the default broadcast. Internal only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefaultBroadcast;

  /**
   * The id of the live chat for this broadcast.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String liveChatId;

  /**
   * The date and time that the broadcast was added to YouTube's live broadcast schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime publishedAt;

  /**
   * The date and time that the broadcast is scheduled to end.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime scheduledEndTime;

  /**
   * The date and time that the broadcast is scheduled to start.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime scheduledStartTime;

  /**
   * A map of thumbnail images associated with the broadcast. For each nested object in this object,
   * the key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThumbnailDetails thumbnails;

  /**
   * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can
   * set this field by modifying the broadcast resource or by setting the title field of the
   * corresponding video resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The date and time that the broadcast actually ended. This information is only available once
   * the broadcast's state is complete.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getActualEndTime() {
    return actualEndTime;
  }

  /**
   * The date and time that the broadcast actually ended. This information is only available once
   * the broadcast's state is complete.
   * @param actualEndTime actualEndTime or {@code null} for none
   */
  public LiveBroadcastSnippet setActualEndTime(com.google.api.client.util.DateTime actualEndTime) {
    this.actualEndTime = actualEndTime;
    return this;
  }

  /**
   * The date and time that the broadcast actually started. This information is only available once
   * the broadcast's state is live.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getActualStartTime() {
    return actualStartTime;
  }

  /**
   * The date and time that the broadcast actually started. This information is only available once
   * the broadcast's state is live.
   * @param actualStartTime actualStartTime or {@code null} for none
   */
  public LiveBroadcastSnippet setActualStartTime(com.google.api.client.util.DateTime actualStartTime) {
    this.actualStartTime = actualStartTime;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast.
   * @param channelId channelId or {@code null} for none
   */
  public LiveBroadcastSnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The broadcast's description. As with the title, you can set this field by modifying the
   * broadcast resource or by setting the description field of the corresponding video resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The broadcast's description. As with the title, you can set this field by modifying the
   * broadcast resource or by setting the description field of the corresponding video resource.
   * @param description description or {@code null} for none
   */
  public LiveBroadcastSnippet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Indicates whether this broadcast is the default broadcast. Internal only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefaultBroadcast() {
    return isDefaultBroadcast;
  }

  /**
   * Indicates whether this broadcast is the default broadcast. Internal only.
   * @param isDefaultBroadcast isDefaultBroadcast or {@code null} for none
   */
  public LiveBroadcastSnippet setIsDefaultBroadcast(java.lang.Boolean isDefaultBroadcast) {
    this.isDefaultBroadcast = isDefaultBroadcast;
    return this;
  }

  /**
   * The id of the live chat for this broadcast.
   * @return value or {@code null} for none
   */
  public java.lang.String getLiveChatId() {
    return liveChatId;
  }

  /**
   * The id of the live chat for this broadcast.
   * @param liveChatId liveChatId or {@code null} for none
   */
  public LiveBroadcastSnippet setLiveChatId(java.lang.String liveChatId) {
    this.liveChatId = liveChatId;
    return this;
  }

  /**
   * The date and time that the broadcast was added to YouTube's live broadcast schedule.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time that the broadcast was added to YouTube's live broadcast schedule.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public LiveBroadcastSnippet setPublishedAt(com.google.api.client.util.DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The date and time that the broadcast is scheduled to end.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getScheduledEndTime() {
    return scheduledEndTime;
  }

  /**
   * The date and time that the broadcast is scheduled to end.
   * @param scheduledEndTime scheduledEndTime or {@code null} for none
   */
  public LiveBroadcastSnippet setScheduledEndTime(com.google.api.client.util.DateTime scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
    return this;
  }

  /**
   * The date and time that the broadcast is scheduled to start.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getScheduledStartTime() {
    return scheduledStartTime;
  }

  /**
   * The date and time that the broadcast is scheduled to start.
   * @param scheduledStartTime scheduledStartTime or {@code null} for none
   */
  public LiveBroadcastSnippet setScheduledStartTime(com.google.api.client.util.DateTime scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
    return this;
  }

  /**
   * A map of thumbnail images associated with the broadcast. For each nested object in this object,
   * the key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * @return value or {@code null} for none
   */
  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  /**
   * A map of thumbnail images associated with the broadcast. For each nested object in this object,
   * the key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * @param thumbnails thumbnails or {@code null} for none
   */
  public LiveBroadcastSnippet setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can
   * set this field by modifying the broadcast resource or by setting the title field of the
   * corresponding video resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can
   * set this field by modifying the broadcast resource or by setting the title field of the
   * corresponding video resource.
   * @param title title or {@code null} for none
   */
  public LiveBroadcastSnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public LiveBroadcastSnippet set(String fieldName, Object value) {
    return (LiveBroadcastSnippet) super.set(fieldName, value);
  }

  @Override
  public LiveBroadcastSnippet clone() {
    return (LiveBroadcastSnippet) super.clone();
  }

}
