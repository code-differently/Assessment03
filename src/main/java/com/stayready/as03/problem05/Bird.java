package com.stayready.as03.problem05;

public abstract class Bird {
    protected String migrationMonth;

    public String move() {
        return "fly";
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth = expected;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
