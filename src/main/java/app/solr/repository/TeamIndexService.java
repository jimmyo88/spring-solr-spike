package app.solr.repository;

import app.model.Team;

public interface TeamIndexService {
    public void addToIndex(Team team);
}
