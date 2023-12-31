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
 * A widget that creates a UI item (for example, a drop-down list) with options for users to select.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteSharedSelectionInput extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsDynamiteSharedSelectionInputSelectionItem> items;

  /**
   * The label displayed ahead of the switch control.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * The name of the text input which is used in formInput.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If specified, the form is submitted when the selection changes. If not specified, you must
   * specify a separate button.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedAction onChangeAction;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AppsDynamiteSharedSelectionInputSelectionItem> getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public AppsDynamiteSharedSelectionInput setItems(java.util.List<AppsDynamiteSharedSelectionInputSelectionItem> items) {
    this.items = items;
    return this;
  }

  /**
   * The label displayed ahead of the switch control.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * The label displayed ahead of the switch control.
   * @param label label or {@code null} for none
   */
  public AppsDynamiteSharedSelectionInput setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * The name of the text input which is used in formInput.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the text input which is used in formInput.
   * @param name name or {@code null} for none
   */
  public AppsDynamiteSharedSelectionInput setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If specified, the form is submitted when the selection changes. If not specified, you must
   * specify a separate button.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedAction getOnChangeAction() {
    return onChangeAction;
  }

  /**
   * If specified, the form is submitted when the selection changes. If not specified, you must
   * specify a separate button.
   * @param onChangeAction onChangeAction or {@code null} for none
   */
  public AppsDynamiteSharedSelectionInput setOnChangeAction(AppsDynamiteSharedAction onChangeAction) {
    this.onChangeAction = onChangeAction;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public AppsDynamiteSharedSelectionInput setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AppsDynamiteSharedSelectionInput set(String fieldName, Object value) {
    return (AppsDynamiteSharedSelectionInput) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteSharedSelectionInput clone() {
    return (AppsDynamiteSharedSelectionInput) super.clone();
  }

}
