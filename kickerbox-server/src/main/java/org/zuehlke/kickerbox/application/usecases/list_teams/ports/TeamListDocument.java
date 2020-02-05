package org.zuehlke.kickerbox.application.usecases.list_teams.ports;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class TeamListDocument {
    private final List<TeamDocument> teamDocuments;

    public TeamListDocument(List<TeamDocument> teamDocuments) {
        this.teamDocuments = teamDocuments;
    }

    public List<TeamDocument> getTeamDocuments() {
        return teamDocuments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamListDocument that = (TeamListDocument) o;
        return getTeamDocuments().equals(that.getTeamDocuments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeamDocuments());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TeamListDocument.class.getSimpleName() + "[", "]")
                .add("teamDocuments=" + teamDocuments)
                .toString();
    }
}
