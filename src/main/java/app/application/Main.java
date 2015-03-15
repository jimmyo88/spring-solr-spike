package app.application;

import app.solr.repository.HttpSolrContext;
import app.solr.repository.RepositoryTeamIndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                MainApplication.class,
                HttpSolrContext.class,
                RepositoryTeamIndexService.class);
        MainApplication mainApp = applicationContext.getBean(MainApplication.class);
        mainApp.start(applicationContext);
    }
}
