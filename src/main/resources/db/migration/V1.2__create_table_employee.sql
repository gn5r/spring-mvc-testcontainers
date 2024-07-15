use mvc;

drop table if exists employee cascade;

create table employee (
  id int not null auto_increment comment 'ID',
  first_name varchar (64) not null comment '名',
  family_name varchar (64) not null comment '姓',
  age int comment '年齢',
  sex varchar(2) comment '性別',
  email varchar (128) comment 'メールアドレス',
  department_id int comment '部署ID',
  hire_date date comment '入社日',
  retirement_date date comment '退職日',
  create_date datetime default current_timestamp comment '登録日',
  update_date datetime default current_timestamp on update current_timestamp comment '更新日',
  delete_flag boolean default false comment '削除フラグ',
  primary key (id),
  foreign key employee_department_fk1 (department_id) references department (id)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8mb4 COLLATE utf8mb4_general_ci COMMENT='従業員';