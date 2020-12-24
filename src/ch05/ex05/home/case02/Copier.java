package ch05.ex05.home.case02;

public class Copier {
	public Document copy(Document doc) {
		Document copiedDoc = new Document();
		
		copiedDoc.setTitle(doc.getTitle());
		copiedDoc.setContent(doc.getContent());
		copiedDoc.setRegDate(doc.getRegDate());
		
		return copiedDoc;
	}
}
