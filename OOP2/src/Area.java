
public class Area {

	//Execercice 1
	int lenght;
	int breadth;
	Double area;
	public void setDim(int lenght , int breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
		area = (double) (lenght * breadth);
	}
	
	public Double getArea() {
		return area;
			}
	
	
	
}
