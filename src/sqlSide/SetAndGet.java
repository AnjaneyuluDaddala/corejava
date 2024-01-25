package sqlSide;



	public class SetAndGet {

		int empid;
		String empName;
		int empAge;
		String address;
		
		
		
		public SetAndGet(int empid, String empName, int empAge, String address) {
			super();
			this.empid = empid;
			this.empName = empName;
			this.empAge = empAge;
			this.address = address;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpAge() {
			return empAge;
		}
		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
	 
		
		}


