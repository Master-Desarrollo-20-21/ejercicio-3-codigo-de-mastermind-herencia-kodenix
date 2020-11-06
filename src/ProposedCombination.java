
public class ProposedCombination extends Combination {
	
	public ProposedCombination(Color[] colors) {
		this.colors = colors;
	}

	public void show() {
		
		for (int i=0; i < 4; i++) {
			Color c = this.colors[i];
			System.out.println(c);
		}
		
	}

}
