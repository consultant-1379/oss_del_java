package newTest;

import org.sikuli.script.*;
import java.io.FileNotFoundException;

public class PMS {
	static double a;
	static String pms,pmsIssue;
	static String nodeIP= "10.45.242.19";
	static String nodeName="G2RBS_19";
	static String nodeType="RadioNode";
	
	public static void main(String args[]) throws FileNotFoundException{
		String imagePath = "H:\\Downloads\\GUI-images\\";
		String capturePath = "H:\\Downloads\\capture_result\\";
		String issuePath = "H:\\Downloads\\capture_issue\\";
		Screen s= new Screen();
		s.setRepeatWaitTime(20000);
		//s.setAutoWaitTimeout(2.0);
	
		try
		{
			
		s.wait(5.0);
        s.click( new Pattern(imagePath+"launch.png").targetOffset(5,-1));
 		s.hover(imagePath+"applications.png");
		s.hover(imagePath+"ericsson.png");
		s.hover(imagePath+"performance.png");
		s.hover(imagePath+"InitiateDataCollection.png");
		s.click(imagePath+"PMS.png");
		s.wait(imagePath+"PMS_gui.png",60.0);
		s.type(Key.ENTER);
		s.wait(2.0);
		s.doubleClick(new Pattern(imagePath+"PMS_gui.png").targetOffset(-8,-14));
		//s.type(KeyModifier.ALT,Key.F10);
		s.wait(3.0);
		s.click(new Pattern(imagePath+"profile.png").targetOffset(-63,0));
		s.click(imagePath+"AddProfile.png");
		s.wait(imagePath+"AddProfileWizard.png",60.0);
		s.rightClick(new Pattern(imagePath+"AddProfileWizard.png").targetOffset(-8,-14));
		s.click(imagePath+"OnTop.png");
		s.type(nodeName);
		s.click(imagePath+"next.png");
		s.wait(imagePath+"ManagedElements.png",10);
		s.click(new Pattern(imagePath+"ManagedElements.png").targetOffset(152,17));
		s.type(nodeType + Key.ENTER);
		s.click(imagePath+"next.png");
		s.wait(imagePath+"Match_blue.png");
		s.type(nodeName + Key.ENTER);
		s.click(imagePath+"SingleArrow.png");
		s.click(imagePath+"next.png");
		s.wait(5.0);
		s.click(imagePath+"DoubleArrow.png");
		s.click(imagePath+"next.png");
		s.wait(imagePath+"ProfileGranularity.png",10);
		s.click(new Pattern(imagePath+"ProfileGranularity.png").targetOffset(-18,25));
		s.type("Continuos" +Key.ENTER);
		s.click(imagePath+"finish.png");
		s.wait(2.0);
		s.click(imagePath+"PMS_UDSP.png");
		s.wait(2.0);
		s.click(new Pattern(imagePath+"match.png").targetOffset(-70,0));
		s.type(nodeName+Key.ENTER);
		s.click(new Pattern(imagePath+"profile.png").targetOffset(-63,0));
		s.wait(2.0);
		s.click(imagePath+"ResumeProfile.png");
		s.wait(2.0);
		s.type(Key.ENTER);
		s.wait(5.0);
		s.saveScreenCapture(capturePath,pms);
		s.type(Key.F4,KeyModifier.ALT);
		s.type(Key.ENTER);
		
				        
		} 		
		
		catch(SikuliException e){
        	System.out.println("Sikuli exception");
        	System.out.println(e.getMessage());
        	s.saveScreenCapture(issuePath,pmsIssue);
        	s.type(Key.F4,KeyModifier.ALT);
}
			
}}


