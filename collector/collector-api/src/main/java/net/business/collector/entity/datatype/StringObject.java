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
 * 字符串值对象.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "stringObject")
public class StringObject extends Value {

    /**
     * The value.
     */
    @XmlElement(name = "stringValue")
    private String value;


    /**
     * The time.
     */
    private long time;

    /**
     * The device time.
     */
    private long deviceTime;

    /**
     * The is correct.
     */
    private boolean isCorrect = true;

    /**
     * The status.
     */
    @XmlElement
    private int status;


    /**
     * The description.
     */
    @XmlElement
    private String description;

    public int getType() {
        return Value.TYPE_STRING;
    }


    public long toLongValue() {
        return -1;
    }


    public String toStringValue() {
        return this.value;
    }


    /**
     * 设置新值.
     *
     * @param value 新值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 构造字符串对象.
     */
    public StringObject() {

    }

    /**
     * 构造字符串对象.
     *
     * @param value 值
     */
    public StringObject(String value) {
        this.value = value;
    }

    /**
     * 构造字符串对象
     *
     * @param value
     * @param deviceTime
     */
    public StringObject(String value, long deviceTime) {
        this.value = value;
        this.deviceTime = deviceTime;
    }

    /* (non-Javadoc)
     * @see cn.com.ruijie.ssc.netinsight.server.collector.interfaces.model.Value#toTable()
     */
    public AbstractTable toTable() {
        return null;
    }


    public Collection toCollection() {
        return null;
    }

    public String toString() {
        super.toString();
        return this.value;
    }


    public boolean isCorrectValue() {
        return this.isCorrect;
    }

    /**
     * 设定值正确性.
     *
     * @param isCorrect 新的正确性
     */
    public void setCorrectValue(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }


    public long getTimestamp() {
        return this.time;
    }


    public String getValue() {
        return this.value;
    }


    public void setTimestamp(long time) {
        this.time = time;
    }


    public long getDeviceTimestamp() {
        return this.deviceTime;
    }

  public void setDeviceTimestamp(long time) {
        this.deviceTime = time;
    }

    public int getValueStatus() {
        return this.status;
    }

    /**
     * 设置新状态.
     *
     * @param status 新状态
     */
    public void setStatus(int status) {
        this.status = status;
    }

    public String getValueDescription() {
        return this.description;
    }

    public void setValueDescription(String desc) {
        this.description = desc;
    }
}
