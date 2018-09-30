package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class Notice {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	public interface Status {
		int DRAFT = 0;
		int PUBLISH = 1;
	}

}
