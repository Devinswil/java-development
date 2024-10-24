package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    @Test
    public void testPunchInEmployeeIfPunchedInEqualsStartTime() {
        //Arrange
        Employee employee1 = new Employee(83, "john", "ceo", 60);
        double startTime = 8;
        double exceptedStartTime = 8;
        //Act
        employee1.punchIn(startTime);

        //Assert
        double actualStartTime = employee1.getStartTime();
        assertEquals(exceptedStartTime, actualStartTime);
    }
    @Test
    public void testPunchOutEmployeeIfStartTimeSubtractedByTime(){
        //Arrange
        Employee employee2 = new Employee(23,"jj","janitor",20);
        double startTime=9;
        double endTime=17;
        double expectedDurationTime=8;
        employee2.punchIn(startTime);
        //Act
        employee2.punchOut(endTime);

        //Assert
        double actualPunchOut = employee2.getHoursWorked();
        assertEquals(expectedDurationTime,actualPunchOut);

    }

}


