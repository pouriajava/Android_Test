package com.example.tutorial001;


import com.example.tutorial001.exception.InvalideException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {


    @InjectMocks
    Car cmo;


    private static Car c;

    @BeforeClass
    public static void initializeCar() {
        c = new Car();
    }

    @Test(expected = InvalideException.class)
    @Category(CarTest.class)
    public void validCarNo() throws InvalideException {
        c.setNo(-2L);
    }

    @Test
    @Category(CarTest.class)
    public void setNo() throws InvalideException {
        long no = 2L;
        c.setNo(no);
        //assertThat(c.getNo()).isEqualTo(2L);
        long returiveno = c.getNo();
        assertEquals(returiveno, no);
    }

    @Test
    public void setModel() {
//        c.setModel("2015");
//        assertThat(c.getModel()).isEqualTo("2015");

        Car moc = mock(Car.class);
        //when(moc.getModel()).thenThrow(new InvalideException());
        when(moc.getModel()).thenReturn("1395");
        assertEquals(moc.getModel(), "1395");
    }

    @Test
    public void tests() throws InvalideException {
//        List<String> list = new LinkedList<>();
//        List<String> spy = spy(list);
//
//        // this does not work
//        // real method is called so spy.get(0)
//        // throws IndexOutOfBoundsException (list is still empty)
//        doReturn("foo").when(spy).get(0);
//
//        assertEquals("foo", spy.get(0));

//        Car cc = Mockito.mock(Car.class);
//
//        when(cc.getNo()).thenReturn(1L);
//        cc.setNo(5L);
//        cc.getNo();
//        cc.getNo();
//        verify(cc).setNo(ArgumentMatchers.eq(5L));
//        verify(cc, times(2)).getNo();
//        verify(cc, never()).getModel();
//        verifyNoMoreInteractions(cc);
//

        Collection collection = Mockito.mock(Collection.class);
        cmo.setNo(5L);
        collection.insertCar(cmo);
        verify(collection).insertCar(any(Car.class));
    }
}