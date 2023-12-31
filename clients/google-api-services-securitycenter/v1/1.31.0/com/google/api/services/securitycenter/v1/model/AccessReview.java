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

package com.google.api.services.securitycenter.v1.model;

/**
 * Conveys information about a Kubernetes access review (e.g. kubectl auth can-i ...) that was
 * involved in a finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessReview extends com.google.api.client.json.GenericJson {

  /**
   * Group is the API Group of the Resource. "*" means all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String group;

  /**
   * Name is the name of the resource being requested. Empty means all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Namespace of the action being requested. Currently, there is no distinction between no
   * namespace and all namespaces. Both are represented by "" (empty).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ns;

  /**
   * Resource is the optional resource type requested. "*" means all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * Subresource is the optional subresource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subresource;

  /**
   * Verb is a Kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.
   * "*" means all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verb;

  /**
   * Version is the API Version of the Resource. "*" means all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Group is the API Group of the Resource. "*" means all.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroup() {
    return group;
  }

  /**
   * Group is the API Group of the Resource. "*" means all.
   * @param group group or {@code null} for none
   */
  public AccessReview setGroup(java.lang.String group) {
    this.group = group;
    return this;
  }

  /**
   * Name is the name of the resource being requested. Empty means all.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name is the name of the resource being requested. Empty means all.
   * @param name name or {@code null} for none
   */
  public AccessReview setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace of the action being requested. Currently, there is no distinction between no
   * namespace and all namespaces. Both are represented by "" (empty).
   * @return value or {@code null} for none
   */
  public java.lang.String getNs() {
    return ns;
  }

  /**
   * Namespace of the action being requested. Currently, there is no distinction between no
   * namespace and all namespaces. Both are represented by "" (empty).
   * @param ns ns or {@code null} for none
   */
  public AccessReview setNs(java.lang.String ns) {
    this.ns = ns;
    return this;
  }

  /**
   * Resource is the optional resource type requested. "*" means all.
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Resource is the optional resource type requested. "*" means all.
   * @param resource resource or {@code null} for none
   */
  public AccessReview setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Subresource is the optional subresource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubresource() {
    return subresource;
  }

  /**
   * Subresource is the optional subresource type.
   * @param subresource subresource or {@code null} for none
   */
  public AccessReview setSubresource(java.lang.String subresource) {
    this.subresource = subresource;
    return this;
  }

  /**
   * Verb is a Kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.
   * "*" means all.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerb() {
    return verb;
  }

  /**
   * Verb is a Kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.
   * "*" means all.
   * @param verb verb or {@code null} for none
   */
  public AccessReview setVerb(java.lang.String verb) {
    this.verb = verb;
    return this;
  }

  /**
   * Version is the API Version of the Resource. "*" means all.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Version is the API Version of the Resource. "*" means all.
   * @param version version or {@code null} for none
   */
  public AccessReview setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public AccessReview set(String fieldName, Object value) {
    return (AccessReview) super.set(fieldName, value);
  }

  @Override
  public AccessReview clone() {
    return (AccessReview) super.clone();
  }

}
