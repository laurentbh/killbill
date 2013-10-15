/*
 * Copyright 2010-2013 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.server.config;

import org.skife.config.Config;
import org.skife.config.Default;
import org.skife.config.Description;

import com.ning.billing.util.config.KillbillConfig;

public interface KillbillServerConfig extends KillbillConfig {

    @Config("killbill.server.multitenant")
    @Default("true")
    @Description("Whether multi-tenancy is enabled")
    public boolean isMultiTenancyEnabled();

    @Config("killbill.server.test.mode")
    @Default("false")
    @Description("Whether to start in test mode")
    public boolean isTestModeEnabled();
}
