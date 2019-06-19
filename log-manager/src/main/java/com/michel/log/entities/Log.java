package com.michel.log.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Michel Mendes	17/06/2019
 * Entidade Log
 */
public class Log implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String fileName;
	private String description;
	private Date data;
    private List<LogData> logDataList;

	
	public Log() {
		super();
	}

	public Log(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public List<LogData> getLogDataList() {
		return logDataList;
	}

	public void setLogDataList(List<LogData> logDataList) {
		this.logDataList = logDataList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
