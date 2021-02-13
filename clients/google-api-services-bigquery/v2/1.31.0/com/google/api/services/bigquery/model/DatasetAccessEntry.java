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

package com.google.api.services.bigquery.model;

/**
 * Model definition for DatasetAccessEntry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatasetAccessEntry extends com.google.api.client.json.GenericJson {

  /**
   * [Required] The dataset this entry applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatasetReference dataset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("target_types")
  private java.util.List<TargetTypes> targetTypes;

  static {
    // hack to force ProGuard to consider TargetTypes used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TargetTypes.class);
  }

  /**
   * [Required] The dataset this entry applies to.
   * @return value or {@code null} for none
   */
  public DatasetReference getDataset() {
    return dataset;
  }

  /**
   * [Required] The dataset this entry applies to.
   * @param dataset dataset or {@code null} for none
   */
  public DatasetAccessEntry setDataset(DatasetReference dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<TargetTypes> getTargetTypes() {
    return targetTypes;
  }

  /**
   * @param targetTypes targetTypes or {@code null} for none
   */
  public DatasetAccessEntry setTargetTypes(java.util.List<TargetTypes> targetTypes) {
    this.targetTypes = targetTypes;
    return this;
  }

  @Override
  public DatasetAccessEntry set(String fieldName, Object value) {
    return (DatasetAccessEntry) super.set(fieldName, value);
  }

  @Override
  public DatasetAccessEntry clone() {
    return (DatasetAccessEntry) super.clone();
  }

  /**
   * Model definition for DatasetAccessEntryTargetTypes.
   */
  public static final class TargetTypes extends com.google.api.client.json.GenericJson {

    /**
     * [Required] Which resources in the dataset this entry applies to. Currently, only views are
     * supported, but additional target types may be added in the future. Possible values: VIEWS: This
     * entry applies to all views in the dataset.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String targetType;

    /**
     * [Required] Which resources in the dataset this entry applies to. Currently, only views are
     * supported, but additional target types may be added in the future. Possible values: VIEWS: This
     * entry applies to all views in the dataset.
     * @return value or {@code null} for none
     */
    public java.lang.String getTargetType() {
      return targetType;
    }

    /**
     * [Required] Which resources in the dataset this entry applies to. Currently, only views are
     * supported, but additional target types may be added in the future. Possible values: VIEWS: This
     * entry applies to all views in the dataset.
     * @param targetType targetType or {@code null} for none
     */
    public TargetTypes setTargetType(java.lang.String targetType) {
      this.targetType = targetType;
      return this;
    }

    @Override
    public TargetTypes set(String fieldName, Object value) {
      return (TargetTypes) super.set(fieldName, value);
    }

    @Override
    public TargetTypes clone() {
      return (TargetTypes) super.clone();
    }

  }

}
