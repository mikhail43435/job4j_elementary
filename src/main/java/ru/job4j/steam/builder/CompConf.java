package ru.job4j.steam.builder;

public class CompConf {
    private String name;
    private boolean isValid;
    private String cpuModel;
    private int ramSize;
    private String gCardModel;
    private int gCardRamSize;
    private String hddOneModel;
    private int hddOneSize;
    private int price;

    static class Builder {
        private String name;
        private boolean isValid;
        private String cpuModel;
        private int ramSize;
        private String gCardModel;
        private int gCardRamSize;
        private String hddOneModel;
        private int hddOneSize;
        private int price;

        CompConf build() {
            CompConf cc = new CompConf();
            cc.name = name;
            cc.isValid = isValid;
            cc.cpuModel = cpuModel;
            cc.ramSize = ramSize;
            cc.gCardModel = gCardModel;
            cc.gCardRamSize = gCardRamSize;
            cc.hddOneModel = hddOneModel;
            cc.hddOneSize = hddOneSize;
            cc.price = price;
            System.out.println("build");
            return cc;
        }

        Builder buildName(String name) {
            this.name = name;
            System.out.println("b name");
            return this;
        }

        Builder buildIsValid(boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        Builder builtCpuModel(String cpuModel) {
            this.cpuModel = cpuModel;
            return this;
        }

        Builder buildRamSize(int ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        Builder buildGCardModel(String gCardModel) {
            this.gCardModel = gCardModel;
            return this;
        }

        Builder buildGCardSize(int gCardRamSize) {
            this.ramSize = gCardRamSize;
            return this;
        }

        Builder buildHddOneModel(String hddOneModel) {
            this.hddOneModel = hddOneModel;
            return this;
        }

        Builder buildHddOneSize(int hddOneSize) {
            this.hddOneSize = hddOneSize;
            return this;
        }

        Builder buildPrice(int price) {
            this.price = price;
            System.out.println("b price");
            return this;
        }
    }

    @Override
    public String toString() {
        return "CompConf{" +
                "name='" + name + '\'' +
                ", isValid=" + isValid +
                ", cpuModel='" + cpuModel + '\'' +
                ", ramSize=" + ramSize +
                ", gCardModel='" + gCardModel + '\'' +
                ", gCardRamSize=" + gCardRamSize +
                ", hddOneModel='" + hddOneModel + '\'' +
                ", hddOneSize=" + hddOneSize +
                ", price=" + price +
                '}';
    }
}