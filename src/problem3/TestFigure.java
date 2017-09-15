package problem3;

import java.util.Arrays;

public class TestFigure {

	public static void main(String[] args) {
		Figure[] figure=new Figure[5];
		
		figure[0]= new UpwardHat();
		figure[1]= new UpwardHat();
		figure[2]=new DownwardHat();
		figure[3]=new FaceMaker();
		figure[4]=new Vertical();
		for (Figure f : figure) {
			System.out.println(f.getFigure());
			//System.out.println(f.getClass().getName() + ": " + f.getFigure());
		}
	}
}
