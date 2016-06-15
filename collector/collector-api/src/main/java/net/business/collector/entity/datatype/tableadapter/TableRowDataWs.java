/*
 * 
 */
package net.business.collector.entity.datatype.tableadapter;

import java.io.Serializable;


/**
 * 表格行数据对象.
 */
public class TableRowDataWs implements Serializable {

	/**
	 * 表格行数据对象的构造器.
	 */
	public TableRowDataWs() {

	}

	// @XmlAttribute
	/** 表格数据. */
	private String[] data;

	/**
	 * 获取表格行数据.
	 * 
	 * @return 行数据
	 */
	public String[] getData() {
		return data;
	}

	/**
	 * 设置行数据.
	 * 
	 * @param data
	 *            行数据
	 */
	public void setData(String[] data) {
		this.data = data;
	}
}
