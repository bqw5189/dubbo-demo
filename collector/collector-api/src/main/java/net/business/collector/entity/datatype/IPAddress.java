/*
 * 
 */
package net.business.collector.entity.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

/**
 * IP地址类型值对象.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "ipAddress")
public class IPAddress extends Value {

    /**
     * The timestamp.
     */
    private long timestamp;

    /**
     * The device timestamp.
     */
    private long deviceTimestamp;

    /**
     * The address string.
     */
    @XmlElement
    private String addressString;

    /**
     * The is correct.
     */
    private boolean isCorrect = true;

    /**
     * The status.
     */
    private int status;

    /**
     * The description.
     */
    private String description;

    /**
     * 构造IP地址对象.
     */
    public IPAddress() {

    }

    /**
     * 构造IP地址对象.
     *
     * @param address 地址
     */
    public IPAddress(String address) {
        this.addressString = address;
    }

    /**
     * 设置值正确性.
     *
     * @param isCorrect 值是否正确
     */
    public void setCorrectValue(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getDeviceTimestamp()
     */
    public long getDeviceTimestamp() {
        return deviceTimestamp;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getTimestamp()
     */
    public long getTimestamp() {
        return timestamp;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getType()
     */
    public int getType() {
        return Value.TYPE_ADDRESS;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getValue()
     */
    public Object getValue() {
        return addressString;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#isCorrectValue()
     */
    public boolean isCorrectValue() {
        return this.isCorrect;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#setDeviceTimestamp(long)
     */
    public void setDeviceTimestamp(long time) {
        this.deviceTimestamp = time;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#setTimestamp(long)
     */
    public void setTimestamp(long time) {
        this.timestamp = time;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toCollection()
     */
    public Collection toCollection() {
        return null;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toLongValue()
     */
    public long toLongValue() {
        return -1;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toStringValue()
     */
    public String toStringValue() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toTable()
     */
    public AbstractTable toTable() {
        return null;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#getValueStatus()
     */
    public int getValueStatus() {
        return this.status;
    }

    /**
     * 设置状态.
     *
     * @param status 新状态
     */
    public void setStatus(int status) {
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

    /**
     * 获取IP地址.
     *
     * @return IP地址
     */
    public String getAddressString() {
        return addressString;
    }

    /**
     * 设置新地址.
     *
     * @param addressString 新地址
     */
    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }
}
