package org.zuehlke.kickerbox.application.usecases.list_teams.ports;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class TeamDocument {

    private final long id;
    private final String name;
    private final List<String> members;

    public TeamDocument(long id, String name, List<String> members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TeamDocument.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("members=" + members)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamDocument that = (TeamDocument) o;
        return getId() == that.getId() &&
                getName().equals(that.getName()) &&
                getMembers().equals(that.getMembers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMembers());
    }
}
