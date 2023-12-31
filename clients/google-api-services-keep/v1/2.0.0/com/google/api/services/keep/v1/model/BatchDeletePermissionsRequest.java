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

package com.google.api.services.keep.v1.model;

/**
 * The request to remove one or more permissions from a note. A permission with the `OWNER` role
 * can't be removed. If removing a permission fails, then the entire request fails and no changes
 * are made. Returns a 400 bad request error if a specified permission does not exist on the note.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Keep API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchDeletePermissionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The names of the permissions to delete. Format:
   * `notes/{note}/permissions/{permission}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> names;

  /**
   * Required. The names of the permissions to delete. Format:
   * `notes/{note}/permissions/{permission}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNames() {
    return names;
  }

  /**
   * Required. The names of the permissions to delete. Format:
   * `notes/{note}/permissions/{permission}`
   * @param names names or {@code null} for none
   */
  public BatchDeletePermissionsRequest setNames(java.util.List<java.lang.String> names) {
    this.names = names;
    return this;
  }

  @Override
  public BatchDeletePermissionsRequest set(String fieldName, Object value) {
    return (BatchDeletePermissionsRequest) super.set(fieldName, value);
  }

  @Override
  public BatchDeletePermissionsRequest clone() {
    return (BatchDeletePermissionsRequest) super.clone();
  }

}
