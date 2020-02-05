package org.zuehlke.kickerbox.application.outbound_ports.presentation;

import org.zuehlke.kickerbox.application.usecases.list_teams.ports.TeamListDocument;

public interface TeamsPresenter {

    void present(TeamListDocument teamListDocument);
}
