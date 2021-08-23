CREATE DATABASE IF NOT EXISTS spring_template;
USE spring_template;
CREATE USER IF NOT EXISTS 'springTemplateDBUser'@'%' identified by 'springTemplateDBPassword';
GRANT ALL ON spring_template.* to 'springTemplateDBUser'@'%';