package com.shaoyu.sho.admin.model.dataobject;

public class SysRoleDept extends BaseModel {

    private Long roleId;

    private Long deptId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

}