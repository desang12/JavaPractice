package 인터페이스;

public class HTMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing done.");
		
	}

}
