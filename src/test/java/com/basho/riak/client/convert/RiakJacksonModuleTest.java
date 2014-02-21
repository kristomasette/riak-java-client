/*
 * This file is provided to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.basho.riak.client.convert;

import com.fasterxml.jackson.databind.Module.SetupContext;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author russell
 * 
 */
public class RiakJacksonModuleTest {

    /**
     * Test method for
     * {@link com.basho.riak.client.convert.RiakJacksonModule#setupModule(com.fasterxml.jackson.databind.Module.SetupContext)}
     * .
     */
    @Test public void setupAddsRiakbeanSerializerModifierToContext() {
        SetupContext setupContext = mock(SetupContext.class);
        RiakJacksonModule module = new RiakJacksonModule();
        module.setupModule(setupContext);
        verify(setupContext, times(1)).addBeanSerializerModifier(RiakBeanSerializerModifier.getInstance());
    }

}