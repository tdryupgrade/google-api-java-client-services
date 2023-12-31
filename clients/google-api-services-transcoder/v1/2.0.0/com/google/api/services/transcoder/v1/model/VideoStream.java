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

package com.google.api.services.transcoder.v1.model;

/**
 * Video stream resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoStream extends com.google.api.client.json.GenericJson {

  /**
   * H264 codec settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private H264CodecSettings h264;

  /**
   * H265 codec settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private H265CodecSettings h265;

  /**
   * VP9 codec settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Vp9CodecSettings vp9;

  /**
   * H264 codec settings.
   * @return value or {@code null} for none
   */
  public H264CodecSettings getH264() {
    return h264;
  }

  /**
   * H264 codec settings.
   * @param h264 h264 or {@code null} for none
   */
  public VideoStream setH264(H264CodecSettings h264) {
    this.h264 = h264;
    return this;
  }

  /**
   * H265 codec settings.
   * @return value or {@code null} for none
   */
  public H265CodecSettings getH265() {
    return h265;
  }

  /**
   * H265 codec settings.
   * @param h265 h265 or {@code null} for none
   */
  public VideoStream setH265(H265CodecSettings h265) {
    this.h265 = h265;
    return this;
  }

  /**
   * VP9 codec settings.
   * @return value or {@code null} for none
   */
  public Vp9CodecSettings getVp9() {
    return vp9;
  }

  /**
   * VP9 codec settings.
   * @param vp9 vp9 or {@code null} for none
   */
  public VideoStream setVp9(Vp9CodecSettings vp9) {
    this.vp9 = vp9;
    return this;
  }

  @Override
  public VideoStream set(String fieldName, Object value) {
    return (VideoStream) super.set(fieldName, value);
  }

  @Override
  public VideoStream clone() {
    return (VideoStream) super.clone();
  }

}
