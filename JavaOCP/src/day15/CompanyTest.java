package day15;

public class CompanyTest {

	public static void main(String[] args) {
		Company company = new Company("Nvidia");
		Company.Department deptSales = company.new Department("Sales");
		Company.Department deptIT = company.new Department("IT");
		
		deptSales.displayDeptInfo();
		deptIT.displayDeptInfo();
		
		company.project(10);
		
		Company.CEO ceo = new Company.CEO("John");
		ceo.showCEO();
		ceo.showCEO2();
	}

}
