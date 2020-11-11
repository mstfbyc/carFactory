package com.carfactory.carfactory.services;
import com.carfactory.carfactory.entity.Cabrio;
import com.carfactory.carfactory.entity.Hatchback;
import com.carfactory.carfactory.entity.Sedan;
import com.carfactory.carfactory.impl.CarFactory;
import com.carfactory.carfactory.interfaces.Car;
import org.junit.Test;
import  org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class GetCarTypeTest {
    private static final String EXPECTED_SEDAN = "Sedan Car has produced";
    private static final String EXPECTED_CABRIO = "Cabrio Car has produced";
    private static final String EXPECTED_HATCHBACK = "Hatchback Car has produced";
    private static final String SEDAN = "Sedan";
    private static final String CABRIO = "Cabrio";
    private static final String HATCHBACK = "Hatchback";
    private static final String OTHER = "Other";
    private Car result;
    private String actual;

    @InjectMocks
    private CarFactoryServices underTest;

    @Mock
    private CarFactory carFactory;

    @Test
    public void  shouldReturnGetCarTypeWhenSedan()  {
        result = new Sedan();
        Mockito.when(carFactory.getCar(Mockito.anyString())).thenReturn(result);
        actual = underTest.getCarType(SEDAN);
       assertNotNull(actual);
       assertEquals(EXPECTED_SEDAN,actual);
    }

    @Test
    public void  shouldReturnGetCarTypeWhenCabrio()  {
        result = new Cabrio();
        Mockito.when(carFactory.getCar(Mockito.anyString())).thenReturn(result);
        actual = underTest.getCarType(CABRIO);
        assertNotNull(actual);
        assertEquals(EXPECTED_CABRIO,actual);
    }

    @Test
    public void  shouldReturnGetCarTypeWhenHatchback() {
        result = new Hatchback();
        Mockito.when(carFactory.getCar(Mockito.anyString())).thenReturn(result);
        actual = underTest.getCarType(HATCHBACK);
        assertNotNull(actual);
        assertEquals(EXPECTED_HATCHBACK,actual);
    }

    @Test(expected = RuntimeException.class)
    public void shouldReturnExceptionWhenInvalidType()  {
        Mockito.when(carFactory.getCar(Mockito.anyString())).thenThrow(Exception.class);
        underTest.getCarType(OTHER);
    }


}
