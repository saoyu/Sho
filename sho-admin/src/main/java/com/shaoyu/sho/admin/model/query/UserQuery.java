package com.shaoyu.sho.admin.model.query;

import com.shaoyu.sho.base.page.PageParam;
import lombok.Data;

/**
 * @Author: ByteOO
 * Date: 2020/7/6 18:22
 * @Version:
 * @Description:
 */
@Data
public class UserQuery extends PageParam {

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 状态  0：禁用   1：正常
	 */
	private Byte status;

	/**
	 * 是否删除  -1：已删除  0：正常
	 */
	private Byte delFlag;
}
