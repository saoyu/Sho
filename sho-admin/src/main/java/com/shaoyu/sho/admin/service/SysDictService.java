package com.shaoyu.sho.admin.service;

import com.shaoyu.sho.admin.model.dataobject.SysDict;
import com.shaoyu.sho.base.core.service.CurdService;

import java.util.List;

/**
 * 字典管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
