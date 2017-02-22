CREATE TABLE IF NOT EXISTS `country` (
    `country_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(200) NOT NULL,
    PRIMARY KEY (`country_id`)
);

CREATE TABLE IF NOT EXISTS `city` (
    `city_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(200) NOT NULL,
    PRIMARY KEY (`city_id`)
);