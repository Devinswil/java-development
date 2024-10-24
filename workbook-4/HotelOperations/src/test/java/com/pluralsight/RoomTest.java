package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void testCheckOutRoomShouldBeOccupiedAndDirty() {
        //Arrange
        Room room1 = new Room(1, 100);
        //Act
        room1.checkIn();
        //Assert
        assertTrue(room1.isOccupied());
        assertTrue(room1.isDirty());

    }

    @Test
    public void testCheckInRoomShouldntBeOccupied() {
        //Arrange
        Room room1 = new Room(1, 100);
        //Act
        room1.checkOut();
        //Assert
        assertFalse(room1.isOccupied());


    }
}