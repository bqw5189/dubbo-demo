package net.business.collector.entity.datatype;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 采集器属性信息对象
 */
public class CollectorAttributes implements Serializable {

	/** 实现该采集器的类路径*/
	private String code;

	/** 采集器名称*/
	private String name;

	/** 生产商名称*/
	private String vendor;

	/** 生产日期，使用YYYY-MM-DD格式*/
	private String date;

	/** 采集器实现的版本号.*/
	private String version;

	/** 采集器使用的参数*/
	private String description;

	/** 参数列表*/
	private ArrayList<Parameter> parameters;

	/**
	 * 构造函数
	 */
	public CollectorAttributes() {

	}

	/**
	 * 设置实现该采集器的类路径
	 * 
	 * @param code --实现该采集器的类路径
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取实现该采集器的类路径
	 * 
	 * @return 实现该采集器的类路径
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * 设置采集器名称
	 * @param name -采集器名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取采集器名称
	 * 
	 * @return 采集器名称
	 * 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置生产商名称
	 * 
	 * @param vendor -生产商名称
	 * 
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * 获取设置生产商名称
	 * 
	 * @return 设置生产商名称
	 * 
	 */
	public String getVendor() {
		return this.vendor;
	}

	/**
	 * 设置生产日期
	 * 
	 * @param date --生产日期
	 * 
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * 获取生产日期
	 * 
	 * @return 生产日期
	 * 
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * 设置采集器版本
	 * 
	 * @param version --采集器版本
	 * 
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 获取采集器版本
	 * 
	 * @return 采集器版本
	 * 
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * 设置参数列表
	 * 
	 * @param param --参数列表
	 * 
	 */
	public void setParameters(ArrayList<Parameter> param) {
		this.parameters = param;
	}

	/**
	 * 获取参数列表
	 * 
	 * @return ArrayList<String[]> 参数列表
	 * 
	 */
	public ArrayList<Parameter> getParameters() {
		return this.parameters;
	}

	/**
	 * 获取采集器描述 
	 * 
	 * @return 采集器描述 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置采集器描述 
	 * 
	 * @param description --采集器描述 
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 判断两个实例是否相等.
	 * 
	 * @param other --目标对象
	 * 
	 * @return true-相等
	 */

	public boolean equals(CollectorAttributes other) {
		boolean isParamEqual = true;
		if ((!this.code.equals(other.code)) || (!this.date.equals(other.date))
				|| (!this.description.equals(other.description))
				|| (!this.name.equals(other.name))
				|| (!this.vendor.equals(other.vendor))
				|| (!this.version.equals(other.version)))
			return false;

		if ((parameters.size()) != other.parameters.size())
			return false;
		for (int i = 0; i < parameters.size(); i++) {
			isParamEqual = parameters.get(i).equals(other.parameters.get(i));
			if (!isParamEqual)
				break;
		}
		return isParamEqual;
	}

}
