import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;	


public class DoublyLinkedListDaniTest {
	
	public static final double delta = 1e-9;
    public DoublyLinkedListDani lista = null;
    
    @Before
    public void inicializa(){
        lista = new DoublyLinkedListDani();
    }
    
    @After
    public void finaliza(){
        lista = null;
    }
    
    @Test
	public void sizeTest() {
		assertEquals(lista.isEmpty(), lista.size() == 0);
	}
    
    @Test
	public void addTest() {
    	int N = lista.size();
    	Object item = new Object();
		lista.add(item);
		assertEquals(N+1, lista.size());
	}

    @Test
   	public void ListIteratorTest() {
       	Object item = lista.iterator();
   	}
    
    @Test (expected = NoSuchElementException.class)
    public void nextTest(){
    	Object item = lista.iterator();
    	((ListIterator) item).next();
    }
    
    @Test (expected = NoSuchElementException.class)
    public void previousTest(){
    	Object item = lista.iterator();
    	((ListIterator) item).previous();
    }
    
    @Test (expected = IllegalStateException.class)
    public void setTest(){
    	Object item = lista.iterator();
    	((ListIterator) item).set(item);
    }
    
    @Test (expected = IllegalStateException.class)
    public void removeTest(){
    	Object item = lista.iterator();
    	((ListIterator) item).remove();
    }
    

}
