package Basic_First.service;

import Basic_First.model.circle;
import Basic_First.model.triangle;

public class ShapeService {
	private circle cir;
	private triangle tri;
	
	public circle getCir() {
		return cir;
	}
	public void setCir(circle cir) {
		this.cir = cir;
	}
	public triangle getTri() {
		return tri;
	}
	public void setTri(triangle tri) {
		this.tri = tri;
	} 
	

}
