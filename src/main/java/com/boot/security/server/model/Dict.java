package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class Dict {

	private Long id;
	private String type;
	private String k;
	private String val;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

}
