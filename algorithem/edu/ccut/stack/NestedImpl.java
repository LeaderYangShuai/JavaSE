package edu.ccut.stack;

import java.util.List;

/**
 * @ProjectName: javaSe_review
 * @ClassName: NestedImpl
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-07 19:55
 */
public class NestedImpl {

    Integer integer;
    List<NestedImpl>  list;

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public void setList(List<NestedImpl> list) {
        this.list = list;
    }

    public void addListObject(){
        NestedImpl nested1 = new NestedImpl();
//        nested1.setList();
        nested1.setInteger(1);
       // list.add(new NestedImpl().setInteger(1));

    }

    public boolean isInteger() {
        return false;
    }


    public Integer getInteger() {
        return null;
    }


    public List<NestedInteger> getList() {
        return null;
    }
}
