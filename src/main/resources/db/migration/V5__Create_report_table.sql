CREATE TABLE `report` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `health_state` bigint(16) NOT NULL,
  `emergency_phone` char(64) DEFAULT NULL,
  `remark` varchar(256) DEFAULT NULL,
  `student_id` bigint(16) NOT NULL,
  `gmt_create` bigint(32) NOT NULL,
  `gmt_modified` bigint(32) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_report_stu` FOREIGN KEY (`student_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
