package com.shaoyu.sho.base.page;

/**
 * @Author: ByteOO
 * Date: 2020/7/6 13:26
 * @Version:
 * @Description:
 */

public class PageParam {

	// 当前页码， 从1开始
	private int pageNum;

	// 每页显示记录数
	private int pageSize = 10;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}