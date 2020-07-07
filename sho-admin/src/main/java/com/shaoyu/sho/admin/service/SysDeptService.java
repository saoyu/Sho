package com.shaoyu.sho.admin.service;

import com.shaoyu.sho.admin.model.dataobject.SysDept;
import com.shaoyu.sho.base.core.service.CurdService;

import java.util.List;

/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @return
	 */
	List<SysDept> findTree();
}
