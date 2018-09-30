package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 权限实体类
 * Create By yangyang.zhang on 2018/9/30 16:32
 **/
@Data
public class Permission {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 父权限id
	 */
	private Long parentId;

	/**
	 * 权限名称
	 */
	private String name;
	private String css;

	/**
	 * 链接
	 */
	private String href;

	/**
	 * 类型
	 */
	private Integer type;

	/**
	 * 权限
	 */
	private String permission;
	private Integer sort;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 子权限
	 */
	private List<Permission> child;
}
