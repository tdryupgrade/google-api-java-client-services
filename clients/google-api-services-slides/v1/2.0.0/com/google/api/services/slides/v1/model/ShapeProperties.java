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

package com.google.api.services.slides.v1.model;

/**
 * The properties of a Shape. If the shape is a placeholder shape as determined by the placeholder
 * field, then these properties may be inherited from a parent placeholder shape. Determining the
 * rendered value of the property depends on the corresponding property_state field value. Any text
 * autofit settings on the shape are automatically deactivated by requests that can impact how text
 * fits in the shape.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShapeProperties extends com.google.api.client.json.GenericJson {

  /**
   * The autofit properties of the shape. This property is only set for shapes that allow text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Autofit autofit;

  /**
   * The alignment of the content in the shape. If unspecified, the alignment is inherited from a
   * parent placeholder if it exists. If the shape has no parent, the default alignment matches the
   * alignment for new shapes created in the Slides editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentAlignment;

  /**
   * The hyperlink destination of the shape. If unset, there is no link. Links are not inherited
   * from parent placeholders.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Link link;

  /**
   * The outline of the shape. If unset, the outline is inherited from a parent placeholder if it
   * exists. If the shape has no parent, then the default outline depends on the shape type,
   * matching the defaults for new shapes created in the Slides editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Outline outline;

  /**
   * The shadow properties of the shape. If unset, the shadow is inherited from a parent placeholder
   * if it exists. If the shape has no parent, then the default shadow matches the defaults for new
   * shapes created in the Slides editor. This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Shadow shadow;

  /**
   * The background fill of the shape. If unset, the background fill is inherited from a parent
   * placeholder if it exists. If the shape has no parent, then the default background fill depends
   * on the shape type, matching the defaults for new shapes created in the Slides editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShapeBackgroundFill shapeBackgroundFill;

  /**
   * The autofit properties of the shape. This property is only set for shapes that allow text.
   * @return value or {@code null} for none
   */
  public Autofit getAutofit() {
    return autofit;
  }

  /**
   * The autofit properties of the shape. This property is only set for shapes that allow text.
   * @param autofit autofit or {@code null} for none
   */
  public ShapeProperties setAutofit(Autofit autofit) {
    this.autofit = autofit;
    return this;
  }

  /**
   * The alignment of the content in the shape. If unspecified, the alignment is inherited from a
   * parent placeholder if it exists. If the shape has no parent, the default alignment matches the
   * alignment for new shapes created in the Slides editor.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentAlignment() {
    return contentAlignment;
  }

  /**
   * The alignment of the content in the shape. If unspecified, the alignment is inherited from a
   * parent placeholder if it exists. If the shape has no parent, the default alignment matches the
   * alignment for new shapes created in the Slides editor.
   * @param contentAlignment contentAlignment or {@code null} for none
   */
  public ShapeProperties setContentAlignment(java.lang.String contentAlignment) {
    this.contentAlignment = contentAlignment;
    return this;
  }

  /**
   * The hyperlink destination of the shape. If unset, there is no link. Links are not inherited
   * from parent placeholders.
   * @return value or {@code null} for none
   */
  public Link getLink() {
    return link;
  }

  /**
   * The hyperlink destination of the shape. If unset, there is no link. Links are not inherited
   * from parent placeholders.
   * @param link link or {@code null} for none
   */
  public ShapeProperties setLink(Link link) {
    this.link = link;
    return this;
  }

  /**
   * The outline of the shape. If unset, the outline is inherited from a parent placeholder if it
   * exists. If the shape has no parent, then the default outline depends on the shape type,
   * matching the defaults for new shapes created in the Slides editor.
   * @return value or {@code null} for none
   */
  public Outline getOutline() {
    return outline;
  }

  /**
   * The outline of the shape. If unset, the outline is inherited from a parent placeholder if it
   * exists. If the shape has no parent, then the default outline depends on the shape type,
   * matching the defaults for new shapes created in the Slides editor.
   * @param outline outline or {@code null} for none
   */
  public ShapeProperties setOutline(Outline outline) {
    this.outline = outline;
    return this;
  }

  /**
   * The shadow properties of the shape. If unset, the shadow is inherited from a parent placeholder
   * if it exists. If the shape has no parent, then the default shadow matches the defaults for new
   * shapes created in the Slides editor. This property is read-only.
   * @return value or {@code null} for none
   */
  public Shadow getShadow() {
    return shadow;
  }

  /**
   * The shadow properties of the shape. If unset, the shadow is inherited from a parent placeholder
   * if it exists. If the shape has no parent, then the default shadow matches the defaults for new
   * shapes created in the Slides editor. This property is read-only.
   * @param shadow shadow or {@code null} for none
   */
  public ShapeProperties setShadow(Shadow shadow) {
    this.shadow = shadow;
    return this;
  }

  /**
   * The background fill of the shape. If unset, the background fill is inherited from a parent
   * placeholder if it exists. If the shape has no parent, then the default background fill depends
   * on the shape type, matching the defaults for new shapes created in the Slides editor.
   * @return value or {@code null} for none
   */
  public ShapeBackgroundFill getShapeBackgroundFill() {
    return shapeBackgroundFill;
  }

  /**
   * The background fill of the shape. If unset, the background fill is inherited from a parent
   * placeholder if it exists. If the shape has no parent, then the default background fill depends
   * on the shape type, matching the defaults for new shapes created in the Slides editor.
   * @param shapeBackgroundFill shapeBackgroundFill or {@code null} for none
   */
  public ShapeProperties setShapeBackgroundFill(ShapeBackgroundFill shapeBackgroundFill) {
    this.shapeBackgroundFill = shapeBackgroundFill;
    return this;
  }

  @Override
  public ShapeProperties set(String fieldName, Object value) {
    return (ShapeProperties) super.set(fieldName, value);
  }

  @Override
  public ShapeProperties clone() {
    return (ShapeProperties) super.clone();
  }

}
