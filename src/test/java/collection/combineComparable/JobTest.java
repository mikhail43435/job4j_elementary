package test.java.main.collection.combineComparable;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenAscByName() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job 2", 4));
        jobs.add(new Job("Job 3", 2));
        jobs.add(new Job("Job 1", 3));
        jobs.add(new Job("Job 4", 1));
        Job jobForCheck =  new Job("Job 0", 1);
        jobs.add(jobForCheck);
        Comparator<Job> comb = new JobAscByName();
        Collections.sort(jobs, comb);
        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(jobForCheck));
    }

    @Test
    public void whenDescByName() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job 2", 4));
        jobs.add(new Job("Job 3", 2));
        jobs.add(new Job("Job 1", 3));
        jobs.add(new Job("Job 4", 1));
        Job jobForCheck =  new Job("Job 5", 1);
        jobs.add(jobForCheck);
        Comparator<Job> comb = new JobDescByName();
        Collections.sort(jobs, comb);
        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(jobForCheck));
    }

    @Test
    public void whenAscByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job 1", 4));
        jobs.add(new Job("Job 1", 2));
        jobs.add(new Job("Job 1", 3));
        jobs.add(new Job("Job 1", 1));
        Job jobForCheck =  new Job("Job 1", 0);
        jobs.add(jobForCheck);
        Comparator<Job> comb = new JobAscByPriority();
        Collections.sort(jobs, comb);
        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(jobForCheck));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job 1", 4));
        jobs.add(new Job("Job 1", 2));
        jobs.add(new Job("Job 1", 3));
        jobs.add(new Job("Job 1", 1));
        Job jobForCheck =  new Job("Job 1", 5);
        jobs.add(jobForCheck);
        Comparator<Job> comb = new JobDescByPriority();
        Collections.sort(jobs, comb);
        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(jobForCheck));
    }

    @Test
    public void whenAscByNameAcsByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job 1", 4));
        jobs.add(new Job("Job 1", 2));
        jobs.add(new Job("Job 1", 3));
        jobs.add(new Job("Job 0", 1));
        Job jobForCheck =  new Job("Job 0", 0);
        jobs.add(jobForCheck);
        Comparator<Job> comb = new JobAscByName()
        .thenComparing(new JobAscByPriority());
        Collections.sort(jobs, comb);
        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(jobForCheck));
    }

    @Test
    public void whenAscByNameDescByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job 2", 4));
        jobs.add(new Job("Job 3", 2));
        jobs.add(new Job("Job 1", 3));
        jobs.add(new Job("Job 0", 0));
        Job jobForCheck =  new Job("Job 0", 1);
        jobs.add(jobForCheck);
        Comparator<Job> comb = new JobAscByName()
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, comb);
        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(jobForCheck));
    }

    @Test
    public void whenDescByNameDescByPriorityDescByLength() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job 50", 4));
        jobs.add(new Job("Job 500", 3));
        jobs.add(new Job("Job 1", 3));
        jobs.add(new Job("Job 3", 1));
        Job jobForCheck =  new Job("Job 500", 4);
        jobs.add(jobForCheck);
        Comparator<Job> comb = new JobDescByName()
                .thenComparing(new JobDescByPriority())
                .thenComparing(new JobDescByNameLength());
        Collections.sort(jobs, comb);
        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(jobForCheck));
    }

}