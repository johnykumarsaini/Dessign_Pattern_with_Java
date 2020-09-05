package in.jk.structural.dessignpatterns.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileFactory implements MobilePhone {

	
	List<String> modelList = new ArrayList<String>();
	
	public MobileFactory() {
		
		modelList.add("A8");
		modelList.add("A7");
		modelList.add("A8");
		modelList.add("A8");
		modelList.add("A35");
		modelList.add("A5");
		modelList.add("A8");
		modelList.add("A35");
		modelList.add("A9");
		modelList.add("A8");
		modelList.add("A35");
	
	}
	
	@Override
	public Map<String,Mobile> getMobile() {
		
		Map<String,Mobile> mobileMap = new HashMap<String,Mobile>();
		Mobile mobile=null;
		
		for (String model : modelList) {
			
			mobile=new Mobile();
			mobile.setCompany("Samsung");
			mobile.setName("Galaxy");
			mobile.setPrice(Math.random());
			mobile.setModelName(model);
			mobileMap.put(model, mobile);
			
		}
		
		return mobileMap;
	}
	
	

}
