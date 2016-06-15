/*
 * 
 */
package net.business.collector.entity.datatype;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collection;

/**
 * 采集属性值.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="valueObject")
public abstract class Value implements Serializable {
	
	/** 整数型采集属性值. */
	public final static int TYPE_INTEGER = 0;
	
	/** 字符串型采集属性值. */
	public final static int TYPE_STRING = 1;
	
	/** 表格型采集属性值. */
	public final static int TYPE_TABLE = 2;
	
	/** 集合型采集属性值. */
	public final static int TYPE_COLLECTION = 4;
	
	/** 其它型采集属性值. */
	public final static int TYPE_OTHER = 5;
	
	
	/** 依赖于操作系统的采集属性值. */
	public final static int TYPE_TELNET_DEPEND_OS = 6;
	
	/** 依赖于脚本的采集属性值. */
	public final static int TYPE_TELNET_DEPEND_SCRIPT = 7;
//	public final static int TYPE_ORACLE_QUERY = 8;
	/** Oracle专用表格型采集属性值. */
	public final static int TYPE_ORACLE_TABLE = 8;
	
	/** Telnet操作专用表格型采集属性值. */
	public final static int TYPE_TELNET_TABLE_REG = 9;
	
	/** Telnet操作专用字符串型采集属性值. */
	public final static int TYPE_TELNET_STRING_REG = 10;
	
	/** Telnet左分析专用字符串型采集属性值. */
	public final static int TYPE_TELNET_STRING_REGLeft = 11;
	
	/** 定长型采集属性值. */
	public final static int TYPE_FIX_LENGTH = 12;
	
	/** 地址型型采集属性值. */
	public final static int TYPE_ADDRESS = 13;
	
	/** 最大长度. */
	public final static int MAXLENGTH = 1024;
	
//	public final static int INVALID_VALUE = -1;
	
	//从协议栈返回值的状�??
	/** 设备上没有对应的指标值. */
	public final static int STATUS_NO_SUCH_VALUE = 1;
	
	/** 设备访问超时. */
	public final static int STATUS_TIMEOUT_VALUE = 2;
	
	
	/**
	 * 获取值类型.
	 * 
	 * @return 值类型
	 */
	public abstract int getType();
	

	
	/**
	 * 获取长整型值.
	 * 
	 * @return 长整型值
	 */
	public abstract long toLongValue();
	
	/**
	 * 获取字符串型值.
	 * 
	 * @return 字符串型值
	 */
	public abstract String toStringValue();
	
	
	/**
	 * 获取表格型值.
	 * 
	 * @return 表格型值
	 */
	public abstract AbstractTable toTable();
	
	/**
	 * 获取集合型值.
	 * 
	 * @return 集合型值
	 */
	public abstract Collection toCollection();
	
	/**
	 * 判断值是否正确.
	 * 
	 * @return true, 如果值正确;false, 如果值不正确
	 */
	public abstract boolean isCorrectValue();
	
	/**
	 * 获取采集时间戳.
	 * 
	 * @return 采集时间戳
	 */
	public abstract long getTimestamp();
	
	/**
	 * 获取设备响应时间戳.
	 * 
	 * @return 设备响应时间戳
	 */
	public abstract long getDeviceTimestamp();
	
	/**
	 * 设置设备响应时间戳.
	 * 
	 * @param time 新的设备响应时间戳
	 */
	public abstract void setDeviceTimestamp(long time);
	
	/**
	 * 设置采集时间戳.
	 * 
	 * @param time 新的采集时间戳
	 */
	public abstract void setTimestamp(long time);
	
	/**
	 * 获取属性值.
	 * 
	 * @return 属性值
	 */
	public abstract Object getValue();
	
	/**
	 * 获取属性值状态.
	 * 
	 * @return 属性值状态
	 */
	public abstract int getValueStatus();
	
	/**
	 * 获取属性值描述.
	 * 
	 * @return 属性值描述
	 */
	public abstract String getValueDescription();
	
	/**
	 * 设置属性值描述.
	 * 
	 * @param desc 新的属性值描述
	 */
	public abstract void setValueDescription(String desc);
	
}
