
public class Main{

	public static void main(String[] args) {
		World w = new World(10,10,"grass.png");
		double probabilite = 0.0;

		int delai=(500);

		w.addAgent(new Humain((int)(Math.random()*w.getSizex()),(int)(Math.random()*w.getSizey()),w.getSizex(),w.getSizey(),"human.png"));
		
		while (true){
			System.out.println("pascal");
			if (probabilite>Math.random())
				w.addAgent(new Humain((int)(Math.random()*w.getSizex()),(int)(Math.random()*w.getSizey()),w.getSizex(),w.getSizey(),"human.png"));
				
			try {
				Thread.sleep(delai);
			} catch (InterruptedException e) {}
			w.repaint();
		}
	}
}