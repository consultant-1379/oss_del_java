package newTest;

import org.sikuli.script.*;


public class PCA {
	
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
    		
    		//creating a PCA//
    		
    		s.click(imagePath+"view.png");
    		s.wait(2.0);
    		s.click(imagePath+"pca.png");
    		Thread.sleep(5000);
    		s.click(new Pattern(imagePath+"new_pca.png").targetOffset(-29,1));
    		s.wait(2.0);
    		s.wait(imagePath+"new_pca_gui.png",30);
    		s.type(pca_name);
    		s.wait(2.0);
    		s.click(imagePath+"ok.png");
    		s.wait(3.0);
    		s.click(imagePath+"view.png");
    		s.wait(2.0);
    		s.click(imagePath+"PropertiesView.png");
    		s.wait(3.0);
    		s.rightClick(imagePath+"properties_gui.png");
    		s.wait(2.0);
    		s.click(imagePath+"maximize.png");
    		s.wait(5.0);
    		s.click(imagePath+"scheme.png");
    		s.wait(2.0);
    		s.click(imagePath+"plan.png");
    		s.wait(2.0);
    		s.click(imagePath+"save.png");
    		s.wait(3.0);
    		s.rightClick(imagePath+"properties_gui.png");
    		s.wait(2.0);
    		s.click(imagePath+"minimize.png");
    		s.wait(3.0);
    		
    		//searching node and making MO changes//
    		s.click( new Pattern(imagePath+"CEX_gui.png").targetOffset(-42,80));
    		s.wait(2.0);
    		s.click(imagePath+"LTE.png");
    		s.wait(2.0);
    		s.click( new Pattern(imagePath+"CEX_gui.png").targetOffset(96,51));
    		s.wait(imagePath+"find.png",10.0);
    		
    		if (s.exists(imagePath+"find.png") != null)
    		{
    		s.click(new Pattern(imagePath+"find.png").targetOffset(32,0));
    		s.wait(2.0);
    		}
    		else
    		{
    			s.click( new Pattern(imagePath+"CEX_gui.png").targetOffset(96,51));
    			s.wait(2.0);
    		}
    		s.type("a",KeyModifier.CTRL);
    		s.type(nodeName+Key.ENTER);
    		s.wait(5.0);
    		s.click( new Pattern(imagePath+"CEX_gui.png").targetOffset(96,51));
			s.wait(2.0);
    		s.click(imagePath+"view.png");
    		s.wait(2.0);
    		s.click(imagePath+"MO_Browser.png");
    		s.wait(5.0);
    		s.wait(imagePath+"ManagedElement.png",10);
    		s.doubleClick(imagePath+"ManagedElement.png");
    		s.wait(5.0);
    		s.click(new Pattern(imagePath+"MO_search.png").targetOffset(22,-3));
    		s.wait(3.0);
    		s.wait(imagePath+"find.png",10.0);
    		s.type("a",KeyModifier.CTRL);
    		s.type(MO_first+Key.ENTER);
    		Thread.sleep(3000);
    		s.doubleClick(imagePath+"MO_SystemFunctions.png");
    		s.wait(3.0);
    		s.click(new Pattern(imagePath+"find.png").targetOffset(32,0));
    		s.type("a",KeyModifier.CTRL);
    		s.type(MO_second+Key.ENTER);
    		Thread.sleep(3000);
    		s.rightClick(imagePath+"MO_SysM.png");
    		s.wait(2.0);
    		s.click(imagePath+"MO_add.png");
    		s.wait(5.0);
    		s.wait(imagePath+"MO_add_gui.png",60);
    		s.click(new Pattern(imagePath+"MO_add_gui.png").targetOffset(142,84));
    		s.wait(1.0);
    		s.click(imagePath+"MO_NtpServer.png");
    		s.wait(3.0);
    		s.click(new Pattern(imagePath+"AdministrativeState.png").targetOffset(123,3));
    		s.wait(1.0);
    		s.click(imagePath+"unlocked.png");
    		s.click(new Pattern(imagePath+"NtpServerId.png").targetOffset(146,5));
    		s.type(ntpId);
    		s.click(new Pattern(imagePath+"ServerAddress.png").targetOffset(122,0));
    		s.type(ntpIp);
    		s.wait(2.0);
    		s.click(imagePath+"add.png");
    		Thread.sleep(5000);
    		s.click(imagePath+"ok.png");
    		s.saveScreenCapture(capturePath,"pca_add_MO");
    		s.wait(2.0);
    		s.click(imagePath+"close.png");
    		Thread.sleep(3000);
    		//activating the pca//
    		
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
    		s.type(pca_name+Key.ENTER);
    		Thread.sleep(3000);
    		s.rightClick(imagePath+"NotStarted.png");
    		s.wait(2.0);
    		s.click(imagePath+"activate.png");
    		s.wait(5.0);
    		s.click(new Pattern(imagePath+"CreateRollback.png").targetOffset(-66,0));
    		s.wait(1.0);
    		s.click(imagePath+"next.png");
    		s.wait(3.0);
      		s.click(imagePath+"next.png");
      		s.wait(2.0);
    		s.click(imagePath+"PreCheck.png");
    		Thread.sleep(7000);
    		s.click(imagePath+"activate_pca.png");
    		Thread.sleep(7000);
    		s.click(imagePath+"next.png");
    		s.wait(3.0);
    		s.click(imagePath+"close.png");
    		s.saveScreenCapture(capturePath,"Activated_pca");
    		
}

		catch(SikuliException | InterruptedException e){
        	System.out.println("Sikuli exception");
        	System.out.println(e.getMessage());
        	s.saveScreenCapture(issuePath,"pca_issue");
        	//s.type(Key.F4,KeyModifier.ALT);
}
			
}}
