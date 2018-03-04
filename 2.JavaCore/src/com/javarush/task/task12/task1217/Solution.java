package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        void setMaxDistance(int maxDistance);
    }

    public interface Run {
        void setMaxSpeed(int maxSpeed);
    }

    public interface Swim {
        void setMaxDeep(int deep);
    }

}
