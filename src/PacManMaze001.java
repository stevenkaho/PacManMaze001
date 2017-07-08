import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon; 
import javax.swing.JFrame; 
import javax.swing.JLabel;

public class PacManMaze001 extends JFrame {

public PacManMaze001(){

	 String Block = "C:\\Steven\\Programming\\Eclipse\\WorkSpace\\PacManMaze001\\src\\img\\Block.jpg";
	 String Road = "C:\\Steven\\Programming\\Eclipse\\WorkSpace\\PacManMaze001\\src\\img\\Road.jpg";
	 String PacMan = "C:\\Steven\\Programming\\Eclipse\\WorkSpace\\PacManMaze001\\src\\img\\PacMan.jpg";
	 String Exit = "C:\\Steven\\Programming\\Eclipse\\WorkSpace\\PacManMaze001\\src\\img\\Exit.jpg";
	
	 String FileName = "";
	 int MazeBlockSize = 20;
	 int width = 20; 
	 int height = 20; 
	 int mazesize = 25; // 25x25 matrix
	 // maze structure
	 int[] maze = new int[] {
			 1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,
			 1,0,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,1,1,
			 1,0,1,1,0,1,0,1,0,1,0,1,0,0,0,0,0,1,1,0,0,1,0,0,1,
			 1,0,1,1,0,1,0,1,0,0,0,1,1,0,1,1,0,1,0,0,0,0,0,1,1,
			 1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,0,0,0,1,1,1,1,0,1,1,
			 1,0,1,1,1,0,1,1,0,0,0,1,1,0,1,1,0,1,0,1,0,0,0,0,1,
			 1,0,0,0,1,0,1,1,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,0,1,
			 1,0,1,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,0,1,
			 1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,1,0,0,0,1,0,1,0,1,1,
			 1,0,1,1,1,0,1,1,0,0,0,0,0,0,1,1,1,0,1,1,0,0,0,1,1,
			 1,0,0,0,1,0,1,1,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,1,1,
			 1,0,1,0,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,0,1,1,
			 2,0,1,1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,2,
			 1,0,1,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,0,1,0,0,0,1,1,
			 1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,0,1,0,1,1,1,1,0,1,1,
			 1,0,1,1,1,0,1,1,0,0,0,1,0,0,1,1,0,1,0,1,0,0,0,1,1,
			 1,0,0,0,1,0,1,1,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,1,1,
			 1,0,1,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,1,1,
			 1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,1,
			 1,0,1,1,1,0,1,1,0,0,0,1,1,0,1,1,1,0,1,1,0,0,0,1,1,
			 1,0,0,0,1,0,1,1,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,1,1,
			 1,0,1,1,1,0,1,1,0,0,0,1,1,0,1,1,1,0,1,1,0,0,0,1,1,
			 1,0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,1,0,1,1,1,1,0,1,1,
			 1,0,0,0,1,0,1,1,1,1,0,0,0,1,1,0,1,0,1,1,1,1,0,1,1,
			 1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1};
	 
	 ImageIcon [] imgUP = new ImageIcon[mazesize*mazesize]; // image array
	 JLabel jl[] = new JLabel[mazesize*mazesize]; // label array

	 this.setResizable(false);//set resize button disable
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(new GridLayout(mazesize,mazesize)); // 
	 // draw maze
	 for (int i =0; i < maze.length ; i++){
		 	if (maze[i] == 1) {
		 		FileName = Block;
		 	}
		 	else if (maze[i] == 0) {
		 		FileName = Road;
		 	}
		 	else {
		 		FileName = Exit;
		 	};
		 	// Image image = new ImageIcon(path).getImage();		
			imgUP[i] = new ImageIcon(FileName);
		 	//imgUP[i] = new ImageIcon(getClass().getResource("FileName"));
		 	imgUP[i].setImage(imgUP[i].getImage().getScaledInstance(width,height,Image.SCALE_DEFAULT));
		 	jl[i] = new JLabel(imgUP[i]);
		 	getContentPane().add(jl[i]);
		 	jl[i].setBounds(new Rectangle(new Point(20,20), jl[i].getPreferredSize()));
		 };
	 setBounds(100, 100, mazesize*MazeBlockSize, mazesize*MazeBlockSize); 
	 setDefaultCloseOperation(EXIT_ON_CLOSE); 
	 setVisible(true); 	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PacManMaze001 th = new PacManMaze001();
		 th.setVisible(true);
	}

}
