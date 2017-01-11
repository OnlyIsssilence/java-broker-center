/*==============================================================*/
/* Table: tbc_broker_company                                    */
/*==============================================================*/
create table tbc_broker_company
(
   company_id           bigint,
   company_name         varchar(200),
   company_code         varchar(20),
   contact_name         varchar(50),
   phone                varchar(20),
   officephone          varchar(20),
   homephone            varchar(20),
   email                varchar(50),
   province_id          bigint,
   province_name        varchar(50),
   city_id              bigint,
   city_name            varchar(50),
   address              varchar(200),
   longitude            decimal(18,6),
   latitude             decimal(18,6),
   formation_date       date default NULL,
   create_time          timestamp default CURRENT_TIMESTAMP,
   update_time          timestamp default CURRENT_TIMESTAMP,
   sys_time             timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   key AK_Key_1 (company_id)
);

/*==============================================================*/
/* Index: Index_broker_company_update_time                      */
/*==============================================================*/
create index Index_broker_company_update_time on tbc_broker_company
(
   update_time
);

/*==============================================================*/
/* Table: tbc_broker_shop                                       */
/*==============================================================*/
create table tbc_broker_shop
(
   shop_id              bigint,
   company_id           bigint,
   shop_name            varchar(200),
   shop_code            varchar(20),
   contact_name         varchar(50),
   phone                char(20),
   officephone          char(20),
   homephone            char(20),
   email                varchar(50),
   province_id          bigint,
   province_name        varchar(50),
   city_id              bigint,
   city_name            varchar(50),
   address              varchar(200),
   longitude            decimal(18,6),
   latitude             decimal(18,6),
   formation_date       date default NULL,
   create_time          timestamp default CURRENT_TIMESTAMP,
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   sys_time             timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   key AK_Key_1 (shop_id)
);

/*==============================================================*/
/* Index: Index_broker_shop_company_id                          */
/*==============================================================*/
create index Index_broker_shop_company_id on tbc_broker_shop
(
   company_id
);

/*==============================================================*/
/* Index: Index_broker_shop_update_time                         */
/*==============================================================*/
create index Index_broker_shop_update_time on tbc_broker_shop
(
   update_time
);

/*==============================================================*/
/* Table: tbc_broker                                            */
/*==============================================================*/
create table tbc_broker
(
   broker_id            bigint,
   broker_name          varchar(50),
   store_id             bigint,
   gender               char(1) default '0' comment '0δ֪1�� 2Ů',
   birthday             date,
   university           varchar(200),
   education            char(1) default '0' comment '1����/��ר���£�2����/��ר��3��ר��4���ƣ�5˶ʿ����',
   native               varchar(200),
   id_number            varchar(20),
   bank_name            varchar(20),
   bank_account         varchar(20),
   phone                varchar(20),
   email                varchar(100),
   QQ                   char(20),
   wechat               varchar(20),
   address              varchar(200),
   language_type        varchar(10),
   language_class       varchar(10),
   housing_type         tinyint comment '1�ⷿ2��',
   transportation       tinyint comment '1��������2���⳵/�쳵��3��ƿ����4���г���5���У�6˽�ҳ�',
   has_marriage         tinyint comment '0����1δ��2�ѻ�3����',
   has_children         tinyint comment '1�� 0��',
   country              varchar(15),
   nation               varchar(15),
   height               int,
   weight               decimal(18,2),
   interest             varchar(500),
   introduction         varchar(500),
   pic_url              varchar(100),
   broker_status        smallint default 0 comment '״̬��0δע�ᣬ1��ע�ᣬ2ǩԼ��3���ã�4��ְ����',
   is_auth              tinyint default 0 comment '0δ��֤1��֤',
   working_time         date,
   server_area          varchar(200),
   area_working_time    date,
   other_experience     varchar(200),
   other_working_type   varchar(200),
   server_village       varchar(500),
   basic_quality        decimal(18,2),
   business_ability     decimal(18,2),
   overall_ability      decimal(18,2),
   city_rank            decimal(18,2),
   create_time          timestamp default CURRENT_TIMESTAMP,
   active_time          timestamp default CURRENT_TIMESTAMP,
   sys_time             timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   key AK_Key_1 (broker_id)
);

/*==============================================================*/
/* Index: Index_tbc_broker_store_id                             */
/*==============================================================*/
create index Index_tbc_broker_store_id on tbc_broker
(
   store_id
);

/*==============================================================*/
/* Index: Index_tbc_broker_create_time                          */
/*==============================================================*/
create index Index_tbc_broker_create_time on tbc_broker
(
   create_time
);

/*==============================================================*/
/* Index: Index_tbc_broker_active_time                          */
/*==============================================================*/
create index Index_tbc_broker_active_time on tbc_broker
(
   active_time
);