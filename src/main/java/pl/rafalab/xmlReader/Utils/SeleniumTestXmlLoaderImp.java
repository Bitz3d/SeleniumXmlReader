package pl.rafalab.xmlReader.Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import pl.rafalab.xmlReader.Model.SeleniumTestXml;
import pl.rafalab.xmlReader.Model.Suite;

public class SeleniumTestXmlLoaderImp implements SeleniumTestXmlLoader {

	@Override
	public List<SeleniumTestXml> getSeleniumTest(File file) {
		
		List<SeleniumTestXml> seleniumList = new ArrayList<SeleniumTestXml>();
		Map<String, String> counters;
		SeleniumTestXml seleniumTestXml = new SeleniumTestXml();
		
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(file);
			doc.getDocumentElement().normalize();
//			//do testun
//			NodeList nList = doc.getElementsByTagName("testrun");
//			Node node = nList.item(0);
//			//
			
			//Counters
			NodeList counterList = doc.getElementsByTagName("count");
			counters=getCounters(counterList);
			seleniumTestXml.setName(file.getName());
			seleniumTestXml.setCounters(counters);

			//Suits
			NodeList suiteList = doc.getElementsByTagName("suite");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return seleniumList;
	} 
	
	private Map<String, String> getCounters(NodeList counterList){
		Map<String, String> dountersData = new HashMap<>();
		for(int i =0;i<counterList.getLength();i++){
			Node node = counterList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				
				Element element = (Element) node;
				dountersData.put(element.getAttribute("name"), element.getAttribute("value"));
			}	
		}
		return dountersData;
		
	}
	
	private List<Suite> getSuites(NodeList suiteList){
		List<Suite> suitesData = new ArrayList<>();
		//TODO

		return suitesData;
		
	}

}
