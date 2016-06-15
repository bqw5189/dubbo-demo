/*
 * 
 */
package net.business.collector.entity.datatype.tableadapter;

// TODO: Auto-generated Javadoc

import net.business.collector.entity.datatype.NameValue;
import net.business.collector.entity.datatype.StringObject;
import net.business.collector.entity.datatype.Value;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Vector;

/**
 * 表格对象适配器.
 * 将复杂的表格对象转换成jaxb可以传送到前台的格式.
 */
public class TableObjectAdapter extends XmlAdapter<TableRowDataWs[],Vector<Vector<NameValue>>> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public TableRowDataWs[] marshal(Vector<Vector<NameValue>> values)
			throws Exception {
		if(values!=null&&values.size()>0){
			Vector<NameValue> rowData = values.get(0);
			if(rowData!=null&&rowData.size()>0){
				int rowCount = values.size();
				int columnCount = rowData.size();
				TableRowDataWs[] datas = new TableRowDataWs[rowCount];
//				data.data = new String[rowCount][columnCount];
				for(int row=0;row<rowCount;row++){
					rowData = values.get(row);
					TableRowDataWs data = new TableRowDataWs();
//					data.data = new String[columnCount];
					data.setData(new String[columnCount]);
					datas[row] = data;
					for(int column=0;column<columnCount;column++){
						NameValue nameValue = rowData.get(column);
						if(nameValue!=null&&nameValue.getValue()!=null){
							Value value = nameValue.getValue();
							try {
//								data.data[column] = value.toString();
								data.getData()[column] = value.toString();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
				return datas;
			}

		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Vector<Vector<NameValue>> unmarshal(TableRowDataWs[] datas)
			throws Exception {
		
		if(datas!=null){
			Vector<Vector<NameValue>> result = new Vector<Vector<NameValue>>();
			for(int row=0;row<datas.length;row++){
				String[] rowData = datas[row].getData();
				if(rowData!=null){
					Vector<NameValue> rowNameValues = new Vector<NameValue>();
					for(int column=0;column<rowData.length;column++){
						NameValue cellValue = new NameValue();
						cellValue.setValue(new StringObject(rowData[column]));
						rowNameValues.add(cellValue);
					}
					result.add(rowNameValues);
				}
			}
		}
		
		return null;
	}

}
