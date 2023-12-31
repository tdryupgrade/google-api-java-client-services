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

package com.google.api.services.run.v1.model;

/**
 * RevisionSpec holds the desired state of the Revision (from the client).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RevisionSpec extends com.google.api.client.json.GenericJson {

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container instance of the Revision. Cloud Run fully managed: supported, defaults to 80 Cloud
   * Run for Anthos: supported, defaults to 0, which means concurrency to the application is not
   * limited, and the system decides the target concurrency for the autoscaler.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer containerConcurrency;

  /**
   * Containers holds the single container that defines the unit of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is
   * documented here: https://github.com/knative/serving/blob/main/docs/runtime-contract.md
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Container> containers;

  static {
    // hack to force ProGuard to consider Container used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Container.class);
  }

  /**
   * Indicates whether information about services should be injected into pod's environment
   * variables, matching the syntax of Docker links. Cloud Run fully managed: Not supported. Cloud
   * Run for Anthos: supported, defaults to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableServiceLinks;

  /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling
   * any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from
   * Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by
   * the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-
   * imagepullsecrets-on-a-pod Cloud Run fully managed: Not supported. Cloud Run for Anthos:
   * supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocalObjectReference> imagePullSecrets;

  static {
    // hack to force ProGuard to consider LocalObjectReference used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LocalObjectReference.class);
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountName;

  /**
   * TimeoutSeconds holds the max duration the instance is allowed for responding to a request.
   * Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600
   * seconds (1 hour). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed
   * value is configurable by the cluster operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeoutSeconds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container instance of the Revision. Cloud Run fully managed: supported, defaults to 80 Cloud
   * Run for Anthos: supported, defaults to 0, which means concurrency to the application is not
   * limited, and the system decides the target concurrency for the autoscaler.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContainerConcurrency() {
    return containerConcurrency;
  }

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container instance of the Revision. Cloud Run fully managed: supported, defaults to 80 Cloud
   * Run for Anthos: supported, defaults to 0, which means concurrency to the application is not
   * limited, and the system decides the target concurrency for the autoscaler.
   * @param containerConcurrency containerConcurrency or {@code null} for none
   */
  public RevisionSpec setContainerConcurrency(java.lang.Integer containerConcurrency) {
    this.containerConcurrency = containerConcurrency;
    return this;
  }

  /**
   * Containers holds the single container that defines the unit of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is
   * documented here: https://github.com/knative/serving/blob/main/docs/runtime-contract.md
   * @return value or {@code null} for none
   */
  public java.util.List<Container> getContainers() {
    return containers;
  }

  /**
   * Containers holds the single container that defines the unit of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is
   * documented here: https://github.com/knative/serving/blob/main/docs/runtime-contract.md
   * @param containers containers or {@code null} for none
   */
  public RevisionSpec setContainers(java.util.List<Container> containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Indicates whether information about services should be injected into pod's environment
   * variables, matching the syntax of Docker links. Cloud Run fully managed: Not supported. Cloud
   * Run for Anthos: supported, defaults to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableServiceLinks() {
    return enableServiceLinks;
  }

  /**
   * Indicates whether information about services should be injected into pod's environment
   * variables, matching the syntax of Docker links. Cloud Run fully managed: Not supported. Cloud
   * Run for Anthos: supported, defaults to true.
   * @param enableServiceLinks enableServiceLinks or {@code null} for none
   */
  public RevisionSpec setEnableServiceLinks(java.lang.Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
    return this;
  }

  /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling
   * any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from
   * Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by
   * the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-
   * imagepullsecrets-on-a-pod Cloud Run fully managed: Not supported. Cloud Run for Anthos:
   * supported.
   * @return value or {@code null} for none
   */
  public java.util.List<LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling
   * any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from
   * Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by
   * the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-
   * imagepullsecrets-on-a-pod Cloud Run fully managed: Not supported. Cloud Run for Anthos:
   * supported.
   * @param imagePullSecrets imagePullSecrets or {@code null} for none
   */
  public RevisionSpec setImagePullSecrets(java.util.List<LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountName() {
    return serviceAccountName;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * @param serviceAccountName serviceAccountName or {@code null} for none
   */
  public RevisionSpec setServiceAccountName(java.lang.String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * TimeoutSeconds holds the max duration the instance is allowed for responding to a request.
   * Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600
   * seconds (1 hour). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed
   * value is configurable by the cluster operator.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /**
   * TimeoutSeconds holds the max duration the instance is allowed for responding to a request.
   * Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600
   * seconds (1 hour). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed
   * value is configurable by the cluster operator.
   * @param timeoutSeconds timeoutSeconds or {@code null} for none
   */
  public RevisionSpec setTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * @param volumes volumes or {@code null} for none
   */
  public RevisionSpec setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  @Override
  public RevisionSpec set(String fieldName, Object value) {
    return (RevisionSpec) super.set(fieldName, value);
  }

  @Override
  public RevisionSpec clone() {
    return (RevisionSpec) super.clone();
  }

}
