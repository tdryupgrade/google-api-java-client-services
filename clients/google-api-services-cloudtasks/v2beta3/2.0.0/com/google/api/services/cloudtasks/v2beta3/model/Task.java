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

package com.google.api.services.cloudtasks.v2beta3.model;

/**
 * A unit of scheduled work.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Task extends com.google.api.client.json.GenericJson {

  /**
   * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has
   * AppEngineHttpRequest set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineHttpRequest appEngineHttpRequest;

  /**
   * Output only. The time that the task was created. `create_time` will be truncated to the nearest
   * second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The number of attempts dispatched. This count includes attempts which have been
   * dispatched but haven't received a response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dispatchCount;

  /**
   * The deadline for requests sent to the worker. If the worker does not respond by this deadline
   * then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud
   * Tasks will retry the task according to the RetryConfig. Note that when the request is
   * cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops
   * processing depends on the worker. For example, if the worker is stuck, it may not react to
   * cancelled requests. The default and maximum values depend on the type of request: * For HTTP
   * tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30
   * minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The
   * default deadline depends on the [scaling
   * type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-
   * managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling,
   * 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the
   * request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds].
   * Regardless of the task's `dispatch_deadline`, the app handler will not run for longer than than
   * the service's timeout. We recommend setting the `dispatch_deadline` to at most a few seconds
   * more than the app handler's timeout. For more information see
   * [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
   * `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an
   * approximate deadline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dispatchDeadline;

  /**
   * Output only. The status of the task's first attempt. Only dispatch_time will be set. The other
   * Attempt information is not retained by Cloud Tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Attempt firstAttempt;

  /**
   * HTTP request that is sent to the task's target. An HTTP task is a task that has HttpRequest
   * set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRequest httpRequest;

  /**
   * Output only. The status of the task's last attempt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Attempt lastAttempt;

  /**
   * Optionally caller-specified in CreateTask. The task name. The task name must have the following
   * format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` *
   * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or
   * periods (.). For more information, see [Identifying projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the task's location. The list of available locations can be obtained by
   * calling ListLocations. For more information, see https://cloud.google.com/about/locations/. *
   * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length
   * is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens
   * (-), or underscores (_). The maximum length is 500 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Pull Message contained in a task in a PULL queue type. This payload type cannot be explicitly
   * set through Cloud Tasks API. Its purpose, currently is to provide backward compatibility with
   * App Engine Task Queue
   * [pull](https://cloud.google.com/appengine/docs/standard/java/taskqueue/pull/) queues to provide
   * a way to inspect contents of pull tasks through the CloudTasks.GetTask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PullMessage pullMessage;

  /**
   * Output only. The number of attempts which have received a response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer responseCount;

  /**
   * The time when the task is scheduled to be attempted. For App Engine queues, this is when the
   * task will be attempted or retried. `schedule_time` will be truncated to the nearest
   * microsecond.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleTime;

  /**
   * Output only. The view specifies which subset of the Task has been returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String view;

  /**
   * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has
   * AppEngineHttpRequest set.
   * @return value or {@code null} for none
   */
  public AppEngineHttpRequest getAppEngineHttpRequest() {
    return appEngineHttpRequest;
  }

  /**
   * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has
   * AppEngineHttpRequest set.
   * @param appEngineHttpRequest appEngineHttpRequest or {@code null} for none
   */
  public Task setAppEngineHttpRequest(AppEngineHttpRequest appEngineHttpRequest) {
    this.appEngineHttpRequest = appEngineHttpRequest;
    return this;
  }

  /**
   * Output only. The time that the task was created. `create_time` will be truncated to the nearest
   * second.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time that the task was created. `create_time` will be truncated to the nearest
   * second.
   * @param createTime createTime or {@code null} for none
   */
  public Task setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The number of attempts dispatched. This count includes attempts which have been
   * dispatched but haven't received a response.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDispatchCount() {
    return dispatchCount;
  }

  /**
   * Output only. The number of attempts dispatched. This count includes attempts which have been
   * dispatched but haven't received a response.
   * @param dispatchCount dispatchCount or {@code null} for none
   */
  public Task setDispatchCount(java.lang.Integer dispatchCount) {
    this.dispatchCount = dispatchCount;
    return this;
  }

  /**
   * The deadline for requests sent to the worker. If the worker does not respond by this deadline
   * then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud
   * Tasks will retry the task according to the RetryConfig. Note that when the request is
   * cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops
   * processing depends on the worker. For example, if the worker is stuck, it may not react to
   * cancelled requests. The default and maximum values depend on the type of request: * For HTTP
   * tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30
   * minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The
   * default deadline depends on the [scaling
   * type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-
   * managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling,
   * 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the
   * request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds].
   * Regardless of the task's `dispatch_deadline`, the app handler will not run for longer than than
   * the service's timeout. We recommend setting the `dispatch_deadline` to at most a few seconds
   * more than the app handler's timeout. For more information see
   * [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
   * `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an
   * approximate deadline.
   * @return value or {@code null} for none
   */
  public String getDispatchDeadline() {
    return dispatchDeadline;
  }

  /**
   * The deadline for requests sent to the worker. If the worker does not respond by this deadline
   * then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud
   * Tasks will retry the task according to the RetryConfig. Note that when the request is
   * cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops
   * processing depends on the worker. For example, if the worker is stuck, it may not react to
   * cancelled requests. The default and maximum values depend on the type of request: * For HTTP
   * tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30
   * minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The
   * default deadline depends on the [scaling
   * type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-
   * managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling,
   * 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the
   * request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds].
   * Regardless of the task's `dispatch_deadline`, the app handler will not run for longer than than
   * the service's timeout. We recommend setting the `dispatch_deadline` to at most a few seconds
   * more than the app handler's timeout. For more information see
   * [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
   * `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an
   * approximate deadline.
   * @param dispatchDeadline dispatchDeadline or {@code null} for none
   */
  public Task setDispatchDeadline(String dispatchDeadline) {
    this.dispatchDeadline = dispatchDeadline;
    return this;
  }

  /**
   * Output only. The status of the task's first attempt. Only dispatch_time will be set. The other
   * Attempt information is not retained by Cloud Tasks.
   * @return value or {@code null} for none
   */
  public Attempt getFirstAttempt() {
    return firstAttempt;
  }

  /**
   * Output only. The status of the task's first attempt. Only dispatch_time will be set. The other
   * Attempt information is not retained by Cloud Tasks.
   * @param firstAttempt firstAttempt or {@code null} for none
   */
  public Task setFirstAttempt(Attempt firstAttempt) {
    this.firstAttempt = firstAttempt;
    return this;
  }

  /**
   * HTTP request that is sent to the task's target. An HTTP task is a task that has HttpRequest
   * set.
   * @return value or {@code null} for none
   */
  public HttpRequest getHttpRequest() {
    return httpRequest;
  }

  /**
   * HTTP request that is sent to the task's target. An HTTP task is a task that has HttpRequest
   * set.
   * @param httpRequest httpRequest or {@code null} for none
   */
  public Task setHttpRequest(HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
    return this;
  }

  /**
   * Output only. The status of the task's last attempt.
   * @return value or {@code null} for none
   */
  public Attempt getLastAttempt() {
    return lastAttempt;
  }

  /**
   * Output only. The status of the task's last attempt.
   * @param lastAttempt lastAttempt or {@code null} for none
   */
  public Task setLastAttempt(Attempt lastAttempt) {
    this.lastAttempt = lastAttempt;
    return this;
  }

  /**
   * Optionally caller-specified in CreateTask. The task name. The task name must have the following
   * format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` *
   * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or
   * periods (.). For more information, see [Identifying projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the task's location. The list of available locations can be obtained by
   * calling ListLocations. For more information, see https://cloud.google.com/about/locations/. *
   * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length
   * is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens
   * (-), or underscores (_). The maximum length is 500 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optionally caller-specified in CreateTask. The task name. The task name must have the following
   * format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` *
   * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or
   * periods (.). For more information, see [Identifying projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the task's location. The list of available locations can be obtained by
   * calling ListLocations. For more information, see https://cloud.google.com/about/locations/. *
   * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length
   * is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens
   * (-), or underscores (_). The maximum length is 500 characters.
   * @param name name or {@code null} for none
   */
  public Task setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Pull Message contained in a task in a PULL queue type. This payload type cannot be explicitly
   * set through Cloud Tasks API. Its purpose, currently is to provide backward compatibility with
   * App Engine Task Queue
   * [pull](https://cloud.google.com/appengine/docs/standard/java/taskqueue/pull/) queues to provide
   * a way to inspect contents of pull tasks through the CloudTasks.GetTask.
   * @return value or {@code null} for none
   */
  public PullMessage getPullMessage() {
    return pullMessage;
  }

  /**
   * Pull Message contained in a task in a PULL queue type. This payload type cannot be explicitly
   * set through Cloud Tasks API. Its purpose, currently is to provide backward compatibility with
   * App Engine Task Queue
   * [pull](https://cloud.google.com/appengine/docs/standard/java/taskqueue/pull/) queues to provide
   * a way to inspect contents of pull tasks through the CloudTasks.GetTask.
   * @param pullMessage pullMessage or {@code null} for none
   */
  public Task setPullMessage(PullMessage pullMessage) {
    this.pullMessage = pullMessage;
    return this;
  }

  /**
   * Output only. The number of attempts which have received a response.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResponseCount() {
    return responseCount;
  }

  /**
   * Output only. The number of attempts which have received a response.
   * @param responseCount responseCount or {@code null} for none
   */
  public Task setResponseCount(java.lang.Integer responseCount) {
    this.responseCount = responseCount;
    return this;
  }

  /**
   * The time when the task is scheduled to be attempted. For App Engine queues, this is when the
   * task will be attempted or retried. `schedule_time` will be truncated to the nearest
   * microsecond.
   * @return value or {@code null} for none
   */
  public String getScheduleTime() {
    return scheduleTime;
  }

  /**
   * The time when the task is scheduled to be attempted. For App Engine queues, this is when the
   * task will be attempted or retried. `schedule_time` will be truncated to the nearest
   * microsecond.
   * @param scheduleTime scheduleTime or {@code null} for none
   */
  public Task setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  /**
   * Output only. The view specifies which subset of the Task has been returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getView() {
    return view;
  }

  /**
   * Output only. The view specifies which subset of the Task has been returned.
   * @param view view or {@code null} for none
   */
  public Task setView(java.lang.String view) {
    this.view = view;
    return this;
  }

  @Override
  public Task set(String fieldName, Object value) {
    return (Task) super.set(fieldName, value);
  }

  @Override
  public Task clone() {
    return (Task) super.clone();
  }

}
