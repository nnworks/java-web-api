package rest.services;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import services.Answer;
import services.ServiceBean;

@ManagedBean
@Path("/hello")
public class HelloService {
	
	@Inject
	ServiceBean serviceBean;
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloParam(@PathParam("param") String param) {
		
		Answer answer = serviceBean.getAnswerString();
		answer.setInput(param);

		return Response.status(200).entity(answer).build();
	}
}

