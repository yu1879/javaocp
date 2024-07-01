package day15;

// 外部類別-公司
public class Company {
	private String name; // 物件變數/屬性/欄位
	
	public Company(String name) { // 建構子/構造函數
		this.name = name; // name 區域變數
	}
	
	public void project() {
		// 方法內部類別-特別專案
		class SpecialProject {
			void handle() {
				System.out.printf("執行 %s 特別專案%n", name);
			}
		}
		SpecialProject project = new SpecialProject();
		project.handle();
		//...
	}
	
	// 內部類別-部門
	class Department {
		private String deptName;
		
		public Department(String deptName) {
			this.deptName = deptName;
		}
		
		public void displayDeptInfo() {
			System.out.printf("%s %s%n", Company.this.name, this.deptName);
			//System.out.printf("%s %s%n", name, deptName);
		}
		
	}
	
}
