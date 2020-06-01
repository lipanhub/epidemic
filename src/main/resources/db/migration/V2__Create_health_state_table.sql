CREATE TABLE `health_state` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `state` char(64) NOT NULL,
  `description` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
