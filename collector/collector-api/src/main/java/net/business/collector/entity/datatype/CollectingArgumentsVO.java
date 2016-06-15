/*
 * 
 */
package net.business.collector.entity.datatype;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 使用采集器与设备通讯时填充的协议参数对象.
 */
public class CollectingArgumentsVO implements Serializable {

	/** 协议名称. */
	private String name;

	/** The meta data. */
	private HashMap<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * 构造器.
	 * 
	 */
	public CollectingArgumentsVO() {

	}

	/**
	 * 构造器.
	 * 
	 * @param name 采集器名
	 * @param metaData 采集器参数
	 */
	public CollectingArgumentsVO(String name, HashMap<String, Object> metaData) {
		this.name = name;
		this.metaData = metaData;
	}

	/**
	 * 构造器.
	 * 
	 * @param parameterinfo 参数信息
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Parameter
	 */
	public CollectingArgumentsVO(Parameter[] parameterinfo) {
		if (metaData != null) {

			for (int i = 0; i < parameterinfo.length; i++) {
				this.metaData.put(parameterinfo[i].name, null);
			}
		}
	}

	/**
	 * 设置采集器名称.
	 * 
	 * @param name -
	 * 指定新的采集器名称
	 * 
	 */
	public void setCollectorInfoName(String name) {
		this.name = name;
	}

	/**
	 * 返回采集器名称.
	 * 
	 * @return 采集器名
	 * 
	 */
	public String getCollectorInfoName() {
		return name;
	}

	/**
	 * 设置对应的协议参数
	 * 
	 * @param paramName -
	 * 参数名
	 * @param paramValue -
	 * 参数值
	 * 
	 */
	public void putParamValue(String paramName, Object paramValue) {
		metaData.put(paramName, paramValue);
	}

	/**
	 * 返回参数的值.
	 * 
	 * @param paramName 参数名
	 * 
	 * @return 参数值
	 * 
	 */
	public Object getParamValue(String paramName) {
		return metaData.get(paramName);
	}

	/**
	 * 设置参数.
	 * 
	 * @param param 参数
	 */
	public void setParam(HashMap<String, Object> param) {
		this.metaData = param;
	}

	/**
	 * 获取参数.
	 * 
	 * @return 参数
	 */
	public HashMap<String, Object> getParam() {
		return this.metaData;
	}

	/**
	 * 获取参数名称.
	 * 
	 * @return 参数名称列表
	 * 
	 */
	public ArrayList<String> getParamNames() {
		int len = metaData.size();
		if (len > 0) {
			ArrayList<String> params = new ArrayList<String>();
			Iterator iterator = metaData.keySet().iterator();
			while (iterator.hasNext()) {
				params.add((String) iterator.next());
			}
			return params;
		}
		return null;
	}
}
