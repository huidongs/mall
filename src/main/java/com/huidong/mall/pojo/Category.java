package com.huidong.mall.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Desc:
 */
@Data
public class Category {

    private Integer id;
    private Integer parentId;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Date createTime;
    private Date updateTime;
}
