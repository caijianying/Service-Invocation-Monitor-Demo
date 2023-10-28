package com.xiaobaicai.tkmybatis.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author caijy
 * @description
 * @date 2023/10/28 星期六 3:27 下午
 */
@Data
@Table(name = "payment")
public class Payment {
    @Id
    private Integer id;
    private String serial;
}
