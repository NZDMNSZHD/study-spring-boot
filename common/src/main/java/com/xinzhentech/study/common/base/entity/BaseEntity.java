package com.xinzhentech.study.common.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * Entity 基类
 */
@Data
@ApiModel
public abstract class BaseEntity<T> implements Serializable {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键", hidden = true)
    protected String id;

    /**
     * 保存数据库前预处理
     */
    public void preInsert() {
    }

    /**
     * 保存数据库前预更新
     */
    public void preUpdate() {
    }
}