package com.yupi.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     * id
     * ID 不能更改 但是我们更新对象 需要知道是更新哪条数据
     * */
    // @TableId(type = IdType.AUTO)
    private Long id;

    /*
    * 用户请求参数
    * */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;

}