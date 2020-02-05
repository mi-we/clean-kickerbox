package org.zuehlke.kickerbox.domain.team;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Team {
    private String name;
    private long id;
    private List<TeamMember> members;

    public Team(String name, long id, List<TeamMember> members) {
        this.name = name;
        this.id = id;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<TeamMember> getMembers() {
        return members;
    }

    public void setMembers(List<TeamMember> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return getId() == team.getId() &&
                getName().equals(team.getName()) &&
                getMembers().equals(team.getMembers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getMembers());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Team.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("id=" + id)
                .add("members=" + members)
                .toString();
    }
}
