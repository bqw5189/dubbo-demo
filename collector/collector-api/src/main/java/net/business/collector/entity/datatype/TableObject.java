/*
 * 
 */

package net.business.collector.entity.datatype;


import net.business.collector.entity.datatype.tableadapter.TableObjectAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Vector;

/**
 * 表格值对象.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "tableObject")
public class TableObject extends AbstractTable {

    /**
     * The data vector.
     */
    @XmlElement(nillable = true)
    @XmlJavaTypeAdapter(TableObjectAdapter.class)
    protected Vector<Vector<NameValue>> dataVector = new Vector<Vector<NameValue>>();
//	 private String[][] data;
    /**
     * The column identifiers.
     */
    @XmlElement
    protected Vector<String> columnIdentifiers = new Vector<String>();

    /**
     * The is correct.
     */
    private boolean isCorrect = true;

    /**
     * The time.
     */
    private long time;

    /**
     * The device time.
     */
    private long deviceTime;

    /**
     * The status.
     */
    private int status;

    /**
     * 构造表格对象.
     */
    public TableObject() {

    }

    /**
     * The description.
     */
    private String description;

    /**
     * New vector.
     *
     * @param size the size
     * @return the vector< vector< name value>>
     */
    private static Vector<Vector<NameValue>> newVector(int size) {
        Vector<Vector<NameValue>> v = new Vector<Vector<NameValue>>(size);
        v.setSize(size);
        return v;
    }

    /**
     * New header vector.
     *
     * @param size the size
     * @return the vector< string>
     */
    private static Vector<String> newHeaderVector(int size) {
        Vector<String> v = new Vector<String>();
        v.setSize(size);
        return v;
    }


    /**
     * Non null vector.
     *
     * @param v the v
     * @return the vector< vector< name value>>
     */
    private static Vector<Vector<NameValue>> nonNullVector(Vector<Vector<NameValue>> v) {
        return (v != null) ? v : new Vector<Vector<NameValue>>();
    }

    /**
     * Non header null vector.
     *
     * @param v the v
     * @return the vector< string>
     */
    private static Vector<String> nonHeaderNullVector(Vector<String> v) {
        return (v != null) ? v : new Vector<String>();
    }


    /**
     * 获取表格数据.
     *
     * @return 表格数据
     */
    public Vector<Vector<NameValue>> getDataVector() {
        return dataVector;
    }

    /**
     * 设置新表格数据.
     *
     * @param dataVector        表格数据
     * @param columnIdentifiers 列头信息
     */
    public void setDataVector(Vector<Vector<NameValue>> dataVector, Vector<String> columnIdentifiers) {
        this.dataVector = nonNullVector(dataVector);
        this.columnIdentifiers = nonHeaderNullVector(columnIdentifiers);
    }


    /**
     * Justify rows.
     *
     * @param from the from
     * @param to   the to
     */
    private void justifyRows(int from, int to) {
        dataVector.setSize(getRowCount());

        for (int i = from; i < to; i++) {
            if (dataVector.elementAt(i) == null) {
                dataVector.setElementAt(new Vector<NameValue>(), i);
            }
            ((Vector<NameValue>) dataVector.elementAt(i)).setSize(getColumnCount());
        }
    }

    /**
     * 构造表格对象.
     *
     * @param data        表格数据
     * @param columnNames 列名称
     */
    public TableObject(Vector<Vector<NameValue>> data, Vector<String> columnNames) {
        setDataVector(data, columnNames);
    }

    /**
     * 构造表格对象.
     *
     * @param columnNames 列名称
     * @param rowCount    行号
     */
    public TableObject(Vector<String> columnNames, int rowCount) {
        setDataVector(newVector(rowCount), columnNames);
    }

    /**
     * 构造表格对象.
     *
     * @param rowCount    行号
     * @param columnCount 列号
     */
    public TableObject(int rowCount, int columnCount) {
        this(newHeaderVector(columnCount), rowCount);
    }

    /**
     * 插入一行数据.
     *
     * @param row     行号
     * @param rowData 行数据
     */
    public void insertRow(int row, Vector<NameValue> rowData) {
        dataVector.insertElementAt(rowData, row);
        justifyRows(row, row + 1);
    }

    /**
     * 增加一行.
     *
     * @param rowData 行数据
     */
    public void addRow(Vector<NameValue> rowData) {
        insertRow(getRowCount(), rowData);
    }


    @Override
    public int getColumnCount() {
        return this.columnIdentifiers.size();
    }


    @Override
    public String getColumnName(int columnIndex) {

        Object id = null;
        if (columnIndex < columnIdentifiers.size()) {
            id = columnIdentifiers.elementAt(columnIndex);
        }
        if (id == null) return null;
        else
            return id.toString();
    }


    @Override
    public int getRowCount() {
        return this.dataVector.size();
    }


    @Override
    public NameValue getValueAt(int rowIndex, int columnIndex) {
        Vector<NameValue> rowVector = null;
        try {
            rowVector = dataVector.elementAt(rowIndex);
        } catch (Exception e1) {
            return null;
        }

        NameValue result = null;
        try {
            result = (NameValue) rowVector.elementAt(columnIndex);
        } catch (Exception e) {
        }
        return result;
    }


    @Override
    public void setValueAt(NameValue value, int rowIndex, int columnIndex) {
        Vector<NameValue> rowVector = dataVector.elementAt(rowIndex);
        rowVector.setElementAt(value, columnIndex);
    }


    public AbstractTable toTable() {
        return this;
    }


    public boolean isCorrectValue() {
        return this.isCorrect;
    }

    /**
     * 设置正确性.
     *
     * @param isCorrect 值是否正确
     */
    public void setCorrectValue(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }


    public long getTimestamp() {
        return this.time;
    }


    public void setTimestamp(long time) {
        this.time = time;
    }


    public Object getValue() {
        return this;
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
     * 设定状态.
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

    /**
     * 获取列头信息.
     *
     * @return 列头信息
     */
    public Vector<String> getColumnIdentifiers() {
        return columnIdentifiers;
    }

    /**
     * 设置新的列头信息.
     *
     * @param columnIdentifiers 新的列头信息
     */
    public void setColumnIdentifiers(Vector<String> columnIdentifiers) {
        this.columnIdentifiers = columnIdentifiers;
    }

}
