package com.dmantz.trainees;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TraineeCourseTest {
	
   String course = "Java";	
   TraineeCourse traineeCourse = new TraineeCourse(course);

   @Test
   public void testPrintMessage() {
      assertEquals(course,traineeCourse.printMessage());
   }
}




