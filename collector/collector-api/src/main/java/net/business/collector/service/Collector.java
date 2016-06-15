package net.business.collector.service;

import net.business.collector.entity.datatype.NameValue;
import net.business.collector.exception.CollectorException;

import java.util.HashMap;


/**
 * 采集器接口
 */
public interface Collector {

   /**
    * 通过采集器 发送一次访问请求。
    * @param name  --采集器名称
    * @param param --相关参数
    * @return NameValue[] 访问后的结果信息
    * @throws CollectorException
    *
    */
	public NameValue[] request(String name, HashMap<String, Object> param)
			throws CollectorException;

	/**
	 * 用来执行通用工具传过来的命令参数
	 * @param cmd  --命令名
	 * @param args --命令想参数
	 * @param resourceId --资源id
	 * @return Object --命令执行结果
	 *
	 */
	public Object execute(String cmd, HashMap args, long resourceId);

	/**
	 * 获取反射串
	 * @param collectorType --采集器名称
	 * @param hash          --相关参数
	 * @return 反射串
	 * @throws CollectorException
	 */
	public String getCharacter(String collectorType, HashMap<String, Object> hash)
			throws CollectorException;
	
	/**
	 * 获取默认反射串
	 * @param collectorType  --采集器类型
	 * @param hash           --相关参数
	 * @return 默认反射串
	 * @throws CollectorException
	 */
	public String getDefaultModelName(String collectorType,
									  HashMap<String, Object> hash) throws CollectorException;
	
	/**
	 * 关闭相关资源
	 */
	public void close();

}
