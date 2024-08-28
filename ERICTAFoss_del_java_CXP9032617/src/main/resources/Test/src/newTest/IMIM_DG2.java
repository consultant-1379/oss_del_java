package newTest;


import org.sikuli.script.*;
import java.io.FileNotFoundException;

public class IMIM_DG2 {
	
	static String issue;
	static String nodeIP= "10.45.242.19";
	static String nodeName="G2RBS_19";
	
	public static void main(String args[]) throws FileNotFoundException{
		String imagePath = "H:\\Downloads\\GUI-images\\";
		String capturePath = "H:\\Downloads\\capture_result\\";
		String issuePath = "H:\\Downloads\\capture_issue\\";
		Screen s= new Screen();
		
	
		
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
    		
    		    		
    		s.hover(imagePath+"applications.png");
    		s.hover(imagePath+"ericsson.png");
    		s.hover(imagePath+"alarm.png");
    		s.hover(imagePath+"FMAdministration");
    		s.click(imagePath+"IMIM.png");
    		s.wait(imagePath+"IMIM_gui.png",60);
    		s.click(imagePath+"ONRM_ROOT_MO.png");
    		s.wait(2.0);
    		s.click(imagePath+"MSRBS_V2.png");
    		s.wait(2.0);
       		s.rightClick(imagePath+"G2RBS_19.png");
    		s.click(imagePath+"properties.png");
    		s.wait(imagePath+"AlarmSupervision.png");
    		s.click(new Pattern(imagePath+"AlarmSupervision.png").targetOffset(58,4));
    		s.wait(imagePath+"apply.png");
    		s.click(imagePath+"apply.png");
       		s.saveScreenCapture(capturePath);
       		s.click(imagePath+"yes.png");
       		s.click(imagePath+"exit.png");
       		s.click(imagePath+"yes.png");
       		
       		
       		/*Now we go ahead verifying ALV if the changes have taken effect*/
       		
       		s.click( new Pattern(imagePath+"launch.png").targetOffset(5,-1));
       		s.hover(imagePath+"applications.png");
    		s.hover(imagePath+"ericsson.png");
    		s.hover(imagePath+"alarm.png");
    		s.hover(imagePath+"ViewAlarmsMain.png");
    		s.click(imagePath+"ALV.png");
    		s.wait(imagePath+"ALV_gui.png",20.0);
    		s.type(Key.F10,KeyModifier.ALT);
    		s.wait(3.0);
    		s.click(new Pattern(imagePath+"find.png").targetOffset(32,0));
    		s.type(nodeName+Key.ENTER);
    		s.wait(2.0);
    		s.click(imagePath+"view.png");
    		s.wait(2.0);
    		s.click(imagePath+"ViewAlarmsInNewList.png");
    		s.wait(5.0);
    	
    		if (s.exists(imagePath+"SupervisionOff.png")!=null);
    		{
    			
    			System.out.println("Test Case is passed!!");
    			s.saveScreenCapture(capturePath);
    		}
		} 		
		
    		catch(SikuliException e){
            	System.out.println("Sikuli exception");
            	System.out.println(e.getMessage());
            	s.saveScreenCapture(issuePath);
	}
				s.type(Key.F4,KeyModifier.ALT);
	}}
