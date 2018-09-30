package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

/**
 * 文件信息实体类
 * Created by yangyang.zhang on 2018/9/30 23:27
 */
@Data
public class FileInfo {

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 内容类型
	 */
	private String contentType;

	/**
	 * 文件大小
	 */
	private Long size;

	/**
	 * 文件路径
	 */
	private String path;

	/**
	 * url
	 */
	private String url;

	/**
	 * 类型
	 */
	private Integer type;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;
}
