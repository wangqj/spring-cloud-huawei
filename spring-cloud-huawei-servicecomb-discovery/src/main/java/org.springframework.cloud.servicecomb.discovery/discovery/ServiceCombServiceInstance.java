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

package org.springframework.cloud.servicecomb.discovery.discovery;

import java.net.URI;
import java.util.Map;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;

/**
 * @Author wangqijun
 * @Date 16:47 2019-07-10 TODO
 **/
public class ServiceCombServiceInstance implements ServiceInstance {
  private String serviceId;

  private String host;

  private int port;

  private boolean secure;

  private Map<String, String> metadata;

  @Override
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  @Override
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  @Override
  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  @Override
  public boolean isSecure() {
    return secure;
  }

  public void setSecure(boolean secure) {
    this.secure = secure;
  }

  @Override
  public URI getUri() {
    return DefaultServiceInstance.getUri(this);
  }

  @Override
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
}
