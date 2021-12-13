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

package com.google.api.services.container.v1beta1.model;

/**
 * Allows filtering to one or more specific event types. If event types are present, those and only
 * those event types will be transmitted to the cluster. Other types will be skipped. If no filter
 * is specified, or no event types are present, all event types will be sent
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Filter extends com.google.api.client.json.GenericJson {

  /**
   * Event types to allowlist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> eventType;

  /**
   * Event types to allowlist.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEventType() {
    return eventType;
  }

  /**
   * Event types to allowlist.
   * @param eventType eventType or {@code null} for none
   */
  public Filter setEventType(java.util.List<java.lang.String> eventType) {
    this.eventType = eventType;
    return this;
  }

  @Override
  public Filter set(String fieldName, Object value) {
    return (Filter) super.set(fieldName, value);
  }

  @Override
  public Filter clone() {
    return (Filter) super.clone();
  }

}
