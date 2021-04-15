package collection;

import java.util.*;
public class MapInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,HashMap<String,Double>> FlightDetails = new HashMap<String,HashMap<String,Double>>();
		HashMap<String,Double> airasia= new HashMap<String,Double>();
		airasia.put("IS-980|IS-971", 4404.00);
		airasia.put("IS-968|IS-170", 4045.00);
		
		HashMap<String,Double> airindia= new HashMap<String,Double>();
		airindia.put("G8-564|G8-988", 5000.00);
		
		FlightDetails.put("AirAsia", airasia);
		FlightDetails.put("AirIndia", airindia);
		System.out.println(FlightDetails);
		System.out.println(airasia);
		
		System.out.println(FlightDetails.get("AirIndia").get("G8-564|G8-988"));
		
		

	}

}
