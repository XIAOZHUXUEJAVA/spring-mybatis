package com.zhu.springmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description: Provider
 * @date: 2023/4/22 15:06
 * @author: zdp
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provider {

    private Integer id;   //id
    private String proCode; //供应商编码
    private String proName; //供应商名称
    private String proDesc; //供应商描述
    private String proContact; //供应商联系人
    private String proPhone; //供应商电话
    private String proAddress; //供应商地址
    private String proFax; //供应商传真
    private Integer createdBy; //创建者
    private Date creationDate; //创建时间
    private Integer modifyBy; //更新者
    private Date modifyDate;//更新时间
}
