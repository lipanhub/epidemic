CREATE TABLE `role`
(
    `id`          bigint(16) NOT NULL AUTO_INCREMENT,
    `role_name`   char(64)   NOT NULL,
    `description` varchar(256) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_rname` (`role_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
