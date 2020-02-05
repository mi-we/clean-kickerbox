package org.zuehlke.kickerbox.application.usecases.list_teams.ports;

import org.zuehlke.kickerbox.application.outbound_ports.presentation.TeamsPresenter;

public interface IListTeams {

    void callWith(TeamsPresenter teamsPresenter);
}
