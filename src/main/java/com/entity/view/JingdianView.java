package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JingdianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 旅游景点
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jingdian")
public class JingdianView extends JingdianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 景点类型的值
	*/
	@ColumnInfo(comment="景点类型的字典表值",type="varchar(200)")
	private String jingdianValue;




	public JingdianView() {

	}

	public JingdianView(JingdianEntity jingdianEntity) {
		try {
			BeanUtils.copyProperties(this, jingdianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 景点类型的值
	*/
	public String getJingdianValue() {
		return jingdianValue;
	}
	/**
	* 设置： 景点类型的值
	*/
	public void setJingdianValue(String jingdianValue) {
		this.jingdianValue = jingdianValue;
	}




	@Override
	public String toString() {
		return "JingdianView{" +
			", jingdianValue=" + jingdianValue +
			"} " + super.toString();
	}
}
