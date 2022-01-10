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

package com.google.api.services.metastore.v1alpha.model;

/**
 * Specifies configuration information specific to running Hive metastore software as the metastore
 * service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HiveMetastoreConfig extends com.google.api.client.json.GenericJson {

  /**
   * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore
   * (configured in hive-site.xml). The mappings override system defaults (some keys cannot be
   * overridden). These overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's AuxiliaryVersionConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> configOverrides;

  /**
   * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endpointProtocol;

  /**
   * Information used to configure the Hive metastore service as a service principal in a Kerberos
   * realm. To disable Kerberos, use the UpdateService method and specify this field's path
   * (hive_metastore_config.kerberos_config) in the request's update_mask while omitting this field
   * from the request's service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KerberosConfig kerberosConfig;

  /**
   * Immutable. The Hive metastore schema version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore
   * (configured in hive-site.xml). The mappings override system defaults (some keys cannot be
   * overridden). These overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's AuxiliaryVersionConfig.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getConfigOverrides() {
    return configOverrides;
  }

  /**
   * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore
   * (configured in hive-site.xml). The mappings override system defaults (some keys cannot be
   * overridden). These overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's AuxiliaryVersionConfig.
   * @param configOverrides configOverrides or {@code null} for none
   */
  public HiveMetastoreConfig setConfigOverrides(java.util.Map<String, java.lang.String> configOverrides) {
    this.configOverrides = configOverrides;
    return this;
  }

  /**
   * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndpointProtocol() {
    return endpointProtocol;
  }

  /**
   * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
   * @param endpointProtocol endpointProtocol or {@code null} for none
   */
  public HiveMetastoreConfig setEndpointProtocol(java.lang.String endpointProtocol) {
    this.endpointProtocol = endpointProtocol;
    return this;
  }

  /**
   * Information used to configure the Hive metastore service as a service principal in a Kerberos
   * realm. To disable Kerberos, use the UpdateService method and specify this field's path
   * (hive_metastore_config.kerberos_config) in the request's update_mask while omitting this field
   * from the request's service.
   * @return value or {@code null} for none
   */
  public KerberosConfig getKerberosConfig() {
    return kerberosConfig;
  }

  /**
   * Information used to configure the Hive metastore service as a service principal in a Kerberos
   * realm. To disable Kerberos, use the UpdateService method and specify this field's path
   * (hive_metastore_config.kerberos_config) in the request's update_mask while omitting this field
   * from the request's service.
   * @param kerberosConfig kerberosConfig or {@code null} for none
   */
  public HiveMetastoreConfig setKerberosConfig(KerberosConfig kerberosConfig) {
    this.kerberosConfig = kerberosConfig;
    return this;
  }

  /**
   * Immutable. The Hive metastore schema version.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Immutable. The Hive metastore schema version.
   * @param version version or {@code null} for none
   */
  public HiveMetastoreConfig setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public HiveMetastoreConfig set(String fieldName, Object value) {
    return (HiveMetastoreConfig) super.set(fieldName, value);
  }

  @Override
  public HiveMetastoreConfig clone() {
    return (HiveMetastoreConfig) super.clone();
  }

}
