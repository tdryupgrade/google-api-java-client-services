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

package com.google.api.services.streetviewpublish.v1.model;

/**
 * Details related to ProcessingFailureReason#NOT_OUTDOORS. If there are multiple indoor frames
 * found, the first frame is recorded here.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotOutdoorsFailureDetails extends com.google.api.client.json.GenericJson {

  /**
   * Relative time (from the start of the video stream) when an indoor frame was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Relative time (from the start of the video stream) when an indoor frame was found.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Relative time (from the start of the video stream) when an indoor frame was found.
   * @param startTime startTime or {@code null} for none
   */
  public NotOutdoorsFailureDetails setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public NotOutdoorsFailureDetails set(String fieldName, Object value) {
    return (NotOutdoorsFailureDetails) super.set(fieldName, value);
  }

  @Override
  public NotOutdoorsFailureDetails clone() {
    return (NotOutdoorsFailureDetails) super.clone();
  }

}
