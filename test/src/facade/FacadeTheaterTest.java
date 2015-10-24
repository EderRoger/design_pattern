package facade;

import org.junit.Test;

/**
 * Created by eder on 24/10/15.
 */
public class FacadeTheaterTest {
    @Test
    public void testHomeTheater() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CdPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());

        homeTheater.watchMovie("Matrix");
        homeTheater.endMovie();
    }
}
