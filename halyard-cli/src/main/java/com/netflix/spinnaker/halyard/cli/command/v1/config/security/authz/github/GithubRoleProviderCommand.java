/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.halyard.cli.command.v1.config.security.authz.github;

import com.beust.jcommander.Parameters;
import com.netflix.spinnaker.halyard.cli.command.v1.config.security.authz.AbstractRoleProviderCommand;
import com.netflix.spinnaker.halyard.config.model.v1.security.GroupMembership;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Parameters(separators = "=")
public class GithubRoleProviderCommand extends AbstractRoleProviderCommand {
  private GroupMembership.RoleProviderType roleProviderType =
      GroupMembership.RoleProviderType.GITHUB;

  public GithubRoleProviderCommand() {
    registerSubcommand(new EditGithubRoleProviderCommand());
  }
}
