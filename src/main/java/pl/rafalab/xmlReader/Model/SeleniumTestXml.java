package pl.rafalab.xmlReader.Model;

import java.util.List;
import java.util.Map;

public class SeleniumTestXml {

	String name;
	Map<String, String> counters;
	List<Suite> suiteList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getCounters() {
		return counters;
	}

	public void setCounters(Map<String, String> counters) {
		this.counters = counters;
	}

	public List<Suite> getSuiteList() {
		return suiteList;
	}

	public void setSuiteList(List<Suite> suiteList) {
		this.suiteList = suiteList;
	}
	 
}
