package newTest;

import org.sikuli.script.*;

public class PCA_Rollback {
	
	static String nodeIP= "10.45.242.19";
	static String nodeName="G2RBS_19";
	static String nodeType="RadioNode",MO_first="SystemFunctions=1",MO_second="SysM=1",ntpId="test098",ntpIp="1.3.5.6",pca_name="pca01";
	
	
	public static void main(String args[]) {
		String imagePath = "H:\\Downloads\\GUI-images\\";
		String capturePath = "H:\\Downloads\\capture_result\\";
		String issuePath = "H:\\Downloads\\capture_issue\\";
		Screen s= new Screen();
		s.setRepeatWaitTime(20000);
		
		try
		{
			s.wait(5.0);
			s.click( new Pattern(imagePath+"launch.png").targetOffset(5,-1));
			s.hover(imagePath+"applications.png");
    		s.hover(imagePath+"ericsson.png");
    		s.click(imagePath+"CEX.png");
    		Thread.sleep(30000);
    		s.wait(imagePath+"CEX_gui.png",60.0);
    		
    		s.click(imagePath+"view.png");
    		s.wait(2.0);
    		s.click(imagePath+"pca.png");
    		Thread.sleep(5000);
    		s.click(new Pattern(imagePath+"new_pca.png").targetOffset(23,-2));
    		//used new_pca image for search by changing the offset//
    		s.wait(3.0);
    		s.wait(imagePath+"find.png",10.0);
    		s.click(new Pattern(imagePath+"find.png").targetOffset(32,0));
    		s.type("a",KeyModifier.CTRL);
    		s.wait(3.0);
    		s.type(pca_name+Key.ENTER);
    		Thread.sleep(3000);

}
		
		catch(SikuliException | InterruptedException e){
        	System.out.println("Sikuli exception");
        	System.out.println(e.getMessage());
        	s.saveScreenCapture(issuePath,"pca_issue");
        	//s.type(Key.F4,KeyModifier.ALT);
}
			
}}

