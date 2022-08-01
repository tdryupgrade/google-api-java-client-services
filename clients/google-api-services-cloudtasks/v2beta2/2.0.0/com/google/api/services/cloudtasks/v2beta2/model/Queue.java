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

package com.google.api.services.cloudtasks.v2beta2.model;

/**
 * A queue is a container of related tasks. Queues are configured to manage how those tasks are
 * dispatched. Configurable properties include rate limits, retry options, target types, and others.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Queue extends com.google.api.client.json.GenericJson {

  /**
   * App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineHttpTarget appEngineHttpTarget;

  /**
   * An http_target is used to override the target values for HTTP tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpTarget httpTarget;

  /**
   * Caller-specified and required in CreateQueue, after which it becomes output only. The queue
   * name. The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters
   * ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see
   * [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-
   * projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location.
   * The list of available locations can be obtained by calling ListLocations. For more information,
   * see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]),
   * numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Pull target. A pull queue is a queue that has a PullTarget.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PullTarget pullTarget;

  /**
   * Output only. The last time this queue was purged. All tasks that were created before this time
   * were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the
   * Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-
   * tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest
   * microsecond. Purge time will be unset if the queue has never been purged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String purgeTime;

  /**
   * Rate limits for task dispatches. rate_limits and retry_config are related because they both
   * control task attempts however they control how tasks are attempted in different ways: *
   * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched
   * from the queue, regardless of whether the dispatch is from a first attempt or a retry). *
   * retry_config controls what happens to particular a task after its first attempt fails. That is,
   * retry_config controls task retries (the second attempt, third attempt, etc).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RateLimits rateLimits;

  /**
   * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-
   * level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry
   * settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the
   * queue-level retry settings apply to all tasks in the queue which do not have retry settings
   * explicitly set on the task and were created by the App Engine SDK. See [App Engine
   * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-
   * tasks).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RetryConfig retryConfig;

  /**
   * Output only. The state of the queue. `state` can only be changed by called PauseQueue,
   * ResumeQueue, or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue
   * cannot be used to change `state`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The realtime, informational statistics for a queue. In order to receive the
   * statistics the caller should include this field in the FieldMask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueueStats stats;

  /**
   * The maximum amount of time that a task will be retained in this queue. Queues created by Cloud
   * Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task
   * will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues
   * created via queue.yaml/xml is equal to the maximum duration because there is a [storage
   * quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the
   * maximum valid duration, see the documentation for Duration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String taskTtl;

  /**
   * The task tombstone time to live (TTL). After a task is deleted or completed, the task's
   * tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is
   * used by task de-duplication; another task with the same name can't be created until the
   * tombstone has expired. For more information about task de-duplication, see the documentation
   * for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String tombstoneTtl;

  /**
   * App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
   * @return value or {@code null} for none
   */
  public AppEngineHttpTarget getAppEngineHttpTarget() {
    return appEngineHttpTarget;
  }

  /**
   * App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
   * @param appEngineHttpTarget appEngineHttpTarget or {@code null} for none
   */
  public Queue setAppEngineHttpTarget(AppEngineHttpTarget appEngineHttpTarget) {
    this.appEngineHttpTarget = appEngineHttpTarget;
    return this;
  }

  /**
   * An http_target is used to override the target values for HTTP tasks.
   * @return value or {@code null} for none
   */
  public HttpTarget getHttpTarget() {
    return httpTarget;
  }

  /**
   * An http_target is used to override the target values for HTTP tasks.
   * @param httpTarget httpTarget or {@code null} for none
   */
  public Queue setHttpTarget(HttpTarget httpTarget) {
    this.httpTarget = httpTarget;
    return this;
  }

  /**
   * Caller-specified and required in CreateQueue, after which it becomes output only. The queue
   * name. The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters
   * ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see
   * [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-
   * projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location.
   * The list of available locations can be obtained by calling ListLocations. For more information,
   * see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]),
   * numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Caller-specified and required in CreateQueue, after which it becomes output only. The queue
   * name. The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters
   * ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see
   * [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-
   * projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location.
   * The list of available locations can be obtained by calling ListLocations. For more information,
   * see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]),
   * numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
   * @param name name or {@code null} for none
   */
  public Queue setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Pull target. A pull queue is a queue that has a PullTarget.
   * @return value or {@code null} for none
   */
  public PullTarget getPullTarget() {
    return pullTarget;
  }

  /**
   * Pull target. A pull queue is a queue that has a PullTarget.
   * @param pullTarget pullTarget or {@code null} for none
   */
  public Queue setPullTarget(PullTarget pullTarget) {
    this.pullTarget = pullTarget;
    return this;
  }

  /**
   * Output only. The last time this queue was purged. All tasks that were created before this time
   * were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the
   * Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-
   * tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest
   * microsecond. Purge time will be unset if the queue has never been purged.
   * @return value or {@code null} for none
   */
  public String getPurgeTime() {
    return purgeTime;
  }

  /**
   * Output only. The last time this queue was purged. All tasks that were created before this time
   * were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the
   * Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-
   * tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest
   * microsecond. Purge time will be unset if the queue has never been purged.
   * @param purgeTime purgeTime or {@code null} for none
   */
  public Queue setPurgeTime(String purgeTime) {
    this.purgeTime = purgeTime;
    return this;
  }

  /**
   * Rate limits for task dispatches. rate_limits and retry_config are related because they both
   * control task attempts however they control how tasks are attempted in different ways: *
   * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched
   * from the queue, regardless of whether the dispatch is from a first attempt or a retry). *
   * retry_config controls what happens to particular a task after its first attempt fails. That is,
   * retry_config controls task retries (the second attempt, third attempt, etc).
   * @return value or {@code null} for none
   */
  public RateLimits getRateLimits() {
    return rateLimits;
  }

  /**
   * Rate limits for task dispatches. rate_limits and retry_config are related because they both
   * control task attempts however they control how tasks are attempted in different ways: *
   * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched
   * from the queue, regardless of whether the dispatch is from a first attempt or a retry). *
   * retry_config controls what happens to particular a task after its first attempt fails. That is,
   * retry_config controls task retries (the second attempt, third attempt, etc).
   * @param rateLimits rateLimits or {@code null} for none
   */
  public Queue setRateLimits(RateLimits rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  /**
   * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-
   * level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry
   * settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the
   * queue-level retry settings apply to all tasks in the queue which do not have retry settings
   * explicitly set on the task and were created by the App Engine SDK. See [App Engine
   * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-
   * tasks).
   * @return value or {@code null} for none
   */
  public RetryConfig getRetryConfig() {
    return retryConfig;
  }

  /**
   * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-
   * level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry
   * settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the
   * queue-level retry settings apply to all tasks in the queue which do not have retry settings
   * explicitly set on the task and were created by the App Engine SDK. See [App Engine
   * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-
   * tasks).
   * @param retryConfig retryConfig or {@code null} for none
   */
  public Queue setRetryConfig(RetryConfig retryConfig) {
    this.retryConfig = retryConfig;
    return this;
  }

  /**
   * Output only. The state of the queue. `state` can only be changed by called PauseQueue,
   * ResumeQueue, or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue
   * cannot be used to change `state`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the queue. `state` can only be changed by called PauseQueue,
   * ResumeQueue, or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue
   * cannot be used to change `state`.
   * @param state state or {@code null} for none
   */
  public Queue setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The realtime, informational statistics for a queue. In order to receive the
   * statistics the caller should include this field in the FieldMask.
   * @return value or {@code null} for none
   */
  public QueueStats getStats() {
    return stats;
  }

  /**
   * Output only. The realtime, informational statistics for a queue. In order to receive the
   * statistics the caller should include this field in the FieldMask.
   * @param stats stats or {@code null} for none
   */
  public Queue setStats(QueueStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * The maximum amount of time that a task will be retained in this queue. Queues created by Cloud
   * Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task
   * will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues
   * created via queue.yaml/xml is equal to the maximum duration because there is a [storage
   * quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the
   * maximum valid duration, see the documentation for Duration.
   * @return value or {@code null} for none
   */
  public String getTaskTtl() {
    return taskTtl;
  }

  /**
   * The maximum amount of time that a task will be retained in this queue. Queues created by Cloud
   * Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task
   * will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues
   * created via queue.yaml/xml is equal to the maximum duration because there is a [storage
   * quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the
   * maximum valid duration, see the documentation for Duration.
   * @param taskTtl taskTtl or {@code null} for none
   */
  public Queue setTaskTtl(String taskTtl) {
    this.taskTtl = taskTtl;
    return this;
  }

  /**
   * The task tombstone time to live (TTL). After a task is deleted or completed, the task's
   * tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is
   * used by task de-duplication; another task with the same name can't be created until the
   * tombstone has expired. For more information about task de-duplication, see the documentation
   * for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
   * @return value or {@code null} for none
   */
  public String getTombstoneTtl() {
    return tombstoneTtl;
  }

  /**
   * The task tombstone time to live (TTL). After a task is deleted or completed, the task's
   * tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is
   * used by task de-duplication; another task with the same name can't be created until the
   * tombstone has expired. For more information about task de-duplication, see the documentation
   * for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
   * @param tombstoneTtl tombstoneTtl or {@code null} for none
   */
  public Queue setTombstoneTtl(String tombstoneTtl) {
    this.tombstoneTtl = tombstoneTtl;
    return this;
  }

  @Override
  public Queue set(String fieldName, Object value) {
    return (Queue) super.set(fieldName, value);
  }

  @Override
  public Queue clone() {
    return (Queue) super.clone();
  }

}
