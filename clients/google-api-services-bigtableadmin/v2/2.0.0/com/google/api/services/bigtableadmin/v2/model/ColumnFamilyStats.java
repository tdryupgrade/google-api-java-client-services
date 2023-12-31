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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Approximate statistics related to a single column family within a table. This information may
 * change rapidly, interpreting these values at a point in time may already preset out-of-date
 * information. Everything below is approximate, unless otherwise specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ColumnFamilyStats extends com.google.api.client.json.GenericJson {

  /**
   * How many cells are present per column qualifier in this column family, averaged over all rows
   * containing any column in the column family. e.g. For column family "family" in a table with 3
   * rows: * A row with 3 cells in "family:col" and 1 cell in "other:col" (3 cells / 1 column in
   * "family") * A row with 1 cell in "family:col", 7 cells in "family:other_col", and 7 cells in
   * "other:data" (8 cells / 2 columns in "family") * A row with 3 cells in "other:col" (0 columns
   * in "family", "family" not present) would report (3 + 8 + 0)/(1 + 2 + 0) = 3.66 in this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double averageCellsPerColumn;

  /**
   * How many column qualifiers are present in this column family, averaged over all rows in the
   * table. e.g. For column family "family" in a table with 3 rows: * A row with cells in
   * "family:col" and "other:col" (1 column in "family") * A row with cells in "family:col",
   * "family:other_col", and "other:data" (2 columns in "family") * A row with cells in "other:col"
   * (0 columns in "family", "family" not present) would report (1 + 2 + 0)/3 = 1.5 in this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double averageColumnsPerRow;

  /**
   * How much space the data in the column family occupies. This is roughly how many bytes would be
   * needed to read the contents of the entire column family (e.g. by streaming all contents out).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long logicalDataBytes;

  /**
   * How many cells are present per column qualifier in this column family, averaged over all rows
   * containing any column in the column family. e.g. For column family "family" in a table with 3
   * rows: * A row with 3 cells in "family:col" and 1 cell in "other:col" (3 cells / 1 column in
   * "family") * A row with 1 cell in "family:col", 7 cells in "family:other_col", and 7 cells in
   * "other:data" (8 cells / 2 columns in "family") * A row with 3 cells in "other:col" (0 columns
   * in "family", "family" not present) would report (3 + 8 + 0)/(1 + 2 + 0) = 3.66 in this field.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAverageCellsPerColumn() {
    return averageCellsPerColumn;
  }

  /**
   * How many cells are present per column qualifier in this column family, averaged over all rows
   * containing any column in the column family. e.g. For column family "family" in a table with 3
   * rows: * A row with 3 cells in "family:col" and 1 cell in "other:col" (3 cells / 1 column in
   * "family") * A row with 1 cell in "family:col", 7 cells in "family:other_col", and 7 cells in
   * "other:data" (8 cells / 2 columns in "family") * A row with 3 cells in "other:col" (0 columns
   * in "family", "family" not present) would report (3 + 8 + 0)/(1 + 2 + 0) = 3.66 in this field.
   * @param averageCellsPerColumn averageCellsPerColumn or {@code null} for none
   */
  public ColumnFamilyStats setAverageCellsPerColumn(java.lang.Double averageCellsPerColumn) {
    this.averageCellsPerColumn = averageCellsPerColumn;
    return this;
  }

  /**
   * How many column qualifiers are present in this column family, averaged over all rows in the
   * table. e.g. For column family "family" in a table with 3 rows: * A row with cells in
   * "family:col" and "other:col" (1 column in "family") * A row with cells in "family:col",
   * "family:other_col", and "other:data" (2 columns in "family") * A row with cells in "other:col"
   * (0 columns in "family", "family" not present) would report (1 + 2 + 0)/3 = 1.5 in this field.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAverageColumnsPerRow() {
    return averageColumnsPerRow;
  }

  /**
   * How many column qualifiers are present in this column family, averaged over all rows in the
   * table. e.g. For column family "family" in a table with 3 rows: * A row with cells in
   * "family:col" and "other:col" (1 column in "family") * A row with cells in "family:col",
   * "family:other_col", and "other:data" (2 columns in "family") * A row with cells in "other:col"
   * (0 columns in "family", "family" not present) would report (1 + 2 + 0)/3 = 1.5 in this field.
   * @param averageColumnsPerRow averageColumnsPerRow or {@code null} for none
   */
  public ColumnFamilyStats setAverageColumnsPerRow(java.lang.Double averageColumnsPerRow) {
    this.averageColumnsPerRow = averageColumnsPerRow;
    return this;
  }

  /**
   * How much space the data in the column family occupies. This is roughly how many bytes would be
   * needed to read the contents of the entire column family (e.g. by streaming all contents out).
   * @return value or {@code null} for none
   */
  public java.lang.Long getLogicalDataBytes() {
    return logicalDataBytes;
  }

  /**
   * How much space the data in the column family occupies. This is roughly how many bytes would be
   * needed to read the contents of the entire column family (e.g. by streaming all contents out).
   * @param logicalDataBytes logicalDataBytes or {@code null} for none
   */
  public ColumnFamilyStats setLogicalDataBytes(java.lang.Long logicalDataBytes) {
    this.logicalDataBytes = logicalDataBytes;
    return this;
  }

  @Override
  public ColumnFamilyStats set(String fieldName, Object value) {
    return (ColumnFamilyStats) super.set(fieldName, value);
  }

  @Override
  public ColumnFamilyStats clone() {
    return (ColumnFamilyStats) super.clone();
  }

}
