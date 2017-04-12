package com.itmuch.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itmuch.config.Configuration2;

// Feign默认使用FeignClientsConfiguration进行配置
// 参考文档：https://www.hihexo.com/2017/03/spring-cloud-netflix-feign/#Overriding-Feign-Defaults-%E8%A6%86%E7%9B%96Feign%E7%9A%84%E9%BB%98%E8%AE%A4%E9%85%8D%E7%BD%AE
@FeignClient(name = "xxxx", url = "http://localhost:8761/", configuration = Configuration2.class)
public interface FeignClient2 {
  @RequestMapping(value = "/eureka/apps/{serviceName}")
  public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
