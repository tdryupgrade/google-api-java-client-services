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

package com.google.api.services.vmmigration.v1.model;

/**
 * Holds informatiom about the available versions for upgrade.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AvailableUpdates extends com.google.api.client.json.GenericJson {

  /**
   * The latest version for in place update. The current appliance can be updated to this version
   * using the API or m4c CLI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApplianceVersion inPlaceUpdate;

  /**
   * The newest deployable version of the appliance. The current appliance can't be updated into
   * this version, and the owner must manually deploy this OVA to a new appliance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApplianceVersion newDeployableAppliance;

  /**
   * The latest version for in place update. The current appliance can be updated to this version
   * using the API or m4c CLI.
   * @return value or {@code null} for none
   */
  public ApplianceVersion getInPlaceUpdate() {
    return inPlaceUpdate;
  }

  /**
   * The latest version for in place update. The current appliance can be updated to this version
   * using the API or m4c CLI.
   * @param inPlaceUpdate inPlaceUpdate or {@code null} for none
   */
  public AvailableUpdates setInPlaceUpdate(ApplianceVersion inPlaceUpdate) {
    this.inPlaceUpdate = inPlaceUpdate;
    return this;
  }

  /**
   * The newest deployable version of the appliance. The current appliance can't be updated into
   * this version, and the owner must manually deploy this OVA to a new appliance.
   * @return value or {@code null} for none
   */
  public ApplianceVersion getNewDeployableAppliance() {
    return newDeployableAppliance;
  }

  /**
   * The newest deployable version of the appliance. The current appliance can't be updated into
   * this version, and the owner must manually deploy this OVA to a new appliance.
   * @param newDeployableAppliance newDeployableAppliance or {@code null} for none
   */
  public AvailableUpdates setNewDeployableAppliance(ApplianceVersion newDeployableAppliance) {
    this.newDeployableAppliance = newDeployableAppliance;
    return this;
  }

  @Override
  public AvailableUpdates set(String fieldName, Object value) {
    return (AvailableUpdates) super.set(fieldName, value);
  }

  @Override
  public AvailableUpdates clone() {
    return (AvailableUpdates) super.clone();
  }

}
