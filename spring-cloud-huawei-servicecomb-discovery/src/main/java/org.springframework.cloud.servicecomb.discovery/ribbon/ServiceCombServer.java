/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.servicecomb.discovery.ribbon;

import com.netflix.loadbalancer.Server;

/**
 * @Author wangqijun
 * @Date 18:26 2019-07-11
 **/
public class ServiceCombServer extends Server {
  public ServiceCombServer(String host, int port) {
    super(host, port);
  }

  public ServiceCombServer(String scheme, String host, int port) {
    super(scheme, host, port);
  }

  public ServiceCombServer(String id) {
    super(id);
  }
}
