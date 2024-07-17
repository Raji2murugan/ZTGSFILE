package ztgs;

import java.util.ArrayList;
import java.util.List;

public class Generation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[][]= {{"Paari","KariKalan"},{"Udhiran","Sendhan"},{"Sendhan","Arulmozhi"},{"KariKalan","Sendhan"}};
		String input="Arulmozhi";
		List<String>list=new ArrayList<>();
		list.add(input);
		
		
		for (int k = 0; k < list.size(); k++) {

			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j].equals(list.get(k))&& j==1) {
						System.out.println(arr[i][j - 1]);
						list.add(arr[i][j - 1]);
					}
				}
				

			}
		}
		System.out.println(list.toString());

		
		
}
	
}
