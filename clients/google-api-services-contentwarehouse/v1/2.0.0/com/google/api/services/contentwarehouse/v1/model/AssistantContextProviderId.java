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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Identifier used to represent a single application (a.k.a. provider). This model represents the
 * surface-agnostic counterpart for assistant.api.core_types.Provider. E.g. it should avoid directly
 * using package names for Android, bundle identifiers for iOS, etc. We require the transformation
 * between assistant.context.ProviderId and assistant.api.core_types.Provider to either be lossless,
 * or "lossy yet retrievable" (e.g. if package name is not available in ProviderId, it can still be
 * retrieved using the ProviderMappingsModule). NOTE: 1. As of May 2021, verticals are highly
 * fragmented in terms of how they represent/identify a provider, and so we may need to accommodate
 * some vertical-specific representations. However, these should be generalized as much as possible
 * so that they can be used by other verticals if needed. 2. If we need to differentiate between
 * whether a provider is a media provider, app actions provider, timer provider, etc. we should
 * capture this information in the context proto that contains a ProviderId field, rather than in
 * the ProviderId message itself. 3. Any common fields across different provider identifier
 * representations (e.g. ecosystem type) should be part of assistant.context.ProviderId directly.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantContextProviderId extends com.google.api.client.json.GenericJson {

  /**
   * TODO(b/241170835) Deprecate this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantContextAppProviderId appProviderId;

  /**
   * Ecosystem type for this provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ecosystemType;

  /**
   * DEPRECATED. Fields in MediaProviderId have been pulled out into separate fields in ProviderId
   * and ProviderMetadata. TODO(b/243953766) Deprecate this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantContextMediaProviderId mediaProviderId;

  /**
   * The MID of the provider. A MID is a unique identifier issued by Knowledge Graph for all
   * entities contained in its graph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * ID issued by the Provider Corpus to uniquely identify a provider entity e.g. an Android app, a
   * Cast app or a Cloud provider. In practice, a single partner can have multiple providers
   * entities. For more detail, see go/se-storage-provider-id. This is the preferred/ standardized
   * ID to use for ProviderId that all use-cases should eventually migrate to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long providerCorpusId;

  /**
   * Provider variant corresponding to the current provider. It's used together with mid to uniquely
   * identify provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantContextProviderVariant providerVariant;

  /**
   * TODO(b/241170835) Deprecate this field.
   * @return value or {@code null} for none
   */
  public AssistantContextAppProviderId getAppProviderId() {
    return appProviderId;
  }

  /**
   * TODO(b/241170835) Deprecate this field.
   * @param appProviderId appProviderId or {@code null} for none
   */
  public AssistantContextProviderId setAppProviderId(AssistantContextAppProviderId appProviderId) {
    this.appProviderId = appProviderId;
    return this;
  }

  /**
   * Ecosystem type for this provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getEcosystemType() {
    return ecosystemType;
  }

  /**
   * Ecosystem type for this provider.
   * @param ecosystemType ecosystemType or {@code null} for none
   */
  public AssistantContextProviderId setEcosystemType(java.lang.String ecosystemType) {
    this.ecosystemType = ecosystemType;
    return this;
  }

  /**
   * DEPRECATED. Fields in MediaProviderId have been pulled out into separate fields in ProviderId
   * and ProviderMetadata. TODO(b/243953766) Deprecate this field.
   * @return value or {@code null} for none
   */
  public AssistantContextMediaProviderId getMediaProviderId() {
    return mediaProviderId;
  }

  /**
   * DEPRECATED. Fields in MediaProviderId have been pulled out into separate fields in ProviderId
   * and ProviderMetadata. TODO(b/243953766) Deprecate this field.
   * @param mediaProviderId mediaProviderId or {@code null} for none
   */
  public AssistantContextProviderId setMediaProviderId(AssistantContextMediaProviderId mediaProviderId) {
    this.mediaProviderId = mediaProviderId;
    return this;
  }

  /**
   * The MID of the provider. A MID is a unique identifier issued by Knowledge Graph for all
   * entities contained in its graph.
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * The MID of the provider. A MID is a unique identifier issued by Knowledge Graph for all
   * entities contained in its graph.
   * @param mid mid or {@code null} for none
   */
  public AssistantContextProviderId setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * ID issued by the Provider Corpus to uniquely identify a provider entity e.g. an Android app, a
   * Cast app or a Cloud provider. In practice, a single partner can have multiple providers
   * entities. For more detail, see go/se-storage-provider-id. This is the preferred/ standardized
   * ID to use for ProviderId that all use-cases should eventually migrate to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProviderCorpusId() {
    return providerCorpusId;
  }

  /**
   * ID issued by the Provider Corpus to uniquely identify a provider entity e.g. an Android app, a
   * Cast app or a Cloud provider. In practice, a single partner can have multiple providers
   * entities. For more detail, see go/se-storage-provider-id. This is the preferred/ standardized
   * ID to use for ProviderId that all use-cases should eventually migrate to.
   * @param providerCorpusId providerCorpusId or {@code null} for none
   */
  public AssistantContextProviderId setProviderCorpusId(java.lang.Long providerCorpusId) {
    this.providerCorpusId = providerCorpusId;
    return this;
  }

  /**
   * Provider variant corresponding to the current provider. It's used together with mid to uniquely
   * identify provider.
   * @return value or {@code null} for none
   */
  public AssistantContextProviderVariant getProviderVariant() {
    return providerVariant;
  }

  /**
   * Provider variant corresponding to the current provider. It's used together with mid to uniquely
   * identify provider.
   * @param providerVariant providerVariant or {@code null} for none
   */
  public AssistantContextProviderId setProviderVariant(AssistantContextProviderVariant providerVariant) {
    this.providerVariant = providerVariant;
    return this;
  }

  @Override
  public AssistantContextProviderId set(String fieldName, Object value) {
    return (AssistantContextProviderId) super.set(fieldName, value);
  }

  @Override
  public AssistantContextProviderId clone() {
    return (AssistantContextProviderId) super.clone();
  }

}
