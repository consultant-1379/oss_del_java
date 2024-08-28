package newTest;

import org.sikuli.script.*;

//import java.io.File;
import java.io.FileNotFoundException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;



public class Amos_AllNode {
	
	
	static String nodeIP= "10.45.242.19";
	static String nodeName="G2RBS_19";
	static String username="super" ,password="super201" ;
	
	public static void main(String args[]) throws FileNotFoundException{
	
		
		String imagePath = "H:\\Downloads\\GUI-images\\";
		String capturePath = "H:\\Downloads\\capture\\";
		String issuePath = "H:\\Downloads\\capture_issue\\";
		Screen s= new Screen();
		System.out.println("Hello World");
		
        
        
                        	
        try{
        		if(imagePath != null){
        		s.wait(5.0);
        		try
        		{
                s.click( new Pattern(imagePath+"launch.png").targetOffset(5,-1));
                System.out.println("first image passed");
        		}
                catch(SikuliException e){
                	System.out.println("Sikuli exception");
                	System.out.println(e.getMessage());
                }
        	                    }
                
                s.click(imagePath+"applications.png");
                s.wait(2.0);
                s.click( new Pattern(imagePath+"utilities.png").targetOffset(20,4));
                s.wait(2.0);
                s.click(imagePath+"terminal.png");
                s.wait(2.0);
                      
                s.type("amos "+nodeIP + Key.ENTER);
                s.wait(imagePath+"EnterCommand.png",60);
                s.type ("lt all" + Key.ENTER);
                s.wait(imagePath+"username.png",60);
                s.type (username + Key.ENTER);
                s.wait(imagePath+"NodePassword.png",60);
                s.type (password + Key.ENTER);
                s.wait(5.0);
                s.type ("lt all" + Key.ENTER);
                s.wait(40.0);
                s.type ("pr" + Key.ENTER);
                s.wait(20.0);
                s.saveScreenCapture(capturePath,"amos");
                System.out.println("Amos using NODE IP is working fine for LTE DG2 node");
                s.wait(2.0);
                s.type(Key.F4,KeyModifier.ALT);
                
                
                  }
        catch(Exception e){
        	
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        	s.saveScreenCapture(issuePath,"amos_Issue");
        }
        
        
    	try
    		{
            s.click( new Pattern(imagePath+"launch.png").targetOffset(5,-1));
            System.out.println("first image passed");
    		
                        
            s.click(imagePath+"applications.png");
            s.click( new Pattern(imagePath+"utilities.png").targetOffset(20,4));
            s.wait(2.0);
            s.click(imagePath+"terminal.png");
            s.wait(7.0);
                         
            //Pattern pImage = new Pattern(imagePath+"1446639965873.png").targetOffset(1,3);
            //r=s.exists(pImage,1);
            //s.click(pImage);
            
            s.type("amos "+nodeName + Key.ENTER);
            s.wait(15.0);
            s.wait(imagePath+"EnterCommand.png",60);
            s.type ("lt all" + Key.ENTER);
            s.wait(imagePath+"username.png",60);
            s.type ("super2" + Key.ENTER);
            s.wait(imagePath+"NodePassword.png",60);
            s.type ("super201" + Key.ENTER);
//            String img33 = imagePath+ ".png";
//            s.wait (img33,120);
//            s.exists(img33);
            s.wait(30.0);
            s.type ("pr" + Key.ENTER);
            s.wait(5.0);
            s.saveScreenCapture(capturePath,"amos");
            System.out.println("Amos using NODE NAME is working fine for LTE DG2 node");
            s.wait(2.0);
            s.type(Key.F4,KeyModifier.ALT);
            
             }
    catch(Exception e){
    	
    	System.out.println(e.getMessage());
    	e.printStackTrace();
    	s.saveScreenCapture(issuePath,"amos_Issue");
    }
     
    
}

}


