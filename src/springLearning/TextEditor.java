package springLearning;

public class TextEditor {
	private SpellChecker spellChecker;

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("inside setspellchecker");
		this.spellChecker = spellChecker;
	}

public SpellChecker getSpellChecker() {
	return spellChecker ;
}
public void spellCheck () {
	spellChecker.checkSpelling();
}
}