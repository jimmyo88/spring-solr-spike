package app.model;

import org.apache.solr.client.solrj.beans.Field;
import org.apache.solr.common.SolrDocument;


public class TeamDocument extends SolrDocument {

    @Field("POSITION")
    private String position;

    @Field("TEAM_NAME")
    private String name;

    @Field("PLAYED")
    private String played;

    @Field("GOAL_DIFFERENCE")
    private String goalDifference;

    @Field("POINTS")
    private String points;

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private TeamDocument build;

        public Builder() {
            build = new TeamDocument();
        }

        public Builder position(String position) {
            build.position = position;
            return this;
        }

        public Builder teamName(String position) {
            build.position = position;
            return this;
        }

        public Builder played(String position) {
            build.position = position;
            return this;
        }

        public Builder goalDifference(String position) {
            build.position = position;
            return this;
        }

        public Builder points(String points) {
            build.points = points;
            return this;
        }

        public TeamDocument build() {
            return build;
        }
    }
}
