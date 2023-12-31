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
 * Edit atom.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EditAtom extends com.google.api.client.json.GenericJson {

  /**
   * End time in seconds for the atom, relative to the input file timeline. When `end_time_offset`
   * is not specified, the `inputs` are used until the end of the atom.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTimeOffset;

  /**
   * List of Input.key values identifying files that should be used in this atom. The listed
   * `inputs` must have the same timeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inputs;

  /**
   * A unique key for this atom. Must be specified when using advanced mapping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Start time in seconds for the atom, relative to the input file timeline. The default is `0s`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTimeOffset;

  /**
   * End time in seconds for the atom, relative to the input file timeline. When `end_time_offset`
   * is not specified, the `inputs` are used until the end of the atom.
   * @return value or {@code null} for none
   */
  public String getEndTimeOffset() {
    return endTimeOffset;
  }

  /**
   * End time in seconds for the atom, relative to the input file timeline. When `end_time_offset`
   * is not specified, the `inputs` are used until the end of the atom.
   * @param endTimeOffset endTimeOffset or {@code null} for none
   */
  public EditAtom setEndTimeOffset(String endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
    return this;
  }

  /**
   * List of Input.key values identifying files that should be used in this atom. The listed
   * `inputs` must have the same timeline.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInputs() {
    return inputs;
  }

  /**
   * List of Input.key values identifying files that should be used in this atom. The listed
   * `inputs` must have the same timeline.
   * @param inputs inputs or {@code null} for none
   */
  public EditAtom setInputs(java.util.List<java.lang.String> inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * A unique key for this atom. Must be specified when using advanced mapping.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * A unique key for this atom. Must be specified when using advanced mapping.
   * @param key key or {@code null} for none
   */
  public EditAtom setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Start time in seconds for the atom, relative to the input file timeline. The default is `0s`.
   * @return value or {@code null} for none
   */
  public String getStartTimeOffset() {
    return startTimeOffset;
  }

  /**
   * Start time in seconds for the atom, relative to the input file timeline. The default is `0s`.
   * @param startTimeOffset startTimeOffset or {@code null} for none
   */
  public EditAtom setStartTimeOffset(String startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
    return this;
  }

  @Override
  public EditAtom set(String fieldName, Object value) {
    return (EditAtom) super.set(fieldName, value);
  }

  @Override
  public EditAtom clone() {
    return (EditAtom) super.clone();
  }

}
