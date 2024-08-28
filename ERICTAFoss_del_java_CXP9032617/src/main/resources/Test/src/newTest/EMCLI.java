package newTest;


import org.sikuli.script.*;

public class EMCLI {
	
	static String emcli,emcliIssue;
	static String nodeIP= "10.45.242.19";
	static String nodeName="G2RBS_19";
	static String nodeType="RadioNode";
	
	public static void main(String args[]) {
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
    		s.click(imagePath+"OSS_Explorer.png");
    		s.wait(20.0);
    		s.wait(imagePath+"OSS_Explorer_gui.png",60);
    		s.click(new Pattern(imagePath+"find.png").targetOffset(32,0));
    		s.type(nodeName + Key.ENTER);
    		s.wait(2.0);
    		s.click(imagePath+"tools.png");
    		s.wait(1.0);
    		s.hover(imagePath+"LTE_Network.png");
    		s.hover(imagePath+"ElementManagers.png");
    		s.click(imagePath+"EMCLI.png");
    		s.wait(5.0);
    		s.exists(imagePath+"Validation_EMCLI.png");
    		s.click( new Pattern(imagePath+"Validation_EMCLI.png").targetOffset(95,22));
    		s.wait(20.0);
    		s.type ("lt all" + Key.ENTER);
            s.wait(5.0);
            s.type ("super2" + Key.ENTER);
            s.wait(2.0);
            s.type ("super201" + Key.ENTER);
            Thread.sleep(40000);
            s.type("pr" + Key.ENTER);
            System.out.println("EMCLI is working fine for node nodeName");
            Thread.sleep(5000);
            s.type(Key.F4,KeyModifier.ALT);
            s.saveScreenCapture(capturePath,"EMCLI");
            s.wait(2.0);
            s.type(Key.F4,KeyModifier.ALT);
            s.wait(2.0);
            s.type(Key.ENTER);
            
    			
    		
    		
    		
} 		
		
		catch(SikuliException | InterruptedException e){
        	System.out.println("Sikuli exception");
        	System.out.println(e.getMessage());
        	s.saveScreenCapture(issuePath,"EMCLI_issue");
        	s.type(Key.F4,KeyModifier.ALT);
}
			
}}
