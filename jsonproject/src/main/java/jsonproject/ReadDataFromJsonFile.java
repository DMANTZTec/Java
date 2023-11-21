package jsonproject;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadDataFromJsonFile {
public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
		
		JSONParser jsonparser=new JSONParser();
		
		FileReader reader=new FileReader(".\\jsonFile\\stations");
		Object obj=jsonparser.parse(reader);
		JSONObject stationsjsonobj=(JSONObject)obj;
		String tname=(String) stationsjsonobj.get("TrainName");
		System.out.println("Trainname : "+ tname);

		
		JSONArray array=(JSONArray)stationsjsonobj.get("station");
		for(int i=0;i<array.size();i++) {
			JSONObject stations=(JSONObject)array.get(i);
			
			String sname=(String) stations.get("stationName");
			String scode=(String) stations.get("stationCode");
			String scity=(String) stations.get("city");
			String splatforms= (String) stations.get("platforms");
			
			System.out.println("Station "+ i + " Detains ");
			System.out.println("stationName :" +sname);
			System.out.println("stationCode :" +scode);
			System.out.println("city :"+scity);
			System.out.println("platforms :" +splatforms);
			
			System.out.println(" ");



		}
		
		System.out.println(" ");
		


}
}
