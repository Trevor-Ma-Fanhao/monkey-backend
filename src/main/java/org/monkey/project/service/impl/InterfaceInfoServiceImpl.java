package org.monkey.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.monkey.project.common.ErrorCode;
import org.monkey.project.exception.BusinessException;
import org.monkey.project.mapper.InterfaceInfoMapper;
import org.monkey.project.model.entity.InterfaceInfo;
import org.monkey.project.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author luckyma
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-04-28 18:42:43
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {


        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 获取接口对象信息 是否为空 否则抛出参数错误的异常
        String name = interfaceInfo.getName();

        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




