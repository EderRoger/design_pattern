package decorator;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by eder on 06/10/15.
 */
public class InputTest {

    @Test
    public void testLoweCase(){
        int c;
        try {
            InputStream in =  new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("....your_path/test.txt")));

            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
