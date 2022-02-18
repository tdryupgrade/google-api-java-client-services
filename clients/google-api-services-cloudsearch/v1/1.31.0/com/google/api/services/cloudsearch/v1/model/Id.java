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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Identifies a particular object, including both Users and DirEntries. This Id is unique across the
 * entire server instance, such as the production or qa instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Id extends com.google.api.client.json.GenericJson {

  /**
   * The User account in which the DirEntry was originally created. If name_space==GAIA, then it's
   * the gaia_id of the user this id is referring to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger creatorUserId;

  /**
   * The local identifier for the DirEntry (local to the creator's account). local_id + app_name is
   * guaranteed to be unique within the creator account, but not across all User accounts. The
   * string is case sensitive. Ignore if name_space==GAIA. NB For name_space==COSMO, all local_id's
   * should be defined in google3/java/com/google/storage/cosmo/server/api/SpecialObjectIds.java as
   * they have a special predefined meaning. See
   * cosmo.client.CosmoIdFactory.createObjectId(long,String) for IMPORTANT recommendations when
   * generating IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localId;

  /**
   * The name space in which this id is unique (typically the application that created it). Values
   * should be drawn from the above enum, but for experimentation, use values greater than 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nameSpace;

  /**
   * The User account in which the DirEntry was originally created. If name_space==GAIA, then it's
   * the gaia_id of the user this id is referring to.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getCreatorUserId() {
    return creatorUserId;
  }

  /**
   * The User account in which the DirEntry was originally created. If name_space==GAIA, then it's
   * the gaia_id of the user this id is referring to.
   * @param creatorUserId creatorUserId or {@code null} for none
   */
  public Id setCreatorUserId(java.math.BigInteger creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  /**
   * The local identifier for the DirEntry (local to the creator's account). local_id + app_name is
   * guaranteed to be unique within the creator account, but not across all User accounts. The
   * string is case sensitive. Ignore if name_space==GAIA. NB For name_space==COSMO, all local_id's
   * should be defined in google3/java/com/google/storage/cosmo/server/api/SpecialObjectIds.java as
   * they have a special predefined meaning. See
   * cosmo.client.CosmoIdFactory.createObjectId(long,String) for IMPORTANT recommendations when
   * generating IDs.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalId() {
    return localId;
  }

  /**
   * The local identifier for the DirEntry (local to the creator's account). local_id + app_name is
   * guaranteed to be unique within the creator account, but not across all User accounts. The
   * string is case sensitive. Ignore if name_space==GAIA. NB For name_space==COSMO, all local_id's
   * should be defined in google3/java/com/google/storage/cosmo/server/api/SpecialObjectIds.java as
   * they have a special predefined meaning. See
   * cosmo.client.CosmoIdFactory.createObjectId(long,String) for IMPORTANT recommendations when
   * generating IDs.
   * @param localId localId or {@code null} for none
   */
  public Id setLocalId(java.lang.String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * The name space in which this id is unique (typically the application that created it). Values
   * should be drawn from the above enum, but for experimentation, use values greater than 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNameSpace() {
    return nameSpace;
  }

  /**
   * The name space in which this id is unique (typically the application that created it). Values
   * should be drawn from the above enum, but for experimentation, use values greater than 1000.
   * @param nameSpace nameSpace or {@code null} for none
   */
  public Id setNameSpace(java.lang.Integer nameSpace) {
    this.nameSpace = nameSpace;
    return this;
  }

  @Override
  public Id set(String fieldName, Object value) {
    return (Id) super.set(fieldName, value);
  }

  @Override
  public Id clone() {
    return (Id) super.clone();
  }

}
