package main.fundamentalsCoding.bank;

public enum ResourceDirectory {

    RESOURCE,

    FUNDAMENTALS,

    BANK,

    HOMEWORK,

    DICTIONARY,

    LUCKY,

    TEST_18_11_10;


    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
