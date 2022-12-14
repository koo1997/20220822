/**
 * 
 */
package com.javateam.SpringMediaDemo.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.ToString;

/**
 * @author javateam
 *
 */
@XmlRootElement(name = "product")
// @ToString
public class ProductVO {
	
	private String id;
	private String name;
	private String detail;
	
	public ProductVO() {}
	
	public ProductVO(String id, String name, String detail) {
		this.id = id;
		this.name = name;
		this.detail = detail;
	}

	public String getId() {
		return id;
	}
	
	@XmlElement
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDetail() {
		return detail;
	}
	
	@XmlElement
	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", detail=" + detail + "]";
	}
	
}