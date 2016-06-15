/**
 *
 */
package net.business.collector.entity.datatype;

import java.util.Collection;


/**
 * 抽象表格值.
 */
public abstract class AbstractTable extends Value {


    public int getType() {
        return Value.TYPE_TABLE;
    }


    public long toLongValue() {
        return -1;
    }


    public String toStringValue() {
        return null;
    }


    public Collection toCollection() {
        return null;
    }

    /**
     * 获取列数.
     *
     * @return 列数
     */
    abstract public int getColumnCount();

    /**
     * 获取列名.
     *
     * @param columnIndex 列索引
     * @return 列名
     */
    abstract public String getColumnName(int columnIndex);

    /**
     * 获取行数.
     *
     * @return 行数
     */
    abstract public int getRowCount();

    /**
     * 获取单元值.
     *
     * @param rowIndex    行索引
     * @param columnIndex 列索引
     * @return 值对象
     */
    abstract public NameValue getValueAt(int rowIndex, int columnIndex);

    /**
     * 设置单元值.
     *
     * @param value       值对象
     * @param rowIndex    行索引
     * @param columnIndex 列索引
     */
    abstract public void setValueAt(NameValue value, int rowIndex, int columnIndex);

}
