package pl.rafalab.xmlReader.Model;

import java.util.Map;

public class Suite {

	Long duration;
	String locationUrl;
	String name;
	String status;
	Map<String, String> output;
	
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getLocationUrl() {
		return locationUrl;
	}
	public void setLocationUrl(String locationUrl) {
		this.locationUrl = locationUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Map<String, String> getOutput() {
		return output;
	}
	public void setOutput(Map<String, String> output) {
		this.output = output;
	}
	
	
}
