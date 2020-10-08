package ru.job4j.steam.travelAgency;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.steam.School;
import ru.job4j.steam.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ProfilesTest {

    @Test
    public void whenCollectAddresses() {

        List<Profile> profileList = new ArrayList<>();
        profileList.add(new Profile(new Address("Moscow", "Bannaya", 23, 3)));
        profileList.add(new Profile(new Address("Bryansk", "Lenina", 34, 75)));

        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Moscow", "Bannaya", 23, 3));
        addresses.add(new Address("Bryansk", "Lenina", 34, 75));

        Profiles profiles = new Profiles();

        //List<Address> add = new ArrayList<>();
        assertThat(addresses, is(profiles.collect(profileList)));
    }

}
