package org.zuehlke.kickerbox.application.usecases.list_teams;

import org.zuehlke.kickerbox.application.outbound_ports.persistence.FindAllTeams;
import org.zuehlke.kickerbox.application.outbound_ports.presentation.TeamsPresenter;
import org.zuehlke.kickerbox.application.usecases.list_teams.ports.IListTeams;

public class ListTeams implements IListTeams {

    private FindAllTeams findAllTeams;

    public ListTeams(FindAllTeams findAllTeams) {
        this.findAllTeams = findAllTeams;
    }

    @Override
    public void callWith(TeamsPresenter teamsPresenter) {
        ListableTeams listableTeams = ListableTeams.find(findAllTeams);
        teamsPresenter.present(listableTeams.asDocument());
    }
}
