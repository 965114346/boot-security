package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

/**
 * 邮件实体类
 * Created by yangyang.zhang on 2018/9/30 23:25
 */
@Data
public class Mail {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 收件人
	 */
	private String toUsers;

	/**
	 * 主题
	 */
	private String subject;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

}
