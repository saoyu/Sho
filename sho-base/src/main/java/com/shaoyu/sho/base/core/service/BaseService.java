package com.shaoyu.sho.base.core.service;

import java.util.List;

/**
 * @Author: ByteOO
 * Date: 2020/7/6 12:25
 * @Version:
 * @Description: 基础服务
 */
public interface BaseService<T> {

	/**
	 * 保存操作
	 *
	 * @param record
	 * @return
	 */
	int save(T record);

	/**
	 * 删除操作
	 *
	 * @param record
	 * @return
	 */
	int delete(T record);

	/**
	 * 批量删除操作
	 *
	 * @param entities
	 */
	int delete(List<T> records);

	/**
	 * 根据ID查询
	 *
	 * @param id
	 * @return
	 */
	T findById(Long id);
}
