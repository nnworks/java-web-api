package services;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ManagedBean
@ApplicationScoped
public class AnswerChooserFactory {
	
	@Produces
	public Answer getAnswerStringChooser() {
		Answer answer = new Answer();
		answer.setTemplate("Thanks for your request for '%s'");

		return answer;
	}
}
