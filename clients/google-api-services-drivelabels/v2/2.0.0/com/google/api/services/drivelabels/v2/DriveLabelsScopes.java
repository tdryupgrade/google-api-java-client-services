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

package com.google.api.services.drivelabels.v2;

/**
 * Available OAuth 2.0 scopes for use with the Drive Labels API.
 *
 * @since 1.4
 */
public class DriveLabelsScopes {

  /** See, edit, create, and delete all Google Drive labels in your organization, and see your organization's label-related admin policies. */
  public static final String DRIVE_ADMIN_LABELS = "https://www.googleapis.com/auth/drive.admin.labels";

  /** See all Google Drive labels and label-related admin policies in your organization. */
  public static final String DRIVE_ADMIN_LABELS_READONLY = "https://www.googleapis.com/auth/drive.admin.labels.readonly";

  /** See, edit, create, and delete your Google Drive labels. */
  public static final String DRIVE_LABELS = "https://www.googleapis.com/auth/drive.labels";

  /** See your Google Drive labels. */
  public static final String DRIVE_LABELS_READONLY = "https://www.googleapis.com/auth/drive.labels.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(DRIVE_ADMIN_LABELS);
    set.add(DRIVE_ADMIN_LABELS_READONLY);
    set.add(DRIVE_LABELS);
    set.add(DRIVE_LABELS_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private DriveLabelsScopes() {
  }
}
