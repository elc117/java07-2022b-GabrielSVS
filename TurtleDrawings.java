
public class TurtleDrawings {

	public static void main(String[] args) {

		NewTurtle t = new NewTurtle();
		
		Pen p = new Pen();
		t.setPen(p);

		TurtleView view = new SwingTurtleView();
		t.setView(view);

		view.initialize();
		t.draw();

	} 


} 