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
 * The mapping for the JobConfig.edit_list atoms with audio EditAtom.inputs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AudioMapping extends com.google.api.client.json.GenericJson {

  /**
   * Required. The EditAtom.key that references the atom with audio inputs in the
   * JobConfig.edit_list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String atomKey;

  /**
   * Audio volume control in dB. Negative values decrease volume, positive values increase. The
   * default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double gainDb;

  /**
   * Required. The zero-based index of the channel in the input audio stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer inputChannel;

  /**
   * Required. The Input.key that identifies the input file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputKey;

  /**
   * Required. The zero-based index of the track in the input file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer inputTrack;

  /**
   * Required. The zero-based index of the channel in the output audio stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer outputChannel;

  /**
   * Required. The EditAtom.key that references the atom with audio inputs in the
   * JobConfig.edit_list.
   * @return value or {@code null} for none
   */
  public java.lang.String getAtomKey() {
    return atomKey;
  }

  /**
   * Required. The EditAtom.key that references the atom with audio inputs in the
   * JobConfig.edit_list.
   * @param atomKey atomKey or {@code null} for none
   */
  public AudioMapping setAtomKey(java.lang.String atomKey) {
    this.atomKey = atomKey;
    return this;
  }

  /**
   * Audio volume control in dB. Negative values decrease volume, positive values increase. The
   * default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getGainDb() {
    return gainDb;
  }

  /**
   * Audio volume control in dB. Negative values decrease volume, positive values increase. The
   * default is 0.
   * @param gainDb gainDb or {@code null} for none
   */
  public AudioMapping setGainDb(java.lang.Double gainDb) {
    this.gainDb = gainDb;
    return this;
  }

  /**
   * Required. The zero-based index of the channel in the input audio stream.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInputChannel() {
    return inputChannel;
  }

  /**
   * Required. The zero-based index of the channel in the input audio stream.
   * @param inputChannel inputChannel or {@code null} for none
   */
  public AudioMapping setInputChannel(java.lang.Integer inputChannel) {
    this.inputChannel = inputChannel;
    return this;
  }

  /**
   * Required. The Input.key that identifies the input file.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputKey() {
    return inputKey;
  }

  /**
   * Required. The Input.key that identifies the input file.
   * @param inputKey inputKey or {@code null} for none
   */
  public AudioMapping setInputKey(java.lang.String inputKey) {
    this.inputKey = inputKey;
    return this;
  }

  /**
   * Required. The zero-based index of the track in the input file.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInputTrack() {
    return inputTrack;
  }

  /**
   * Required. The zero-based index of the track in the input file.
   * @param inputTrack inputTrack or {@code null} for none
   */
  public AudioMapping setInputTrack(java.lang.Integer inputTrack) {
    this.inputTrack = inputTrack;
    return this;
  }

  /**
   * Required. The zero-based index of the channel in the output audio stream.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOutputChannel() {
    return outputChannel;
  }

  /**
   * Required. The zero-based index of the channel in the output audio stream.
   * @param outputChannel outputChannel or {@code null} for none
   */
  public AudioMapping setOutputChannel(java.lang.Integer outputChannel) {
    this.outputChannel = outputChannel;
    return this;
  }

  @Override
  public AudioMapping set(String fieldName, Object value) {
    return (AudioMapping) super.set(fieldName, value);
  }

  @Override
  public AudioMapping clone() {
    return (AudioMapping) super.clone();
  }

}
