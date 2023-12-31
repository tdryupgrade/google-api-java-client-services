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

package com.google.api.services.aiplatform.v1.model;

/**
 * Attribution that explains a particular prediction output.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1Attribution extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Error of feature_attributions caused by approximation used in the explanation
   * method. Lower value means more precise attributions. * For Sampled Shapley attribution,
   * increasing path_count might reduce the error. * For Integrated Gradients attribution,
   * increasing step_count might reduce the error. * For XRAI attribution, increasing step_count
   * might reduce the error. See [this introduction](/vertex-ai/docs/explainable-ai/overview) for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double approximationError;

  /**
   * Output only. Model predicted output if the input instance is constructed from the baselines of
   * all the features defined in ExplanationMetadata.inputs. The field name of the output is
   * determined by the key in ExplanationMetadata.outputs. If the Model's predicted output has
   * multiple dimensions (rank > 1), this is the value in the output located by output_index. If
   * there are multiple baselines, their output values are averaged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double baselineOutputValue;

  /**
   * Output only. Attributions of each explained feature. Features are extracted from the prediction
   * instances according to explanation metadata for inputs. The value is a struct, whose keys are
   * the name of the feature. The values are how much the feature in the instance contributed to the
   * predicted result. The format of the value is determined by the feature's input format: * If the
   * feature is a scalar value, the attribution value is a floating number. * If the feature is an
   * array of scalar values, the attribution value is an array. * If the feature is a struct, the
   * attribution value is a struct. The keys in the attribution value struct are the same as the
   * keys in the feature struct. The formats of the values in the attribution struct are determined
   * by the formats of the values in the feature struct. The
   * ExplanationMetadata.feature_attributions_schema_uri field, pointed to by the ExplanationSpec
   * field of the Endpoint.deployed_models object, points to the schema file that describes the
   * features and their attribution values (if it is populated).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object featureAttributions;

  /**
   * Output only. Model predicted output on the corresponding explanation instance. The field name
   * of the output is determined by the key in ExplanationMetadata.outputs. If the Model predicted
   * output has multiple dimensions, this is the value in the output located by output_index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double instanceOutputValue;

  /**
   * Output only. The display name of the output identified by output_index. For example, the
   * predicted class name by a multi-classification Model. This field is only populated iff the
   * Model predicts display names as a separate field along with the explained output. The predicted
   * display name must has the same shape of the explained output, and can be located using
   * output_index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputDisplayName;

  /**
   * Output only. The index that locates the explained prediction output. If the prediction output
   * is a scalar value, output_index is not populated. If the prediction output has multiple
   * dimensions, the length of the output_index list is the same as the number of dimensions of the
   * output. The i-th element in output_index is the element index of the i-th dimension of the
   * output vector. Indices start from 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> outputIndex;

  /**
   * Output only. Name of the explain output. Specified as the key in ExplanationMetadata.outputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputName;

  /**
   * Output only. Error of feature_attributions caused by approximation used in the explanation
   * method. Lower value means more precise attributions. * For Sampled Shapley attribution,
   * increasing path_count might reduce the error. * For Integrated Gradients attribution,
   * increasing step_count might reduce the error. * For XRAI attribution, increasing step_count
   * might reduce the error. See [this introduction](/vertex-ai/docs/explainable-ai/overview) for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.Double getApproximationError() {
    return approximationError;
  }

  /**
   * Output only. Error of feature_attributions caused by approximation used in the explanation
   * method. Lower value means more precise attributions. * For Sampled Shapley attribution,
   * increasing path_count might reduce the error. * For Integrated Gradients attribution,
   * increasing step_count might reduce the error. * For XRAI attribution, increasing step_count
   * might reduce the error. See [this introduction](/vertex-ai/docs/explainable-ai/overview) for
   * more information.
   * @param approximationError approximationError or {@code null} for none
   */
  public GoogleCloudAiplatformV1Attribution setApproximationError(java.lang.Double approximationError) {
    this.approximationError = approximationError;
    return this;
  }

  /**
   * Output only. Model predicted output if the input instance is constructed from the baselines of
   * all the features defined in ExplanationMetadata.inputs. The field name of the output is
   * determined by the key in ExplanationMetadata.outputs. If the Model's predicted output has
   * multiple dimensions (rank > 1), this is the value in the output located by output_index. If
   * there are multiple baselines, their output values are averaged.
   * @return value or {@code null} for none
   */
  public java.lang.Double getBaselineOutputValue() {
    return baselineOutputValue;
  }

  /**
   * Output only. Model predicted output if the input instance is constructed from the baselines of
   * all the features defined in ExplanationMetadata.inputs. The field name of the output is
   * determined by the key in ExplanationMetadata.outputs. If the Model's predicted output has
   * multiple dimensions (rank > 1), this is the value in the output located by output_index. If
   * there are multiple baselines, their output values are averaged.
   * @param baselineOutputValue baselineOutputValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1Attribution setBaselineOutputValue(java.lang.Double baselineOutputValue) {
    this.baselineOutputValue = baselineOutputValue;
    return this;
  }

  /**
   * Output only. Attributions of each explained feature. Features are extracted from the prediction
   * instances according to explanation metadata for inputs. The value is a struct, whose keys are
   * the name of the feature. The values are how much the feature in the instance contributed to the
   * predicted result. The format of the value is determined by the feature's input format: * If the
   * feature is a scalar value, the attribution value is a floating number. * If the feature is an
   * array of scalar values, the attribution value is an array. * If the feature is a struct, the
   * attribution value is a struct. The keys in the attribution value struct are the same as the
   * keys in the feature struct. The formats of the values in the attribution struct are determined
   * by the formats of the values in the feature struct. The
   * ExplanationMetadata.feature_attributions_schema_uri field, pointed to by the ExplanationSpec
   * field of the Endpoint.deployed_models object, points to the schema file that describes the
   * features and their attribution values (if it is populated).
   * @return value or {@code null} for none
   */
  public java.lang.Object getFeatureAttributions() {
    return featureAttributions;
  }

  /**
   * Output only. Attributions of each explained feature. Features are extracted from the prediction
   * instances according to explanation metadata for inputs. The value is a struct, whose keys are
   * the name of the feature. The values are how much the feature in the instance contributed to the
   * predicted result. The format of the value is determined by the feature's input format: * If the
   * feature is a scalar value, the attribution value is a floating number. * If the feature is an
   * array of scalar values, the attribution value is an array. * If the feature is a struct, the
   * attribution value is a struct. The keys in the attribution value struct are the same as the
   * keys in the feature struct. The formats of the values in the attribution struct are determined
   * by the formats of the values in the feature struct. The
   * ExplanationMetadata.feature_attributions_schema_uri field, pointed to by the ExplanationSpec
   * field of the Endpoint.deployed_models object, points to the schema file that describes the
   * features and their attribution values (if it is populated).
   * @param featureAttributions featureAttributions or {@code null} for none
   */
  public GoogleCloudAiplatformV1Attribution setFeatureAttributions(java.lang.Object featureAttributions) {
    this.featureAttributions = featureAttributions;
    return this;
  }

  /**
   * Output only. Model predicted output on the corresponding explanation instance. The field name
   * of the output is determined by the key in ExplanationMetadata.outputs. If the Model predicted
   * output has multiple dimensions, this is the value in the output located by output_index.
   * @return value or {@code null} for none
   */
  public java.lang.Double getInstanceOutputValue() {
    return instanceOutputValue;
  }

  /**
   * Output only. Model predicted output on the corresponding explanation instance. The field name
   * of the output is determined by the key in ExplanationMetadata.outputs. If the Model predicted
   * output has multiple dimensions, this is the value in the output located by output_index.
   * @param instanceOutputValue instanceOutputValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1Attribution setInstanceOutputValue(java.lang.Double instanceOutputValue) {
    this.instanceOutputValue = instanceOutputValue;
    return this;
  }

  /**
   * Output only. The display name of the output identified by output_index. For example, the
   * predicted class name by a multi-classification Model. This field is only populated iff the
   * Model predicts display names as a separate field along with the explained output. The predicted
   * display name must has the same shape of the explained output, and can be located using
   * output_index.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputDisplayName() {
    return outputDisplayName;
  }

  /**
   * Output only. The display name of the output identified by output_index. For example, the
   * predicted class name by a multi-classification Model. This field is only populated iff the
   * Model predicts display names as a separate field along with the explained output. The predicted
   * display name must has the same shape of the explained output, and can be located using
   * output_index.
   * @param outputDisplayName outputDisplayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1Attribution setOutputDisplayName(java.lang.String outputDisplayName) {
    this.outputDisplayName = outputDisplayName;
    return this;
  }

  /**
   * Output only. The index that locates the explained prediction output. If the prediction output
   * is a scalar value, output_index is not populated. If the prediction output has multiple
   * dimensions, the length of the output_index list is the same as the number of dimensions of the
   * output. The i-th element in output_index is the element index of the i-th dimension of the
   * output vector. Indices start from 0.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getOutputIndex() {
    return outputIndex;
  }

  /**
   * Output only. The index that locates the explained prediction output. If the prediction output
   * is a scalar value, output_index is not populated. If the prediction output has multiple
   * dimensions, the length of the output_index list is the same as the number of dimensions of the
   * output. The i-th element in output_index is the element index of the i-th dimension of the
   * output vector. Indices start from 0.
   * @param outputIndex outputIndex or {@code null} for none
   */
  public GoogleCloudAiplatformV1Attribution setOutputIndex(java.util.List<java.lang.Integer> outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  /**
   * Output only. Name of the explain output. Specified as the key in ExplanationMetadata.outputs.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputName() {
    return outputName;
  }

  /**
   * Output only. Name of the explain output. Specified as the key in ExplanationMetadata.outputs.
   * @param outputName outputName or {@code null} for none
   */
  public GoogleCloudAiplatformV1Attribution setOutputName(java.lang.String outputName) {
    this.outputName = outputName;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1Attribution set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1Attribution) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1Attribution clone() {
    return (GoogleCloudAiplatformV1Attribution) super.clone();
  }

}
