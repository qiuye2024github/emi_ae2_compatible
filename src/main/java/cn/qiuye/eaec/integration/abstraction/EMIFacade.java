package cn.qiuye.eaec.integration.abstraction;

import java.util.Objects;

public class EMIFacade {

    private EMIFacade() {
    }

    private static IEMI instance = new IEMI.Stub();

    public static IEMI instance() {
        return instance;
    }

    public static void setInstance(IEMI jei) {
        instance = Objects.requireNonNull(jei);
    }

}
