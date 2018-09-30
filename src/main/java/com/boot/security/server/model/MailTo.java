package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class MailTo {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 邮件id
	 */
	private Long mailId;

	/**
	 * 收件人
	 */
	private String toUser;

	/**
	 * 状态
	 */
	private Boolean status;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;
}
