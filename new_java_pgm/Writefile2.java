import java.io.FileWriter;
class Writefile2 {
	public static void main(String args[]) {
		String data = "This is the data in the output file";
		try {
			FileWriter output = new FileWriter("newFile.txt");
			output.write(data);
			System.out.println("Data is written to the file.");
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}