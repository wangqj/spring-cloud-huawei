package org.springframework.cloud.huawei.config;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.cloud.common.exception.RemoteOperationException;
import org.springframework.cloud.huawei.config.client.ServiceCombConfigClient;

import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Injectable;
import mockit.MockUp;
import mockit.integration.junit4.JMockit;

/**
 * @Author wangqijun
 * @Date 17:43 2019-10-26
 **/
@RunWith(JMockit.class)
public class ServiceCombConfigPropertySourceTest extends MockUp<ServiceCombConfigPropertySource> {

  private Map<String, Object> properties = new HashMap<>();

  @Test
  public void loadAllRemoteConfig(@Injectable String name, @Injectable ServiceCombConfigClient source)
      throws RemoteOperationException {
    name = "dd";
    Map<String, String> map = new HashMap<>();
    map.put("r", "r");
    map.put("d", "r");
    new Expectations() {
      {
        source.loadAll(anyString, anyString);
        result = map;
      }
    };
    ServiceCombConfigPropertySource serviceCombConfigPropertySource = new ServiceCombConfigPropertySource(name, source);
    Deencapsulation.setField(serviceCombConfigPropertySource, properties);
    Map<String, String> result = serviceCombConfigPropertySource.loadAllRemoteConfig("", "", "");
    Assert.assertEquals(result.size(), 2);
  }

  @Test
  public void getPropertyNames(@Injectable String name, @Injectable ServiceCombConfigClient source) {
    name = "dd";
    ServiceCombConfigPropertySource serviceCombConfigPropertySource = new ServiceCombConfigPropertySource(name, source);
    Deencapsulation.setField(serviceCombConfigPropertySource, properties);
    properties.put("test", "tt");
    properties.put("test2", "tt");
    String[] result = serviceCombConfigPropertySource.getPropertyNames();
    Assert.assertEquals(result.length, 2);
  }

  @Test
  public void getProperty(@Injectable String name, @Injectable ServiceCombConfigClient source) {
    name = "dd";
    ServiceCombConfigPropertySource serviceCombConfigPropertySource = new ServiceCombConfigPropertySource(name, source);
    Deencapsulation.setField(serviceCombConfigPropertySource, properties);
    properties.put("test", "tt");
    Object result = serviceCombConfigPropertySource.getProperty("test");
    Assert.assertEquals(result, "tt");
  }
}