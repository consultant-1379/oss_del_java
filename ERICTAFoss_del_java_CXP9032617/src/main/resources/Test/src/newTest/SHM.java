package newTest;

import org.sikuli.script.*;

public class SHM {
	static String nodeIP= "10.45.242.19";
	static String nodeName="G2RBS_19",username="suser9",password="suser901",backupName="rvd-Backup1";
	static String nodeType="RadioNode",MO_first="SystemFunctions=1",MO_second="SysM=1",ntpId="test098",ntpIp="1.3.5.6",pca_name="pca01";
	
	
	public static void main(String args[]) {
		String imagePath = "H:\\Downloads\\GUI-images\\";
		String capturePath = "H:\\Downloads\\capture_result\\";
		String issuePath = "H:\\Downloads\\capture_issue\\";
		Screen s= new Screen();
		s.setRepeatWaitTime(20000);
		
		try
		{
		 Thread.sleep(5000);
		 
		 s.click( new Pattern(imagePath+"launch.png").targetOffset(5,-1));
		 s.hover(imagePath+"applications.png");
 		 s.hover(imagePath+"ericsson.png");
 		 s.click(imagePath+"OSS_Explorer.png");
 		 s.wait(20.0);
		 s.wait(imagePath+"OSS_Explorer_gui.png",60);
		 
		 s.click(imagePath+"tools.png");
		 s.wait(2.0);
		 s.hover(imagePath+"shm1.png");
		 s.click(imagePath+"shm2.png");
		 s.wait(40.0);
		 if (s.exists(imagePath+"shm_username.png") != null)
		 {
		 s.type(username+Key.TAB);
		 s.wait(2.0);
		 s.type(password + Key.ENTER);
		 s.wait(6.0);}
		 else {
		 s.click(imagePath+"shm_inventory.png");}
		 s.wait(3.0);
		 s.click(new Pattern(imagePath+"shm_search.png").targetOffset(-56,0));
		 s.wait(2.0);
		 s.type(nodeName+Key.ENTER);
		 s.wait(2.0);
		 s.click(new Pattern(imagePath+"shm_search2.png").targetOffset(-61,-2));
		 s.wait(2.0);
		 s.click(new Pattern(imagePath+"shm_ME.png").targetOffset(-46,29));
		 s.wait(5.0);
		 s.click(imagePath+"shm_swInventory.png");
		 s.saveScreenCapture(capturePath, "hardwareInventory");
		 s.wait(2.0);
		 s.click(new Pattern(imagePath+"shm_ME.png").targetOffset(-46,29));
		 s.wait(2.0);
		 s.click(new Pattern(imagePath+"shm_baseband.png").targetOffset(-37,-3));
		 s.wait(6.0);
		 s.click(imagePath+"shm_upgrade.png");
		 s.saveScreenCapture(capturePath, "sw_Inventory");
		 s.wait(2.0);
		 s.click(imagePath+"shm_backup.png");
		 s.wait(3.0);
		 s.click(new Pattern(imagePath+"shm_backup2.png").targetOffset(-40,0));
		 s.wait(3.0);
		 s.click(new Pattern(imagePath+"shm_backupname.png").targetOffset(100,0));
		 s.type("a",KeyModifier.CTRL);
 		 s.type(backupName);
 		 s.wait(2.0);
 		 s.click(new Pattern(imagePath+"shm_system.png").targetOffset(-38,-1));
 		 s.click(imagePath+"shm_start.png");
 		 s.wait(5.0);
 		 s.click(new Pattern(imagePath+"shm_export.png").targetOffset(-43,-4));
 		 s.wait(2.0);
 		 s.click(imagePath+"shm_ok.png");
 		 s.wait(3.0);
 		 s.click(imagePath+"shm_yes.png");
 		 s.wait(5.0);
 		 s.saveScreenCapture(capturePath, "Backup_job_start");
 		 Thread.sleep(600000);
  		 s.click(imagePath+"shm_inventory.png");
 		 s.saveScreenCapture(capturePath, "Backup_job_complete");
 		 
 		 //REstore Job//
 		 
 		 s.wait(3.0);
		 s.click(new Pattern(imagePath+"shm_search.png").targetOffset(-56,0));
		 s.wait(2.0);
		 s.type("a",KeyModifier.CTRL);
		 s.type(nodeName+Key.ENTER);
		 s.wait(2.0);
		 s.click(new Pattern(imagePath+"shm_search2.png").targetOffset(-61,-2));
		 s.wait(2.0);
		 s.click(new Pattern(imagePath+"shm_InvBackup.png").targetOffset(19,0));
		 s.wait(3.0);
		 s.type("f" + KeyModifier.CTRL);
		 s.wait(2.0);
		 s.type(backupName);
		 s.wait(2.0);
		 s.click(new Pattern(imagePath+"shm_backupname.png").targetOffset(-53,0));
		 s.wait(2.0);
		 s.click(imagePath+"shm_restore.png");
		 s.wait(3.0);
		 s.click(imagePath+"ok.png");
		 s.wait(5.0);
		 s.saveScreenCapture(capturePath, "Backup_job_started");
		 
		
			
			
		}

		catch(SikuliException | InterruptedException e){
        	System.out.println("Sikuli exception");
        	System.out.println(e.getMessage());
        	s.saveScreenCapture(issuePath,"SHM_issue");
}
	}
}
