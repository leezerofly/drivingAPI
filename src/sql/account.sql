CREATE DATABASE driving;

CREATE TABLE account (
  id binary(16) NOT NULL,
  phone varchar(64) DEFAULT NULL,
  wx_account varchar(64) DEFAULT NULL,
  login_password varchar(64) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8