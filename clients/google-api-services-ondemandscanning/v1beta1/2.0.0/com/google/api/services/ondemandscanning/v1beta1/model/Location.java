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

package com.google.api.services.ondemandscanning.v1beta1.model;

/**
 * An occurrence of a particular package installation found within a system's filesystem. E.g.,
 * glibc was found in `/var/lib/dpkg/status`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Location extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpeUri;

  /**
   * The path from which we gathered that this package/version is installed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Deprecated. The version installed at this location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Version version;

  /**
   * Deprecated. The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
   * @return value or {@code null} for none
   */
  public java.lang.String getCpeUri() {
    return cpeUri;
  }

  /**
   * Deprecated. The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
   * @param cpeUri cpeUri or {@code null} for none
   */
  public Location setCpeUri(java.lang.String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

  /**
   * The path from which we gathered that this package/version is installed.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The path from which we gathered that this package/version is installed.
   * @param path path or {@code null} for none
   */
  public Location setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Deprecated. The version installed at this location.
   * @return value or {@code null} for none
   */
  public Version getVersion() {
    return version;
  }

  /**
   * Deprecated. The version installed at this location.
   * @param version version or {@code null} for none
   */
  public Location setVersion(Version version) {
    this.version = version;
    return this;
  }

  @Override
  public Location set(String fieldName, Object value) {
    return (Location) super.set(fieldName, value);
  }

  @Override
  public Location clone() {
    return (Location) super.clone();
  }

}
