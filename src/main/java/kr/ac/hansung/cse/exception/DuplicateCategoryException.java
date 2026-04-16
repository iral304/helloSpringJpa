package kr.ac.hansung.cse.exception;

public class DuplicateCategoryException extends RuntimeException{
    public DuplicateCategoryException(String name){
        super(name);
    }
}
