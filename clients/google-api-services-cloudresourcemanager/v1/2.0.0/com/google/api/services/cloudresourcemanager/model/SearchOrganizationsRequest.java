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

package com.google.api.services.cloudresourcemanager.model;

/**
 * The request sent to the `SearchOrganizations` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchOrganizationsRequest extends com.google.api.client.json.GenericJson {

  /**
   * An optional query string used to filter the Organizations to return in the response. Filter
   * rules are case-insensitive. Organizations may be filtered by `owner.directoryCustomerId` or by
   * `domain`, where the domain is a G Suite domain, for example: * Filter
   * `owner.directorycustomerid:123456789` returns Organization resources with
   * `owner.directory_customer_id` equal to `123456789`. * Filter `domain:google.com` returns
   * Organization resources corresponding to the domain `google.com`. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * The maximum number of Organizations to return in the response. The server can return fewer
   * organizations than requested. If unspecified, server picks an appropriate default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A pagination token returned from a previous call to `SearchOrganizations` that indicates from
   * where listing should continue. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * An optional query string used to filter the Organizations to return in the response. Filter
   * rules are case-insensitive. Organizations may be filtered by `owner.directoryCustomerId` or by
   * `domain`, where the domain is a G Suite domain, for example: * Filter
   * `owner.directorycustomerid:123456789` returns Organization resources with
   * `owner.directory_customer_id` equal to `123456789`. * Filter `domain:google.com` returns
   * Organization resources corresponding to the domain `google.com`. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * An optional query string used to filter the Organizations to return in the response. Filter
   * rules are case-insensitive. Organizations may be filtered by `owner.directoryCustomerId` or by
   * `domain`, where the domain is a G Suite domain, for example: * Filter
   * `owner.directorycustomerid:123456789` returns Organization resources with
   * `owner.directory_customer_id` equal to `123456789`. * Filter `domain:google.com` returns
   * Organization resources corresponding to the domain `google.com`. This field is optional.
   * @param filter filter or {@code null} for none
   */
  public SearchOrganizationsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The maximum number of Organizations to return in the response. The server can return fewer
   * organizations than requested. If unspecified, server picks an appropriate default.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * The maximum number of Organizations to return in the response. The server can return fewer
   * organizations than requested. If unspecified, server picks an appropriate default.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchOrganizationsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A pagination token returned from a previous call to `SearchOrganizations` that indicates from
   * where listing should continue. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A pagination token returned from a previous call to `SearchOrganizations` that indicates from
   * where listing should continue. This field is optional.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchOrganizationsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  @Override
  public SearchOrganizationsRequest set(String fieldName, Object value) {
    return (SearchOrganizationsRequest) super.set(fieldName, value);
  }

  @Override
  public SearchOrganizationsRequest clone() {
    return (SearchOrganizationsRequest) super.clone();
  }

}
