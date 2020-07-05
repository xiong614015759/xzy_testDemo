package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data  //自动生成getter Setter方法
@AllArgsConstructor  //全成员变量的构造方法
@NoArgsConstructor  //空参构造
public class User {

    //对应数据库中的主键（uuid，自增id，雪花算法）

    @TableId(type = IdType.AUTO) //全局唯一id   默认方案
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //字段添加填充内容
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version  //乐观锁version注解
    private Integer version;  //乐观锁字段

    @TableLogic
    private Integer logicDelete;

}
