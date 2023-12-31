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

package com.google.api.services.localservices.v1.model;

/**
 * Container for booking lead specific information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Local Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsHomeservicesLocalservicesV1BookingLead extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp of when service is provided by advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String bookingAppointmentTimestamp;

  /**
   * Consumer email associated with the booking lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerEmail;

  /**
   * Consumer phone number associated with the booking lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerPhoneNumber;

  /**
   * Name of the customer who created the lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerName;

  /**
   * The job type of the specified lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobType;

  /**
   * Timestamp of when service is provided by advertiser.
   * @return value or {@code null} for none
   */
  public String getBookingAppointmentTimestamp() {
    return bookingAppointmentTimestamp;
  }

  /**
   * Timestamp of when service is provided by advertiser.
   * @param bookingAppointmentTimestamp bookingAppointmentTimestamp or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1BookingLead setBookingAppointmentTimestamp(String bookingAppointmentTimestamp) {
    this.bookingAppointmentTimestamp = bookingAppointmentTimestamp;
    return this;
  }

  /**
   * Consumer email associated with the booking lead.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerEmail() {
    return consumerEmail;
  }

  /**
   * Consumer email associated with the booking lead.
   * @param consumerEmail consumerEmail or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1BookingLead setConsumerEmail(java.lang.String consumerEmail) {
    this.consumerEmail = consumerEmail;
    return this;
  }

  /**
   * Consumer phone number associated with the booking lead.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerPhoneNumber() {
    return consumerPhoneNumber;
  }

  /**
   * Consumer phone number associated with the booking lead.
   * @param consumerPhoneNumber consumerPhoneNumber or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1BookingLead setConsumerPhoneNumber(java.lang.String consumerPhoneNumber) {
    this.consumerPhoneNumber = consumerPhoneNumber;
    return this;
  }

  /**
   * Name of the customer who created the lead.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerName() {
    return customerName;
  }

  /**
   * Name of the customer who created the lead.
   * @param customerName customerName or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1BookingLead setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * The job type of the specified lead.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobType() {
    return jobType;
  }

  /**
   * The job type of the specified lead.
   * @param jobType jobType or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1BookingLead setJobType(java.lang.String jobType) {
    this.jobType = jobType;
    return this;
  }

  @Override
  public GoogleAdsHomeservicesLocalservicesV1BookingLead set(String fieldName, Object value) {
    return (GoogleAdsHomeservicesLocalservicesV1BookingLead) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsHomeservicesLocalservicesV1BookingLead clone() {
    return (GoogleAdsHomeservicesLocalservicesV1BookingLead) super.clone();
  }

}
