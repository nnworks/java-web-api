package services;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ManagedBean
@ApplicationScoped
public class ServiceBean {
	
  @Inject
  Answer answer;
	
  public Answer getAnswerString() {
	  return answer;
  }
}
