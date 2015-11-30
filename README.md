spring-boot-sample-thrift
==========

## 项目简介
spring-boot集成thrift的示例，可以作为微服务架构的应用的基准代码


## How To Use

1. import project

  导入你的IDE后，执行一下 maven-thrift-plugin 插件的 compile 操作，用于生成必要的代码

1. 打runable jar

  ```
      mvn clean package
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