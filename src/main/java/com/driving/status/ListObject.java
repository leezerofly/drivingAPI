package com.driving.status;

import java.util.List;

/**
 * 将状态和数据整合封装成对象
 * created by wk on 2017-11-24
 */
public class ListObject extends AbstractJsonObject {

	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
