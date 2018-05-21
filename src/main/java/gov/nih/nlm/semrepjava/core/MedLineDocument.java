package gov.nih.nlm.semrepjava.core;

import java.util.List;

import gov.nih.nlm.ling.core.Document;
import gov.nih.nlm.ling.core.Sentence;

public class MedLineDocument extends Document{

	private String title;
	
	public MedLineDocument(String id, String text) {
		super(id, text);
	}
	
	public MedLineDocument(String id, String text, List<Sentence> sentence) {
		super(id,text,sentence);
	}
	
	public MedLineDocument(String id, String text, List<Sentence> sentence, String title) {
		super(id,text,sentence);
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}

}
