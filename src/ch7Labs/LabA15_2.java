package ch7Labs;

import java.util.ArrayList;
import java.util.Random;

public class LabA15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> tenList = new ArrayList<Integer>();
		for(int i = 1; i < 11; i++)
			tenList.add(i);
		Random rd = new Random();
		int randIndex = 0;
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 500; i++) {
				randIndex = rd.nextInt(tenList.size());
				int temp = tenList.get(randIndex);
				tenList.remove(randIndex);
				tenList.add(temp);
			}
			for(int i = 0; i < tenList.size(); i++)
				System.out.print(tenList.get(i) + " ");
			System.out.println();
		}
		
	}

}
