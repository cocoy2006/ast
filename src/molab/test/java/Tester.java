package molab.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.android.prefs.AndroidLocation.AndroidLocationException;

public class Tester {

	public static void main(String[] args) throws AndroidLocationException, IOException {
		// TODO Auto-generated method stub
//		System.out.println(AvdManager.getBaseAvdFolder());
		
//		SdkManager sm = SdkManager.createManager(System.getenv("ANDROID_SDK"), new StdSdkLog());
//		AvdManager am = new AvdManager(sm, new StdSdkLog());
//		AvdInfo[] avds = am.getValidAvds();
//		if(avds.length > 0) {
//			for(AvdInfo avd : avds) {
//				System.out.println(avd.getName() + " is running? " + avd.isRunning());
//			}
//		}
		
		kill();
	}
	
	public static String getPID() {  
        String pid = null;  
        String cmd = "tasklist /nh /FI \"IMAGENAME eq Thunder.exe\"";  
        try {  
            Runtime runtime = Runtime.getRuntime();  
            Process process = runtime.exec(cmd);  
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));  
            String line = null;  
            while((line=br.readLine()) != null){  
//                if(line.indexOf("Thunder.exe") != -1){  
//                    String[] lineArray = line.split(" ");  
//                    pid = lineArray[17].trim();  
//                    if(pid.equals()){  
//                        continue;  
//                    } else {  
//                        return pid;  
//                    }  
//                }  
            	System.out.println(line);
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return pid;  
    }
	
	public static void kill() {
		try {  
		    Runtime.getRuntime().exec("taskkill /F /IM emulator*");  
		} catch (IOException e1) {  
		    e1.printStackTrace();  
		}
	}
	
	public static void kill2() {
		try {  
		    Runtime.getRuntime().exec("killall -9 -r emulator*"); // pkill emulator
		} catch (IOException e1) {  
		    e1.printStackTrace();  
		}
	}
		
}