package JavaServerEmployees.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import JavaServerEmployees.db.MySQL;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class Employees 
{

    @POST
    @Path("/salary")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSalary (Employ employ)
    {
        String salary = new MySQL().getSalary(employ.name);
        return salary;
    }

    public static class Employ {
        @JsonProperty("name")
        public String name;
    }

}
