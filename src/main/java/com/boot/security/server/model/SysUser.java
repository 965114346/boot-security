package com.boot.security.server.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 用户实体类
 * Created by yangyang.zhang on 2018/9/30 23:21
 */
@Data
public class SysUser {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 别名
	 */
	private String nickname;

	/**
	 * 头像
	 */
	private String headImgUrl;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 手机
	 */
	private String telephone;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 出生日期
	 */
	@JSONField(format = "yyyy-MM-dd")
	private Date birthday;

	/**
	 * 性别
	 */
	private Integer sex;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 介绍
	 */
	private String intro;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	public interface Status {
		int DISABLED = 0;
		int VALID = 1;
		int LOCKED = 2;
	}

}
