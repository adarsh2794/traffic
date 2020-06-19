package com.example.geektrust;


import com.example.geektrust.helpers.TrafficTimeHelper;
import com.example.geektrust.utils.ProcessInput;
import com.example.geektrust.utils.ReadFile;

public class GeekTrustApplication {

  public static void main(String[] args) throws Exception {

    ReadFile readFile = new ReadFile();
    String filename = "";
    if (args.length > 0) {
			if (args[0] != null) {
				filename = args[0];
			}
    }
    String input1 = readFile.readFileAsString(filename);
    PossiblePath possiblePath = new PossiblePath(new ProcessInput(), new TrafficTimeHelper());
    System.out.println(possiblePath.getShortestPossiblePath(input1));

  }

}
