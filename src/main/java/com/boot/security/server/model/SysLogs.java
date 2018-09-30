package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class SysLogs {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户
	 */
	private SysUser user;

	/**
	 * 模块
	 */
	private String module;

	/**
	 * 标记
	 */
	private Boolean flag;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

}
