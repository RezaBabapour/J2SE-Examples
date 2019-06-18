import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/index")
public class Server {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/method")
    public String getClicked(@QueryParam("id") String id, @QueryParam("name") String name){
        return "hello dude";
    }

    public static void main(String[] args) {
        HttpServer server = HttpServerFactory.create("http//localhost:/9998/");
    }
}
