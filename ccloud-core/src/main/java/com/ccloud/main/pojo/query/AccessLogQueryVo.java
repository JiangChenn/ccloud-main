package com.ccloud.main.pojo.query;

import lombok.Data;

/**
 * @author wangjie
 */
@Data
public class AccessLogQueryVo {

    private Integer pageNum;
    private Integer pageSize;

    private Integer appId;
}
