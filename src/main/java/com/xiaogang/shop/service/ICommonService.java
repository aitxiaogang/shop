package com.xiaogang.shop.service;

import java.io.Serializable;

public interface ICommonService<T> {
	public T add(T t);
	public void del(T t);
	public T get(Serializable id);
}
