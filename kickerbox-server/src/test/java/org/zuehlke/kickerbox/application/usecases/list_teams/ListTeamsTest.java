package org.zuehlke.kickerbox.application.usecases.list_teams;

import org.junit.jupiter.api.Test;
import org.zuehlke.kickerbox.application.outbound_ports.persistence.FindAllTeams;
import org.zuehlke.kickerbox.application.outbound_ports.presentation.TeamsPresenter;
import org.zuehlke.kickerbox.application.usecases.list_teams.ports.IListTeams;
import org.zuehlke.kickerbox.application.usecases.list_teams.ports.TeamDocument;
import org.zuehlke.kickerbox.application.usecases.list_teams.ports.TeamListDocument;
import org.zuehlke.kickerbox.domain.team.Team;
import org.zuehlke.kickerbox.domain.team.TeamMember;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListTeamsTest {

    @Test
    void list_teams() {
        FindAllTeams findAllTeams = () -> List.of(new Team("FearlessFlyers", 1,
                List.of(
                        new TeamMember("Mark Lettieri"),
                        new TeamMember("Joe Dart"),
                        new TeamMember("Dave Smith"),
                        new TeamMember("Cory Wong")
                )));


        var expectedTeam = new TeamListDocument(List.of(new TeamDocument(1, "FearlessFlyers", List.of(
                "Mark Lettieri",
                "Joe Dart",
                "Dave Smith",
                "Cory Wong"
        ))));

        IListTeams listTeams = new ListTeams(findAllTeams);

        TeamsPresenter teamsPresenter = teamListDocument ->
                assertThat(teamListDocument).isEqualTo(expectedTeam);

        listTeams.callWith(teamsPresenter);
    }
}