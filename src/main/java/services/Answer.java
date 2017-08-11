package services;

import javax.xml.bind.annotation.XmlElement;

public class Answer {
	
	private String template;
	private String input;
	
	public Answer() {
	}

	public void setTemplate(final String template) {
		this.template = template;
	}
	
	public void setInput(final String input) {
		this.input = input;
	}

	@XmlElement(name = "answer")
	public String getAnswer() {
		return String.format(template, input);
	}
}
