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

package com.google.api.services.domains.v1beta1.model;

/**
 * Parameters required to transfer a domain from another registrar.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferParameters extends com.google.api.client.json.GenericJson {

  /**
   * The registrar that currently manages the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentRegistrar;

  /**
   * The domain name. Unicode domain names are expressed in Punycode format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domainName;

  /**
   * The name servers that currently store the configuration of the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> nameServers;

  /**
   * Contact privacy options that the domain supports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supportedPrivacy;

  /**
   * Indicates whether the domain is protected by a transfer lock. For a transfer to succeed, this
   * must show `UNLOCKED`. To unlock a domain, go to its current registrar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transferLockState;

  /**
   * Price to transfer or renew the domain for one year.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money yearlyPrice;

  /**
   * The registrar that currently manages the domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentRegistrar() {
    return currentRegistrar;
  }

  /**
   * The registrar that currently manages the domain.
   * @param currentRegistrar currentRegistrar or {@code null} for none
   */
  public TransferParameters setCurrentRegistrar(java.lang.String currentRegistrar) {
    this.currentRegistrar = currentRegistrar;
    return this;
  }

  /**
   * The domain name. Unicode domain names are expressed in Punycode format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomainName() {
    return domainName;
  }

  /**
   * The domain name. Unicode domain names are expressed in Punycode format.
   * @param domainName domainName or {@code null} for none
   */
  public TransferParameters setDomainName(java.lang.String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * The name servers that currently store the configuration of the domain.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNameServers() {
    return nameServers;
  }

  /**
   * The name servers that currently store the configuration of the domain.
   * @param nameServers nameServers or {@code null} for none
   */
  public TransferParameters setNameServers(java.util.List<java.lang.String> nameServers) {
    this.nameServers = nameServers;
    return this;
  }

  /**
   * Contact privacy options that the domain supports.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupportedPrivacy() {
    return supportedPrivacy;
  }

  /**
   * Contact privacy options that the domain supports.
   * @param supportedPrivacy supportedPrivacy or {@code null} for none
   */
  public TransferParameters setSupportedPrivacy(java.util.List<java.lang.String> supportedPrivacy) {
    this.supportedPrivacy = supportedPrivacy;
    return this;
  }

  /**
   * Indicates whether the domain is protected by a transfer lock. For a transfer to succeed, this
   * must show `UNLOCKED`. To unlock a domain, go to its current registrar.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransferLockState() {
    return transferLockState;
  }

  /**
   * Indicates whether the domain is protected by a transfer lock. For a transfer to succeed, this
   * must show `UNLOCKED`. To unlock a domain, go to its current registrar.
   * @param transferLockState transferLockState or {@code null} for none
   */
  public TransferParameters setTransferLockState(java.lang.String transferLockState) {
    this.transferLockState = transferLockState;
    return this;
  }

  /**
   * Price to transfer or renew the domain for one year.
   * @return value or {@code null} for none
   */
  public Money getYearlyPrice() {
    return yearlyPrice;
  }

  /**
   * Price to transfer or renew the domain for one year.
   * @param yearlyPrice yearlyPrice or {@code null} for none
   */
  public TransferParameters setYearlyPrice(Money yearlyPrice) {
    this.yearlyPrice = yearlyPrice;
    return this;
  }

  @Override
  public TransferParameters set(String fieldName, Object value) {
    return (TransferParameters) super.set(fieldName, value);
  }

  @Override
  public TransferParameters clone() {
    return (TransferParameters) super.clone();
  }

}
