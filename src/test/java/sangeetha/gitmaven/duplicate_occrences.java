package sangeetha.gitmaven;

import java.util.HashMap;
import java.util.Map.Entry;

public class duplicate_occrences {
		
		public static void duplicate(String name) {
			
			HashMap< String , Integer> hm = new HashMap<String, Integer>();
			
			String[] s=name.split(" ");
			
			for ( String tempstring : s){
				if(hm.get(tempstring)!=null) {
					hm.put(tempstring, hm.get(tempstring)+1);
					
				}
				else
				{
					hm.put(tempstring, 1);
				}
		}	
		
		for(Entry entry :hm.entrySet() ) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}}
		
		public static void main(String args[]) {	
			String name="iam sangeetha sangeetha";
			
			duplicate("iam sangeetha sangeetha");
	

}}
