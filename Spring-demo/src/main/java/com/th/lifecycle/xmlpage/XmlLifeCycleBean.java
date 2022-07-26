package com.th.lifecycle.xmlpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName: XmlLifeCycleBean
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/4 15:21
 * @Version 1.0
 */
public class XmlLifeCycleBean {
	private static final Log LOGGER = LogFactory.getLog(XmlLifeCycleBean.class);

	private  String  webName;

	private  String url;

	public void setWebName(String webName) {
		this.webName = webName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "XmlLifeCycleBean{" +
				"webName='" + webName + '\'' +
				", url='" + url + '\'' +
				'}';
	}

	/**
	 * 初始化回调方法
	 */
	public  void init(){
		LOGGER.info("在 XML 配置中通过 init-method 属性指定初始化方法：init() 方法");
	}

	/**
	 * 销毁回调反复
	 */
	public  void destroy(){
		LOGGER.info("在 XML 配置中通过 destroy-method 属性指定回调方法：destroy() 方法");
	}
}