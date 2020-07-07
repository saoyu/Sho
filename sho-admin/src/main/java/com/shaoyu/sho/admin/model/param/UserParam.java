package com.shaoyu.sho.admin.model.param;

import com.shaoyu.sho.base.page.PageParam;
import lombok.Data;

import java.util.Date;

/**
 * @Author: ByteOO
 * Date: 2020/7/6 18:52
 * @Version:
 * @Description:
 */
@Data
public class UserParam extends PageParam {
	/**
	 * 编号
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 昵称
	 */
	private String nickName;


	/**
	 * 更新时间
	 */
	private Date lastUpdateTime;

	/**
	 * 是否删除  -1：已删除  0：正常
	 */
	private Byte delFlag;
}
