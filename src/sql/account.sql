CREATE DATABASE driving;

CREATE TABLE account (
  id binary(16) NOT NULL,
  phone varchar(64) DEFAULT NULL,
  wx_account varchar(64) DEFAULT NULL,
  login_password varchar(64) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `order` (
  `id` varbinary(16) NOT NULL,
  `user_id` varbinary(16) DEFAULT NULL,
  `class_def_id` varbinary(16) DEFAULT NULL,
  `ground_id` varbinary(16) DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  `paid` float(10,2) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8