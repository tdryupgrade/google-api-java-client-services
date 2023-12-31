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

package com.google.api.services.cloudbuild.v2.model;

/**
 * TimeoutFields allows granular specification of pipeline, task, and finally timeouts
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeoutFields extends com.google.api.client.json.GenericJson {

  /**
   * Finally sets the maximum allowed duration of this pipeline's finally
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("finally")
  private String finally__;

  /**
   * Pipeline sets the maximum allowed duration for execution of the entire pipeline. The sum of
   * individual timeouts for tasks and finally must not exceed this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String pipeline;

  /**
   * Tasks sets the maximum allowed duration of this pipeline's tasks
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String tasks;

  /**
   * Finally sets the maximum allowed duration of this pipeline's finally
   * @return value or {@code null} for none
   */
  public String getFinally() {
    return finally__;
  }

  /**
   * Finally sets the maximum allowed duration of this pipeline's finally
   * @param finally__ finally__ or {@code null} for none
   */
  public TimeoutFields setFinally(String finally__) {
    this.finally__ = finally__;
    return this;
  }

  /**
   * Pipeline sets the maximum allowed duration for execution of the entire pipeline. The sum of
   * individual timeouts for tasks and finally must not exceed this value.
   * @return value or {@code null} for none
   */
  public String getPipeline() {
    return pipeline;
  }

  /**
   * Pipeline sets the maximum allowed duration for execution of the entire pipeline. The sum of
   * individual timeouts for tasks and finally must not exceed this value.
   * @param pipeline pipeline or {@code null} for none
   */
  public TimeoutFields setPipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

  /**
   * Tasks sets the maximum allowed duration of this pipeline's tasks
   * @return value or {@code null} for none
   */
  public String getTasks() {
    return tasks;
  }

  /**
   * Tasks sets the maximum allowed duration of this pipeline's tasks
   * @param tasks tasks or {@code null} for none
   */
  public TimeoutFields setTasks(String tasks) {
    this.tasks = tasks;
    return this;
  }

  @Override
  public TimeoutFields set(String fieldName, Object value) {
    return (TimeoutFields) super.set(fieldName, value);
  }

  @Override
  public TimeoutFields clone() {
    return (TimeoutFields) super.clone();
  }

}
