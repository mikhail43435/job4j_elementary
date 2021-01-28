package ru.job4j.steam.builder;

public class CompConfMaster {
    public static void main(String[] args) {
        CompConf cc = new CompConf.Builder()
                .buildName("Comp 1")
                .buildIsValid(true)
                .builtCpuModel("Intel")
                .buildRamSize(128)
                .buildGCardModel("NVidea")
                .buildGCardSize(256)
                .buildHddOneModel("Intel SSD")
                .buildHddOneSize(512)
                //.buildPrice(548)
                .build();
        System.out.println(cc);
    }
}
