FROM java:8
MAINTAINER conanca <imconan@gmail.com>

RUN echo "Asia/Shanghai" > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata

ADD target/spring-boot-sample-thrift-0.1.jar app.jar

RUN bash -c 'touch /app.jar'

EXPOSE 8080

CMD java -jar /app.jar