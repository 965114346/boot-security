package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class Role {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 权限名称
	 */
	private String name;

	/**
	 * 权限描述
	 */
	private String description;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;
}
