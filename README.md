# Solaris — A Open Source Community System

# 开源社区系统

---

<br>


## Introduction

Sound is an open source community system with no separation of front and back ends, based on the current mainstream Java Web technology stack (SpringBoot + MyBatis + MySQL + Redis + Kafka + Elasticsearch + Spring Security + ...) . This system contains posts, comments, private messages, system notifications, likes, followers, search, user settings, statistics and other modules.


## Technology Stack 

Back end：

- Spring
- Spring Boot 2.1.5 RELEASE
- Spring MVC
- ORM ：MyBatis
- Database ：MySQL 5.7
- Redis
- In-memory cache ：Caffeine
- Kafka 2.13-2.7.0
- Search Engine ：Elasticsearch 6.4.3
- Security ：Spring Security
- Spring Mail

Front end：

- Thymeleaf
- Bootstrap 4.x
- Jquery
- Ajax

## Development environment

- Windows 10
- Apache Maven
- Intellij IDEA
- Apache Tomcat
- Postman
- Apache JMeter
- Git
- Java 版本：8

## Display Interfaces

Index：

![](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/index.png)

Login：

![image-20210906202300374](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906202300374.png)

Post：

![](https://gitee.com/veal98/images/raw/master/img/20210512101041.png)

Post detailed page (MarkDown rendering):

![image-20210906202453767](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906202453767.png)

Post detailed page 2：

![image-20210906202540130](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906202540130.png)



personal page：

![image-20210906202608586](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906202608586.png)

System notification page:

![image-20210906202710161](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906202710161.png)

Notification detailed page：

![image-20210906204423977](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906204423977.png)

Account setting page:

![image-20210906202734519](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906202734519.png)



Search details page：

![image-20210906202925761](https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/image-20210906202925761.png)



## Local running environment

If the project needs to be deployed locally for testing, the following environments should be available in advance:

- Java 8
- MySQL 5.7
- Redis
- Kafka 2.13-2.7.0
- Elasticsearch 6.4.3

Then change the information in the configuration file to your own local environment, it won't run directly.

The configuration file information that needs to be changed for local operation is as follows.

1）`application-develop.properties`：

- MySQL
- Spring Mail（Mail require SMTP service to be enabled）
- Kafka：consumer.group-id（该字段见 Kafka 安装包中的 consumer.proerties，可自行修改, 修改完毕后需要重启 Kafka）
- Elasticsearch：cluster-name（该字段见 Elasticsearch 安装包中的 elasticsearch.yml，可自行修改）

2）`logback-spring-develop.xml`：

- LOG_PATH ：Where the logs are stored

Each run requires the following environment to be opened：

- MySQL
- Redis
- Elasticsearch
- Kafka

In addition, you will need to build the database *greatecommunity* and then run these sql files in turn under the project sql folder to create the database tables.：

<img src="https://raw.githubusercontent.com/Exlie-Flyyi/img-storage1/main/20210217134928.png" style="width:386px" />
