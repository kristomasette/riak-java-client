/*
 * Copyright 2013 Basho Technologies Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.basho.riak.client.operations.crdt;

import com.basho.riak.client.query.crdt.ops.CrdtOp;

public abstract class CrdtMutation
{

    public abstract CrdtOp getOp();

    public static MapMutation forMap()
    {
        return new MapMutation();
    }

    public static SetMutation forSet()
    {
        return new SetMutation();
    }

    public static CounterMutation forCounter()
    {
        return new CounterMutation();
    }

}