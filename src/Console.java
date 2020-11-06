import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	
	BufferedReader br;
	
	Console() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String getQuestionResponse(String question) {
		this.print(question);
		return this.read();
	}
	
	public String read() {
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return " ";
	}
	
	public void print(String text) {
		System.out.print(text);
	}
	
	public void printLine(String text) {
		System.out.println(text);
	}
	
	public void printLineChar(char text) {
		System.out.println(text);
	}

	public static void main(String[] args) throws IOException {
		Console console = new Console();
		String edad = console.getQuestionResponse("Introduzca su edad");
		console.printLine(edad);
	}
	
}
