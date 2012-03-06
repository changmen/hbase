/**
 * Copyright 2010 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver.handler;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hbase.HRegionInfo;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.Server;
import org.apache.hadoop.hbase.regionserver.RegionServerServices;

/**
 * Handles opening of a meta region on a region server.
 * <p>
 * This is executed after receiving an OPEN RPC from the master for meta.
 */
@InterfaceAudience.Private
public class OpenMetaHandler extends OpenRegionHandler {
  public OpenMetaHandler(final Server server,
      final RegionServerServices rsServices, HRegionInfo regionInfo,
      final HTableDescriptor htd) {
    this(server, rsServices, regionInfo, htd, -1);
  }
  public OpenMetaHandler(final Server server,
      final RegionServerServices rsServices, HRegionInfo regionInfo,
      final HTableDescriptor htd, int versionOfOfflineNode) {
    super(server, rsServices, regionInfo, htd, EventType.M_RS_OPEN_META,
        versionOfOfflineNode);
  }
}