package org.zuehlke.kickerbox.application.usecases.list_teams;

import org.zuehlke.kickerbox.application.usecases.list_teams.ports.TeamDocument;
import org.zuehlke.kickerbox.domain.team.Team;
import org.zuehlke.kickerbox.domain.team.TeamMember;

import java.util.List;
import java.util.stream.Collectors;

class ListableTeam {

    private final Team self;

    ListableTeam(Team self) {
        this.self = self;
    }

    TeamDocument asDocument() {
        List<String> members = self.getMembers().stream()
                .map(TeamMember::getName)
                .collect(Collectors.toList());
        return new TeamDocument(self.getId(), self.getName(), members);
    }
}
