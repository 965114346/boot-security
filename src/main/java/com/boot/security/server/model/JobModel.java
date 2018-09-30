package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

/**
 *
 * Created by yangyang.zhang on 2018/9/30 23:29
 */
@Data
public class JobModel {

	private Long id;

	private String jobName;

	private String description;

	private String cron;

	private String springBeanName;

	private String methodName;

	private Boolean isSysJob;

	private Integer status;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

}
