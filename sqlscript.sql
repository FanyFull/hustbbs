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