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