package org.jleopard.mall.service;

import org.jleopard.mall.model.Address;
import org.jleopard.mall.model.AddressKey;

import java.util.List;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-07-25  下午6:03
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public interface AddressService {

    int deleteByIds(AddressKey key);

    Address insert(Address address);

    List<Address> selectByIds(AddressKey key);

    Address selectById(Integer id);

    Address updateByIdSelective(Address address);

}
