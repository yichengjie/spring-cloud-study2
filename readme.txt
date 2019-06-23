1、注册中心server-eureka: 1001
2、服务提供方client-eureka: 2001
3、网关中心gateway-zuul: 3001
4、配置中心config-server-git: 4001
  4.1配置使用端config-client: 4002
5、服务消费方
  5.1 consumer-eureka : 2002
  5.2 consumer-feign : 2003
  5.3 consumer-feign-hystrix: 2004
