package org.monkey.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoUpdateRequest implements Serializable {

    /**
     * id
     * ID 不能更改 但是我们更新对象 需要知道是更新哪条数据
     * */
    // @TableId(type = IdType.AUTO)
    private Long id;

    // 下面的请求 都有可能更改

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String discription;

    /**
     * 接口地址
     */
    private String url;
    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态（0-关闭， 1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

}