package miniproject;

import java.io.IOException;

public class WritingData {
	static String file_path = System.getProperty("user.dir") + ".\\testdata\\MyProjectData.xlsx";

	public static void writeProjectNames(String[] names) {

		for (int i = 1; i <= 5; i++) {
			try {
				UtilityFile.setCellData(file_path, "Sheet1", i, 1, names[i - 1]);
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Writing of First Five Projects in Excel Done");
	}

	public static void totalProjects(int count) {
		
		String value = String.valueOf(count);
		try {
			UtilityFile.setCellData(file_path, "Sheet1", 1, 0, value);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		System.out.println("Writing of Total number of projects in Excel Done");
	}
	
	public static void writeEmail(String email) {
		
		try {
			UtilityFile.setCellData(file_path, "Sheet1", 1, 2, email);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Writing of Email Address in Excel Done");
	}

}
