package net.business.collector.entity.datatype;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 用于描述采集器参数属性对象信息
 */
public class Parameter implements Serializable {

	/** 参数名称*/
	public String name;

	/** 参数类型*/
	public String type;

	/** 描述信息*/
	public String description;

	/** 采集器定位标识 */
	public String anchor;

	/**
	 * 构造函数
	 */
	public Parameter() {

	}

	/**
	 * 构造函数
	 * 
	 * @param parameter --参数属性信息
	 */
	public Parameter(String[] parameter) {
		if (parameter.length == 4) {
			name = parameter[0];
			type = parameter[1];
			description = parameter[2];
			anchor = parameter[3];
		}
	}

	/**
	 * 比较两个对象是否相等
	 * 
	 * @param other --目标比较对象
	 * 
	 * @return true --相等 false-不相等
	 */
	public boolean equals(Parameter other) {
		return (this.name.equals(other.name)) && (this.type.equals(other.type))
				&& (this.description.equals(other.description))
				&& (this.anchor.equals(other.anchor));
	}

	/**
	 * 测试方法
	 * 
	 * @param args 相应变量
	 */
	public static void main(String[] args) {
		String[] one = new String[] { "1", "2", "3", "4" };
		String[] two = new String[] { "1", "2", "3", "4" };
		Parameter info1 = new Parameter(one);
		Parameter info2 = new Parameter(two);
		ArrayList<Parameter> info = new ArrayList<Parameter>();
		info.add(info1);
		info.add(info2);
		Parameter info3 = (Parameter) info.get(0);
		Parameter info4 = (Parameter) info.get(1);
		System.out.println(info3.equals(info4));
		System.out.println(info1.equals(info2));

	}

}
