# drivingAPI目前接口源码介绍

## 框架（已搭建完成）

1. 技术：springboot+mybatis+maven+redis+mysql（已完成）
2. 缓存：redis缓存（配置已完成，方法封装已完成，暂未使用）
3. 数据库：（已完成）
4. 日志打印：（已完成）
5. Junit单元测试（已添加）


## 账号模块

说明：
    （1）登录的同时能向token表添加access_token，如果添加不成功则登录也失败
    （2）注册是向account,user两个表添加信息，同时向token表添加access_token，同步进行，要不都成功，要不都不成功。


1. 登录
地址：POST       http://localhost:8081/drivingAPI/login

(1)简单登录（已完成）
(2)三个数据库表同步（已完成）
(3)插入token登录（未实现）

2. 注册
地址：POST http://localhost:8081/drivingAPI/register

(1)简单注册（已完成）
(2)三个数据库表同步（已完成）
(3)插入token注册（未实现）

3. 找回密码（未实现）
地址：PUT http://localhost:8081/drivingAPI/password


## 用户模块

1. 获取当前用户信息
地址：GET http://localhost:8081/drivingAPI/user
（1）基本功能已完成
（2）待完成：获取当前登录用户的cookie

2. 更新当前用户信息
地址：PUT http://localhost:8081/drivingAPI/user
（1）基本功能已完成
（2）待完成：获取当前登录用户的cookie

## 班型模块
1. 获取班型列表
地址：GET http://localhost:8081/drivingAPI/class/list
（1）基本功能已完成

2. 根据不同班型获取班型详细信息
地址：GET http://localhost:8081/drivingAPI/class/detail
（1）基本功能已完成
（2）待完成：获取URL参数，通过班型id获取班型详情

 ## 场地模块
 1. 获取所有场地的列表
 地址：GET http://localhost:8081/drivingAPI/ground/list
（1）基本功能已完成

 ## 教练模块
 1. 获取教练模块
 地址：GET http://localhost:8081/drivingAPI/coach/list
（1）基本功能已完成

## 订单模块
```
说明：订单模块接口需要接入微信支付，支付宝支付等（未完成）
```
1. 创建订单
地址：POST http://localhost:8081/drivingAPI/order/create
（1）基本功能已完成
（2）待完成：order设置userID，calssDefID,groundID

2. 继续支付
地址：PUT http://localhost:8081/drivingAPI/order/pay
（1）基本功能已完成
（2）待完成：获取当前登录用户的cookie；判断总价和已支付的价格的比值，重新写入状态

3. 获取订单
地址：GET http://localhost:8081/drivingAPI/order
（1）基本功能已完成
（2）待完成：获取当前登录用户的cookie

4. 取消订单
地址：DELETE http://localhost:8081/drivingAPI/order
（1）基本功能已完成
    （2）待完成：获取当前登录用户的cookie
