# 创建数据库
CREATE DATABASE hustdb;

USE hustdb;

CREATE TABLE user_tb(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(16) NOT NULL,
                        age INT,
                        stuno CHAR(12),
                        tel CHAR(11)
);

# 插入几条数据
INSERT INTO user_tb(name, age, stuno, tel) VALUES('张醒言', 20, '20190001', '1231341324');
INSERT INTO user_tb(id, name, age, stuno, tel) VALUES(null, '琼彤', 20, '20190002', '12841283428');
INSERT INTO user_tb VALUES(null, '雪宜', 20, '20190003', '12841283428');

SELECT * FROM user_tb;

# first query

DROP TABLE user_tb;

CREATE TABLE user_tb(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        `username` VARCHAR(20) NOT NULL,
                        `password` VARCHAR(20) NOT NULL,
                        email VARCHAR(36) NOT NULL,
                        create_time DATETIME NOT NULL
);

# 插入几条数据
INSERT INTO user_tb(`username`, `password`, email, create_time)
VALUES('superuser', '123456', 'U201812203@hust.edu.cn', NOW());

INSERT INTO user_tb(`username`, `password`, email, create_time)
VALUES('柳七', '123456', '1983387472@qq.com', NOW());

INSERT INTO user_tb(`username`, `password`, email, create_time)
VALUES('芥川龙之介', '123456', '3141592@gmail.com', NOW());

SELECT * FROM user_tb;