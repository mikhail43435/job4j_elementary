package ru.job4j.steam.travelAgency;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {

        List ddd = profiles.stream().map(e -> e.getAddress())
                .sorted(Comparator.comparing(address -> address.getCity()))
                .distinct()
                .collect(Collectors.toList());
        ddd.stream().forEach(System.out::println);
        return ddd;
    }
}
