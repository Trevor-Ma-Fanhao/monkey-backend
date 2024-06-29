package org.monkey.project.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.monkey.monkeyapicommon.model.entity.InterfaceInfo;


/**
 * 帖子视图
 *
 * @author yupi
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}