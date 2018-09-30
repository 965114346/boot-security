package com.boot.security.server.model;

import lombok.Data;

import java.util.Date;

/**
 * TokenModel
 * Created by yangyang.zhang on 2018/9/30 23:20
 */
@Data
public class TokenModel {

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 过期时间
	 */
	private Date expireTime;

	/**
	 * LoginUser的json串
	 */
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
