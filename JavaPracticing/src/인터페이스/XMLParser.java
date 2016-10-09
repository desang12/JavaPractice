package 인터페이스;

public class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - XML Parsing done.");
		
	}

}
