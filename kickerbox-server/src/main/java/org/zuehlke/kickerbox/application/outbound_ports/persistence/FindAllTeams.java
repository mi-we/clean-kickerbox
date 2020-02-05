package org.zuehlke.kickerbox.application.outbound_ports.persistence;

import org.zuehlke.kickerbox.domain.team.Team;

import java.util.List;

public interface FindAllTeams {

    List<Team> all();
}
