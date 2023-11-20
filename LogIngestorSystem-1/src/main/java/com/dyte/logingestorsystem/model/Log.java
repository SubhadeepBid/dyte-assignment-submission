package com.dyte.logingestorsystem.model;

import java.sql.Timestamp;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Log {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer logId;
	
	private String level;
	
	private String message;
	
	private String resourceId;
	
	private Timestamp timestamp;
	
	private String traceId;
	
	private String spanId;
	
	private String commit;
	
	@Embedded
	private MetaData metadata;
	
	public Log() {
		// TODO Auto-generated constructor stub
	}

	public Log(Integer logId, String level, String message, String resourceId, Timestamp timestamp, String traceId,
			String spanId, String commit, MetaData metadata) {
		super();
		this.logId = logId;
		this.level = level;
		this.message = message;
		this.resourceId = resourceId;
		this.timestamp = timestamp;
		this.traceId = traceId;
		this.spanId = spanId;
		this.commit = commit;
		this.metadata = metadata;
	}

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getSpanId() {
		return spanId;
	}

	public void setSpanId(String spanId) {
		this.spanId = spanId;
	}

	public String getCommit() {
		return commit;
	}

	public void setCommit(String commit) {
		this.commit = commit;
	}

	public MetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", level=" + level + ", message=" + message + ", resourceId=" + resourceId
				+ ", timestamp=" + timestamp + ", traceId=" + traceId + ", spanId=" + spanId + ", commit=" + commit
				+ ", metadata=" + metadata + "]";
	}

}
