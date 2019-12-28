package cat.emprul.eventcal.config;

import java.util.Set;
import java.util.logging.Logger;

import com.sun.faces.config.FacesInitializer;
import org.springframework.web.WebApplicationInitializer;

/**
 * 
 * @author ferran 
 *
 */



public class MainWebAppInitializer extends FacesInitializer implements WebApplicationInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainWebAppInitializer.class);

    @Override
    public void onStartup(Set<Class<?>> classes, ServletContext servletContext) throws ServletException {
        super.onStartup(classes, servletContext);
    }

    /**
     * Register and configure all Servlet container components necessary to power the web application.
     */
    @Override
    public void onStartup(final ServletContext sc) throws ServletException {
        LOGGER.info("MainWebAppInitializer.onStartup()");
        sc.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");

        // Create the 'root' Spring application context
        final AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.register(SpringCoreConfig.class);
        sc.addListener(new ContextLoaderListener(root));
    }


}
