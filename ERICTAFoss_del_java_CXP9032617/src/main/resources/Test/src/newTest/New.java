package newTest;


import org.sikuli.script.*;
//import java.io.File;
import java.io.FileNotFoundException;

public class New {
	static double a;
	static String image;
	static String nodeIP= "10.45.242.19";
	static String nodeName="G2RBS_19";
	public void hai(int x, int y){ //THis is a method
		//return "Machi";
	}
	public static void main(String args[]) throws FileNotFoundException{
	String imagePath = "H:\\Downloads\\GUI-images\\";
	//New new1 = new New();
	//String capturePath = "H:\\Downloads\\capture\\";
	Screen s= new Screen();
		
	try{
		s.wait(5.0);
		
		//s.wait(imagePath+"EnterCommand.png",10);
		//s.click(imagePath+"EnterCommand.png");
		s.type ("lt all" + Key.ENTER);
		//s.wait(2.0);
		//s.hover(imagePath+"yes.png");
		//s.type(Key.F4,KeyModifier.ALT);
		//s.type(Key.ENTER);
		//s.type(nodeName+Key.ENTER);
		//s.type("r",KeyModifier.CTRL);
		//s.type(KeyModifier.ALT,Key.F10);
		//s.wait(3.0);
		//s.type(KeyModifier.ALT,"P"+Key.ENTER);

	}
	catch (Exception e){
    	System.out.println("Sikuli exception");
    	System.out.println(e.getMessage());
    }
	

}
}