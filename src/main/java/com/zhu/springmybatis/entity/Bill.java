package com.zhu.springmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: Bill
 * @date: 2023/4/22 14:55
 * @author: zdp
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    private int id;   //id
	private String billCode; //账单编码
	private String productName; //商品名称
	private String productDesc; //商品描述
	private String productUnit; //商品单位
	private BigDecimal productCount; //商品数量
	private BigDecimal totalPrice; //总金额
	private int isPayment; //是否支付
	private int providerId; //供应商ID
	private int createdBy; //创建者
	private Date creationDate; //创建时间
	private int modifyBy; //更新者
	private Date modifyDate;//更新时间
	private String providerName;//供营商名称
}
