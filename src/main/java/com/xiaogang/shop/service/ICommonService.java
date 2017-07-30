package com.xiaogang.shop.service;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICommonService<T> {
	public T add(T t);
	public void del(T t);
	public T get(Serializable id);
	public Page<T> queryPage(Pageable pageable);
}
