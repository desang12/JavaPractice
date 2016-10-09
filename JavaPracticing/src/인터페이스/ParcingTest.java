package 인터페이스;

public class ParcingTest {
	public static void main(String [] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
	}
}
