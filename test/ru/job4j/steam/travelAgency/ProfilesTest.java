package ru.job4j.steam.travelAgency;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.steam.School;
import ru.job4j.steam.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ProfilesTest {

    @Test
    public void whenCollectAddresses() {
        Address address1 = new Address("Moscow", "Bannaya", 23, 3);
        Address address2 = new Address("Bryansk", "Lenina", 34, 75);
        List<Profile> profileList = new ArrayList<>();
        profileList.add(new Profile(address1));
        profileList.add(new Profile(address2));
        List<Address> addresses = Arrays.asList( address1, address2);
        Profiles profiles = new Profiles();
        assertThat (addresses, is(profiles.collect(profileList)));
    }

}
