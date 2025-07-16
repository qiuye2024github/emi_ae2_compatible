package cn.qiuye.eaec.integration.abstraction;


public interface IEMI {
    default boolean isEnabled() {
        return false;
    }

    default String getSearchText() {
        return "";
    }

    default void setSearchText(String text) {
    }

    default boolean hasSearchFocus() {
        return false;
    }

    class Stub implements IEMI {
    }
}
