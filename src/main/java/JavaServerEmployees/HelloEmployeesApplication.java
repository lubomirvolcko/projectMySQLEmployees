package JavaServerEmployees;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloEmployeesApplication extends Application<HelloEmployeesConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloEmployeesApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloEmployees";
    }

    @Override
    public void initialize(final Bootstrap<HelloEmployeesConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloEmployeesConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
