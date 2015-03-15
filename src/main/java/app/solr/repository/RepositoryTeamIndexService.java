package app.solr.repository;

import app.model.Team;
import app.model.TeamDocument;
import app.solr.repository.TeamIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import app.solr.repository.solr.TeamRepository;

import javax.annotation.Resource;

@Configuration
@Repository
public class RepositoryTeamIndexService implements TeamIndexService {

    @Autowired
    public TeamRepository repository;


    @Transactional
    @Override
    public void addToIndex(Team teamEntry) {
        TeamDocument document = TeamDocument.getBuilder()
                .goalDifference(teamEntry.getGoalDifference())
                .played(teamEntry.getPlayed())
                .teamName(teamEntry.getTeamName())
                .position(teamEntry.getPositionNumber())
                .points(teamEntry.getPoints())
                .build();

        repository.save(document);
    }
}