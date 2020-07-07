package com.shaoyu.sho.admin.service;

import com.shaoyu.sho.admin.model.dataobject.SysUser;
import com.shaoyu.sho.admin.model.dataobject.SysUserRole;
import com.shaoyu.sho.base.core.service.CurdService;
import com.shaoyu.sho.base.page.PageRequest;

import java.io.File;
import java.util.List;
import java.util.Set;

/**
 * 用户管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysUserService extends CurdService<SysUser> {

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userId
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

	/**
	 * 生成用户信息Excel文件
	 * @param pageRequest 要导出的分页查询参数
	 * @return
	 */
	File createUserExcelFile(PageRequest pageRequest);

}
