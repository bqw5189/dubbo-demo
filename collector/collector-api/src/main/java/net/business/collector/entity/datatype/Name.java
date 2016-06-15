/**
 * 
 */
package net.business.collector.entity.datatype;

import java.io.Serializable;

/**
 * 采集结果属性名.
 * 
 */
public class Name implements Serializable {
	
	/** The key name. */
	private String keyName;
	
	/**
	 * 构造器.
	 * 
	 * @param name 属性名字符串
	 */
	public Name(String name){
		this.keyName = name;
	}
	
	/**
	 * 获取属性名字符串.
	 * 
	 * @return 属性名字符串
	 */
	public String getName(){
		return this.keyName;
	}
	
	/**
	 * 设置属性名.
	 * 
	 * @param name 新的属性名
	 */
	public void setName(String name){
		this.keyName = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return keyName;
	}
	
	/**
	 * 构造器.
	 */
	public Name(){}
}
