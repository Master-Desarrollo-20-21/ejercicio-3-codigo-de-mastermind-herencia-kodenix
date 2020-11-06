
public enum Color {
	
	RED('r'),
    BLUE('b'),
    YELLOW('y'),
    ORANGE('o'),
    PINK('p'),
    GREEN('g');

    private char keyword;

    Color(char keyword) {
        this.keyword = keyword;
    }
	
	public static Color getColorFromIndex(int index) {
		return Color.values()[index];
	}
	
	public static Color valueOf(char character) {
        for (Color color : values()) {
        	
            if (color.keyword == character) {
                return color;
            }
            
        }
        return null;
    }
	
	
	
}
