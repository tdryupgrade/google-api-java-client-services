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

package com.google.api.services.osconfig.v1alpha.model;

/**
 * Compliance data for an OS policy
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicyAssignmentReportOSPolicyCompliance extends com.google.api.client.json.GenericJson {

  /**
   * The compliance state of the OS policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complianceState;

  /**
   * The reason for the OS policy to be in an unknown compliance state. This field is always
   * populated when `compliance_state` is `UNKNOWN`. If populated, the field can contain one of the
   * following values: * `vm-not-running`: The VM was not running. * `os-policies-not-supported-by-
   * agent`: The version of the OS Config agent running on the VM does not support running OS
   * policies. * `no-agent-detected`: The OS Config agent is not detected for the VM. * `resource-
   * execution-errors`: The OS Config agent encountered errors while executing one or more resources
   * in the policy. See `os_policy_resource_compliances` for details. * `task-timeout`: The task
   * sent to the agent to apply the policy timed out. * `unexpected-agent-state`: The OS Config
   * agent did not report the final status of the task that attempted to apply the policy. Instead,
   * the agent unexpectedly started working on a different task. This mostly happens when the agent
   * or VM unexpectedly restarts while applying OS policies. * `internal-service-errors`: Internal
   * service errors were encountered while attempting to apply the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complianceStateReason;

  /**
   * The OS policy id
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osPolicyId;

  /**
   * Compliance data for each resource within the policy that is applied to the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance> osPolicyResourceCompliances;

  /**
   * The compliance state of the OS policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplianceState() {
    return complianceState;
  }

  /**
   * The compliance state of the OS policy.
   * @param complianceState complianceState or {@code null} for none
   */
  public OSPolicyAssignmentReportOSPolicyCompliance setComplianceState(java.lang.String complianceState) {
    this.complianceState = complianceState;
    return this;
  }

  /**
   * The reason for the OS policy to be in an unknown compliance state. This field is always
   * populated when `compliance_state` is `UNKNOWN`. If populated, the field can contain one of the
   * following values: * `vm-not-running`: The VM was not running. * `os-policies-not-supported-by-
   * agent`: The version of the OS Config agent running on the VM does not support running OS
   * policies. * `no-agent-detected`: The OS Config agent is not detected for the VM. * `resource-
   * execution-errors`: The OS Config agent encountered errors while executing one or more resources
   * in the policy. See `os_policy_resource_compliances` for details. * `task-timeout`: The task
   * sent to the agent to apply the policy timed out. * `unexpected-agent-state`: The OS Config
   * agent did not report the final status of the task that attempted to apply the policy. Instead,
   * the agent unexpectedly started working on a different task. This mostly happens when the agent
   * or VM unexpectedly restarts while applying OS policies. * `internal-service-errors`: Internal
   * service errors were encountered while attempting to apply the policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplianceStateReason() {
    return complianceStateReason;
  }

  /**
   * The reason for the OS policy to be in an unknown compliance state. This field is always
   * populated when `compliance_state` is `UNKNOWN`. If populated, the field can contain one of the
   * following values: * `vm-not-running`: The VM was not running. * `os-policies-not-supported-by-
   * agent`: The version of the OS Config agent running on the VM does not support running OS
   * policies. * `no-agent-detected`: The OS Config agent is not detected for the VM. * `resource-
   * execution-errors`: The OS Config agent encountered errors while executing one or more resources
   * in the policy. See `os_policy_resource_compliances` for details. * `task-timeout`: The task
   * sent to the agent to apply the policy timed out. * `unexpected-agent-state`: The OS Config
   * agent did not report the final status of the task that attempted to apply the policy. Instead,
   * the agent unexpectedly started working on a different task. This mostly happens when the agent
   * or VM unexpectedly restarts while applying OS policies. * `internal-service-errors`: Internal
   * service errors were encountered while attempting to apply the policy.
   * @param complianceStateReason complianceStateReason or {@code null} for none
   */
  public OSPolicyAssignmentReportOSPolicyCompliance setComplianceStateReason(java.lang.String complianceStateReason) {
    this.complianceStateReason = complianceStateReason;
    return this;
  }

  /**
   * The OS policy id
   * @return value or {@code null} for none
   */
  public java.lang.String getOsPolicyId() {
    return osPolicyId;
  }

  /**
   * The OS policy id
   * @param osPolicyId osPolicyId or {@code null} for none
   */
  public OSPolicyAssignmentReportOSPolicyCompliance setOsPolicyId(java.lang.String osPolicyId) {
    this.osPolicyId = osPolicyId;
    return this;
  }

  /**
   * Compliance data for each resource within the policy that is applied to the VM.
   * @return value or {@code null} for none
   */
  public java.util.List<OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance> getOsPolicyResourceCompliances() {
    return osPolicyResourceCompliances;
  }

  /**
   * Compliance data for each resource within the policy that is applied to the VM.
   * @param osPolicyResourceCompliances osPolicyResourceCompliances or {@code null} for none
   */
  public OSPolicyAssignmentReportOSPolicyCompliance setOsPolicyResourceCompliances(java.util.List<OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance> osPolicyResourceCompliances) {
    this.osPolicyResourceCompliances = osPolicyResourceCompliances;
    return this;
  }

  @Override
  public OSPolicyAssignmentReportOSPolicyCompliance set(String fieldName, Object value) {
    return (OSPolicyAssignmentReportOSPolicyCompliance) super.set(fieldName, value);
  }

  @Override
  public OSPolicyAssignmentReportOSPolicyCompliance clone() {
    return (OSPolicyAssignmentReportOSPolicyCompliance) super.clone();
  }

}
