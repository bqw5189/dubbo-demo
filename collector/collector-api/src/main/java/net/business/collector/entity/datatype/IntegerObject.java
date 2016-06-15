/**
 * 
 */
package net.business.collector.entity.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

/**
 * 整型值对象.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="integerObject")
public class IntegerObject extends Value {

	/** The is correct. */
	private boolean isCorrect = true;
	
	/** The time. */
	private long time;
	
	/** The device time. */
	private long deviceTime;
	
	/** The value. */
	@XmlElement(name="intValue")
	private long value = -1;
	
	/** The status. */
	@XmlElement
	private int status;

	/** The description. */
	@XmlElement
	private String description;

	public int getType() {
		return Value.TYPE_INTEGER;
	}





	public long toLongValue() {
		return value;
	}

	/**
	 * 设置值.
	 * 
	 * @param value 值
	 */
	public void setValue(long value){
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getValue()
	 */
	public Long getValue(){
		return this.value;
	}
	
	/**
	 * 构造整型值对象.
	 */
	public IntegerObject(){
		
	}
	
	/**
	 * 构造整型值对象.
	 * 
	 * @param value 值
	 */
	public IntegerObject(long value){
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toStringValue()
	 */
	public String toStringValue() {
		return null;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toTable()
	 */
	public AbstractTable toTable() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toCollection()
	 */
	public Collection toCollection(){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		super.toString();
		return ""+this.value;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#isCorrectValue()
	 */
	public boolean isCorrectValue() {
		return this.isCorrect;
	}
	
	/**
	 * 设置值正确性.
	 * 
	 * @param isCorrect 值是否正确
	 */
	public void setCorrectValue(boolean isCorrect){
		this.isCorrect = isCorrect;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getTimestamp()
	 */
	public long getTimestamp() {
		return this.time;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#setTimestamp(long)
	 */
	public void setTimestamp(long time) {
		this.time = time;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getDeviceTimestamp()
	 */
	public long getDeviceTimestamp() {
		return this.deviceTime;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#setDeviceTimestamp(long)
	 */
	public void setDeviceTimestamp(long time) {
		this.deviceTime = time;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getValueStatus()
	 */
	public int getValueStatus() {
		return this.status;
	}
	
	/**
	 * 设定值状态.
	 * 
	 * @param status 状态
	 */
	public void setStatus(int status){
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getValueDescription()
	 */
	public String getValueDescription() {
		return this.description;
	}

	/* (non-Javadoc)
	 * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#setValueDescription(java.lang.String)
	 */
	public void setValueDescription(String desc) {
		this.description = desc;
	}
}
