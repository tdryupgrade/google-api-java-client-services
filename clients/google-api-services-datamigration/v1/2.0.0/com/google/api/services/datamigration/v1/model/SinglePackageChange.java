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

package com.google.api.services.datamigration.v1.model;

/**
 * Options to configure rule type SinglePackageChange. The rule is used to alter the sql code for a
 * package entities. The rule filter field can refer to one entity. The rule scope can be: Package
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SinglePackageChange extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Sql code for package body
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageBody;

  /**
   * Optional. Sql code for package description
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageDescription;

  /**
   * Optional. Sql code for package body
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageBody() {
    return packageBody;
  }

  /**
   * Optional. Sql code for package body
   * @param packageBody packageBody or {@code null} for none
   */
  public SinglePackageChange setPackageBody(java.lang.String packageBody) {
    this.packageBody = packageBody;
    return this;
  }

  /**
   * Optional. Sql code for package description
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageDescription() {
    return packageDescription;
  }

  /**
   * Optional. Sql code for package description
   * @param packageDescription packageDescription or {@code null} for none
   */
  public SinglePackageChange setPackageDescription(java.lang.String packageDescription) {
    this.packageDescription = packageDescription;
    return this;
  }

  @Override
  public SinglePackageChange set(String fieldName, Object value) {
    return (SinglePackageChange) super.set(fieldName, value);
  }

  @Override
  public SinglePackageChange clone() {
    return (SinglePackageChange) super.clone();
  }

}
