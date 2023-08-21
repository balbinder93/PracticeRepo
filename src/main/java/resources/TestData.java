package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestData {

	
	public AddPlace addPlace() {
		AddPlace p =new AddPlace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 09");;
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 983 893 3937");;
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName("Frontline house");
		List<String> myList =new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");

		p.setType(myList);
		Location l =new Location();
		l.setLan(-38.383494);
		l.setLan(33.427362);
		p.setLocation(l);
		return p;
	}
}
