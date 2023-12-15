package com.json.Demo_json;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJsonApplication {
	public static void main(String[] args) {

		/*
		FileReader fileReader = new FileReader("c:/JavaProjects/Demo_json/src/json/employee.json");
		Employee e = gson.fromJson(fileReader,Employee.class);
		System.out.println(e.getFirstName());
		 */
		getJson(new EmployeeEx("tisha","sudani","amreli"));


	}
	private static void getJson(EmployeeEx employee) {
		try
		{
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json=gson.toJson(employee);
			System.out.println(json);

			getobj(json);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void getobj(String json) {
		Gson gson = new Gson();
		EmployeeEx emp=gson.fromJson(json, EmployeeEx.class);
		System.out.println(emp.getFirstName());
	}


}
