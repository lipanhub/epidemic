CREATE TABLE `user`
(
    `id`       bigint(16)  NOT NULL AUTO_INCREMENT,
    `username`  char(64)    NOT NULL,
    `password` varchar(64) NOT NULL,
    `name`     varchar(64)  DEFAULT NULL,
    `home`     varchar(256) DEFAULT NULL,
    `phone`    varchar(64)  DEFAULT NULL,
    `clazz_id` bigint(16)   DEFAULT NULL,
    `role_id`  bigint(16)  NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_account` (`username`),
    CONSTRAINT `fk_user_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
    CONSTRAINT `fk_user_clazz` FOREIGN KEY (`clazz_id`) REFERENCES `clazz` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;