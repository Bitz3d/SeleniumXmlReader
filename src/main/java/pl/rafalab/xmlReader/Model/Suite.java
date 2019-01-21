package pl.rafalab.xmlReader.Model;

import java.util.List;

public class Suite {

	Long duration;
	String locationUrl;
	String name;
	String status;
	List<TestCase> tastCaseList;
	
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
	public List<TestCase> getTastCaseList() {
		return tastCaseList;
	}
	public void setTastCaseList(List<TestCase> tastCaseList) {
		this.tastCaseList = tastCaseList;
	}

	
	
}
