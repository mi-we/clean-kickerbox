package org.zuehlke.kickerbox.domain.team;

import java.util.Objects;
import java.util.StringJoiner;

public class TeamMember {
    private final String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamMember that = (TeamMember) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TeamMember.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
