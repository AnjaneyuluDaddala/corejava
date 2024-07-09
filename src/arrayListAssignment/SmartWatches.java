package arrayListAssignment;

public class SmartWatches extends Platform{

	public SmartWatches(String watchName, String color, double size) {
		super();
		WatchName = watchName;
		this.color = color;
		Size = size;
	}
	
	private String WatchName;
    private  String color;
    private  double Size;
	public String getWatchName() {
		return WatchName;
	}
	public void setWatchName(String watchName) {
		WatchName = watchName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSize() {
		return Size;
	}
	public void setSize(double size) {
		Size = size;
	}
	@Override
	public String toString() {
		return "SmartWatches [WatchName=" + WatchName + ", color=" + color + ", Size=" + Size + "]";
	}


}
