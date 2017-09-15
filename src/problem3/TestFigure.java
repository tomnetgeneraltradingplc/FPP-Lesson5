package problem3;
public class TestFigure {

	public static void main(String[] args) {
		Figure f[] = new Figure[5];

		f[0] = new UpwardHat();
		f[1] = new UpwardHat();
		f[2] = new DownwardHat();
		f[3] = new FaceMaker();
		f[4] = new Vertical();

		for (Figure figure : f) {
			figure.getFigure();

		}

		System.out.println();
		for (Figure figure : f) {
			System.out.print(figure.getClass().getSimpleName() + ": ");
			figure.getFigure();

			System.out.println();
		}
	}
}
/*Output
/\/\\/:)||
UpwardHat: /\
UpwardHat: /\
DownwardHat: \/
FaceMaker: :)
Vertical: ||
*/