package org.zuehlke.kickerbox.application.usecases.list_teams;

import org.zuehlke.kickerbox.application.outbound_ports.persistence.FindAllTeams;
import org.zuehlke.kickerbox.application.usecases.list_teams.ports.TeamDocument;
import org.zuehlke.kickerbox.application.usecases.list_teams.ports.TeamListDocument;
import org.zuehlke.kickerbox.domain.team.Team;

import java.util.List;
import java.util.stream.Collectors;

class ListableTeams {
    private List<Team> self;

    private ListableTeams(List<Team> self) {
        this.self = self;
    }

    static ListableTeams find(FindAllTeams findAllTeams) {
        return new ListableTeams(findAllTeams.all());
    }

    TeamListDocument asDocument() {
        List<TeamDocument> teamDocuments = self.stream()
                .map(ListableTeam::new)
                .map(ListableTeam::asDocument)
                .collect(Collectors.toList());
        return new TeamListDocument(teamDocuments);
    }
}
