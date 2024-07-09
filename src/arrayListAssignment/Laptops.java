package arrayListAssignment;

public class Laptops extends Platform{
	
	public Laptops(String modelName, double size, String color) {
		
		this.ModelName = modelName;
		this.size = size;
		this.color = color;
	}

	private String ModelName;
	private double size;
	private String color;
	
	void LaptopFeautres(int Disksize,String CPUmodel,int Ram ) {
		System.out.println(" The size of disk is = "+Disksize);
		System.out.println(" The cpu model is  "+CPUmodel);
		System.out.println(" The Ram of the Laptop   "+Ram);
		
		
	}
	
    void SpecialFeautrs(String audio,String keyboard) {
		System.out.println(" Audio is available in "+audio);
		System.out.println("keyboard is in  "+keyboard);
	}
/*	

Brand	Lenovo
Model Name	IdeaPad
Screen Size	15.6 Inches
Colour	Arctic Grey
Hard Disk Size	512 GB
CPU Model	Ryzen 5
RAM Memory Installed Size	8 GB
Operating System	Windows 11 Home
Special Feature	HD Audio, Backlit Keyboard
Graphics Card

price= ₹35,990;
	
	*/

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Laptops [ModelName=" + ModelName + ", size=" + size + ", color=" + color + "]";
	}

}
