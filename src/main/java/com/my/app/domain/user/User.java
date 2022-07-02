package com.my.app.domain.user;

import com.my.app.core.domain.DomainEntity;
import com.my.app.core.domain.Entity;
import lombok.AllArgsConstructor;

public interface User extends DomainEntity {

    @lombok.Data
    @AllArgsConstructor
    class Data implements User{
        private final String firstName;
        private final String lastName;

        @Override
        public int compareTo(Entity o) {
            return 0;
        }
    }

    @lombok.Data
    @AllArgsConstructor
    class ListItem implements User {
        private final String fullName;

        @Override
        public int compareTo(Entity o) {
            return 0;
        }
    }
}
