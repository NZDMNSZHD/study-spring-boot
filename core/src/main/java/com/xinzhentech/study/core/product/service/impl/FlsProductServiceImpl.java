package com.xinzhentech.study.core.product.service.impl;

import com.xinzhentech.study.core.product.domain.FlsProduct;
import com.xinzhentech.study.core.product.mapper.FlsProductMapper;
import com.xinzhentech.study.core.product.service.FlsProductService;
import org.springframework.stereotype.Service;

/**
 * ServiceImpl:FlsProductServiceImpl
 * @author limingfeng@xinzhentech.com
 * @version 1.0
 * @date 2018-6-15
 */
@Service("flsProductService") 
public class FlsProductServiceImpl extends BaseServiceImpl<FlsProductMapper, FlsProduct> implements FlsProductService {
    //@Resource
    //private FlsProductMapper flsProductMapper;

}
