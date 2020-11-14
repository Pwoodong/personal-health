# 健康管理项目

## 项目描述

​	此项目实现个人健康的管理，涉及数据采集、健康报告模块；现主要实现采集个人跑步运动数据，并展示运动报告。

此项目用于学习使用。

## 模块介绍

### 	采集模块

#### 			采集跑步数据

#### 			采集方式有:

​					1、手动录入采集

​					2、导入GPX文件采集（实现中）

​					3、运动图像识别采集（未实现）

### 	计算模块

#### 			运动报告展示

​					1、汇总数据

​					2、运动量趋势图

​					3、运动量环比

​					...

## 架构技术

​	数据库:MySQL

​	业务:SpringBoot、Mybatis

​	中间件:Nginx、Tomcat

​	系统:Centos

## 架构图

![健康管理架构](https://github.com/Pwoodong/personal-health/raw/master/document/framework/HealthFramework.png)

## 其它

​	后续实现分布式架构，考虑增加Redis、RabbitMq、Zookeeper等；将所学习到的技术应用与此项目。

