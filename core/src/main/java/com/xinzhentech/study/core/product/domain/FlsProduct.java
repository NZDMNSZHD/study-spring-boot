package com.xinzhentech.study.core.product.domain;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * entity:FlsProduct
 *
 * @author limingfeng@xinzhentech.com
 * @version 1.0
 * @date 2018-6-15
 */
@Data
public class FlsProduct implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long id;  /* 主键ID */ 
    private Integer productType;  /* 产品类型：1=融资租赁 */ 
    private String productCode;  /* 产品代码 */ 
    private String productName;  /* 产品名称 */ 
    private Integer status;  /* 状态:0=禁用,1=启用 */ 
    private Date createTime;  /* 创建时间 */ 
    private Date lastUpdateTime;  /* 最后更新时间 */ 
}
