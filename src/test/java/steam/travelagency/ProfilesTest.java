package test.java.main.steam.travelagency;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {
    @Test
    public void whenCollectAddresses() {
        Address address1 = new Address("Moscow", "Bannaya", 23, 3);
        Address address2 = new Address("Bryansk", "Lenina", 34, 75);
        List<Profile> profileList = new ArrayList<>();
        profileList.add(new Profile(address1));
        profileList.add(new Profile(address2));
        List<Address> addressesFinal = Arrays.asList(address2, address1);
        Profiles profiles = new Profiles();
        assertThat(addressesFinal, is(profiles.collect(profileList)));
    }

    @Test
    public void whenSortAndDistinct() {
        Address address1 = new Address("Moscow", "Bannaya", 23, 3);
        Address address2 = new Address("Bryansk", "Lenina", 34, 75);
        Address address3 = new Address("Bryansk", "Lenina", 34, 75);
        List<Profile> profileList = new ArrayList<>();
        profileList.add(new Profile(address1));
        profileList.add(new Profile(address2));
        profileList.add(new Profile(address3));
        List<Address> addressesFinal = Arrays.asList(address2, address1);
        Profiles profiles = new Profiles();
        assertThat(addressesFinal, is(profiles.collect(profileList)));
    }
}
