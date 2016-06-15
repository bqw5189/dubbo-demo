package net.business.collector.exception;


// TODO: Auto-generated Javadoc
/**
 * 底层采集器的异常类对象
 */
public class CollectorException extends Exception {
	
	/** 不确定的采集异常 */
	public final static int Uncertain = 0; // 不确定的，未知的
	
	/** 采集器参数不正确*/
	public final static int ParameterError = 1; // 采集器参数不正确
	
	/**被管对象不可访问*/
	public final static int TargetUnreachableError = 2; // 被管对象不可访问
	
	/** 查询或设置的 值对象不存在*/
	public final static int NoSuchObject = 3; // 虽然被管对象是可达的，但被查询或者设定的值对象是不存在的

	/** 错误号 */
	private int errorCode = CollectorException.Uncertain;
	
	/** 异常描述 */
	private String errorDetail; // 错误描述
	
	/** 发生错误的对象 */
	private Object errorObject; // 发生错误的对象

	/**
	 * 构造函数 --创建指定错误类型的异常
	 * 
	 * @param errorcode --异常号
	 */
	public CollectorException(int errorcode) {
		this.errorCode = errorcode;
	}

	/**
	 * 构造函数--创建指定错误类型和错误描述的异常实例
	 * 
	 * @param errorcode   --错误类型
	 * @param errordetail --错误描述
	 */
	public CollectorException(int errorcode, String errordetail) {
		this.errorCode = errorcode;
		this.errorDetail = errordetail;
	}

	/**
	 * 构造函数 --创建指定错误类型,错误描述及错误对象的异常实例
	 * 
	 * @param errorcode 	--错误类型
	 * @param errordetail 	--错误描述
	 * @param errorobject 	--错误对象
	 */
	public CollectorException(int errorcode, String errordetail,
							  Object errorobject) {
		this.errorCode = errorcode;
		this.errorDetail = errordetail;
		this.errorObject = errorobject;
	}

	/**
	 * 获取错误类型
	 * 
	 * @return 错误类型
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * 设置错误类型
	 * 
	 * @param errorCode --错误类型
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 获取错误描述
	 * 
	 * @return 错误描述
	 */
	public String getErrorDetail() {
		return errorDetail;
	}

	/**
	 * 设置错误描述
	 * 
	 * @param errorDetail --错误描述
	 */
	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}

	/**
	 * 获取错误对象
	 * 
	 * @return 错误对象
	 */
	public Object getErrorObject() {
		return errorObject;
	}

	/**
	 * 设置错误对象
	 * 
	 * @param errorObject --错误对象
	 */
	public void setErrorObject(Object errorObject) {
		this.errorObject = errorObject;
	}

}
