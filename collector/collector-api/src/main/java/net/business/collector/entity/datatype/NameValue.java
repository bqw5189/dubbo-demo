/*
 * 
 */

package net.business.collector.entity.datatype;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import java.io.Serializable;


/**
 * 采集属性名值对.
 */
public class NameValue implements Serializable {
	
	/** The key. */
	private Name key;
	
	/** The value. */
	private Value value;
	
	/**
	 * 获取采集属性名.
	 * 
	 * @return 采集属性名
	 */
	public Name getKey() {
		return key;
	}
	
	/**
	 * 设置采集属性名.
	 * 
	 * @param key 新的采集属性名
	 */
	public void setKey(Name key) {
		this.key = key;
	}
	
	/**
	 * 获取采集属性值.
	 * 
	 * @return 采集属性值
	 */
	@XmlElementRefs({
		@XmlElementRef(type=TableObject.class),
		@XmlElementRef(type=IntegerObject.class),
		@XmlElementRef(type=IPAddress.class),
		@XmlElementRef(type=StringObject.class)
	})
	public Value getValue() {
		return value;
	}
	
	/**
	 * 设置采集属性值.
	 * 
	 * @param value 新的采集属性值
	 */
	public void setValue(Value value) {
		this.value = value;
	}
	
	/**
	 * 构造器.
	 */
	public NameValue(){}
}
