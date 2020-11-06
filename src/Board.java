public class Board {
	
	final int MAX_PROPOSED_COMBINATION = 10;
	final int INIT_ATTEMP_VALUE = 0; 
	
	private SecretCombination secretCombination;

	private ProposedCombination[] proposedCombinations;
	private int attempt = INIT_ATTEMP_VALUE; 

	private boolean isWinner = false;
	private Console console;
	
	Board() {
		console = new Console();
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ProposedCombination[10];
	}

	public void play() {
		do {
			console.printLine("----- MASTERMIND -----");
			String encodedCharacters = this.secretCombination.getEncodedCharacters();
			console.printLine(encodedCharacters);
			
			this.attempt += 1;
			
			ProposedCombination currentProposedCombination = requestProposedCombination();
			saveProposedCombination(currentProposedCombination);
			currentProposedCombination.show();
			
			this.isWinner = secretCombination.isWinner(currentProposedCombination);
			
		} while (!(this.attempt <= MAX_PROPOSED_COMBINATION || this.isWinner));
		
	}

	private void saveProposedCombination(ProposedCombination proposedCombination) {
		this.proposedCombinations[attempt-1] = proposedCombination;
	}

	private ProposedCombination requestProposedCombination() {
		
		String text_combination = console.getQuestionResponse("Propose a combination:");
		
		Color[] colors = new Color[4];
		
		for (int i=0; i < text_combination.length(); i++) {
			char colorChar = text_combination.charAt(i);
			colors[i] = Color.valueOf(colorChar);
		}
		
		return new ProposedCombination(colors);
		
	}
	

}
