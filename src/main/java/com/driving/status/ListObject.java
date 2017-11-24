package com.driving.status;

import java.util.List;

/**
 * 将状态和数据整合封装成对象
 * created by wk on 2017-11-24
 */
public class ListObject extends AbstractJsonObject {

	private List<?> data;

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

}
