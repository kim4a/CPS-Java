package fileStructure;

import java.io.File;

public class ShowFileStructure {

	public static void main(String[] args) {
		String fPath = "src";
		File f = new File(fPath);
		showFiles(f, "  ");
	}
	
	public static void showFiles(File file, String indent) {
		System.out.printf("%s%s\n", indent, file.getName());
		if (file.isDirectory()) {
			indent += "  ";
			File[] files = file.listFiles();
			for (File f : files) {
				showFiles(f, indent);
			}
		}
	}

}
