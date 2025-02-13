package dataDrivenTest;

import java.io.IOException;
import java.util.ArrayList;

public class TestScriptData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TestValidationsData data = new TestValidationsData();
		ArrayList<String> testData = data.getData("Add Profile");
		System.out.println(testData.get(0));
		System.out.println(testData.get(1));
		System.out.println(testData.get(2));
		System.out.println(testData.get(3));
		
	}

}
