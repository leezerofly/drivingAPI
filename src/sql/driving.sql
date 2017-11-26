CREATE DATABASE driving;

# 创建account表
CREATE TABLE account (
  id varbinary(16) NOT NULL,
  phone varchar(64) DEFAULT NULL,
  wx_account varchar(64) DEFAULT NULL,
  login_password varchar(64) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

# 创建uer表
CREATE TABLE user (
  id varbinary(16) NOT NULL,
  account_id varbinary(16) DEFAULT NULL,
  name varchar(64) DEFAULT NULL,
  img varchar(64) DEFAULT NULL,
  district varchar(64) DEFAULT NULL,
  PRIMARY KEY (id),
  foreign key(account_id) references account(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

# 创建token表
CREATE TABLE token (
  id varbinary(16) NOT NULL,
  account_id varbinary(16) DEFAULT NULL,
  client_type INT DEFAULT  NULL ,
  access_token varbinary(16) DEFAULT NULL,
  refresh_time DATE DEFAULT NULL,
  PRIMARY KEY (id),
  foreign key(account_id) references account(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

# 创建order表
CREATE TABLE `order` (
  `id` varbinary(16) NOT NULL,
  `user_id` varbinary(16) DEFAULT NULL,
  `class_def_id` varbinary(16) DEFAULT NULL,
  `ground_id` varbinary(16) DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  `paid` float(10,2) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

# 班型总表 class_def
create table class_def
(
	id varbinary(16) not null comment '班型总表id'
		primary key,
	name_id varbinary(16) null comment '班型名称id',
	type_id varbinary(16) null comment '班型类别id',
	service_list varchar(1024) null comment '服务内容',
	cost_list varchar(1024) null comment '费用明细',
	price float(10,2) null comment '价格'
)

# 班型类别表 class_type
create table class_type
(
	id varbinary(16) not null comment '班型类别id'
		primary key,
	name varchar(64) null comment '班型类别名称'
)

# 教练表 coach
create table coach
(
	id varbinary(16) not null
		primary key,
	name varchar(64) null,
	img varchar(255) null,
	intro varchar(255) null,
	rank int(10) null
)

# 场地表 ground
create table ground
(
	id varbinary(16) not null
		primary key,
	name varchar(255) null,
	addr varchar(255) null,
	longitude varchar(64) null,
	latitude varchar(64) null
)
