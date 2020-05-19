package day12;

import java.io.IOException;

public class Test06 {

	public static void main(String[] args) throws IOException {
		
		ProcessBuilder oProcess = new ProcessBuilder("notepad.exe");
		oProcess.start();

	}

}
