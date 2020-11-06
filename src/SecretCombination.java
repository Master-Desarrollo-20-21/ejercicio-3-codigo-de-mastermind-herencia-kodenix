import java.util.Random;

public class SecretCombination extends Combination {
	
	SecretCombination() {
		super();
		this.colors = this.getRandom();
	}

	private Color[] getRandom() {
		Color[] generatedColors = new Color[4];
		int count = 0;
		do {
			int colorIndex = new Random().nextInt(6);
			generatedColors[count] = Color.getColorFromIndex(colorIndex);
            count++;
            
        }while (count < 4);
		
		return generatedColors;
	}
	
	public boolean isWinner(ProposedCombination proposedCombination) {
		return true;
	}
	
	public String getEncodedCharacters() {
		String characters = "";
		for (int i=0; i < this.colors.length; i++) {
			characters = characters + "*";
		}
		return characters;
		
	}
	
	

}
