CREATE TABLE `user`
(
    `id`       bigint(16)  NOT NULL AUTO_INCREMENT,
    `account`  char(64)    NOT NULL,
    `password` varchar(64) NOT NULL,
    `name`     varchar(64)  DEFAULT NULL,
    `home`     varchar(256) DEFAULT NULL,
    `phone`    varchar(64)  DEFAULT NULL,
    `class_id` bigint(16)   DEFAULT NULL,
    `role_id`  bigint(16)  NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_account` (`account`),
    CONSTRAINT `fk_user_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
    CONSTRAINT `fk_user_class` FOREIGN KEY (`class_id`) REFERENCES `class` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;