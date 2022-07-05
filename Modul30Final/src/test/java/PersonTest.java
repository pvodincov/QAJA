
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PersonTest {

    @DataProvider(name = "isTeenagerTestAge")
    Object[][] sumDataProvider() {
        return new Object[][]{
                {-1, false},
                {0, false},
                {13, true},
                {15, true},
                {19, true},
                {30, false},
                {13.2,true}



        };
    }
        @Test (dataProvider = "isTeenagerTestAge")

        public void isTeenagerTest (int arg1, boolean arg2){
            boolean result = Person.isTeenager(arg1);
           //System.out.println(result);
            assertEquals(result,arg2);

        }
    }

