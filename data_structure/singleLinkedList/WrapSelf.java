package singleLinkedList;

/**
 * @ProjectName: JavaSE
 * @ClassName: WrapSelf
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-26 15:02
 *
 * 自己包装自己，这个自己是个引用，没有赋值的时候就是null，没有初始化使用null值会报错
 */
public class WrapSelf {

    private  WrapSelf wrapSelf;
    private  String name;

    public static void main(String[] args) {

        WrapSelf wrapSelf1 = new WrapSelf();
        wrapSelf1.setName("杨红兵");
        wrapSelf1.wrapSelf= new WrapSelf();
        wrapSelf1.wrapSelf.setName("红兵");
        wrapSelf1.wrapSelf.wrapSelf=new WrapSelf();
        wrapSelf1.wrapSelf.wrapSelf.setName("xiao兵");
        WrapSelf temp=wrapSelf1;
        while (temp!=null){
            System.out.println(temp.getName()+System.identityHashCode(temp)+"       "+temp.hashCode());
            temp= temp.wrapSelf;
        }
    }
    public WrapSelf getWrapSelf() {
        return wrapSelf;
    }

    public void setWrapSelf(WrapSelf wrapSelf) {
        this.wrapSelf = wrapSelf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
