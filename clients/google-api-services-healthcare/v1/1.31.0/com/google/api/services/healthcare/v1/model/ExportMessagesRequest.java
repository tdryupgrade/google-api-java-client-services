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

package com.google.api.services.healthcare.v1.model;

/**
 * Request to schedule an export.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportMessagesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The end of the range in `send_time` (MSH.7, https://www.hl7.org/documentcenter/public_temp_2E58
   * C1F9-1C23-BA17-0C6126475344DA9D/wg/conf/HL7MSH.htm) to process. If not specified, the time when
   * the export is scheduled is used. This value has to come after the `start_time` defined below.
   * Only messages whose `send_time` lies in the range `start_time` (inclusive) to `end_time`
   * (exclusive) are exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Export to a Cloud Storage destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsDestination gcsDestination;

  /**
   * The start of the range in `send_time` (MSH.7, https://www.hl7.org/documentcenter/public_temp_2E
   * 58C1F9-1C23-BA17-0C6126475344DA9D/wg/conf/HL7MSH.htm) to process. If not specified, the UNIX
   * epoch (1970-01-01T00:00:00Z) is used. This value has to come before the `end_time` defined
   * below. Only messages whose `send_time` lies in the range `start_time` (inclusive) to `end_time`
   * (exclusive) are exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The end of the range in `send_time` (MSH.7, https://www.hl7.org/documentcenter/public_temp_2E58
   * C1F9-1C23-BA17-0C6126475344DA9D/wg/conf/HL7MSH.htm) to process. If not specified, the time when
   * the export is scheduled is used. This value has to come after the `start_time` defined below.
   * Only messages whose `send_time` lies in the range `start_time` (inclusive) to `end_time`
   * (exclusive) are exported.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The end of the range in `send_time` (MSH.7, https://www.hl7.org/documentcenter/public_temp_2E58
   * C1F9-1C23-BA17-0C6126475344DA9D/wg/conf/HL7MSH.htm) to process. If not specified, the time when
   * the export is scheduled is used. This value has to come after the `start_time` defined below.
   * Only messages whose `send_time` lies in the range `start_time` (inclusive) to `end_time`
   * (exclusive) are exported.
   * @param endTime endTime or {@code null} for none
   */
  public ExportMessagesRequest setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Export to a Cloud Storage destination.
   * @return value or {@code null} for none
   */
  public GcsDestination getGcsDestination() {
    return gcsDestination;
  }

  /**
   * Export to a Cloud Storage destination.
   * @param gcsDestination gcsDestination or {@code null} for none
   */
  public ExportMessagesRequest setGcsDestination(GcsDestination gcsDestination) {
    this.gcsDestination = gcsDestination;
    return this;
  }

  /**
   * The start of the range in `send_time` (MSH.7, https://www.hl7.org/documentcenter/public_temp_2E
   * 58C1F9-1C23-BA17-0C6126475344DA9D/wg/conf/HL7MSH.htm) to process. If not specified, the UNIX
   * epoch (1970-01-01T00:00:00Z) is used. This value has to come before the `end_time` defined
   * below. Only messages whose `send_time` lies in the range `start_time` (inclusive) to `end_time`
   * (exclusive) are exported.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The start of the range in `send_time` (MSH.7, https://www.hl7.org/documentcenter/public_temp_2E
   * 58C1F9-1C23-BA17-0C6126475344DA9D/wg/conf/HL7MSH.htm) to process. If not specified, the UNIX
   * epoch (1970-01-01T00:00:00Z) is used. This value has to come before the `end_time` defined
   * below. Only messages whose `send_time` lies in the range `start_time` (inclusive) to `end_time`
   * (exclusive) are exported.
   * @param startTime startTime or {@code null} for none
   */
  public ExportMessagesRequest setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public ExportMessagesRequest set(String fieldName, Object value) {
    return (ExportMessagesRequest) super.set(fieldName, value);
  }

  @Override
  public ExportMessagesRequest clone() {
    return (ExportMessagesRequest) super.clone();
  }

}
