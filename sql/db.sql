-- 指定向monkey_db插入表
use monkey_db;
-- 接口信息
create table if not exists monkey_db.`interface_info`
(
    `id` bigint not null auto_increment comment 'id' primary key,
    `name` varchar(256) not null comment '名称',
    `discription` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestParams` text not null comment '请求参数',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态（0-关闭， 1-开启）',
    `method` varchar(256) not null comment '请求类型',
    `url` varchar(512) not null comment '接口地址',
    `userId` bigint not null comment '创建人',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null comment '更新时间',
    `isDelete` tinyint default 0 not null comment '是否删除（0-未删， 1-已删）'
) comment '接口信息';

insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('钟君浩', '周金鑫', 'www.demetrius-wolff.net', '龚明', '武子轩', 0, '毛伟诚', 94623298);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('何浩轩', '胡驰', 'www.leigh-huels.net', '徐伟祺', '沈鹭洋', 0, '孟熠彤', 937567);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('杨擎苍', '龙昊然', 'www.geneva-tromp.net', '严晓啸', '魏雪松', 0, '龚弘文', 4721);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('贺雪松', '魏睿渊', 'www.rigoberto-kessler.com', '黄文昊', '洪炫明', 0, '何嘉熙', 445);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('田君浩', '赖语堂', 'www.collene-parker.co', '于明辉', '龚思远', 0, '钱弘文', 3);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('万子骞', '戴晟睿', 'www.milly-feest.name', '赵涛', '洪乐驹', 0, '曹楷瑞', 4);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('姚天宇', '龚振家', 'www.ressie-goodwin.net', '崔晓博', '宋立诚', 0, '蒋鸿煊', 7978531);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('韩思源', '秦熠彤', 'www.helen-thiel.com', '尹建辉', '周梓晨', 0, '谢博涛', 85819);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('袁子轩', '胡擎苍', 'www.jen-roberts.co', '龙驰', '马绍齐', 0, '梁志泽', 3726619919);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('吴鹤轩', '秦君浩', 'www.jeremy-metz.co', '贾文轩', '吴晟睿', 0, '孙智辉', 987);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('杜浩轩', '武潇然', 'www.grayce-boyle.co', '龚越泽', '白越彬', 0, '武晟睿', 52522);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('覃越泽', '尹建辉', 'www.alease-cummings.name', '洪鑫鹏', '郭胤祥', 0, '白弘文', 42370143);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('邱远航', '韩鹏飞', 'www.columbus-mayer.io', '韦雨泽', '莫鑫磊', 0, '李浩', 854217);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('金伟祺', '万志强', 'www.manual-ankunding.net', '孟彬', '邱俊驰', 0, '董航', 59671);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('武耀杰', '潘智辉', 'www.rex-buckridge.org', '秦明轩', '董明轩', 0, '刘浩', 10948146);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('杨楷瑞', '许弘文', 'www.alonzo-kunze.com', '何煜祺', '段昊然', 0, '叶烨磊', 27654587);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('程风华', '姚立辉', 'www.toney-stokes.org', '蔡博超', '钱胤祥', 0, '任瑞霖', 860236989);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('林泽洋', '郝炎彬', 'www.waltraud-trantow.com', '郝晓啸', '张烨华', 0, '郝越彬', 64893);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('王弘文', '孔鹏飞', 'www.irmgard-abbott.co', '洪语堂', '罗浩宇', 0, '苏熠彤', 44257237);
insert into monkey_db.`interface_info` (`name`, `discription`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('雷立果', '罗烨伟', 'www.phyliss-mccullough.info', '陶熠彤', '赖思聪', 0, '曾振家', 8242696);