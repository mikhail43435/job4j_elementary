package ru.job4j.steam.travelAgency;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> addresses;
        addresses = profiles.stream().map(e -> e.getAddress()).collect(Collectors.toList());
        return addresses;
    }
}
