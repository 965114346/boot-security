package com.boot.security.server.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public abstract class BaseEntity<ID extends Serializable> {

	private ID id;
	private Date createTime = new Date();
	private Date updateTime = new Date();
}
