/*
 * Copyright 2010-2011 Ning, Inc
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

package com.ning.billing.entitlement.glue;


import com.ning.billing.entitlement.engine.core.EventNotifier;
import com.ning.billing.entitlement.engine.core.MockApiEventProcessorMemory;
import com.ning.billing.entitlement.engine.dao.EntitlementDao;
import com.ning.billing.entitlement.engine.dao.MockEntitlementDaoMemory;

public class MockEngineModuleMemory extends MockEngineModule {
    @Override
    protected void installApiEventProcessor() {
        bind(EventNotifier.class).to(MockApiEventProcessorMemory.class).asEagerSingleton();
    }

    @Override
    protected void installEntitlementDao() {
        bind(EntitlementDao.class).to(MockEntitlementDaoMemory.class).asEagerSingleton();
    }


    @Override
    protected void configure() {
        super.configure();
    }
}
