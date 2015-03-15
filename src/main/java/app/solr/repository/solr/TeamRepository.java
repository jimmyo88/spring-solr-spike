package app.solr.repository.solr;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.repository.SolrCrudRepository;
import app.model.TeamDocument;
import org.springframework.stereotype.Repository;

public interface TeamRepository extends SolrCrudRepository<TeamDocument, String> {
}

