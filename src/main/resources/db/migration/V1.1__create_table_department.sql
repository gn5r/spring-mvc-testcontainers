use mvc;

SET FOREIGN_KEY_CHECKS = 0;
drop table if exists department cascade;
SET FOREIGN_KEY_CHECKS = 1;

create table department (
  id int not null auto_increment comment 'ID',
  name varchar (64) not null comment '部署名',
  create_date datetime default current_timestamp comment '登録日',
  update_date datetime default current_timestamp on update current_timestamp comment '更新日',
  delete_flag boolean default false comment '削除フラグ',
  primary key (id)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8mb4 COLLATE utf8mb4_general_ci COMMENT='部署';