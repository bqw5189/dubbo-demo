package net.business.collector.entity.datatype;

import java.io.Serializable;

/**
 * 采集器详细信息对象
 */
public class CollectorInfo implements Serializable {

	/** 采集器名称*/
	private String name;

	/** 采集器的编写厂商*/
	private String vendor;

	/** 采集器编写的日期*/
	private String date;

	/** 采集器的版本*/
	private String version;

	/** 采集器的描述信息*/
	private String description;

	/** 采集器参数列表信息*/
	private Parameter[] info;

	/** 采集参数对象*/
	private CollectingArgumentsVO parameters;

	/**
	 * 能够通过该信息让采集器唯一确定设备的参数
	 */
	private String meta;

	/**
	 * 构造函数
	 */
	public CollectorInfo() {

	}

	/**
	 * 构造函数
	 * 
	 * @param collectorAttributes --采集器属性信息对象
	 * @param collectingArgumentsVO --采集参数对象
	 * @param info 					--参数值信息
	 */
	public CollectorInfo(CollectorAttributes collectorAttributes,
			CollectingArgumentsVO collectingArgumentsVO, Parameter[] info) {
		this.name = collectorAttributes.getName();
		this.vendor = collectorAttributes.getVendor();
		this.date = collectorAttributes.getDate();
		this.version = collectorAttributes.getVersion();
		this.description = collectorAttributes.getDescription();

		this.info = info;
		this.parameters = collectingArgumentsVO;
		this.parameters.setCollectorInfoName(name);

	}

	/**
	 * 获取采集器名称
	 * 
	 * @return 采集器名称
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * 获取采集器的编写厂商
	 * 
	 * @return 采集器的编写厂商
	 * 
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * 获取采集器编写的日期
	 * 
	 * @return 采集器编写的日期
	 * 
	 */
	public String getDate() {
		return date;
	}

	/**
	 * 获取采集器的版本
	 * 
	 * @return 采集器的版本
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * 获取采集器的描述信息
	 * 
	 * @return 采集器的描述信息
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 获取采集器参数列表
	 * 
	 * @return 采集器参数列表
	 * 
	 */
	public Parameter[] getParamInfos() {
		return info;
	}

	/**
	 * 获取采集参数对象
	 * 
	 * @return 采集参数对象
	 * 
	 */
	public CollectingArgumentsVO getParameter() {
		return parameters;
	}

}
