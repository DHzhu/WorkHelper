/**
 * 
 */
package com.model;

import java.time.LocalDate;

import com.controller.utils.DateUtil;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @desc  : TODO
 * @author: Zhu
 * @date  : 2017年12月19日
 */
public class Person {
	private final StringProperty name;
	private final StringProperty skill;
	private final StringProperty status;
	private final ObjectProperty<LocalDate> startDate;
	private final ObjectProperty<LocalDate> endDate;
	
	public Person() {
		this(null, null, null, null, null);
	}
	
	public Person(String name, String skill, String status, String startDate, String endDate) {
		this.name = new SimpleStringProperty(name);
		this.skill = new SimpleStringProperty(skill);
		this.status = new SimpleStringProperty(status);
		
		this.startDate = new SimpleObjectProperty<LocalDate>(DateUtil.parse(startDate));
		this.endDate = new SimpleObjectProperty<LocalDate>(DateUtil.parse(endDate));
	}

	/**
	 * 
	 */
	public StringProperty getName() {
		return name;
	}

	/**
	 * 
	 */
	public StringProperty getSkill() {
		return skill;
	}

	/**
	 * 
	 */
	public StringProperty getStatus() {
		return status;
	}

	/**
	 * 
	 */
	public ObjectProperty<LocalDate> getStartDate() {
		return startDate;
	}

	/**
	 * 
	 */
	public ObjectProperty<LocalDate> getEndDate() {
		return endDate;
	}
	
}
