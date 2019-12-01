package com.launchcode.java;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/*
* day 18 - find out whether or
* not a word is a palindrome
* */

public class Palindrome {
    Stack<Character> stackup = new Stack();
    Queue<Character> queue = new LinkedList<>();

    void pushTheCharacter(char cheese){
        stackup.push(cheese);
    }
    void enqueueTheCharacter(char cheese){
        queue.add(cheese);
    }
    char popTheCharacter(){
        return stackup.pop();
    }
    char deQueueTheCharacter(){
        return queue.remove();
    }
}
