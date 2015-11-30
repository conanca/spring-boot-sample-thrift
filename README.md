spring-boot-sample-thrift
==========

## 项目简介
spring-boot 集成 thrift 的示例，可以作为微服务架构应用的基准代码。


## How To Use

1. 打 runnable jar

  ```
      mvn clean thrift:compile package
  ```

2. 构建镜像

  ```
    docker build -t="xhndev/spring-boot-sample-thrift:0.1" .
  ```

3. 运行容器

  *注意容器名和挂载目录名spring-boot-sample-thrift_01 是唯一的*

  ```
      docker run -d -P --name spring-boot-sample-thrift_01 -v ~/spring-boot-sample-thrift_01:/tmp/spring-boot-sample-thrift/ xhndev/spring-boot-sample-thrift:0.1
  ```